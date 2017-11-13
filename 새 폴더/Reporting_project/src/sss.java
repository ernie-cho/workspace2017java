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
		
		Connection conn = null; // try-catch문 안에서 사용할 io, 외부 선언
		Statement stmt = null;
		ResultSet rset = null;
		long StartTime = 0;
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@" + HostName + ":" + Port + ":" + SID,UserName,Password);
			// connection 선언 jdbc:oracle:thin:@Hostname : Port : SID,UserName,Password
			conn.setAutoCommit(false); // autocommit 해제
			System.out.println("DB is Connected"); //connection 확인
			
			StartTime = System. currentTimeMillis ();
			System.out.println("Start : "+StartTime);
			
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM (SELECT GUGUN,DONG,COUNT(*) AS TheNumberOfZipcodes FROM ZIPCODE WHERE SIDO='서울' GROUP BY GUGUN,DONG ORDER BY TheNumberOfZipcodes DESC)"
					  + "WHERE ROWNUM<=50";
			
			rset = stmt.executeQuery(sql);
			//DB에서 ResultSet(서울시 동별 우편번호현황 TOP50)을 추출
			
			//File xmlFile = new File("C:\\PROJECT_03\\REPORT_ZIPCODE.xml");
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance(); //DocumentBuilderFactory >> DocumentBuilder >> Document
			DocumentBuilder db = dbf.newDocumentBuilder();
			// Document doc = db.parse(xmlFile);  xml parsing
			
			Document doc = db.newDocument(); //(XML)새문서를 객체로 인식
			Element root = doc.createElement("REPORT_ZIPCODE"); //최상위 Element
			//doc.appendChild(root);  // Document >> Element : root (종속관계)
         
			java.sql.ResultSetMetaData rsmd = rset.getMetaData(); //테이블의 정보(메타데이터)를 불러옴 >> Colum의 이름,값,수 데이터를 추출
			int seq = 1;
			
			while(rset.next()){
				Element row=doc.createElement("서울"+seq); //REPORT_ZIPCODE >> 서울 Numbering
				for(int j=1;j<=rsmd.getColumnCount();j++){ 
					String colName=rsmd.getColumnName(j); //Column 이름
					String colValue=rset.getString(j); //Column 값
					Element e=doc.createElement(colName); //Colum 이름으로 Element생성
					e.appendChild(doc.createTextNode(colValue)); //해당 Element이하로 Colum값 부여
				row.appendChild(e);
				}
				root.appendChild(row); //거꾸로 Element간의 종속관계 설정(닫기)
				seq++; //Numbering
			}
			doc.appendChild(root); //거꾸로 Element간의 종속관계 설정(닫기)
						
			/*
			while(rset.next()){
            	Element GUGUN = doc.createElement("GUGUN"); //Element : GUGUN
            	GUGUN.appendChild(doc.createTextNode(rset.getString(1))); //ResultSet에서 1번째 열의 값
            	root.appendChild(GUGUN); //root 하위
            
            	Element DONG = doc.createElement("DONG"); //Element : DONG
            	DONG.appendChild(doc.createTextNode(rset.getString(2))); //ResultSet에서 2번째 열의 값
            	GUGUN.appendChild(DONG); //GUGUN 하위
            
            	Element TheNumberOfZipcodes = doc.createElement("TheNumberOfZipcodes"); //Element : TheNumberOfZipcodes : 서울시에 각 주소에 부여된 우편번호의 수
            	TheNumberOfZipcodes.appendChild(doc.createTextNode(rset.getString(3))); //ResultSet에서 3번째 열의 값(Int형이지만 암시적 형번환)
            	DONG.appendChild(TheNumberOfZipcodes); //DONG 하위
            }
			*/
            DOMSource source = new DOMSource(doc); //Document 기반으로 DOM소스 선언
            
            TransformerFactory tfF = TransformerFactory.newInstance(); //지금까지의 문서를 XML형식으로 변환하기 위한 과정
            Transformer tf = tfF.newTransformer(); //TransformerFactory >> Transformer >> Output형식 지정
            tf.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); //인코딩 형식
            tf.setOutputProperty(OutputKeys.INDENT, "yes"); //들여쓰기
                               
            StreamResult result = new StreamResult(new FileOutputStream(new File("C:\\test\\ZIPCODE_JDBC.xml"))); //StreamResult >> FileOutputStream >> File 파일(위치)지정
            //StreamResult result = new StreamResult(System.out); //console 확인
            tf.transform(source, result); //문서 형식 변환
            
            long endTime = System. currentTimeMillis (); //완료시간
    		System.out.println("COMPLITE"); 
    		System.out.println("END : " + endTime +"ms"); 
    		System.out.println("PROCESSING TIME : " + (endTime - StartTime) +"ms"); //처리시간
            
    		rset.close(); //사용한 객체종료(반환)
            stmt.close();
            conn.close();
		} catch (Exception e) {
			System.out.println("Error : "); //console 확인
			e.printStackTrace();
		
		}
 
	}
}