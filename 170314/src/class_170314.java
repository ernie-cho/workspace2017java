import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class class_170314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�����ڵ�
	/*	int a = 10;
		int b = 0;
		int c = 0, result=0;
		
		Scanner myIn = new Scanner(System.in);
		
		try
		{
			b = myIn.nextInt();
			c = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("0�̿��� ���ڸ� �Է��ϼ���");	
			result = 1;
		}
		catch(InputMismatchException e)
		{
			System.out.println("������ �Է��ϼ���");	
			result = 1;
		}
		finally //���ܿ��ο� ������� ����Ǵ� ����
		{
			System.out.println("�� �� ���� ����");
		}
		
		if(result == 0)
		{
			System.out.println("�����" +c);
			System.out.println("����!!");
		}
		myIn.close();
	*/
//������� �̿��� �����ڵ�
	/*	int a = 0;
		Scanner myInput = new Scanner(System.in);
		System.out.println("1. �����̿��, 2. �����");
		try
		{
			a = myInput.nextInt();
			if( a < 1 || a > 2)
			{
				throw new InputMismatchException();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("�Է¿����Դϴ�");
		}
		catch(Exception e)
		{
			
		}
	*/
//���׿�����
	/*	int result = 0;
		int a = 10;
		int b = 20;
		result = (a> b) ? 1 : 2;
		System.out.println(result);
	*/
//����, ����, �� ����
		String result;
		Scanner myScan = new Scanner(System.in);
		System.out.println("����, ����, �� ����");
		System.out.print("�ϳ��� �Է��ϼ���: ");
		result = myScan.nextLine();
		//System.out.print(result);//�ӽ÷� ����غ���
			
		Random rand = new Random();
		int randNum = Math.abs(rand.nextInt()% 3);
		//System.out.println(randNum);
		
		if(result.equals("����"))
		{
			result = "0";
		}
		else if(result.equals("����"))
		{
			result = "1";
		}
		else if(result.equals("��"))
		{
			result = "2";
		}
		
		if(randNum == 0)
		{
			if(result == "0")
			{
				System.out.println("�����ϴ�");
			}
			else if(result == "1")
			{
				System.out.println("����� �̰���ϴ�");
			}
			else if(result == "2")
			{
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}
		}
		else if(randNum == 1)
		{
			if(result == "0")
			{
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}
			else if(result == "1")
			{
				System.out.println("�����ϴ�");
			}
			else if(result == "2")
			{
				System.out.println("����� �̰���ϴ�");
			}
		}
		else if(randNum == 2)
		{
			if(result == "0")
			{
				System.out.println("����� �̰���ϴ�");
			}
			else if(result == "1")
			{
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			}
			else if(result == "2")
			{
				System.out.println("�����ϴ�");
			}
		}
		
		//System.out.print(result);//�ӽ÷� ����غ���
		
		
		
		
		
		
		
		
	}
}
