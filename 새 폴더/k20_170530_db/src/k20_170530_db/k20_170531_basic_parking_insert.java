package k20_170530_db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class k20_170531_basic_parking_insert {

	public static void main(String[] args) {
		String sqlstr = null;
		
		try{
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			
			
			File k20_f = new File("C:\\test\\����������ǥ�ص�����_3.txt");
			/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*�ӽ÷� ���Ͽ��� �� ���徿 �ҷ��ͼ� ������ ���ڿ� ����*/
			String k20_readtxt;
			
			/*���� �ð��� ������ ����*/
			long startTime = System. currentTimeMillis ();
			
			/*PreparedStatement�� ���� ������ ����*/
			sqlstr=   " insert into parking (seq, parking_no, parking_name, parking_type,"
					+ " parking_address, parking_road, parking_size, open_day, price, contact,"
					+ " latitude, longitude) values (?,?,?,?,?,?,?,?,?,?,?,?)"; 
			PreparedStatement pstmt = k20_conn.prepareStatement(sqlstr);
			
			
			int count = 0;
			/*������ ���� �����ϱ� ���� txt���� �����͸� Table�� insert */
			while((k20_readtxt=k20_br.readLine())!=null){
				/*StringBuffer�� �̿��� ���ڿ� ����*/
				StringBuffer k20_s = new StringBuffer();
				/*("\t")�� �߶� ������ �ʵ�迭�� ����*/
				String[] k20_field = k20_readtxt.split("\t");
				/* �����͸� sql���ȿ� insert */
				pstmt.setString(1, k20_field[0]);
				pstmt.setString(2, k20_field[1]);
				pstmt.setString(3, k20_field[2]);
				pstmt.setString(4, k20_field[3]);
				pstmt.setString(5, k20_field[4]);
				pstmt.setString(6, k20_field[5]);
				pstmt.setString(7, k20_field[6]);
				pstmt.setString(8, k20_field[7]);
				pstmt.setString(9, k20_field[8]);
				pstmt.setString(10, k20_field[9]);
				pstmt.setDouble(11,Double.parseDouble(k20_field[10]));
				pstmt.setDouble(12,Double.parseDouble(k20_field[11]));
				count++;
				pstmt.execute();
			}
			/*���� �ð� ������ ����*/
			long endTime = System. currentTimeMillis (); 
			
			/*��ü ������ ���� ����*/
			k20_stmt.close();
			k20_conn.close();
			
			/*���� ���*/
			System.out.println("Finish");
			/*���� ���� ���*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			System.out.println("Data Inserted: " + count); 
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
