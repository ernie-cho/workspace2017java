import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class self 
{
	public static void main(String[] args) 
	{
	try
	{
		FileInputStream in = new FileInputStream("C:\\test\\test.csv");
		DataInputStream din = new DataInputStream(in);
		FileOutputStream out = new FileOutputStream("C:\\test\\test_result.csv");
		DataOutputStream dout = new DataOutputStream(out);
		int colCount = 3;
		int rowCount = 0;
		String inputData = null;
		String[] name = new String[100];
		String[][] outputArr = new String [100][100];
		
		while((inputData = din.readLine()) != null)
		{
			name = inputData.split(",");
			
			for(int i = 0; i < colCount; i++) 
			{
				outputArr[rowCount][i] = name[i];
				//System.out.println(name[i]);
			}
			rowCount++;
			//������� ���� ���� ������ split�Ͽ� ����� �� �࿭ ���
			
			for(int i = 0; i < rowCount; i++) 
			{
				for(int j = 0; j < colCount; j++) 
				{
					System.out.print(outputArr[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
			
			
			
			
			
		}//while
		
																//���⼭���� ���� csv���
		String[] goodsName = new String [100]; // ��ǰ��迭
		int[] goodsPrice = new int [100]; // ���ݹ迭
		int [] goodsStock = new int [100]; // ���迭
		int [] totalCountArr = new int [rowCount];
		int [] totalSumArr = new int [rowCount];
		
		String lastOutputSave = null;
		String lastOutputTitle = null;
		lastOutputTitle = "��ǰ��"+ "," + "����" + "," + "�Ǹż���" + "," + "�������" + "," + "�Ұ�" + "\n";
		dout.write(lastOutputTitle.getBytes());
		for(int i = 0; i < rowCount; i++)
		{					
			lastOutputSave = goodsName[i] + "," + goodsPrice[i] + "," + totalCountArr[i] + "," + goodsStock[i] + "," + totalSumArr[i] + "\n";
			dout.write(lastOutputSave.getBytes());
		}
		
		
		
		
		din.close();
		dout.close();
	}//try
	catch(Exception e)
	{
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
