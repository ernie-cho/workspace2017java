/*package xml_clalc;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class testttt {

	public static void main(String[] args) {	
	
		Connection conn =null; // ������ DB������ ����, Ʈ������ ���� � ���õ� ����� ���� ��ü
		Statement readStmt = null; // SQL��ɾ �����Ű�� ����� ���� ��ü (Connection �� ������ �ش�.)
		
		
		Document document;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹��ε� ����");
			//2.DB ���� �� connection ��ü ������
			//String url = "jdbc:oracle:thin:@���� �ּ�:port��ȣ:SID"
			String url = "jdbc:oracle:thin:@192.168.232.128:1521:orasparta";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url,user,password); //DB ������ ���� ����̹� �Ŵ���			
			System.out.println("DB���� ����!");	
			
			readStmt = conn.createStatement();
			// ������ ������.
			ResultSet re = readStmt.executeQuery("SELECT ZIPCODE,SIDO,NVL(GUGUN,' '),NVL(DONG, ' '),NVL(RI, ' '),NVL(BUNJI, ' '),SEQ FROM ZIPCODE_TEST"); 		
			//re.getInt(8);
			
			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		
			Node root = document.createElement("ZIPCOD_TABLE");
			document.appendChild(root);
			
			while(re.next())
			{		
					Element SEQ = document.createElement("SEQ");
					SEQ.setAttribute("SEQ", re.getString(7));			
					root.appendChild(SEQ);	
				
				  	Element ZIPCODE = document.createElement("ZIPCODE");
				  	ZIPCODE.appendChild(document.createTextNode(re.getString(1)));
					SEQ.appendChild(ZIPCODE);
					
					Element SIDO= document.createElement("SIDO");
					SIDO.appendChild(document.createTextNode(re.getString(2)));
					SEQ.appendChild(SIDO);
					
					Element GUGUN = document.createElement("GUGUN");
					GUGUN.appendChild(document.createTextNode(re.getString(3)));
					SEQ.appendChild(GUGUN);
			
					Element DONG = document.createElement("DONG");
					DONG.appendChild(document.createTextNode(re.getString(4)));
					SEQ.appendChild(DONG);
					
					Element RI = document.createElement("RI");
					RI.appendChild(document.createTextNode(re.getString(5)));
					SEQ.appendChild(RI);
					
					Element BUNJI = document.createElement("BUNJI");
					BUNJI.appendChild(document.createTextNode(re.getString(6)));
					SEQ.appendChild(BUNJI);		
			}

		// Document ����
		DOMSource xmlDOM = new DOMSource(document);
		StreamResult xmlFile = new StreamResult(new File("saveed.xml"));
		TransformerFactory.newInstance().newTransformer().transform(xmlDOM, xmlFile);
		
		
		conn.close();
		re.close();
		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
*/