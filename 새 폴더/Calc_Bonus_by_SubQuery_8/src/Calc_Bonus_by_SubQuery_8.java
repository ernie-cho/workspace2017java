import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Calc_Bonus_by_SubQuery_8 {
	public static void main(String[] args) {
		String sqlstr = null;		
		try{
			// Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Open a connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.159.128:1521:orasparta", "scott", "dudeh123");
			long startTime = System. currentTimeMillis ();
			// --PL/SQL 
			sqlstr = " INSERT INTO BONUS_LARGE26 "
					+ " (SELECT TO_CHAR(SYSDATE, 'YYYY/MM'),EMPNO, JOB, DEPTNO,SAL, "
					+ " CASE WHEN DEPTNO = 10 THEN SAL*0.3 "
					+ " WHEN DEPTNO = 20 THEN SAL*0.1 "
					+ " WHEN DEPTNO = 30 THEN SAL*0.05 "
					+ " ELSE SAL*0.2 "
					+ " END AS BONUS "
					+ " FROM EMP_LARGE WHERE JOB != 'PRESIDENT') ";
			CallableStatement cstmt = conn.prepareCall(sqlstr);
			//cstmt.setString(1, "201705"); // -- Insert Bonus Parameter to SQL
			cstmt.execute();
			long endTime = System. currentTimeMillis ();  
			// Close
			cstmt.close();
			conn.close();
			 System.out.println("Finish");
			 System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); // Time Check	
		}
		catch(Exception e) {
			 e.printStackTrace();
		}
	}
}
