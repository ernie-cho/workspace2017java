package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170601_score_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			/*�����͸� ���� ���� ����*/
			int personCnt = 1000;
			
			/*1000�� ������ ������ insert*/
			for(int i = 0 ; i < personCnt ; i++){
				/*���� ���� ����*/
				String name = String.format("ȫ��%04d",i+1);
				int kor1 = (int)( Math.random() * 100) +1;
				int eng1 = (int)( Math.random() * 100) +1;
				int mat1 = (int)( Math.random() * 100) +1;
				/*���� �Է�*/
				k20_stmt.execute( " INSERT INTO score ( studentid, name, kor, eng, mat )"
						+ "values("+ (i+1) + ",'" + name + "',"
						+ kor1 +  "," + eng1 +  "," + mat1 +")");
				
			}
			/*��ü ������ ���� ����*/
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
