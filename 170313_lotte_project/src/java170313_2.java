import java.util.Scanner;

public class java170313_2 {
	
	static int freeD_old = 52000, freeD_young = 45000, freeD_child = 41000, freeD_baby = 13000; //���� 1�ϱ�
	static int free4_old = 41000, free4_young = 36000, free4_child = 32000, free4_baby = 13000; //���� After4
	static int passD_old = 36000, passD_young = 32000, passD_child = 29000;					   //����� 1�ϱ�
	static int pass4_old = 30000, pass4_young = 27000, pass4_child = 24000;					   //����� After4
	static int pass7_old = 18000, pass7_young = 16000, pass7_child = 14000;					   //����� After7

	public static void main(String[] args) {
		// TODO �Ե����� ����� �����ϱ�
										/*������ �����ϼ���.
										1. �����̿��
										2. �����
										
										Ƽ�� ������ �����ϼ���.
										1. 1�ϱ�
										2. After4
										3. After7
										
										���̸� �Է��ϼ���.
										
										������ �ֹ��Ͻðڽ��ϱ�?
												
										�������� �����ϼ���.
										1. ����
										2. �����
										3. ����������
										
										������ ���Դϴ�.
										�����մϴ�.
										============�ζ�����===========
										�����̿��(1�ϱ�) � X2 104000��
										=============================*/

		int ticketType = 0, ticket = 0, age = 0, ageType = 0, cnt = 0, discnt = 0, result = 0, price = 0;
		int totalPrice = 0;
		
		Scanner mylnput = new Scanner(System.in);
		
		System.out.println("������ �����ϼ���.");	//��������
		System.out.println("1. �����̿��");
		System.out.println("2. �����");
		ticketType = mylnput.nextInt();
		
		if (ticketType == 1)
		{
			System.out.println("Ƽ�� ������ �����ϼ���."); //�����̿���� ���� ����Ǽ���
			System.out.println("1. 1�ϱ�");
			System.out.println("2. After4");
			ticket = mylnput.nextInt();
		}
		else if (ticketType == 2)
		{
			System.out.println("Ƽ�� ������ �����ϼ���."); //������� ���� ����Ǽ���
			System.out.println("1. 1�ϱ�");
			System.out.println("2. After4");
			System.out.println("3. After7");
			ticket = mylnput.nextInt();
		}
		System.out.println("���̸� �Է��ϼ���."); 		//���� �Է�
		age = mylnput.nextInt();
		if (age >= 65) 
		{		 // ���
			ageType = 0;
		}
		else if (age > 18) 
		{		 // �
			ageType = 1;
		}
		else if (age > 13)
		{	 	// û�ҳ�
			ageType = 2;
		}
		else if (age > 3) 
		{		 // ���
			ageType = 3;
		}
		else 
		{		 // ���̺�
			ageType = 4;
		}
		System.out.println("������ �ֹ��Ͻðڽ��ϱ�?");	//���� ��� �Է�
		cnt = mylnput.nextInt();
		if (ticketType == 1)
		{  // �����̿��				
			if (ticket == 1)	 // �����̿���� 1�ϱ�
			{ // 1�ϱ�
				switch (ageType)
				{
				case 1: // �
					price = freeD_old;
					result = 1;
					break;
				case 2: // û�ҳ�
					price = freeD_young;
					result = 2;
					break;
				case 0: // ���
				case 3: // ���
					price = freeD_child;
					result = 3;
					break;
				case 4: // ���̺�
					price = freeD_baby;
					result = 4;
					break;
				default :
					System.out.println("�Է¿���");
					break;
				}
			}
			if (ticket == 2)	 // �����̿���� 1�ϱ�
			{ // 1�ϱ�
				switch (ageType)
				{
				case 1: // �
					price = free4_old;
					result = 1;
					break;
				case 2: // û�ҳ�
					price = free4_young;
					result = 2;
					break;
				case 0: // ���
				case 3: // ���
					price = free4_child;
					result = 3;
					break;
				case 4: // ���̺�
					price = free4_baby;
					result = 4;
					break;
				default :
					System.out.println("�Է¿���");
					break;
				}
			}
			else
			{
				System.out.println("�Է¿��� ������ �ҷ��ּ���");
			}
		}
		else if (ticketType == 2) //�����
		{
			if (ticket == 1) // ������� 1�ϱ�
			{ // 1�ϱ�
				switch (ageType)
				{
				case 1: // �
					price = passD_old;
					result = 9;
					break;
				case 2: // û�ҳ�
					price = passD_young;
					result = 10;
					break;
				case 0: // ���
				case 3: // ���
					price = passD_child;
					result = 11;
					break;
				default:
					System.out.println("�Ʊ�(0~3��) ����!!");
					result = 18;
					break;
				}
			}
			else if (ticket == 2) // ������� After4
			{
				switch (ageType)
				{
				case 1: // �
					price = pass4_old;
					result = 12;
					break;
				case 2: // û�ҳ�
					price = pass4_young;
					result = 13;
					break;
				case 0: // ���
				case 3: // ���
					price = pass4_child;
					result = 14;
					break;
				default:
					System.out.println("�Ʊ�(0~3��) ����!!");
					result = 18;
					break;
				}
			}
			else if (ticket == 3) // ������� After7
			{
				switch (ageType)
				{
				case 1: // �
					price = pass7_old;
					result = 15;
					break;
				case 2: // û�ҳ�
					price = pass7_young;
					result = 16;
					break;
				case 0: // ���
				case 3: // ���
					price = pass7_child;
					result = 17;
					break;
				default:
					System.out.println("�Ʊ�(0~3��) ����!!");
					result = 18;
					break;
				}
			}

		}
		totalPrice = (price*cnt);
		System.out.println("�⺻ ������ "+ totalPrice +"���Դϴ�.");
		System.out.println("���� �������� ���� �ϼ���.\n");
		System.out.println("1. ����\n");
		System.out.println("2. ����� ���\n");
		System.out.println("3. ����������\n");
		discnt = mylnput.nextInt();
		if (discnt == 1)
		{
			totalPrice = totalPrice;
		}
		else if (discnt == 2)
		{
			totalPrice = (totalPrice * 7) / 10;
		}
		else if (discnt == 3)
		{
			totalPrice = totalPrice / 2;
		}
		else
		{
			System.out.println("1,2,3���߿� �����ϼ���\n\n");
		}
		
		System.out.println("======================�ζ�  ����===================");
		if (result == 1)  // �����̿���� 1�ϱ�
		{
			System.out.println("�����̿��(1�ϱ�)"	+"\t\t" +"�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 2)
		{
			System.out.println("�����̿��(1�ϱ�)"	+"\t\t" +"û�ҳ�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 3)
		{
			System.out.println("�����̿��(1�ϱ�)"	+"\t\t" +"���,���  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 4)
		{
			System.out.println("�����̿��(1�ϱ�)"	+"\t\t" +"�Ʊ�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 5)  // �����̿���� after4
		{
			System.out.println("�����̿��(After4)"	+"\t\t" +"�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 6)
		{
			System.out.println("�����̿��(After4)"	+"\t\t" +"û�ҳ�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 7)
		{
			System.out.println("�����̿��(After4)"	+"\t\t" +"���,���  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 8)
		{
			System.out.println("�����̿��(After4)"	+"\t\t" +"�Ʊ�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 9) // ������� 1�ϱ�
		{
			System.out.println("�����(1�ϱ�)"	+"\t\t" +"�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 10)
		{
			System.out.println("�����(1�ϱ�)"	+"\t\t" +"û�ҳ�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 11)
		{
			System.out.println("�����(1�ϱ�)"	+"\t\t" +"���,���  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 12)  // ������� After4
		{
			System.out.println("�����(After4)"	+"\t\t" +"�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 13)
		{
			System.out.println("�����(After4)"	+"\t\t" +"û�ҳ�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 14)
		{
			System.out.println("�����(After4)"	+"\t\t" +"���,���  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 15)  // ������� After7
		{
			System.out.println("�����(After7)"	+"\t\t" +"�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 16)
		{
			System.out.println("�����(After7)"	+"\t\t" +"û�ҳ�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 17)
		{
			System.out.println("�����(After7)"	+"\t\t" +"���,���  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else if (result == 18)
		{
			System.out.println("�����"	+"\t\t" +"���̺�  x" + cnt + "\t\t" +totalPrice +"��");
		}
		else
		{
			System.out.println("����� �ȵǾ����ϴ� �������� �������ּ���\n\n");
		}
		System.out.println("======================�����մϴ�===================\n\n");
		
		
		
		
		
		
		
		
		
		
	}

}













