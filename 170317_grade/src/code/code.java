
package code;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class code  
{

	public static void main(String[] args) 
	{
		try
		{
			OutputStream out = new FileOutputStream("C:\\test\\output.csv"); //�ش� ��ο� output.csv ���Ϸ� ����
			DataOutputStream dout = new DataOutputStream(out);
			Scanner myInput = new Scanner(System.in);
			
			String student = "";
			int scoreKor = 0, scoreEng = 0, scoreMath = 0;
			int mathTotal = 0, korTotal = 0, engTotal = 0;
			int stuTotal = 0, stuAvg =0;
			int input = 0;
		
			String strData;
			
			//dataStr = "�� ��" + "," + "�� ��" + "," + "�� ��" + "," + "�� ��" + "\n";
			strData = "�� ��" + "," + "�� ��" + "," + "�� ��" + "," + "�� ��" + "," + " "+ "," + "��������"+ "," + "�������" + "\n";
			out.write(strData.getBytes());
			
			int cnt = 0;  //�л� �߰��� �� ���� ī��Ʈ ������
			do
			{
				System.out.println("�̸��� �Է��ϼ���(�����)");
				student = myInput.next();  					//�л� �̸� �Է�
				System.out.println("���� ������ �Է��ϼ��� : ");
				scoreKor = myInput.nextInt();				
				System.out.println("���� ������ �Է��ϼ��� : ");
				scoreEng = myInput.nextInt();
				System.out.println("���� ������ �Է��ϼ��� : ");
				scoreMath = myInput.nextInt();
				System.out.println("��� �Է� �Ͻðڽ��ϱ�? ��� : 1 , �ߴ� : 2 ");
				input = myInput.nextInt();
					
				stuTotal = scoreKor+scoreEng+scoreMath;   //�л�  ���� ����
				stuAvg = stuTotal/3;					  //�л�  ���� ���
				
				//dataStr = student + "," + scoreKor + "," + scoreEng + "," + scoreMath + "," + "\n";   // ���Ϸ� ������ ���
				strData = student + "," + scoreKor + "," + scoreEng + "," + scoreMath + "," + " " + "," + stuTotal + "," + stuAvg + "\n";   // ���Ϸ� ������ ���
				out.write(strData.getBytes());
				
				korTotal += scoreKor;		//���� ���� ����
				engTotal += scoreEng;		//���� ���� ����
				mathTotal += scoreMath;		//���� ���� ����
				
				cnt++;	
			}
			while ( input == 1 );
			
			strData = "\r\n" + "���� ����" + "," + korTotal + "," + engTotal +"," + mathTotal + "\n";
			out.write(strData.getBytes());
			strData = "���� ���" + "," + korTotal/cnt + "," + engTotal/cnt +"," + mathTotal/cnt + "\n";
			out.write(strData.getBytes());
			
			myInput.close();
			out.close();			
		}
		catch(Exception e)
		{
	
		}
	
	}

}
