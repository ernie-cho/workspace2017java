package k20_170530_db;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class k20_170603_02_stock_Insert {
	public static void main(String[] args) {
	
		try{
			/*���� ��� ����*/
			File k20_f = new File("C:\\Users\\kopo\\Desktop\\������Ŭ���̾�Ʈ"
					+ "\\�ڹٺ���\\�ǽ�������\\day_data\\THTSKS010H00.dat");
			/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			String sqlstr = null;
			/*JDBC����̹� ���� �ڹ� 1.6�̻󿡼��� �ڵ����� �����*/
			Class.forName("com.mysql.jdbc.Driver");
			/*mysql ���� �� ��� ����*/
			Connection k20_conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.23.102:33070/webServer", "root", "dudeh123");
			/*Statement ��ü ����*/
			sqlstr = "Insert Into stock (stnd_iscd,bsop_date, shrn_iscd, stck_prpr, stck_oprc, stck_hgpr,"
					+ " stck_lwpr, acml_vol, acml_tr_pbmn) VALUES(?,?,?,?,?,?,?,?,?)";
			PreparedStatement k20_stmt = k20_conn.prepareStatement(sqlstr);
			k20_conn.setAutoCommit(false);
			
			/*�ӽ÷� ���Ͽ��� �� ���徿 �ҷ��ͼ� ������ ���ڿ� ����*/
			String k20_readtxt;
			/*���� ī��Ʈ�� �� ������*/
			int k20_cnt=0, k20_wcnt=0;
			/*���� �ð��� ������ ����*/
			long startTime = System. currentTimeMillis ();
			
			/*������ ���� �����ϱ� ������ ������ ���ڿ� �˻�, ��ü,�ڸ��� */
			while((k20_readtxt=k20_br.readLine())!=null){
				
				/*(%_%)�� �߶� ������ �ʵ�迭�� ����*/
				String[] k20_field = k20_readtxt.split("%_%");
				/*�������� 3��° �׸���  A�� ��ġ�ϸ� �Ʒ� ������ ����*/
				if(k20_field.length > 2&&k20_field[2].replace("^","").trim().substring(0, 1).equals("A")){
					
					/*�ʵ��� ũ�⸸ŭ �ݺ��ϸ鼭 "^" �����ϰ� �ʵ�ȿ� ������ "0"���� ġȯ*/
					for(int k20_i= 0 ; k20_i < k20_field.length ; k20_i++){
						k20_field[k20_i] = k20_field[k20_i].replace("^", "").trim();
						if(k20_field[k20_i].equals("") ){
							k20_field[k20_i] = "0";
						}
					}
					/*�ʵ� ���� �´� �����͸� �Է�����*/
					k20_stmt.setString(1, k20_field[0]); /*NOT_NULL ǥ�� �����ڵ�*/ 
					k20_stmt.setString(2, k20_field[1]); /*NOT_NULL �ֽ� ���� ����*/
					k20_stmt.setString(3, k20_field[2]); /*�������� ���� �����ڵ�*/
					k20_stmt.setString(4, k20_field[3]); /*�ֽ� ����*/
					k20_stmt.setString(5, k20_field[4]); /*�ֽ� �ð� */					
					k20_stmt.setString(6, k20_field[5]); /*�ֽ� �ְ�*/
					k20_stmt.setString(7, k20_field[6]); /*�ֽ� ������*/
					k20_stmt.setString(8, k20_field[11]);/*���� �ŷ���*/
					k20_stmt.setString(9, k20_field[12]);/*���� �ŷ� ���*/
					
					/*addBatch�� ����Ͽ� �޸𸮿� �÷ȴٰ� �ѹ��� DB�� ������ ����*/
					k20_stmt.addBatch();
					/*�Ķ���� Clear*/
					k20_stmt.clearParameters();
					/*addBatch ����*/
					if(k20_cnt % 1000 == 0){
						k20_stmt.executeBatch();
						k20_stmt.clearBatch();
						k20_conn.commit();
					}	
				}
				k20_cnt++;
			}
			/*addBatch�� �÷����� ���� ���� ������ ����*/
			k20_stmt.executeBatch();
			k20_stmt.clearBatch();
			k20_conn.commit();
			/*���� �ð� ������ ����*/
			long endTime = System. currentTimeMillis (); 
			/*BufferedReader ����*/
			k20_br.close();
			System.out.printf("Program End[%d][%d]records\n", k20_cnt,k20_wcnt);
			/*���� ���*/
			System.out.println("Finish");
			/*���� ���� ���*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			
		
		
		}catch  (Exception e){
			e.printStackTrace();
		}
	
	}
}
