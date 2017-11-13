package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class k20_170603_04_stock_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String sqlstr = null;
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement 객체 생성*/
			Statement k20_stmt = k20_conn.createStatement();
			/*특정 일자 조회*/
			sqlstr = "select * from stock where bsop_date = '2007-01-04'";
			/*쿼리문을 수행 할 ResultSet 선언*/
			ResultSet rs = k20_stmt.executeQuery(sqlstr);
			
			/*라인 카운트를 할 변수*/
			int k20_cnt=0;
			/*시작 시간을 저장할 변수*/
			long startTime = System. currentTimeMillis ();
			/*헤드 부분을 출력*/
			System.out.printf("======================================================================================================================================\n");
			System.out.printf("%s %6s %8s %8s %8s %8s %9s %9s %10s\n", " 표준종목코드","주식영업일자",
					"유가증권단축종목코드","주식종가","주식시가","주식최고가","주식최저가","누적거래량","누적거래대금");
			System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------\n");
			/*파일의 끝에 도달하기 전까지 쿼리문에 작성된 날짜 데이터만 출력 */
			while(rs.next()){
				rs.getString(1);	/*  표준종목코드  */
				rs.getInt(2);		/*  주식영업일자  */
				rs.getString(3);	/*  유가증권단축종목코드  */
				rs.getInt(4);		/*  주식종가  */
				rs.getInt(5);		/*  주식시가  */
				rs.getInt(6);		/*  주식최고가  */
				rs.getInt(7);		/*  주식최저가  */
				rs.getLong(8);		/*  누적거래량  */
				rs.getLong(9);		/*  누적거래대금  */
				/*내용 출력*/
				System.out.printf(" %1s %10s %16s %,15d %,14d %,12d %,15d %,13d %,18d\n",rs.getString(1),rs.getString(2),rs.getString(3)
						,rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getLong(8),rs.getLong(9));
				/*검색했던 전체 데이터 개수*/
				k20_cnt++;
			}
			/*꼬리 부분을 출력*/
			System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------\n");			
			System.out.printf("%s %6s %8s %8s %8s %8s %9s %9s %10s\n", " 표준종목코드","주식영업일자",
					"유가증권단축종목코드","주식종가","주식시가","주식최고가","주식최저가","누적거래량","누적거래대금");
			System.out.printf("======================================================================================================================================\n");
			/*종료 시간 측정할 변수*/
			long endTime = System. currentTimeMillis (); 
			
			
			System.out.printf("Program End[%d]records\n", k20_cnt);
			/*종료 출력*/
			System.out.println("Finish");
			/*종료 시점 출력*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			
		
		
		}catch  (Exception e){
			e.printStackTrace();
		}
	}

}
