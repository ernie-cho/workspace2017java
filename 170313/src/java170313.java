import java.util.Scanner;

public class java170313 
{

	public static void main(String[] args) 
	{
/*		System.out.print("����~!!3");
		System.out.println("�ȳ��ϼ���~!!");*/
		
/*		int sum = 0;
		for(int i=0; i <= 10; i++){
			sum = sum +i;
		}
		System.out.println("����" + sum + "�Դϴ�.");*/
		
/*																		//�������� -������ ���-	
		for(int i = 2 ; i <= 9; i++)
		{
			System.out.println("===" + i +"��" +"===");
			for(int j = 1; j <=9; j++)
			{
			System.out.println(i +"*" +j+ "=" +i*j);			
			}
		}
*/
																		//C��� �������� -������ �����-
/*	
		System.out.println("--------------------------------------");
		System.out.println("�޴�"+"\t\t\t����"+"\t     �ݾ�");
		System.out.println("--------------------------------------");
		System.out.println("[]A-1 �ϱ�"+"\t\t4"+"\t35,200");
		System.out.println("[]A-3 ��ä��"+"\t\t11"+"\t96,800");
		System.out.println("[]A-2 �Ҹ�"+"\t\t5"+"\t42,000");
		System.out.println("[]A-4 �ҷ���"+"\t\t6"+"\t52,800");
		System.out.println("[]A-5 ��ä��"+"\t\t5"+"\t40,000");
		System.out.println("[]A-6 XO���� ����"+"\t\t4"+"\t30,000");
		System.out.println("[]A-8 ����������"+"\t\t4"+"\t32,000");
		System.out.println("[]A-7 ��������"+"\t\t4"+"\t32,000");
		System.out.println("[]A-10 ��ȭ��"+"\t\t4"+"\t32,000");
		System.out.println("[]C-3 ��ġ���"+"\t\t4"+"\t35,200");
		System.out.println("[]źź��"+"\t\t\t2"+"\t20,000");
		System.out.println("--------------------------------------");
		System.out.println("��  ��"+"       \t\t\t451,200");	
		System.out.println("��  ��"+"       \t\t\t451,200");
		System.out.println("--------------------------------------");
*/
/*		
																		//C��� �������� -����� �����-
		//������ ���� A,B,C �� ���� ���ڸ� �Է¹޾�, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//A, B, C �� ���ڰ� ¦���̸� 0, Ȧ���̸� 1 ���, A, B, C ���� ��, ��, �� ���
		
		Scanner mylnput = new Scanner(System.in);
		int inputA, inputB, inputC, resultSum, resultMinus, resultMul;
		System.out.print("A�� �Է�");
		inputA = mylnput.nextInt();
		System.out.print("B�� �Է�");
		inputB = mylnput.nextInt();
		System.out.print("C�� �Է�");
		inputC = mylnput.nextInt();
		System.out.println("A�� "+inputA);
		System.out.println("B�� "+inputB);
		System.out.println("C�� "+inputC);
		
		System.out.println("A�� ¦/Ȧ Ȯ�� : "+inputA%2);
		System.out.println("B�� ¦/Ȧ Ȯ�� : "+inputB%2);
		System.out.println("C�� ¦/Ȧ Ȯ�� : "+inputC%2);
		resultSum = inputA+inputB+inputC;
		resultMinus = inputA-inputB-inputC;
		resultMul  = inputA*inputB*inputC;
		System.out.println("A + B + C = "  + inputA + "+" +inputB + "+" +inputC+"=" + resultSum);
		System.out.println("A - B - C = "  + inputA + "-" +inputB + "-" +inputC+"=" + resultMinus);
		System.out.println("A * B * C = "  + inputA + "*" +inputB + "*" +inputC+"=" + resultMul);
*/	
																		//�������� �ΰ��� ������ �Է¹޾� ��հ� ��������
/*		
		Scanner mylnput = new Scanner(System.in);
		int num1, num2, avg;
		System.out.println("���� �ΰ��� �Է��ϼ��� : ");
		num1 = mylnput.nextInt();
		num2 = mylnput.nextInt();
		System.out.println("�Է��Ͻ� ������ " + num1 +" "+ num2 +"�Դϴ�.");
		avg = (num1+num2)/2;
																		//if else if���� �غ���
		if (90 < avg && avg <= 100)
		{
			System.out.println("����� ����� " + avg +"�̸�, ������ A�Դϴ�.");
			
		}
		else if (80 < avg && avg <= 90)
		{
			System.out.println("����� ����� " + avg +"�̸�, ������ B�Դϴ�.");
		}
		else if (70 < avg && avg <= 80)
		{
			System.out.println("����� ����� " + avg +"�̸�, ������ C�Դϴ�.");
		}
		else if (60 < avg && avg <= 70)
		{
			System.out.println("����� ����� " + avg +"�̸�, ������ D�Դϴ�.");
		}
		else if (avg < 59)
		{
			System.out.println("����� ����� " + avg +"�̸�, ������ F�Դϴ�.");
		}
		else
		{
			System.out.println("�Է¹��� �ʰ�");
		}
		
																		//switch case�� �غ���
		switch (avg/10)
		{
		case 10:
		case 9:
			System.out.println("����� ����� " + avg +"�̸�, ������ A�Դϴ�.");
			break;
		case 8:
			System.out.println("����� ����� " + avg +"�̸�, ������ B�Դϴ�.");
			break;
		case 7:
			System.out.println("����� ����� " + avg +"�̸�, ������ C�Դϴ�.");
			break;
		case 6:
			System.out.println("����� ����� " + avg +"�̸�, ������ D�Դϴ�.");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("����� ����� " + avg +"�̸�, ������ F�Դϴ�.");
			break;
		default:
			System.out.println("�Է¹��� �ʰ�");
			break;
		}
*/

/*																		//������ 1~10�ܱ��� ��� (�� 3�� ����� ���� ������� �ʱ�)
		for(int i = 1; i <= 10; i++)
		{
			System.out.println("===" + i +"��" +"===");
			if(i % 3 == 1 || i % 3 == 2)
			{
				for(int j = 1; j < 10; j++)
				{
					System.out.println(i + "*" + j +"=" +i*j);
				}
			}
			else
			{
				System.out.println("��¾���");
			}
			
		}
*/
/*																	//While��(1~100���� ����ϸ鼭, 3�� ����� ���� ǥ�����ֱ�)
	int num = 0 ;
		while(num <=100)
		{
			if(num % 3 == 0)
			{
			System.out.println(num +"<---3�� ���");
			}
			else
			{
				System.out.println(num);
			}
			num++;
		}
*/
/*																	//�������� �Է¹ް� ����ϱ�
		Scanner mylnput = new Scanner(System.in);
		String input;
		boolean bool;
		int inputNum;
		byte byteNum;
		short shortNum;
		long longNum;
		float floatNum;
		double doubleNum;
		System.out.println("����� �̸���?");
		input = mylnput.nextLine();
		System.out.println("����� �̸���"+input+"�Դϴ�.");
		
		System.out.println("����� ���̴�?");
		inputNum = mylnput.nextInt();
		System.out.println("����� ���̴�"+inputNum+"�Դϴ�.(���ڸ� �Է�)");
		
		System.out.println("boolean���� �Է��ϼ��� : ");
		bool = mylnput.nextBoolean();
		System.out.println("�Է��� boolean ����"+bool+"�Դϴ�.");
		
		System.out.println("byte ���� �Է��ϼ��� : ");
		byteNum = mylnput.nextByte();
		System.out.println("�Է��� byte ����" + byteNum +"�Դϴ�.");
		
		System.out.println("Short ���� �Է��ϼ��� : ");
		shortNum = mylnput.nextShort();
		System.out.println("�Է��� Short ����" + shortNum +"�Դϴ�.");
		
		System.out.println("long ���� �Է��ϼ��� : ");
		longNum = mylnput.nextLong();
		System.out.println("�Է��� long ����" + longNum +"�Դϴ�.");
		
		System.out.println("float ���� �Է��ϼ��� : ");
		floatNum = mylnput.nextFloat();
		System.out.println("�Է��� float ����" + floatNum +"�Դϴ�.");
		
		System.out.println("double ���� �Է��ϼ��� : ");
		doubleNum = mylnput.nextDouble();
		System.out.println("�Է��� double ����" + doubleNum +"�Դϴ�.");
		
*/																			//���� (0�Է½� ���� ����)
/*
		int num1 = 0, num2, result = 0;
		String oper;
		Scanner mylnput = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("������ �Է��ϼ���.(0�Է½� ����)");
			num1 = mylnput.nextInt();
			if (num1 == 0)
			{
				System.out.println("�����մϴ�.");
			}
			mylnput.nextLine();						//���� ���� ������
			oper = mylnput.nextLine(); 	//equals
			num2 = mylnput.nextInt();
			if (num1 != 0)
			{
				if(oper.equals("+"))
				{
					result = num1 + num2;
				}
				else if (oper.equals("-"))
				{
					result = num1 - num2;
				}
				else if (oper.equals("*"))
				{
					result = num1 * num2;
				}
				else if (oper.equals("/"))
				{
					result = num1 / num2;
				}
			}System.out.println(num1+ oper+ num2 +"=" + result);
		}
		
		*/
		
		
		
		
		
		
		
		
	}

}