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

public class Reporting_project {

	public static void main(String[] args) {
		// variables for Finally
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			// Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Open a connection
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.159.128:1521:orasparta", "scott", "dudeh123");
			long startTime = System. currentTimeMillis ();
			// Execute a query to create statement with
			stmt = conn.createStatement();
			// SQL for order by hospital
			rs = stmt.executeQuery("SELECT ZIPCODE,SIDO,NVL(GUGUN,' ') AS GUGUN,NVL(DONG, ' ')"
					+ " AS DONG,NVL(RI, ' ') AS RI,NVL(BUNJI, ' ') AS BUNJI,SEQ "
					+ "FROM ZIPCODE WHERE RI LIKE '%º´¿ø' ORDER BY SEQ");
			// auto commit off
			conn.setAutoCommit(false);
			// document for element
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			// root element
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("ZIPCODE_JDBC");
			// MetaData for parsing 
			java.sql.ResultSetMetaData rsmd = rs.getMetaData(); 
			// insert data into XML
			while(rs.next()){
				Element row = doc.createElement("ZIPCODE");
				for(int i=1;i<=rsmd.getColumnCount();i++){ 
					// Column name
					String columnName = rsmd.getColumnName(i);		
					// Column data
					String colValue = rs.getString(i); 		
					// node for element
					Element node = doc.createElement(columnName);
					// append of Element Column
					node.appendChild(doc.createTextNode(colValue)); 
				row.appendChild(node);
				}
				// close element
				rootElement.appendChild(row); 			
			} // end of while
			// close element
			doc.appendChild(rootElement);
		    // Use DOM for Document
			DOMSource source = new DOMSource(doc); 
			// transforming data to XML
			TransformerFactory tfF = TransformerFactory.newInstance(); 
            Transformer transformer = tfF.newTransformer(); 
            // encoding type
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); 
            // indent text yes/no
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); 
            // declare omit XML yes/no
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            // method type XML
		    transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            // path for result     
            StreamResult result = new StreamResult(new FileOutputStream(new File("C:\\test\\ZIPCODE_JDBC.xml"))); 
            // transfer data type
            transformer.transform(source, result); 
            // check time of processing
            long endTime = System. currentTimeMillis (); 
             System.out.println("Finish");
			 System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 		
		}
		catch (Exception e) {
			 e.printStackTrace();		 
		}finally{ 
			// close the objects
			try{
				rs.close();
				stmt.close();
				conn.close();
			}catch(Exception e2){
				System.out.println(e2);
			}
		}
	}

}
