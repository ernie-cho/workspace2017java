import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class zipcode {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int LineCnt=0;
		try {
			// Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Open a connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.159.128:1521:orasparta", "scott", "dudeh123");
			// Set auto commit as false.
			conn.setAutoCommit(false);
			// Execute a query to create statment with
			Statement stmt = conn.createStatement();
			// Open file 
			FileInputStream f = new FileInputStream("C:\\test\\zipcode.csv");
			BufferedInputStream bis = new BufferedInputStream(f);
			BufferedReader br = new BufferedReader(new InputStreamReader(bis));
			// text file reading
			String readtxt;
			// Look for true file
			if((readtxt = br.readLine())==null){
				System.out.println("Empty File");
				return;
			}
			// Split with (,) because csv 
			String[] field_name = readtxt.split(","); 
			// Read data and split and Insert Query
			while((readtxt = br.readLine()) != null){
				try{
				String[] field = readtxt.split(","); //split with (,) csv 
				String QueryTxt ;
			// Insert Query
			QueryTxt = String.format("INSERT INTO zipcode ("
					+ "ZIPCODE, SIDO, GUGUN, DONG, RI,"
					+ "BUNJI, SEQ)"
					+ "VALUES ("
					+ "'%s', '%s', '%s', '%s', '%s',"
					+ "'%s', %s)",
					field[0], field[1], field[2], field[3], field[4],
					field[5], field[6]);
			stmt.execute(QueryTxt);
			// Print on Eclipe console
			System.out.printf("%d's Data Insert OK [%s]\n", LineCnt, QueryTxt);
			// If error appears send error log on FileOutputStream
				  }catch (Exception e1){
					  try { 
							FileOutputStream out = new FileOutputStream("C:\\test\\error.txt", true);
							PrintStream ps = new PrintStream(out);
							System.setErr(ps);
							System.err.println("Error: " + LineCnt + "Line");
							e1.printStackTrace();
							System.out.printf("%d's Data Insert Failed\n", LineCnt);
						} catch(Exception e2) {
							System.out.print("Error message failed");
						}
					  }
				LineCnt++;
			}//while((readtxt = br.readLine()) != null)
			
			br.close();
			stmt.close();
			conn.close();
			System.out.println("Finish");
			
		} catch(Exception e) {
			System.out.printf("%d Failed!!\n", LineCnt);
			
		}finally {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.159.128:1521:orasparta", "scott", "dudeh123");	
				Statement stmt = conn.createStatement();	
				conn.setAutoCommit(true); // Reset transaction as true
		        if( stmt != null ) stmt.close();
		        if( conn != null ) conn.close();
			}catch (SQLException sqe) { 	  
		  		}
		}		
	}//public static void main(String[] args)

}//public class zipcode
