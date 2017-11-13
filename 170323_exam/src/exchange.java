import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class exchange 
{

	public static void main(String[] args) 
	{
		double result = 0; //use double not int
		try
		{
			FileInputStream in = new FileInputStream("C:\\test\\input.csv"); 	//�ش� ��ο� input.csv ������ ȣ��
			DataInputStream din = new DataInputStream(in);					 	//DataInputStream�� ȥ�ڼ� ���� ���� FileInputStream�� ������ �޾ƾ��Ѵ�			
			FileOutputStream out = new FileOutputStream("C:\\test\\output.csv");//�ش� ��ο� output.csv ���Ϸ� ����
			DataOutputStream dout = new DataOutputStream(out);
	
			Scanner myInput = new Scanner(System.in); 							 //�Էº���
			int moneyWon =0;
			Double lastResult ;
			double changed =0;
			String nationalCode = null;
			int row =0, col=0;
			int more = 0; //����Ұ����� ������
			String nameofNation = null;										//�Էµ� �����ڵ带 �ӽ÷� ����
			Double[] save = new Double[100];								//�Էµ� ȯ���� �����ϴ� �迭
			String[] saveNational = new String[100];						//�Էµ� �����ڵ常 �����ϴ� �迭
			Double[] currency = new Double[100];							//ȯ���� �����ϴ� �迭
			String[] national = new String[100];							//�����ڵ带 �����ϴ� �迭
			int count = 0;
			int count2= 0;													//����� �����ϴ� �迭�� ī��Ʈ
			while (din.available() >0)	
			{
				String temp;												//���Ͼȿ� ������ ������ �����ϱ� ���� ����
				String[] temp_curr = new String[3];							//���Ͼ��� ������ ���� �����ϱ� ���� �迭
				temp = din.readLine();										//������ �о temp�� ����
				temp_curr = temp.split(",");								//temp�� ����Ȱ��� �޸�(,)�� ������ �迭�� ����
				
				for(int i = 0; i < 1; i++)									//1���� ����� ���� �ѹ� �����Ͽ�  currency[count]�� ���� 
				{
					national[count] = (temp_curr[0]);						//0�������� national�迭�� ����			
					currency[count] = Double.parseDouble(temp_curr[1]);		//1������(exchange���� ����)
				}
				count++;
				
		
			}//while
			for(int i = 0; i < 4 ; i++) 									//�ֿܼ� ����
			{		
				System.out.print(national[i] + "\t");						//input���Ͽ� �ִ� �����ڵ� ����غ���
				System.out.print(currency[i] + "\t");						//input���Ͽ� �ִ� ȯ�� ����غ���
				System.out.println();
			}
			
			
			while(true)														//����� �Է¹ޱ�
			{
				System.out.print("ȯ�� ����� ���� ��ȭ �ݾ��� �Է��ϼ��� : ");				 
				moneyWon = myInput.nextInt();								//��ȭ �Է� �ޱ�
				System.out.print("��ȯ�� ���� �ڵ带 �Է��ϼ��� : ");					//�����ڵ� �Է� �ޱ�
				nationalCode = myInput.next();

				System.out.print("�߰� �Ͻðڽ��ϱ�? (1:Yes, 2:No)");
				more = myInput.nextInt();
				
				for(int i =0;i <count; i++) 								//�迭�� �˻��Ͽ� ���� ���� ã�Ƽ� ���, equal(string)
				{
					if(national[i].equals(nationalCode) == true)
					{
						result = moneyWon * currency[i];					//�Է��� won�� ����ȯ���� ���Ͽ� ���� ������
						nameofNation = national[i];							//�Է��� �����ڵ带 �ӽ÷� ������
						break;												//�������� ã�ұ� ������ �ش�for���� �������´�
					}
				}
				saveNational[count2] = nameofNation;						//�ӽ������ �����ڵ带 �Էµ� �����ڵ� �迭�� ������� ������
				save[count2] = result;										//result���� save�迭�� �����Ͽ� �Է� �ɶ� ���� ������
				count2++;													//save�迭�� ī��Ʈ������Ŵ
	
				
				if(more == 2)
				{
					for(int i = 0; i < row; i++) 								//�ֿܼ� ����
					{		
							System.out.print(currency[i] + "\t");
							lastResult = currency[i];			
					}
					System.out.println("���Ͽ� ����Ǿ����ϴ�");
					break;
				}
			}//while(true)	
			for(int i = 0; i < count2; i++)
			{
				System.out.print(saveNational[i]);			//�ֿܼ� �����ڵ� �迭�� ���� ������� �����
				System.out.println("\t" + save[i]);					//�ֿܼ� save�迭�� ���� ������� �����
			}
			
			
			
			//���⿡ �Է��ϴ� ������ ����csv�� �����ϴ� �ڵ� �ۼ�
			
			
			
			

				
				 
		din.close();
		dout.close();
		}//try
		
		catch(Exception e)
		{
			
		}//catch(Exception e)
		return;
	}//public static void main(String[] args) 

}//public class exchange 
