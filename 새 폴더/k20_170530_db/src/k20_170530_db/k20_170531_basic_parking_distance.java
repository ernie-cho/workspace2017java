package k20_170530_db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class k20_170531_basic_parking_distance {

	public static void main(String[] args) {
		
		try{
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement 객체 생성*/
			Statement k20_stmt = k20_conn.createStatement();
			/*융합기술원 위도, 경도*/
			double k20_lat = 37.3860521;
			double k20_lng = 127.1214038;
			
			String QueryTxt;
			/*시작 시간을 저장할 변수*/
			long startTime = System. currentTimeMillis ();
			/*피타고라스 정리로 최대 거리를 구하는 쿼리*/
			QueryTxt =  "select * from (select parking_name,parking_address,max(sqrt(pow((latitude - " + k20_lat + "), 2) "
					+ "+ pow((longitude - "+k20_lng+"), 2))) as distance"
					+ " from parking group by parking_name,parking_address) as distance2 "
					+ "where distance = (select max(sqrt(pow((latitude -" + k20_lat + "), 2) "
							+ "+ pow((longitude -"+k20_lng+"), 2))) from parking);";
			/*ResultSet으로 쿼리를 불러오고 */
			ResultSet rset1 = k20_stmt.executeQuery(QueryTxt);
			/*받아온 쿼리를 출력하게 해줌*/
			rset1.next();
			System.out.printf("융합기술원에서 가장 먼 곳은 "+rset1.getString(2) +" 에 있는 ");
			System.out.println(rset1.getString(1) +" 주차장이며,");
			System.out.println("거리는 "+rset1.getDouble(3)+"입니다.");
			/*피타고라스 정리로 최소 거리를 구하는 쿼리*/
			QueryTxt =  "select * from (select parking_name,parking_address,min(sqrt(pow((latitude -" + k20_lat + "), 2) "
					+ "+ pow((longitude - "+k20_lng+"), 2))) as distance "
					+ "from parking group by parking_name,parking_address) as distance2 "
					+ "where distance = (select min(sqrt(pow((latitude -" + k20_lat + "), 2) "
							+ "+ pow((longitude -"+k20_lng+"), 2))) from parking);";
			/*ResultSet으로 쿼리를 불러오고 */
			rset1 = k20_stmt.executeQuery(QueryTxt);
			/*받아온 쿼리를 출력하게 해줌*/
			rset1.next();
			
			/*출력 부분*/
			System.out.printf("융합기술원에서 가장 가까운 곳은 "+rset1.getString(2) +" 에 있는 ");
			System.out.println(rset1.getString(1) +" 주차장이며,");
			System.out.printf("거리는 %5.15f입니다.\n", rset1.getDouble(3));
				
			/*종료 시간 측정할 변수*/
			long endTime = System. currentTimeMillis (); 
			
			/*객체 생성과 연결 종료*/
			k20_stmt.close();
			k20_conn.close();
			
			/*종료 출력*/
			System.out.println("Finish");
			/*종료 시점 출력*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			//System.out.println("Data Inserted: " + count); 
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}

/*	
while (rset1.next()){
	
	
	
	System.out.printf("*************************************************************\n");
	System.out.printf("sequence		: %d\n",rset1.getInt(1));
	System.out.printf("주차장관리번호		: %s\n",rset1.getString(2));
	System.out.printf("주차장명		: %s\n",rset1.getString(3));
	System.out.printf("주차장유형		: %s\n",rset1.getString(4));
	System.out.printf("소재지지번주소		: %s\n",rset1.getString(5));
	System.out.printf("소재지도로명주소	: %s\n",rset1.getString(6));
	System.out.printf("주차구획수		: %s\n",rset1.getString(7));
	System.out.printf("운영요일		: %s\n",rset1.getString(8));
	System.out.printf("요금정보		: %s\n",rset1.getString(9));
	System.out.printf("연락처			: %s\n",rset1.getString(10));
	System.out.printf("위도			: %f\n",rset1.getDouble(11));
	System.out.printf("경도			: %f\n",rset1.getDouble(12));
	System.out.printf("*************************************************************\n");
	
}
*/
