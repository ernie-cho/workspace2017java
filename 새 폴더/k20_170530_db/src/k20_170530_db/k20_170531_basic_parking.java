package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170531_basic_parking {

	public static void main(String[] args) {
		try{
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement 객체 생성*/
			Statement k20_stmt = k20_conn.createStatement();
			
			/*execute를 통한 테이블 생성*/
			k20_stmt.execute( " create table parking(" +    /*parking 테이블 생성*/
					  " seq 			 int," +			/*sequence 컬럼 생성*/
					  " parking_no 		 varchar(300)," +	/*주차장관리번호 컬럼 생성*/
					  " parking_name	 varchar(300), " +	/*주차장명 컬럼 생성*/
					  " parking_type     varchar(300), " +	/*주차장유형 컬럼 생성*/
					  " parking_address  varchar(300)," +	/*소재지지번주소 컬럼 생성*/
					  " parking_road     varchar(300)," + 	/*소재지도로명주소 컬럼 생성*/
					  " parking_size	 varchar(300)," + 	/*주차구획수 컬럼 생성*/
					  "	open_day		 varchar(300),"+ 	/*운영요일 컬럼 생성*/
					  " price			 varchar(300)," +	/*요금정보 컬럼 생성*/
					  " contact 		 varchar(300)," +	/*연락처 컬럼 생성*/
					  " latitude 		 double," +			/*위도 컬럼 생성*/
					  " longitude		 double," +			/*경도 컬럼 생성*/
					  /*primary key로 sequence와 주차장관리번호 지정*/
					  " constraint pk primary key(seq,parking_no)) " + 
					  " DEFAULT CHARSET = utf8");/*character set utf8로 설정 */
			
			/*테이블 삭제 실습*/
			//k20_stmt.execute("drop table parking");
			
			/*객체 생성과 연결 종료*/
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
