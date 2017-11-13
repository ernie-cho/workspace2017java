import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class MoneyChangeClass {
	public double exchange(double won, String targetName) 				//---------------B(exchange �żҵ�)
	{
		double result = 0;
		try
		{
			FileInputStream in = new FileInputStream("C:\\test\\exchange_Input.csv"); //�ش� ��ο� exchange_Input.csv ������ ȣ��
			DataInputStream din = new DataInputStream(in);
			
			//String[] currency = new String[100];						//�ҷ��� ������ �����ϱ� ���� �迭����
			Double[] currency = new Double[100];						//�ҷ��� ������ �����ϱ� ���� �迭����
			String[] name = new String[100];
			int number = 0;												//�ҷ��� �������� �ٲٴ� ����
			while(din.available() >0)									//���Ͼȿ� ����� ���븸ŭ ����
			{
				String temp;											//���Ͼȿ� ������ ������ �����ϱ� ���� ����
				String[] temp_curr = new String[3];						//���Ͼ��� ������ ���� �����ϱ� ���� �迭
				//Double[] temp_curr = new Double[3];						//���Ͼ��� ������ ���� �����ϱ� ���� �迭
				temp = din.readLine();									//������ �о temp�� ����
				temp_curr = temp.split(",");							//temp�� ����Ȱ��� �޸�(,)�� ������ �迭�� ����
				
				for(int i = 0; i < 1; i++)								//1���� ����� ���� �ѹ� �����Ͽ�  currency[number]�� ���� 
				{
					//currency[number] = temp_curr[1];					//1������(exchange���� ����)
					currency[number] = Double.parseDouble(temp_curr[1]);
				}

				number++;												//�� ������ ���� ������Ű��
				//System.out.println(number);
			}
			for(int i=0; i < number; i++)
			{
				if(name[i].equals(targetName) == true)
				{
					result = won / currency[i];
					break;
				}
			}
			
			
			//System.out.println(currency[number]);
			/*switch(targetName)											//�Ʒ� case������ ����ϴ°�
			{
			case "USD" :
				result = won/Double.parseDouble(currency[0]);
				break;
			case "JPY" :
				result = won/Double.parseDouble(currency[1]);
				break;
			case "TWD" :
				result = won/Double.parseDouble(currency[2]);
				break;
			case "AUD" :
				result =won/Double.parseDouble(currency[3]);
				break;
			}*/
			in.close();
			din.close();
		}//try
		catch(Exception e)
		{
			
		}//catch	
		return result;
	}//public double exchange(double won, String targetName);
}
