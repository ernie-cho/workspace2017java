import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class array_class 
{

	public static void main(String[] args) 
	{
		try
		{
		OutputStream out = new FileOutputStream("C:\\test\\output.csv"); //�ش� ��ο� output.csv ���Ϸ� ����
		DataOutputStream dout = new DataOutputStream(out);
		
		
		int[][] score = new int[100][2];
		int number = 1;
		int question = 0;
		Scanner myInput = new Scanner(System.in);
		do
		{
			System.out.println(number + "�� �л���");
			System.out.println("���� ������ �Է��ϼ��� : ");
			score[number][0] = myInput.nextInt();
			System.out.println("���� ������ �Է��ϼ��� : ");
			score[number][1] = myInput.nextInt();
			number++;
			
			System.out.println("��� �Է� �Ͻðڽ��ϱ�? ��� : 1 , �ߴ� : 2 ");
			question = myInput.nextInt();
		}
		while(question !=2);
		
		for(int i=0; i < number; i++) //���
		{
			for(int j=0; j < 2; j++)
			{
				System.out.print(score[i][j] + "\t");	
			}
			System.out.println();
		}

		}//try
		
		catch(Exception e)
		{
			
		}//catch
		
		
		//Scanner myInput = new Scanner(System.in);
		/*
		//�����Է� ���
	try
	{
		OutputStream out = new FileOutputStream("C:\\test\\output.csv"); //�ش� ��ο� output.csv ���Ϸ� ����
		DataOutputStream dout = new DataOutputStream(out);
		
		int[] arr2 = new int[10];
		String[] arr = new String[100];
		String student = "";
		String printData ="";
		int score = 0;
		int input = 0;
		int count =0;
		String strData;
		strData = "�̸�" + "," + "����" + "\n";
		out.write(strData.getBytes());
		
		do
		{			
			System.out.println("�̸��� �Է��ϼ��� : ");
			arr[count] = myInput.next(); 
			System.out.println("������ �����Դϱ�? ");
			arr2[count] = myInput.nextInt(); 	
			System.out.println("��� �Է� �Ͻðڽ��ϱ�? ��� : 1 , �ߴ� : 2 ");
			input = myInput.nextInt();
			count++;		
		}
		while (input == 1);
		
		for(int i = 0; i < count; i++)
		{
			printData= arr[i] +","+arr2[i] + "\n";
			out.write(printData.getBytes());		
		}		
		
		
		//
	}
	catch(Exception e)
	{
		
	}*/
		//2���� �迭
		/*
		try
		{
			OutputStream out = new FileOutputStream("C:\\test\\output.csv"); //�ش� ��ο� output.csv ���Ϸ� ����
			DataOutputStream dout = new DataOutputStream(out);
			
			int result=0, count=1;
			int arrTwo[][] = new int[100][2];
			int score=0;
			String strData;
			strData = "�̸�" + "," + "����" + "\n";
			out.write(strData.getBytes());
			String student = "";
			int scoreKor = 0, scoreEng = 0, scoreMath = 0;
			int mathTotal = 0, korTotal = 0, engTotal = 0;
			int stuTotal = 0, stuAvg =0;
			int input = 0;
			
			
			
			int cnt = 0;  //�л� �߰��� �� ���� ī��Ʈ ������
			do
			{
				System.out.println("�̸��� �Է��ϼ���(�����)");
				student = myInput.next();  					//�л� �̸� �Է�
				System.out.println("���� ������ �Է��ϼ��� : ");
				scoreKor = myInput.nextInt();				
				System.out.println("���� ������ �Է��ϼ��� : ");
				scoreEng = myInput.nextInt();
				//System.out.println("���� ������ �Է��ϼ��� : ");
				//scoreMath = myInput.nextInt();
				System.out.println("��� �Է� �Ͻðڽ��ϱ�? ��� : 1 , �ߴ� : 2 ");
				input = myInput.nextInt();
					
				int arrTwo[][] = scoreKor+scoreEng; //scoreMath;   //�л�  ���� ����
				stuAvg = stuTotal/2;					  //�л�  ���� ���
				
				strData = student + "," + scoreKor + "," + scoreEng + "," + scoreMath + "," + "\n";   // ���Ϸ� ������ ���
				//strData = student + "," + scoreKor + "," + scoreEng + "," + scoreMath + "," + " " + "," + stuTotal + "," + stuAvg + "\n";   // ���Ϸ� ������ ���
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
		}
		catch (Exception e)
		{
			
			
		}
		
			
		   System.out.println("��ĭ ���ٷ� �Է��ұ��? : ");	
					result = myInput.nextInt(); 
					myInput.close();
					
					for(int i=0; i < result; i++)
					{
						for(int j=0; j < result; j++)
						{
							arrTwo[i][j] = count++; 
						}
					}
					
					for(int i=0; i < result; i++) //���
					{
						for(int j=0; j < result; j++)
						{
							System.out.print(arrTwo[i][j] + "\t");	
						}
						System.out.println();
					}
			
			*/
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
