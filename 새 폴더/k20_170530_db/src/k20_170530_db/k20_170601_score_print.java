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
			/*��¥ ���ϱ� �Լ�*/
			GregorianCalendar k20_calender = new GregorianCalendar();
			/*����Ͻú� ����*/
			SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");  
			/*�ð� ���� ���� ����*/
			String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());
			 /*�ð� ��¿� ����*/
			String k20_date= k20_dateTime.substring(0,4) +"."+ k20_dateTime.substring(4,6) +"."+ k20_dateTime.substring(6,8)
		    + " " + k20_dateTime.substring(8,10) +":" + k20_dateTime.substring(10, 12) +":"+k20_dateTime.substring(12,14);
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			
			/*�������� ������ ����*/
			String QueryTxt;
			
			/*Score ���̺��� ����� Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			/*Score ���̺� ������ ī��Ʈ �� Statement ��ü ����*/
			Statement k20_stmt1 = k20_conn.createStatement();
			/*������������ ����� Statement ��ü ����*/
			Statement k20_stmt2 = k20_conn.createStatement();
			/*������������ ����� Statement ��ü ����*/
			Statement k20_stmt3 = k20_conn.createStatement();
			
			/*Score ���̺� ���� �ҷ�����*/
			QueryTxt = " select count(*) from score ";
			/*Score ���̺� ������ ī��Ʈ �� ResultSet ����*/
			ResultSet rset = k20_stmt1.executeQuery(QueryTxt);
			rset.next();
	
			/*���̺��� �� ���ڵ� �� �޾ƿ���*/
			int personCnt = rset.getInt(1);
			
			QueryTxt = " select studentid, name, kor, eng, mat, kor+eng+mat, (kor+eng+mat)/3 from score ";
			
			/*Score ���̺��� ����� ResultSet ����*/
			ResultSet rset1 = k20_stmt.executeQuery(QueryTxt);
			/*������������ ����� ResultSet ����*/
			ResultSet rset2 = null;
			/*������������ ����� ResultSet ����*/
			ResultSet rset3 =null;
			/*�����, ������, ������������ ī��Ʈ ���� ����*/
			int cnt = 1;
			int pageCnt =1;
			int lastCnt = 0;
			while(true){
				System.out.printf("%37s\n", "��������ǥ");/*���� ���*/
				/*������ ī��Ʈ + ����Ͻ� ���*/
				System.out.printf("%5s %1d %39s %8.20s \n","PAGE : ",pageCnt, "������� :",k20_date);
				System.out.printf("==========================================================================\n");
				System.out.printf("%s %6s %8s %8s %8s %8s %8s\n", "�л�ID","�̸�","����","����","����","�л��հ�","�л����");
				System.out.printf("--------------------------------------------------------------------------\n");
				/*�ݺ����� ����Ǵ� ���� ������ �Է�*/
				for(int i = 0; i < 30; i++){
					rset1.next();
					System.out.printf("%,5d %9s %7d %10d %10d %10d %15f\n", rset1.getInt(1), rset1.getString(2),
							rset1.getInt(3), rset1.getInt(4), rset1.getInt(5), rset1.getInt(6), rset1.getDouble(7));
					/*����� ī��Ʈ�� ��¶��ΰ� ��ġ�ϸ� �ݺ��� ����*/
				  if(cnt == personCnt ){
					break;
				  }
				  
				  cnt++;
				  
				}
				////////////////////////////////���� ������/////////////////////////////
				if(cnt % 2 == 1 && pageCnt <= personCnt/30){
					/*���������� ��� ����*/
				QueryTxt = "select sum(kor+eng+mat), sum(kor+eng+mat)/"+ ((cnt-1)/pageCnt)*3+""
						+", sum(kor), sum(eng), sum(mat)"
						+", sum(kor)/"+ ((cnt-1)/pageCnt)+""
						+", sum(eng)/"+ ((cnt-1)/pageCnt)+""
						+", sum(mat)/"+ ((cnt-1)/pageCnt)+""
						+ " from (select kor, eng, mat from score limit " + (cnt-31) + ", 30) lmt;";

				
				rset2 = k20_stmt2.executeQuery(QueryTxt);
				rset2.next();
				System.out.printf("==========================================================================\n");
				System.out.printf(" ����������\n");
				System.out.printf("%s %7d %10d %10d %15s %d \n"," �� �� �� �� �� : "
						,rset2.getInt(3),rset2.getInt(4),rset2.getInt(5) ,"������ �հ� :",rset2.getInt(1));
				System.out.printf("%s %7f %10f %10f %8s %f\n"," �� �� �� �� �� : "
						,rset2.getDouble(6),rset2.getDouble(7),rset2.getDouble(8) ,"������ ��� :", rset2.getDouble(2));
				System.out.printf("==========================================================================\n");
				System.out.printf("\n");
				lastCnt = cnt;
				}
				else{
					/*������ ���� ��� ����*/
					/*���������� ��� ����*/
					QueryTxt = "select sum(kor+eng+mat), sum(kor+eng+mat)/"+ (cnt-(lastCnt-1))*3+""
							+", sum(kor), sum(eng), sum(mat)"
							+", sum(kor)/"+ (cnt-(lastCnt-1))+""
							+", sum(eng)/"+ (cnt-(lastCnt-1))+""
							+", sum(mat)/"+ (cnt-(lastCnt-1))+""
							+ " from (select kor, eng, mat from score limit " + (lastCnt - 1) + "," + (cnt-lastCnt+1) +") lmt;";
					rset2 = k20_stmt2.executeQuery(QueryTxt);
					rset2.next();
					System.out.printf("==========================================================================\n");
					System.out.printf(" ����������\n");
					System.out.printf("%s %7d %10d %10d %15s %d \n"," �� �� �� �� �� : "
							,rset2.getInt(3),rset2.getInt(4),rset2.getInt(5) ,"������ �հ� :",rset2.getInt(1));
					System.out.printf("%s %7f %10f %10f %8s %f\n"," �� �� �� �� �� : "
							,rset2.getDouble(6),rset2.getDouble(7),rset2.getDouble(8) ,"������ ��� :", rset2.getDouble(2));
					System.out.printf("==========================================================================\n");
					//System.out.printf("\n");
				}
				////////////////////////////////���� ������/////////////////////////////
				if(cnt % 2 == 1 && pageCnt <= personCnt/30){
					/*���� ������ ��� ����*/
				QueryTxt = "select sum(kor+eng+mat), sum(kor+eng+mat)/"+ (cnt-1)*3+""
						+", sum(kor), sum(eng), sum(mat)"
						+", sum(kor)/"+ (cnt-1)+""
						+", sum(eng)/"+ (cnt-1)+""
						+", sum(mat)/"+ (cnt-1)+""
						+ " from (select kor, eng, mat from score limit 0," + (30+(cnt-31)) + ") lmt;";

				/*������������ ���� ResultSet*/
				rset3 = k20_stmt3.executeQuery(QueryTxt);
				rset3.next();
				System.out.printf("==========================================================================\n");
				System.out.printf(" ����������\n");
				System.out.printf("%s %7d %10d %10d %10s %d \n"," �� �� �� �� �� : "
						,rset3.getInt(3),rset3.getInt(4),rset3.getInt(5) ,"������ �հ� :",rset3.getInt(1));
				System.out.printf("%s %7f %10f %10f %8s %f\n"," �� �� �� �� �� : "
						,rset3.getDouble(6),rset3.getDouble(7),rset3.getDouble(8) ,"������ ��� :", rset3.getDouble(2));
				System.out.printf("==========================================================================\n");
				//System.out.printf("\n");
				lastCnt = cnt;
				}
				else{
					/*������ ���� ��� ����*/
					/*���������� ��� ����*/
					QueryTxt ="select sum(kor+eng+mat), sum(kor+eng+mat)/"+ personCnt*3+""
							+", sum(kor), sum(eng), sum(mat)"
							+", sum(kor)/"+ personCnt+"" /*���������� ������ ���� ��� �� ���ο��� ����*/
							+", sum(eng)/"+ personCnt+"" /*cnt�� ����� ������ personCnt�� �����°� �� ����*/
							+", sum(mat)/"+ personCnt+""
							+ " from (select kor, eng, mat from score limit 0," + (30+(cnt-31)) + ") lmt;";
					/*������������ ���� ResultSet*/
					rset3 = k20_stmt3.executeQuery(QueryTxt);
					rset3.next();
					System.out.printf("==========================================================================\n");
					System.out.printf(" ����������\n");
					System.out.printf("%s %7d %10d %10d %10s %d \n"," �� �� �� �� �� : "
							,rset3.getInt(3),rset3.getInt(4),rset3.getInt(5) ,"������ �հ� :",rset3.getInt(1));
					System.out.printf("%s %7f %10f %10f %8s %f\n"," �� �� �� �� �� : "
							,rset3.getDouble(6),rset3.getDouble(7),rset3.getDouble(8) ,"������ ��� :", rset3.getDouble(2));
					System.out.printf("==========================================================================\n");
					//System.out.printf("\n");
				}				
				pageCnt++;
				
				
				/*While ���ǹ� Ż�� ����*/
				if(personCnt == cnt)
					break;

				
			}
			

			/*��ü ������ ���� ����*/
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
