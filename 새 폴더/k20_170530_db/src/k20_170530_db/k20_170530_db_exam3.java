package k20_170530_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class k20_170530_db_exam3 {
	public static void main(String[] args){
		try{
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement ��ü ����*/
			Statement k20_stmt = k20_conn.createStatement();
			/*execute�� ���� ������ ����*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('ȿ��',209901,95,100,95)"); /*ȿ�� �л� ���� �Է�*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('����',209902,95,95,95)");  /*���� �л� ���� �Է�*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('����',209903,100,100,100)");/*���� �л� ���� �Է�*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('����',209904,100,95,90)"); /*���� �л� ���� �Է�*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('�ҿ�',209905,80,100,70)"); /*�ҿ� �л� ���� �Է�*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('ť��',209906,100,100,70)");/*ť�� �л� ���� �Է�*/
			k20_stmt.execute("insert into examtable (name, studentid, kor, eng, mat) "
					+ "values ('ȭ��',209907,70,70,70)");  /*ȭ�� �л� ���� �Է�*/
			
			/*��ü ������ ���� ����*/
			k20_stmt.close();
			k20_conn.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
}
