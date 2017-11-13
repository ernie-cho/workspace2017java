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
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			/*���ձ���� ����, �浵*/
			double k20_lat = 37.3860521;
			double k20_lng = 127.1214038;
			
			String QueryTxt;
			/*���� �ð��� ������ ����*/
			long startTime = System. currentTimeMillis ();
			/*��Ÿ��� ������ �ִ� �Ÿ��� ���ϴ� ����*/
			QueryTxt =  "select * from (select parking_name,parking_address,max(sqrt(pow((latitude - " + k20_lat + "), 2) "
					+ "+ pow((longitude - "+k20_lng+"), 2))) as distance"
					+ " from parking group by parking_name,parking_address) as distance2 "
					+ "where distance = (select max(sqrt(pow((latitude -" + k20_lat + "), 2) "
							+ "+ pow((longitude -"+k20_lng+"), 2))) from parking);";
			/*ResultSet���� ������ �ҷ����� */
			ResultSet rset1 = k20_stmt.executeQuery(QueryTxt);
			/*�޾ƿ� ������ ����ϰ� ����*/
			rset1.next();
			System.out.printf("���ձ�������� ���� �� ���� "+rset1.getString(2) +" �� �ִ� ");
			System.out.println(rset1.getString(1) +" �������̸�,");
			System.out.println("�Ÿ��� "+rset1.getDouble(3)+"�Դϴ�.");
			/*��Ÿ��� ������ �ּ� �Ÿ��� ���ϴ� ����*/
			QueryTxt =  "select * from (select parking_name,parking_address,min(sqrt(pow((latitude -" + k20_lat + "), 2) "
					+ "+ pow((longitude - "+k20_lng+"), 2))) as distance "
					+ "from parking group by parking_name,parking_address) as distance2 "
					+ "where distance = (select min(sqrt(pow((latitude -" + k20_lat + "), 2) "
							+ "+ pow((longitude -"+k20_lng+"), 2))) from parking);";
			/*ResultSet���� ������ �ҷ����� */
			rset1 = k20_stmt.executeQuery(QueryTxt);
			/*�޾ƿ� ������ ����ϰ� ����*/
			rset1.next();
			
			/*��� �κ�*/
			System.out.printf("���ձ�������� ���� ����� ���� "+rset1.getString(2) +" �� �ִ� ");
			System.out.println(rset1.getString(1) +" �������̸�,");
			System.out.printf("�Ÿ��� %5.15f�Դϴ�.\n", rset1.getDouble(3));
				
			/*���� �ð� ������ ����*/
			long endTime = System. currentTimeMillis (); 
			
			/*��ü ������ ���� ����*/
			k20_stmt.close();
			k20_conn.close();
			
			/*���� ���*/
			System.out.println("Finish");
			/*���� ���� ���*/ 
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
	System.out.printf("�����������ȣ		: %s\n",rset1.getString(2));
	System.out.printf("�������		: %s\n",rset1.getString(3));
	System.out.printf("����������		: %s\n",rset1.getString(4));
	System.out.printf("�����������ּ�		: %s\n",rset1.getString(5));
	System.out.printf("���������θ��ּ�	: %s\n",rset1.getString(6));
	System.out.printf("������ȹ��		: %s\n",rset1.getString(7));
	System.out.printf("�����		: %s\n",rset1.getString(8));
	System.out.printf("�������		: %s\n",rset1.getString(9));
	System.out.printf("����ó			: %s\n",rset1.getString(10));
	System.out.printf("����			: %f\n",rset1.getDouble(11));
	System.out.printf("�浵			: %f\n",rset1.getDouble(12));
	System.out.printf("*************************************************************\n");
	
}
*/
