import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class files extends IOclass
{
	public void loadData()
	{
		
		InputStream in;
		try {
			in = new FileInputStream("C:\\test\\goods.csv");
		 
		DataInputStream din = new DataInputStream(in);
		
		try {
			while (din.available() > 0) {
				str = din.readLine();
				str2 = str.split(",");
				if (a == 0) {
					a++;
					continue;
				}
				goods_barcode[count] = Integer.parseInt(str2[0]);
				goods_name[count] = str2[1];
				goods_price[count] = Integer.parseInt(str2[2]);
				goods_count[count] = Integer.parseInt(str2[3]);
				goods_event[count] = str2[4];
				count++;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // csv�� �ִ� �͵��� ������ �´�
		for (int i = 0; i < count; i++) {
			max[i] = goods_count[i];
		} // max���� �������ش�
		
		System.out.println("���ڵ�\t��ǰ\t���\t����\t�̺�Ʈ");
		for (int i = 0; i < count; i++) {
			System.out.print(goods_barcode[i] + "\t");
			System.out.print(goods_name[i] + "\t");
			System.out.print(goods_count[i] + "\t");
			System.out.print(goods_price[i] + "\t");
			System.out.println(goods_event[i] + "\t");
		}
		
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
