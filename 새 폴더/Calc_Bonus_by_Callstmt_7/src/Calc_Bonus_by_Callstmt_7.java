import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Calc_Bonus_by_Callstmt_7 {
	public static void main(String[] args) {
		String sqlstr = null;		
		try{
			// Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Open a connection
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.159.128:1521:orasparta", "scott", "dudeh123");
			long startTime = System. currentTimeMillis ();
			// --PL/SQL 
			sqlstr = " DECLARE " +
			    " CURSOR CUR_BONUS IS " +
			      " SELECT SAL, JOB, DEPTNO, EMPNO, " +
			        " CASE WHEN DEPTNO = 10 THEN SAL*0.3 " +
			             " WHEN DEPTNO = 20 THEN SAL*0.1 " +
			             " WHEN DEPTNO = 30 THEN SAL*0.05 " +
			             " ELSE SAL*0.2 " +
			        " END AS BONUS " +
			        " FROM EMP_LARGE " +
			        " WHERE JOB != 'PRESIDENT'; " +			        
			       " V_SAL    EMP.SAL%TYPE; " +
			       " V_JOB    EMP.JOB%TYPE; " +
			       " V_DEPTNO EMP.DEPTNO%TYPE; " +
			       " V_EMPNO  NUMBER; " +
			       " V_BONUS  BONUS_LARGE12.BONUS%TYPE; " +
			       " V_COUNT NUMBER; " +
			     
			" BEGIN " +
			      " OPEN CUR_BONUS; " +
			     " V_COUNT := 1; " +
			      
			     " INSERT INTO DATA_PROC_LOG(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING) " +
			             " VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'BEGIN PROCSESSING'); " +
			     " LOOP " +
			         " FETCH CUR_BONUS INTO V_SAL,V_JOB,V_DEPTNO,V_EMPNO,V_BONUS; " +
			         " EXIT WHEN CUR_BONUS%NOTFOUND; " +			          
			         " INSERT INTO BONUS_LARGE23(YYYYMM,EMPNO,JOB,DEPTNO,SAL,BONUS) " +
			               " VALUES(?,V_EMPNO,V_JOB,V_DEPTNO,V_SAL,V_BONUS); " + // PARAMETER 
			         " IF  (MOD(V_COUNT,300000) = 0) " + // DATA_PROCESSING_LOGGING EVERY 300,000 TIMES
			         " THEN " +
			         " DBMS_OUTPUT.PUT_LINE ('DATA_PROCESSING_LOGGING INSERTED'); " +
			         " INSERT INTO DATA_PROC_LOG(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING) " +
			             " VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'PROCSESSING...'); " +
			         " END IF; " +			             
			          " <<LOCAL_BLK>> " + // Create Error
			           " DECLARE " +
			             " E_CODE VARCHAR2(30); " +
			             " E_MSG VARCHAR2(50); " +
			           " BEGIN " +
			             " E_CODE := TO_CHAR(SQLCODE); " +
			             " E_MSG  := SQLERRM; " +
			               " IF (MOD(V_COUNT,1230000) =0) " + // ERROR OCCURS EVERY 1,230,000 TIMES
			               " THEN " +
			               " DBMS_OUTPUT.PUT_LINE ('ERROR LOGGING INSERTED'); " +
			               " RAISE INVALID_NUMBER; " + // Raise Error from Invail_number
			               " END IF; " +
			           " EXCEPTION " +
			               " WHEN INVALID_NUMBER THEN " +
			               " DBMS_OUTPUT.PUT_LINE('ERROR FOUNDED1'); " +
			               " INSERT INTO ERROR_LOG(COUNT,PROGRAM_NAME,LOG_DATE,LOG_TIME,ERR_CODE,ERR_MSG) " +
			                           " VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'), E_CODE,E_MSG); " +
			           " END; " +
			       " V_COUNT := V_COUNT+1; " + // INCREASE COUNT
			     " END LOOP; " + // LOOP ENDS
			         " INSERT INTO DATA_PROC_LOG(COUNT,PROGRAM_NAME,CURR_DATE,CURR_TIME,PROCESSING) " +
			                 " VALUES(V_COUNT,'BONUS_V1.0',TO_CHAR(SYSDATE, 'YYYY/MM/DD'),TO_CHAR(SYSTIMESTAMP, 'HH:MI:SS'),'PROCSESSING END'); " +
			     " CLOSE CUR_BONUS; " +
			     " COMMIT; " +
			" EXCEPTION " +
			 " WHEN OTHERS THEN " +
			     " DBMS_OUTPUT.PUT_LINE('ERROR FOUNDED2'); " +
			     " DBMS_OUTPUT.PUT_LINE('ERROR CODE =>'||TO_CHAR(SQLCODE)); " +
			     " DBMS_OUTPUT.PUT_LINE('ERROR MSG =>'||SQLERRM); " +
			" END; " ;

			CallableStatement cstmt = conn.prepareCall(sqlstr);
			cstmt.setString(1, "201705"); // -- Insert Bonus Parameter to SQL
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
