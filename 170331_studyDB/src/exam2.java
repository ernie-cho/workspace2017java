import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = null;
		int eng = 0, math = 0;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn1 =DriverManager.getConnection("jdbc:mysql://192.168.23.102:33060/Exam2", "root", "dudeh123");
			Statement stmt1 = conn1.createStatement();
			int studentid = 0;
			while(true){
				//�Էºκ�
				System.out.println("�̸� �Է� : ");
				name = sc.nextLine();
					if(name.toLowerCase().equals("end")){//end�ԷµǸ� ���α׷� ����
						break;
					}
				System.out.println("�й� �Է� : ");
				studentid = sc.nextInt();
				System.out.println("���� ���� �Է� : ");
				eng = sc.nextInt();
				System.out.println("���� ���� �Է� : ");
				math = sc.nextInt();
				sc.nextLine();//�������� ���͸� �ѹ� �ν��ϱ� ������ �̰��� ����
				
				//�Է¹��� �����͸� �����ͺ��̽��� �߰�
				stmt1.execute("INSERT INTO score (studentid, name, eng, math, total, ave) VALUES("
						+ studentid + "," +
						"'" + name + "'," +
						eng + "," +
						math + "," +
						(eng+math) + "," +
						((eng+math)/2) +");"
						);
				
				
				//��ºκ�
				System.out.println("�̸�\t����\t����\t����\t���");
				//�����ͺ��̽� ���
				ResultSet rset1 = stmt1.executeQuery("select * from score;");//���� ��� ���� �޴°� ���� �׳� execte�ϸ� �����⸸ �ϴ°�
				while (rset1.next()){
					//����� ó��
					System.out.println(rset1.getString(2) + "\t" + rset1.getInt(3)+ "\t" +rset1.getInt(4)
							+ "\t" +rset1.getInt(5)+ "\t" +rset1.getInt(6));
				}
				//��ü ��
				rset1 = stmt1.executeQuery("select sum(eng), sum(math) from score;");
				rset1.next();
				System.out.println("��\t" + rset1.getString(1) + "\t" + rset1.getString(2));
				
				//��ü���
				rset1 = stmt1.executeQuery("select avg(eng), avg(math) from score;");
				rset1.next();
				System.out.println("���\t" + rset1.getString(1) + "\t" + rset1.getString(2));
				
				
				
				
				rset1.close();
				
			}//while(true)
			stmt1.close();
			conn1.close();
		}//try
		catch (Exception e){
			e.printStackTrace();
		}
		
		
		
		
		
	}//public static void main(String[] args)

}//public class exam2
