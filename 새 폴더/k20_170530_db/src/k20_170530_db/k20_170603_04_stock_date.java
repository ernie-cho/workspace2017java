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
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			/*Ư�� ���� ��ȸ*/
			sqlstr = "select * from stock where bsop_date = '2007-01-04'";
			/*�������� ���� �� ResultSet ����*/
			ResultSet rs = k20_stmt.executeQuery(sqlstr);
			
			/*���� ī��Ʈ�� �� ����*/
			int k20_cnt=0;
			/*���� �ð��� ������ ����*/
			long startTime = System. currentTimeMillis ();
			/*��� �κ��� ���*/
			System.out.printf("======================================================================================================================================\n");
			System.out.printf("%s %6s %8s %8s %8s %8s %9s %9s %10s\n", " ǥ�������ڵ�","�ֽĿ�������",
					"�������Ǵ��������ڵ�","�ֽ�����","�ֽĽð�","�ֽ��ְ�","�ֽ�������","�����ŷ���","�����ŷ����");
			System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------\n");
			/*������ ���� �����ϱ� ������ �������� �ۼ��� ��¥ �����͸� ��� */
			while(rs.next()){
				rs.getString(1);	/*  ǥ�������ڵ�  */
				rs.getInt(2);		/*  �ֽĿ�������  */
				rs.getString(3);	/*  �������Ǵ��������ڵ�  */
				rs.getInt(4);		/*  �ֽ�����  */
				rs.getInt(5);		/*  �ֽĽð�  */
				rs.getInt(6);		/*  �ֽ��ְ�  */
				rs.getInt(7);		/*  �ֽ�������  */
				rs.getLong(8);		/*  �����ŷ���  */
				rs.getLong(9);		/*  �����ŷ����  */
				/*���� ���*/
				System.out.printf(" %1s %10s %16s %,15d %,14d %,12d %,15d %,13d %,18d\n",rs.getString(1),rs.getString(2),rs.getString(3)
						,rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getLong(8),rs.getLong(9));
				/*�˻��ߴ� ��ü ������ ����*/
				k20_cnt++;
			}
			/*���� �κ��� ���*/
			System.out.printf("--------------------------------------------------------------------------------------------------------------------------------------\n");			
			System.out.printf("%s %6s %8s %8s %8s %8s %9s %9s %10s\n", " ǥ�������ڵ�","�ֽĿ�������",
					"�������Ǵ��������ڵ�","�ֽ�����","�ֽĽð�","�ֽ��ְ�","�ֽ�������","�����ŷ���","�����ŷ����");
			System.out.printf("======================================================================================================================================\n");
			/*���� �ð� ������ ����*/
			long endTime = System. currentTimeMillis (); 
			
			
			System.out.printf("Program End[%d]records\n", k20_cnt);
			/*���� ���*/
			System.out.println("Finish");
			/*���� ���� ���*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			
		
		
		}catch  (Exception e){
			e.printStackTrace();
		}
	}

}
