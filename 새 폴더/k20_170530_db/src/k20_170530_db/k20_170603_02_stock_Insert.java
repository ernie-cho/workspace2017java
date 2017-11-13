package k20_170530_db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class k20_170603_02_stock_Insert {
	public static void main(String[] args) {
	
		try{
			/*파일 경로 지정*/
			File k20_f = new File("C:\\Users\\kopo\\Desktop\\웹서버클라이언트"
					+ "\\자바복습\\실습데이터\\day_data\\THTSKS010H00.dat");
			/*파일 연결하는데 FileReader를 이용하게 됨*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			String sqlstr = null;
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement 객체 생성*/
			sqlstr = "Insert Into stock (stnd_iscd,bsop_date, shrn_iscd, stck_prpr, stck_oprc, stck_hgpr,"
					+ " stck_lwpr, acml_vol, acml_tr_pbmn) VALUES(?,?,?,?,?,?,?,?,?)";
			PreparedStatement k20_stmt = k20_conn.prepareStatement(sqlstr);
			k20_conn.setAutoCommit(false);
			
			/*임시로 파일에서 한 문장씩 불러와서 저장할 문자열 변수*/
			String k20_readtxt;
			/*라인 카운트를 할 변수들*/
			int k20_cnt=0, k20_wcnt=0;
			/*시작 시간을 저장할 변수*/
			long startTime = System. currentTimeMillis ();
			
			/*파일의 끝에 도달하기 전까지 조건의 문자열 검색, 대체,자르기 */
			while((k20_readtxt=k20_br.readLine())!=null){
				
				/*(%_%)를 잘라낸 라인을 필드배열에 저장*/
				String[] k20_field = k20_readtxt.split("%_%");
				/*데이터의 3번째 항목이  A와 일치하면 아래 내용을 수행*/
				if(k20_field.length > 2&&k20_field[2].replace("^","").trim().substring(0, 1).equals("A")){
					
					/*필드의 크기만큼 반복하면서 "^" 삭제하고 필드안에 공백을 "0"으로 치환*/
					for(int k20_i= 0 ; k20_i < k20_field.length ; k20_i++){
						k20_field[k20_i] = k20_field[k20_i].replace("^", "").trim();
						if(k20_field[k20_i].equals("") ){
							k20_field[k20_i] = "0";
						}
					}
					/*필드 값에 맞는 데이터를 입력해줌*/
					k20_stmt.setString(1, k20_field[0]); /*NOT_NULL 표준 종목코드*/ 
					k20_stmt.setString(2, k20_field[1]); /*NOT_NULL 주식 영업 일자*/
					k20_stmt.setString(3, k20_field[2]); /*유가증권 단축 종목코드*/
					k20_stmt.setString(4, k20_field[3]); /*주식 종가*/
					k20_stmt.setString(5, k20_field[4]); /*주식 시가 */					
					k20_stmt.setString(6, k20_field[5]); /*주식 최고가*/
					k20_stmt.setString(7, k20_field[6]); /*주식 최저가*/
					k20_stmt.setString(8, k20_field[11]);/*누적 거래량*/
					k20_stmt.setString(9, k20_field[12]);/*누적 거래 대금*/
					
					/*addBatch를 사용하여 메모리에 올렸다가 한번에 DB에 쿼리를 날림*/
					k20_stmt.addBatch();
					/*파라미터 Clear*/
					k20_stmt.clearParameters();
					/*addBatch 조건*/
					if(k20_cnt % 1000 == 0){
						k20_stmt.executeBatch();
						k20_stmt.clearBatch();
						k20_conn.commit();
					}	
				}
				k20_cnt++;
			}
			/*addBatch에 올려지지 않은 남은 데이터 수행*/
			k20_stmt.executeBatch();
			k20_stmt.clearBatch();
			k20_conn.commit();
			/*종료 시간 측정할 변수*/
			long endTime = System. currentTimeMillis (); 
			/*BufferedReader 종료*/
			k20_br.close();
			System.out.printf("Program End[%d][%d]records\n", k20_cnt,k20_wcnt);
			/*종료 출력*/
			System.out.println("Finish");
			/*종료 시점 출력*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			
		
		
		}catch  (Exception e){
			e.printStackTrace();
		}
	
	}
}
