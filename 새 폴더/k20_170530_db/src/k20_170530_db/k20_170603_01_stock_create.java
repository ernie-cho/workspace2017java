package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170603_01_stock_create {

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
					k20_stmt.execute( " create table stock(" +		
							"	stnd_iscd 	varchar(15), " +          	/*  NOT_NULL 표준 종목코드                      */ ///////
							"	bsop_date 	date 	, " +          		/*  NOT_NULL 주식 영업 일자                     */ ///////
							"	shrn_iscd 	varchar(15) ,	" +         /*  유가증권 단축 종목코드            			*/ ///////
							"	stck_prpr 	int 	, " +          		/*  주식 종가                                   */ ///////
							"	stck_oprc 	int 	, " +          		/*  주식 시가                                   */ ///////
							"	stck_hgpr 	int 	, " +          		/*  주식 최고가                                 */ ///////
							"	stck_lwpr 	int 	, " +          		/*  주식 최저가                                 */ ///////							 
							"	acml_vol 	bigint 	, " +          		/*  누적 거래량                                 */ ///////
							"	acml_tr_pbmn 	bigint 	, " +       	/*  누적 거래 대금                              */ ///////							
							" 	constraint pk primary key(stnd_iscd,bsop_date)) " +
							" 	DEFAULT CHARSET = utf8");
					/*테이블 삭제 실습*/
					//k20_stmt.execute("drop table stock");
					
					/*객체 생성과 연결 종료*/
					k20_stmt.close();
					k20_conn.close();
					
				}catch (Exception e){
					e.printStackTrace();
				}
	}

}
