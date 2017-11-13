import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class pos_work {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);		
		
		try {
			// ����� ����
			FileInputStream in = new FileInputStream("C:\\test\\goods.csv");
			DataInputStream din = new DataInputStream(in);
			
			FileOutputStream out = new FileOutputStream("C:\\test\\goods_result.csv");
			DataOutputStream dout = new DataOutputStream(out);
		
////////////////// �������� 1 ///////////////////////////////			
			
			// ���� ����
			int rowCount = 0, colCount = 3;
			String inputData = null;
			String [] inputArr = new String [100];	
			String[][] outputArr = new String [100][100];
			
			// ���� �ҷ�����
			while((inputData = din.readLine()) != null) { // inputData : Kanu, 3000, 100,
				inputArr = inputData.split(",");	// inputArr[0] = kanu, inputArr[1] = 3000 ....
				// ��¹迭�� �ֱ�. 
				for(int i = 0; i < colCount; i++) {
						outputArr[rowCount][i] = inputArr[i];
				}
				rowCount++;	
			}
			// rowCount ���� 4
			
			System.out.println("======= ��ǰ ����Ʈ =======");
			System.out.println("��ǰ��" + "\t" + "����" + "\t" + "���� ���");
			// �ҷ��� ����(��¹迭) ����غ���
			for(int i = 0; i < rowCount; i++) {
				for(int j = 0; j < colCount; j++) {
					System.out.print(outputArr[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
			
/////////////// �������� 2 //////////////////////////////////
			
			// �� �ʵ庰 �迭����
			String[] goodsName = new String [100]; // ��ǰ��迭
			int[] goodsPrice = new int [100]; // ���ݹ迭
			int [] goodsStock = new int [100]; // ���迭
			
			// �ʵ庰 ������ ����
			int colGoodsName = 0, colGoodsPrice = 1, colstockCount = 2;
			// ���ڵ庰 ������ ����
			int rowKanu = 0, rowKimbab = 1, rowCoke = 2, rowBibim = 3;
			
			// ��ǰ��迭�� ��ǰ�ֱ�
			for(int i = 0; i < rowCount; i++) {
				goodsName[i] = outputArr[i][colGoodsName];
			}
			// ���ݹ迭�� ���ݳֱ�
			for(int i = 0; i < rowCount; i++) {
				goodsPrice[i] = Integer.parseInt(outputArr[i][colGoodsPrice]);
			}
			// ���迭�� ���ֱ�
			for(int i = 0; i < rowCount; i++) {
				goodsStock[i] = Integer.parseInt(outputArr[i][colstockCount]);
			}
			// ������ �迭�� �ִ� ���� ���
			System.out.println("======= ��ǰ ����Ʈ =======");
			System.out.println("��ǰ��" + "\t" + "����" + "\t" + "���� ���");
			for(int i = 0; i < rowCount; i++) {
				System.out.println(goodsName[i] + "\t" + goodsPrice[i] + "\t"+ goodsStock[i]);
			}
			System.out.println();
			
/////////////// �������� 3 ////////////////////////////////////
			
			// �Է� ���� ��ǰ��, ����, �ֹ����� ��������
			int goodsNum = 0, goodsCount = 0, jumunEnd = 0, todayEnd = 0;
			// �� ��ǰ�� ������ �ٸ����� ����.
			int goodsNameKanu = 0, goodsNameKimbab = 0, goodsNameCoke = 0, goodsNameBibim = 0;
			int goodsCountKanu = 0, goodsCountKimbab = 0, goodsCountCoke = 0, goodsCountBibim = 0;
			// �Ұ�
			int sum = 0;
			
			// ������ ����ɶ� ����� ����
			int totalSum = 0; // �ѼҰ�
			int [] totalSumArr = new int [rowCount];
			int [] totalCountArr = new int [rowCount];
			
			while(true) { // �Է� �ݺ��� ����
				System.out.println("��ǰ�� �Է����ּ���.");
				System.out.println("1.ī��, 2.���, 3.�ݶ�, 4,�����");
				System.out.print("��ǰ��ȣ : ");
				goodsNum = myInput.nextInt();
				System.out.println(goodsNum + "�� ��ǰ" + " => " + goodsName[goodsNum-1] + ", " + goodsPrice[goodsNum-1] + "��");
				System.out.print("���� : ");
				goodsCount = myInput.nextInt();	
				// �Էµ� ���� ��ǰ��, �������� �ٸ� ������  ����
				switch(goodsNum) {
				case 1:
					goodsNameKanu = goodsNum;
					goodsCountKanu = goodsCount; // goodsCountKanu = goodsCountKanu + goodsCount;
					break;
				case 2:
					goodsNameKimbab = goodsNum;
					goodsCountKimbab = goodsCount;
					break;
				case 3:
					goodsNameCoke = goodsNum;
					goodsCountCoke = goodsCount;
					break;
				case 4:
					goodsNameBibim = goodsNum;
					goodsCountBibim = goodsCount;
					break;
				}
				// �ֹ� ���� ����
				System.out.print("��� �Է��Ͻðڽ��ϱ�? (1:Yes, 2:No)");
				jumunEnd = myInput.nextInt();
				System.out.println();
				
				// �ֹ��� �Ϸ� �Ǿ�����
				if(jumunEnd == 2) {			
					System.out.println("=========== ���� ���� ===========");
					System.out.println("��ǰ��\t����\t����\t�Ұ�");
					
					// ���õ� �� ���
				 	if(goodsNameKanu > 0) {
				 		System.out.println(goodsName[goodsNameKanu-1] + "\t" + goodsPrice[goodsNameKanu-1] + "\t" + goodsCountKanu + "\t" + goodsPrice[goodsNameKanu-1]*goodsCountKanu);
				 		sum = sum + (goodsPrice[goodsNameKanu-1]*goodsCountKanu);
				 		totalCountArr[rowKanu] = totalCountArr[rowKanu] + goodsCountKanu;
				 		goodsStock[rowKanu] = goodsStock[rowKanu] - goodsCountKanu;
				 		totalSumArr[rowKanu] = totalSumArr[rowKanu] + (goodsPrice[goodsNameKanu-1]*goodsCountKanu);
				 		goodsCountKanu = 0;
				 	}
				 	if(goodsNameKimbab > 0) {
				 		System.out.println(goodsName[goodsNameKimbab-1] + "\t" + goodsPrice[goodsNameKimbab-1] + "\t" + goodsCountKimbab + "\t" + goodsPrice[goodsNameKimbab-1]*goodsCountKimbab);
				 		sum = sum + (goodsPrice[goodsNameKimbab-1]*goodsCountKimbab);
				 		totalCountArr[rowKimbab] = totalCountArr[rowKimbab] + goodsCountKimbab;
				 		goodsStock[rowKimbab] = goodsStock[rowKimbab] - goodsCountKimbab;
				 		totalSumArr[rowKimbab] = totalSumArr[rowKimbab] + (goodsPrice[goodsNameKimbab-1]*goodsCountKimbab);
				 		goodsCountKimbab= 0;
				 	}
				 	if(goodsNameCoke > 0) {
				 		System.out.println(goodsName[goodsNameCoke-1] + "\t" + goodsPrice[goodsNameCoke-1] + "\t" + goodsCountCoke + "\t" + goodsPrice[goodsNameCoke-1]*goodsCountCoke);
				 		sum = sum + (goodsPrice[goodsNameCoke-1]*goodsCountCoke);
				 		totalCountArr[rowCoke] = totalCountArr[rowCoke] + goodsCountCoke;
				 		goodsStock[rowCoke] = goodsStock[rowCoke] - goodsCountCoke;
				 		totalSumArr[rowCoke] = totalSumArr[rowCoke] + (goodsPrice[goodsNameCoke-1]*goodsCountCoke);
				 		goodsCountCoke = 0;
				 	}
				 	if(goodsNameBibim > 0) {
				 		System.out.println(goodsName[goodsNameBibim-1] + "\t" + goodsPrice[goodsNameBibim-1] + "\t" + goodsCountBibim + "\t" + goodsPrice[goodsNameBibim-1]*goodsCountBibim);
				 		sum = sum + (goodsPrice[goodsNameBibim-1]*goodsCountBibim);
				 		totalCountArr[rowBibim] = totalCountArr[rowBibim] + goodsCountBibim;
				 		goodsStock[rowBibim] = goodsStock[rowBibim] - goodsCountBibim;
				 		totalSumArr[rowBibim] = totalSumArr[rowBibim] + (goodsPrice[goodsNameBibim-1]*goodsCountBibim);
				 		goodsCountBibim = 0;
				 	}	
				 	
				 	
				 	//����
				 	System.out.println();
					System.out.println("�Ѱ�: " + sum + "��");
					System.out.println();
					System.out.println("��� �����Ͻðڽ��ϱ�? (1.Yes, 2.��������)");
					todayEnd = myInput.nextInt();
					System.out.println();
					sum = 0;
					
					if(todayEnd == 2){
						break;
					}
				}		
	
			} 
	
/////////////////////////// �������� 4 /////////////////////////////////////////////
			
			String lastOutputSave = null;
			String lastOutputTitle = null;
			
			// ���� �����				
			System.out.println("======== ���� ���� ��ü ���� ========");
			System.out.println("��ǰ��\t����\t�Ǹż���\t�������\t�Ұ�");
			// ����  ���
			for(int i = 0; i< rowCount; i++) {
				System.out.print(goodsName[i] + "\t" + goodsPrice[i] + "\t" + totalCountArr[i] + "\t" + goodsStock[i] + "\t"+ totalSumArr[i] + "\n");
			}		
			// �� ���� ���
			for(int i = 0; i < rowCount; i++) {
				totalSum = totalSum + totalSumArr[i];
			}
			
			System.out.print("�� ���� : " + totalSum);
			
			// �������ῡ ���� �Ѹ��� ���Ͽ� ����
			lastOutputTitle = "��ǰ��"+ "," + "����" + "," + "�Ǹż���" + "," + "�������" + "," + "�Ұ�" + "\n";
			dout.write(lastOutputTitle.getBytes());
			for(int i = 0; i < rowCount; i++) {					
				lastOutputSave = goodsName[i] + "," + goodsPrice[i] + "," + totalCountArr[i] + "," + goodsStock[i] + "," + totalSumArr[i] + "\n";
				dout.write(lastOutputSave.getBytes());
			}
						
			din.close();
			dout.close();
			
		} catch(Exception e) {
			System.out.println("����1");
		}
		
		myInput.close();
		System.out.println();
	}

}
