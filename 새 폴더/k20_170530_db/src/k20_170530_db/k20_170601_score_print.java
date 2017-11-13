package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class k20_170601_score_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{			
			/*날짜 구하기 함수*/
			GregorianCalendar k20_calender = new GregorianCalendar();
			/*년월일시분 포맷*/
			SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");  
			/*시간 포맷 지정 변수*/
			String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());
			 /*시간 출력용 변수*/
			String k20_date= k20_dateTime.substring(0,4) +"."+ k20_dateTime.substring(4,6) +"."+ k20_dateTime.substring(6,8)
		    + " " + k20_dateTime.substring(8,10) +":" + k20_dateTime.substring(10, 12) +":"+k20_dateTime.substring(12,14);
			/*JDBC드라이버 설정 자바 1.6이상에서는 자동으로 잡아줌*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql 연결 및 경로 설정*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			
			/*쿼리문을 저장할 변수*/
			String QueryTxt;
			
			/*Score 테이블을 출력할 Statement 객체 생성*/
			Statement k20_stmt = k20_conn.createStatement();
			/*Score 테이블 개수를 카운트 할 Statement 객체 생성*/
			Statement k20_stmt1 = k20_conn.createStatement();
			/*현재페이지를 출력할 Statement 객체 생성*/
			Statement k20_stmt2 = k20_conn.createStatement();
			/*누적페이지를 출력할 Statement 객체 생성*/
			Statement k20_stmt3 = k20_conn.createStatement();
			
			/*Score 테이블 개수 불러오기*/
			QueryTxt = " select count(*) from score ";
			/*Score 테이블 개수를 카운트 할 ResultSet 생성*/
			ResultSet rset = k20_stmt1.executeQuery(QueryTxt);
			rset.next();
	
			/*테이블의 총 레코드 수 받아오기*/
			int personCnt = rset.getInt(1);
			
			QueryTxt = " select studentid, name, kor, eng, mat, kor+eng+mat, (kor+eng+mat)/3 from score ";
			
			/*Score 테이블을 출력할 ResultSet 생성*/
			ResultSet rset1 = k20_stmt.executeQuery(QueryTxt);
			/*현재페이지를 출력할 ResultSet 생성*/
			ResultSet rset2 = null;
			/*누적페이지를 출력할 ResultSet 생성*/
			ResultSet rset3 =null;
			/*사람수, 페이지, 마지막페이지 카운트 변수 생성*/
			int cnt = 1;
			int pageCnt =1;
			int lastCnt = 0;
			while(true){
				System.out.printf("%37s\n", "성적집계표");/*제목 출력*/
				/*페이지 카운트 + 출력일시 출력*/
				System.out.printf("%5s %1d %39s %8.20s \n","PAGE : ",pageCnt, "출력일자 :",k20_date);
				System.out.printf("==========================================================================\n");
				System.out.printf("%s %6s %8s %8s %8s %8s %8s\n", "학생ID","이름","국어","영어","수학","학생합계","학생평균");
				System.out.printf("--------------------------------------------------------------------------\n");
				/*반복문이 수행되는 동안 데이터 입력*/
				for(int i = 0; i < 30; i++){
					rset1.next();
					System.out.printf("%,5d %9s %7d %10d %10d %10d %15f\n", rset1.getInt(1), rset1.getString(2),
							rset1.getInt(3), rset1.getInt(4), rset1.getInt(5), rset1.getInt(6), rset1.getDouble(7));
					/*사람수 카운트가 출력라인과 일치하면 반복문 종료*/
				  if(cnt == personCnt ){
					break;
				  }
				  
				  cnt++;
				  
				}
				////////////////////////////////현재 페이지/////////////////////////////
				if(cnt % 2 == 1 && pageCnt <= personCnt/30){
					/*현재페이지 계산 쿼리*/
				QueryTxt = "select sum(kor+eng+mat), sum(kor+eng+mat)/"+ ((cnt-1)/pageCnt)*3+""
						+", sum(kor), sum(eng), sum(mat)"
						+", sum(kor)/"+ ((cnt-1)/pageCnt)+""
						+", sum(eng)/"+ ((cnt-1)/pageCnt)+""
						+", sum(mat)/"+ ((cnt-1)/pageCnt)+""
						+ " from (select kor, eng, mat from score limit " + (cnt-31) + ", 30) lmt;";

				
				rset2 = k20_stmt2.executeQuery(QueryTxt);
				rset2.next();
				System.out.printf("==========================================================================\n");
				System.out.printf(" 현재페이지\n");
				System.out.printf("%s %7d %10d %10d %15s %d \n"," 과 목 별 총 합 : "
						,rset2.getInt(3),rset2.getInt(4),rset2.getInt(5) ,"페이지 합계 :",rset2.getInt(1));
				System.out.printf("%s %7f %10f %10f %8s %f\n"," 과 목 별 평 균 : "
						,rset2.getDouble(6),rset2.getDouble(7),rset2.getDouble(8) ,"페이지 평균 :", rset2.getDouble(2));
				System.out.printf("==========================================================================\n");
				System.out.printf("\n");
				lastCnt = cnt;
				}
				else{
					/*마지막 라인 출력 조건*/
					/*현재페이지 계산 쿼리*/
					QueryTxt = "select sum(kor+eng+mat), sum(kor+eng+mat)/"+ (cnt-(lastCnt-1))*3+""
							+", sum(kor), sum(eng), sum(mat)"
							+", sum(kor)/"+ (cnt-(lastCnt-1))+""
							+", sum(eng)/"+ (cnt-(lastCnt-1))+""
							+", sum(mat)/"+ (cnt-(lastCnt-1))+""
							+ " from (select kor, eng, mat from score limit " + (lastCnt - 1) + "," + (cnt-lastCnt+1) +") lmt;";
					rset2 = k20_stmt2.executeQuery(QueryTxt);
					rset2.next();
					System.out.printf("==========================================================================\n");
					System.out.printf(" 현재페이지\n");
					System.out.printf("%s %7d %10d %10d %15s %d \n"," 과 목 별 총 합 : "
							,rset2.getInt(3),rset2.getInt(4),rset2.getInt(5) ,"페이지 합계 :",rset2.getInt(1));
					System.out.printf("%s %7f %10f %10f %8s %f\n"," 과 목 별 평 균 : "
							,rset2.getDouble(6),rset2.getDouble(7),rset2.getDouble(8) ,"페이지 평균 :", rset2.getDouble(2));
					System.out.printf("==========================================================================\n");
					//System.out.printf("\n");
				}
				////////////////////////////////누적 페이지/////////////////////////////
				if(cnt % 2 == 1 && pageCnt <= personCnt/30){
					/*누적 페이지 계산 쿼리*/
				QueryTxt = "select sum(kor+eng+mat), sum(kor+eng+mat)/"+ (cnt-1)*3+""
						+", sum(kor), sum(eng), sum(mat)"
						+", sum(kor)/"+ (cnt-1)+""
						+", sum(eng)/"+ (cnt-1)+""
						+", sum(mat)/"+ (cnt-1)+""
						+ " from (select kor, eng, mat from score limit 0," + (30+(cnt-31)) + ") lmt;";

				/*누적페이지를 위한 ResultSet*/
				rset3 = k20_stmt3.executeQuery(QueryTxt);
				rset3.next();
				System.out.printf("==========================================================================\n");
				System.out.printf(" 누적페이지\n");
				System.out.printf("%s %7d %10d %10d %10s %d \n"," 과 목 별 총 합 : "
						,rset3.getInt(3),rset3.getInt(4),rset3.getInt(5) ,"페이지 합계 :",rset3.getInt(1));
				System.out.printf("%s %7f %10f %10f %8s %f\n"," 과 목 별 평 균 : "
						,rset3.getDouble(6),rset3.getDouble(7),rset3.getDouble(8) ,"페이지 평균 :", rset3.getDouble(2));
				System.out.printf("==========================================================================\n");
				//System.out.printf("\n");
				lastCnt = cnt;
				}
				else{
					/*마지막 라인 출력 조건*/
					/*누적페이지 계산 쿼리*/
					QueryTxt ="select sum(kor+eng+mat), sum(kor+eng+mat)/"+ personCnt*3+""
							+", sum(kor), sum(eng), sum(mat)"
							+", sum(kor)/"+ personCnt+"" /*누적페이지 마지막 쿼리 계산 시 총인원을 나눔*/
							+", sum(eng)/"+ personCnt+"" /*cnt로 나누어도 되지만 personCnt로 나누는게 더 나음*/
							+", sum(mat)/"+ personCnt+""
							+ " from (select kor, eng, mat from score limit 0," + (30+(cnt-31)) + ") lmt;";
					/*누적페이지를 위한 ResultSet*/
					rset3 = k20_stmt3.executeQuery(QueryTxt);
					rset3.next();
					System.out.printf("==========================================================================\n");
					System.out.printf(" 누적페이지\n");
					System.out.printf("%s %7d %10d %10d %10s %d \n"," 과 목 별 총 합 : "
							,rset3.getInt(3),rset3.getInt(4),rset3.getInt(5) ,"페이지 합계 :",rset3.getInt(1));
					System.out.printf("%s %7f %10f %10f %8s %f\n"," 과 목 별 평 균 : "
							,rset3.getDouble(6),rset3.getDouble(7),rset3.getDouble(8) ,"페이지 평균 :", rset3.getDouble(2));
					System.out.printf("==========================================================================\n");
					//System.out.printf("\n");
				}				
				pageCnt++;
				
				
				/*While 조건문 탈출 조건*/
				if(personCnt == cnt)
					break;

				
			}
			

			/*객체 생성과 연결 종료*/
			rset1.close();
			rset2.close();
			k20_stmt2.close();
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
