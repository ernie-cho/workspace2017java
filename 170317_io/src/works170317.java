
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class works170317{

	public static void main(String[] args) {
		try{
			OutputStream out = new FileOutputStream("C:\\code\\output.csv");
			DataOutputStream dout = new DataOutputStream(out);
			Scanner myInput = new Scanner(System.in);
			
			String name = "";
			int scoreKor = 0, scoreEng = 0, scoreMath = 0;
			int mathTotal = 0, korTotal = 0, engTotal = 0;
			int contin = 0;
			
			String dataStr;
			
		
			dataStr = "�̸�" + "," + "����" + "," + "����" + "," + "����" + "\n";
			out.write(dataStr.getBytes());
			
			int i = 0;
			do{
				System.out.println("�̸��� �Է��ϼ��� : ");
				name = myInput.next();
				System.out.println("���� ������ �Է��ϼ��� : ");
				scoreKor = myInput.nextInt();
				System.out.println("���� ������ �Է��ϼ��� : ");
				scoreEng = myInput.nextInt();
				System.out.println("���� ������ �Է��ϼ��� : ");
				scoreMath = myInput.nextInt();
				System.out.println("��� �Է� �Ͻðڽ��ϱ�? Yes : 1 , No : 2 ");
				contin = myInput.nextInt();
				
				dataStr = name + "," + scoreKor + "," + scoreEng + "," + scoreMath + "\n";
				out.write(dataStr.getBytes());
				
				korTotal += scoreKor;
				engTotal += scoreEng;
				mathTotal += scoreMath;			
				i++;
				
			}while ( contin == 1 );			
			dataStr = "\n" + "�� ��" + "," + korTotal + "," + engTotal +"," + mathTotal + "\n";
			out.write(dataStr.getBytes());
			dataStr = "�� ��" + "," + korTotal/i + "," + engTotal/i +"," + mathTotal/i + "\n";
			out.write(dataStr.getBytes());		
			myInput.close();
			out.close();
			
		}catch(Exception e){
			
			
		}

		
	}

}