import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
 
public class sss {
 
	public static void main(String[] args) {
		String HostName = "192.168.159.128";
		String Port = "1521";
		String SID = "orasparta";
		String UserName = "SCOTT";
		String Password = "dudeh123";
		
		Connection conn = null; // try-catch�� �ȿ��� ����� io, �ܺ� ����
		Statement stmt = null;
		ResultSet rset = null;
		long StartTime = 0;
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + HostName + ":" + Port + ":" + SID,UserName,Password);
			// connection ���� jdbc:oracle:thin:@Hostname : Port : SID,UserName,Password
			conn.setAutoCommit(false); // autocommit ����
			System.out.println("DB is Connected"); //connection Ȯ��
			
			StartTime = System. currentTimeMillis ();
			System.out.println("Start : "+StartTime);
			
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM (SELECT GUGUN,DONG,COUNT(*) AS TheNumberOfZipcodes FROM ZIPCODE WHERE SIDO='����' GROUP BY GUGUN,DONG ORDER BY TheNumberOfZipcodes DESC)"
					  + "WHERE ROWNUM<=50";
			
			rset = stmt.executeQuery(sql);
			//DB���� ResultSet(����� ���� �����ȣ��Ȳ TOP50)�� ����
			
			//File xmlFile = new File("C:\\PROJECT_03\\REPORT_ZIPCODE.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); //DocumentBuilderFactory >> DocumentBuilder >> Document
			DocumentBuilder db = dbf.newDocumentBuilder();
			// Document doc = db.parse(xmlFile);  xml parsing
			
			Document doc = db.newDocument(); //(XML)�������� ��ü�� �ν�
			Element root = doc.createElement("REPORT_ZIPCODE"); //�ֻ��� Element
			//doc.appendChild(root);  // Document >> Element : root (���Ӱ���)
         
			java.sql.ResultSetMetaData rsmd = rset.getMetaData(); //���̺��� ����(��Ÿ������)�� �ҷ��� >> Colum�� �̸�,��,�� �����͸� ����
			int seq = 1;
			
			while(rset.next()){
				Element row=doc.createElement("����"+seq); //REPORT_ZIPCODE >> ���� Numbering
				for(int j=1;j<=rsmd.getColumnCount();j++){ 
					String colName=rsmd.getColumnName(j); //Column �̸�
					String colValue=rset.getString(j); //Column ��
					Element e=doc.createElement(colName); //Colum �̸����� Element����
					e.appendChild(doc.createTextNode(colValue)); //�ش� Element���Ϸ� Colum�� �ο�
				row.appendChild(e);
				}
				root.appendChild(row); //�Ųٷ� Element���� ���Ӱ��� ����(�ݱ�)
				seq++; //Numbering
			}
			doc.appendChild(root); //�Ųٷ� Element���� ���Ӱ��� ����(�ݱ�)
						
			/*
			while(rset.next()){
            	Element GUGUN = doc.createElement("GUGUN"); //Element : GUGUN
            	GUGUN.appendChild(doc.createTextNode(rset.getString(1))); //ResultSet���� 1��° ���� ��
            	root.appendChild(GUGUN); //root ����
            
            	Element DONG = doc.createElement("DONG"); //Element : DONG
            	DONG.appendChild(doc.createTextNode(rset.getString(2))); //ResultSet���� 2��° ���� ��
            	GUGUN.appendChild(DONG); //GUGUN ����
            
            	Element TheNumberOfZipcodes = doc.createElement("TheNumberOfZipcodes"); //Element : TheNumberOfZipcodes : ����ÿ� �� �ּҿ� �ο��� �����ȣ�� ��
            	TheNumberOfZipcodes.appendChild(doc.createTextNode(rset.getString(3))); //ResultSet���� 3��° ���� ��(Int�������� �Ͻ��� ����ȯ)
            	DONG.appendChild(TheNumberOfZipcodes); //DONG ����
            }
			*/
            DOMSource source = new DOMSource(doc); //Document ������� DOM�ҽ� ����
            
            TransformerFactory tfF = TransformerFactory.newInstance(); //���ݱ����� ������ XML�������� ��ȯ�ϱ� ���� ����
            Transformer tf = tfF.newTransformer(); //TransformerFactory >> Transformer >> Output���� ����
            tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); //���ڵ� ����
            tf.setOutputProperty(OutputKeys.INDENT, "yes"); //�鿩����
                               
            StreamResult result = new StreamResult(new FileOutputStream(new File("C:\\test\\ZIPCODE_JDBC.xml"))); //StreamResult >> FileOutputStream >> File ����(��ġ)����
            //StreamResult result = new StreamResult(System.out); //console Ȯ��
            tf.transform(source, result); //���� ���� ��ȯ
            
            long endTime = System. currentTimeMillis (); //�Ϸ�ð�
    		System.out.println("COMPLITE"); 
    		System.out.println("END : " + endTime +"ms"); 
    		System.out.println("PROCESSING TIME : " + (endTime - StartTime) +"ms"); //ó���ð�
            
    		rset.close(); //����� ��ü����(��ȯ)
            stmt.close();
            conn.close();
		} catch (Exception e) {
			System.out.println("Error : "); //console Ȯ��
			e.printStackTrace();
		
		}
 
	}
}