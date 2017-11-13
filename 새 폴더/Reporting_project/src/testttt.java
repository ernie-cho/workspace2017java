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
	
		Connection conn =null; // 이전의 DB접속을 해제, 트랜젝션 설정 등에 관련된 기능을 갖는 객체
		Statement readStmt = null; // SQL명령어를 실행시키는 기능을 갖는 객체 (Connection 이 생성해 준다.)
		
		
		Document document;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공");
			//2.DB 접속 및 connection 객체 얻어오기
			//String url = "jdbc:oracle:thin:@서버 주소:port번호:SID"
			String url = "jdbc:oracle:thin:@192.168.232.128:1521:orasparta";
			String user = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url,user,password); //DB 접속할 때는 드라이버 매니저			
			System.out.println("DB접속 성공!");	
			
			readStmt = conn.createStatement();
			// 쿼리를 날린다.
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

		// Document 저장
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