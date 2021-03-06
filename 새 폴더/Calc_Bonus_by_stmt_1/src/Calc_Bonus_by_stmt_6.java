import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Calc_Bonus_by_stmt_6 {

	public static void main(String[] args) {
		ResultSet  rs = null;
		double bonus = 0;
		String sqlstr = null;
		
		try{
			// Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Open a connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.159.128:1521:orasparta", "scott", "dudeh123");
			
			// Execute a query to create statement with
			Statement stmt = conn.createStatement();
			// Query for check table
			rs = stmt.executeQuery("SELECT * FROM EMP_LARGE WHERE JOB != 'PRESIDENT'");
			// Start time 
			long startTime = System. currentTimeMillis (); 
			//Statement stmt2 = conn.createStatement();
			// --changed to PreparedStatement--
			sqlstr = "Insert Into BONUS_LARGE20(YYYYMM, EMPNO, JOB, DEPTNO, SAL, BONUS) VALUES(TO_CHAR(SYSDATE, 'YYYYMM'),?,?,?,?,?)";
			PreparedStatement stmt2 = conn.prepareStatement(sqlstr);
			int cnt = 1;
			// Start While clause
			while(rs.next()) {
				// Auto commit 
				conn.setAutoCommit(false);  
                int     sal = rs.getInt("SAL");
                String  job  = rs.getString("JOB");            
                int  deptno = rs.getInt("DEPTNO"); 
                int    empno = rs.getInt("EMPNO");
                
             // Bonus calculate  
				/*if(rs.getString("JOB").equals("PRESIDENT")){		
				    bonus = 0;
				}*/
				switch (deptno){
					case 10:
						bonus = sal * 0.3;
						break;
					case 20:
						bonus = sal * 0.1;
						break;
					case 30:
						bonus = sal * 0.05;
						break;
					case 40:
						bonus = sal * 0.2;
						break;		
				}				
             //--Insert data to BONUS_LARGE table -- 
                /*sqlstr =" INSERT INTO BONUS_LARGE5( " +
                		" YYYYMM,EMPNO,JOB,DEPTNO,SAL,BONUS ) " +
                		" VALUES ( " + 
                		" " + "TO_CHAR(SYSDATE, 'YYYYMM')" + ", '" + empno + "', '"+ job + "', '"+ deptno + "', '"+ sal + "', '"+ bonus + "' )";*/
				//--PreparedStatement data--
				stmt2.setInt(1, empno);
				stmt2.setString(2, job);
				stmt2.setInt(3, deptno);
				stmt2.setInt(4, sal);
				stmt2.setDouble(5, bonus);
				//stmt2.executeUpdate();
				// --used addBatch
				stmt2.addBatch();
				
				if(cnt%50000==0){
					stmt2.executeBatch();
					stmt2.clearBatch();
				}
				cnt++;
                // move to outside of while
                //Statement stmt2 = conn.createStatement();
                
               //commit
               //conn.commit();
			   //stmt2.close();					
            }// while(rs.next())
			stmt2.executeBatch();
			stmt2.clearBatch();
					
			 //commit
             conn.commit();
             // End time 
			 long endTime = System. currentTimeMillis ();  
			 stmt.close();
			 conn.close();
			 stmt2.close();
			
			 // Check Finish Time
			 System.out.println("Finish");
			 System.out.println("TimeCheck: " + (endTime - startTime) +"ms");			
		}//try
		catch(Exception e) {
			  e.printStackTrace();
		}//catch(Exception e)	
	}//public static void main(String[] args)
}//public class batch 
