import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class IOclass {
		static int count = 0; // ���Ͼȿ� ������ �ִ����� �����ִ� ����
		static int[] goods_barcode = new int[100];
		static String[] goods_name = new String[100]; // ��ǰ�� �̸��� ���� �迭
		static String[] goods_event = new String[100]; // �̺�Ʈ�� �����ִ� �迭
		static int[] goods_price = new int[100]; // ��ǰ�� ���� ������ ���� �迭
		static int[] goods_count = new int[100]; // ��ǰ�� ���� ������ ���� �迭
		static String[] str2 = new String[20];
		static int max[] = new int[100]; // �� ��ǰ���� ����� max���� �������ִ� ����
		static String str;
		static int a = 0; // csv�� ó���� ���ںκ��� pass�����ֱ����� ����
		
		public void IOtest() {
		final int EVENT11 = 2;
		final int EVENT12 = 6;
		final int EVENT21 = 3; // ����ǰ�� �ϳ��� ã�ƹٲ����ʰ� ���� ���ڸ� �ٲٸ� �ٲ�(�׷��� csv����
								// ���ιٲ������)
		try{
			
			OutputStream out = new FileOutputStream("C:\\test\\finish.csv");
			DataOutputStream dout = new DataOutputStream(out);
			int row = 5; // csv�� �Է��� row�� ���� csv�� �������� �ø��� ���� �ٲ��ָ��
			
			int no = 0; // ȯ�ҽ� 1�̵Ǹ� ȯ���� �ȵǰ� ��ġ�ص� ����
			Scanner sc = new Scanner(System.in);
			String[][] thisPOS = new String[100][row + 1]; // �Ѽմ��� ���� �����ִ� pos
			String[][] POS = new String[100][row + 1]; // �������� �Ѱ��� ����ϱ����� pos
			String[][] totalPos = new String[100][row + 1]; // ȯ���� ���ؼ� �Է��Ҷ����� ������
				System.out.println();											// ������ִ� pos

			int buycount = 0;   // �������� �ߺ��� �����ֱ����� ����
			int totalcost = 0;  // �������� �Ѱ踦 �����ֱ� ���� ����
			int all = 0; // �ݺ����� �� Ƚ���� �������� ����

			while (true) {
				int thiscount = 0;
				int thistotalcost = 0; // �ѻ���� ���� ������ ���� ����ؾ��ϱ⶧���� 0���� �ʱ�ȭ���ش�
				while (true) {
					
					System.out.println("������ ��ǰǰ���?(1.���,2.�Ȼ��)");
					int buy = sc.nextInt();
					if (buy == 2) {
						System.out.println("�ȳ���������");
						break;
					}
					System.out.println("��ǰ��ȣ : ");
					int goodnum = sc.nextInt();
					System.out.println(goodnum + "�� ��ǰ ==> " + goods_name[goodnum - 1] + ", " + goods_price[goodnum - 1]);
					System.out.println("����");
					int goodscount = sc.nextInt();
					if (goodnum == EVENT11 || goodnum == EVENT12) {
						System.out.println("����ǰ�Դϴ�(1+1)");
					} else if (goodnum == EVENT21) {
						System.out.println("����ǰ�Դϴ�(2+1)");
					} // ��� ��ǰ���� Ȯ������
					if (goodscount > goods_count[goodnum - 1]) {
						System.out.println("��� �����մϴ�");
						continue;
					}
					goods_count[goodnum - 1] -= goodscount;
					POS[buycount][0] = String.valueOf(goods_barcode[goodnum - 1]);
					thisPOS[thiscount][0] = String.valueOf(goods_barcode[goodnum - 1]);
					POS[buycount][1] = goods_name[goodnum - 1];
					thisPOS[thiscount][1] = goods_name[goodnum - 1];
					POS[buycount][2] = String.valueOf(goods_price[goodnum - 1]);
					thisPOS[thiscount][2] = String.valueOf(goods_price[goodnum - 1]);
					POS[buycount][3] = String.valueOf(goodscount);
					thisPOS[thiscount][3] = String.valueOf(goodscount);
					if (goodnum == EVENT11 || goodnum == EVENT12) {
						if (goodscount % 2 == 0) {
							POS[buycount][4] = String.valueOf((goods_price[goodnum - 1] * goodscount) / 2);
							POS[buycount][5] = goodscount / 2 + "�� ����";
							thisPOS[thiscount][4] = String.valueOf((goods_price[goodnum - 1] * goodscount) / 2);
							thisPOS[thiscount][5] = goodscount / 2 + "�� ����";
						} else {
							POS[buycount][4] = String.valueOf((goods_price[goodnum - 1] * goodscount)
									- (goods_price[goodnum - 1] * (goodscount / 2)));
							POS[buycount][5] = goodscount / 2 + "�� ����";
							thisPOS[thiscount][4] = String.valueOf((goods_price[goodnum - 1] * goodscount)
									- (goods_price[goodnum - 1] * (goodscount / 2)));
							thisPOS[thiscount][5] = goodscount / 2 + "�� ����";
						}
					} else if (goodnum == EVENT21) {
						if (goodscount % 3 == 0) {
							POS[buycount][4] = String.valueOf(
									(goods_price[goodnum - 1] * goodscount - goods_price[goodnum - 1] * goodscount / 3));
							POS[buycount][5] = goodscount / 3 + "�� ����";
							thisPOS[thiscount][4] = String.valueOf(
									(goods_price[goodnum - 1] * goodscount - goods_price[goodnum - 1] * goodscount / 3));
							thisPOS[thiscount][5] = goodscount / 3 + "�� ����";
						} else {
							POS[buycount][4] = String.valueOf(
									(goods_price[goodnum - 1] * goodscount - goods_price[goodnum - 1] * (goodscount / 3)));
							POS[buycount][5] = goodscount / 3 + "�� ����";
							thisPOS[thiscount][4] = String.valueOf(
									(goods_price[goodnum - 1] * goodscount - goods_price[goodnum - 1] * (goodscount / 3)));
							thisPOS[thiscount][5] = goodscount / 3 + "�� ����";
						}
					} else {
						POS[buycount][4] = String.valueOf(goods_price[goodnum - 1] * goodscount);
						POS[buycount][5] = "������";
						thisPOS[thiscount][4] = String.valueOf(goods_price[goodnum - 1] * goodscount);
						thisPOS[thiscount][5] = "������";
					} // 2+1, 1+1���� ó��
					for (int i = 0; i < thiscount; i++) {
						if (thisPOS[i][0].equals(thisPOS[thiscount][0])) {
							thisPOS[i][3] = String.valueOf((Integer.parseInt(thisPOS[i][3]) + goodscount));
							thisPOS[i][4] = String
									.valueOf((Integer.parseInt(POS[i][4]) + goodscount * goods_price[goodnum - 1]));
							thiscount--;// ���� ��ǰ�� �ִٸ� ���������� �ѹ��������� �ϱ⿡
							break;// �迭�� ������ ��ĭ���̰� �̹��ִ� ��ǰ�� ������ ����������(�ѻ��)
						}
					}
					for (int j = 0; j < row + 1; j++) {
						totalPos[all][j] = POS[buycount][j];
					} //
					all++; // ��ü������Ҵ��� Ȯ���ϱ����� �����ϴº���
					for (int i = 0; i < buycount; i++) {
						if (POS[i][0].equals(POS[buycount][0])) {
							POS[i][3] = String.valueOf((Integer.parseInt(POS[i][3]) + goodscount));
							POS[i][4] = String
									.valueOf((Integer.parseInt(POS[i][4]) + goodscount * goods_price[goodnum - 1]));
							buycount--; // ���� ��ǰ�� �ִٸ� ���������� �ѹ��������� �ϱ⿡
							break; // �迭�� ������ ��ĭ���̰� �̹��ִ� ��ǰ�� ������ ����������(��ü������)
						}
					}
					thiscount++;
					buycount++; // ����� �ѹ������� �������� ����������
					System.out.println("��� �Է��Ͻðڽ��ϱ�? (1.Yes, 2. No) : ");
					int go = sc.nextInt();
					if (go == 2) {
						System.out.println("===========���� ����=============");
						System.out.println("���ڵ�\t��ǰ��\t����\t����\t�Ұ�\t���");
						for (int i = 0; i < thiscount; i++) {
							for (int j = 0; j < row + 1; j++) {
								System.out.print(thisPOS[i][j] + "\t");
							}
							System.out.println();
						} // �ѻ���� �������� ������
						for (int i = 0; i < thiscount; i++) {
							thistotalcost += Integer.parseInt(thisPOS[i][4]);
						}
						System.out.println();
						System.out.println("�Ѱ� :" + thistotalcost);
						thistotalcost = 0;
						break;
					}
				}
				System.out.println("��� �Ͻðڽ��ϱ�?(1.yes, 2.ȯ��, 3.����)"); // 1�̸� �ٽý��� 2�̸�
																		// ȯ�� 3�̸� ����
				int conti = sc.nextInt();
				if (conti == 2) {
					System.out.println("���ڵ�\t��ǰ\t����\t����\t�Ұ�\t�̺�Ʈ");
					for (int i = 0; i < all; i++) {
						for (int j = 0; j < row + 1; j++) {
							System.out.print(totalPos[i][j] + "\t");
						}
						System.out.println();
					} // ���ݱ��� ����Ѱ͵��� ������
					System.out.println();
					System.out.println("���°���� ȯ���Ͻðڽ��ϱ�?");
					int refund = sc.nextInt();
					if (refund <= all) {
						System.out.println(refund + "�� ��ǰ ==> ");
						for (int j = 0; j < row + 1; j++) {
							System.out.print(totalPos[refund - 1][j] + "\t");
						} // �������� ���° ���� ȯ���Ұ����� ���
						System.out.println();
						System.out.println("��¥ ȯ���Ͻðڽ��ϱ�?(1.ok,2.no)");
						int real = sc.nextInt(); // ȯ�� �Ұ��� �ѹ��� Ȯ����
						if (real == 1) {
							for (int i = 0; i < all; i++) {
								if (totalPos[refund - 1][0].equals(String.valueOf(goods_barcode[i]))) {
									if (Integer.parseInt(totalPos[refund - 1][3]) + goods_count[i] > max[i]) {
										no = 1;
										System.out.println("�츮�����̾ƴմϴ�");
										continue;
									}
								}
							}
							for(int i=0; i< all; i++){
								if(totalPos[refund-1][0].equals(POS[i][0])){
								POS[i][3] = String.valueOf(
										(Integer.parseInt(POS[i][3]) - Integer.parseInt(totalPos[refund - 1][3])));
								POS[i][4] = String.valueOf(
										(Integer.parseInt(POS[i][4]) - Integer.parseInt(totalPos[refund - 1][4])));
								}
							}
								for (int z = 0; z < count; z++) {
									if (totalPos[refund - 1][1].equals(goods_name[z])) {
										goods_count[z] += Integer.parseInt(totalPos[refund - 1][3]);
									
								}
								totalPos[refund - 1][3] = String.valueOf(0);
								totalPos[refund - 1][4] = String.valueOf(0);
							}
							if (no != 1) {
								System.out.println("ȯ�ҿϷ�");
							}
							continue;
						}
					} else {
						System.out.println("ȯ���� �ȉ���ϴ�");
						continue;
					} // ȯ���� �����ش�(��������ȣ�� ȯ���� ������)
				} else if (conti == 3) {
					for (int i = 0; i < buycount; i++) {
						totalcost += Integer.parseInt(POS[i][4]);
					}
					System.out.println("===========���� ����=============");
					System.out.println("���ڵ�\t��ǰ��\t����\t�Ǹ�\t�Ұ�\t���");
					for (int i = 0; i < buycount; i++) {
						for (int j = 0; j < row + 1; j++) {
							System.out.print(POS[i][j] + "\t");
						}
						System.out.println();
					}
					System.out.println();
					System.out.println("�Ѱ� :" + totalcost);
					break; // ������ ��������ָ鼭 ��ü �� �Ǹŷ��� �����ش�
				}
			}

			String str1 = "���ڵ�" + "," + "��ǰ��" + "," + "����" + "," + "�Ǹ�" + "," + "�Ұ�" + "," + "���" + "\r\n";
			out.write(str1.getBytes());
			for (int i = 0; i < buycount; i++) {
				for (int j = 0; j < row + 1; j++) {
					str1 = POS[i][j] + ",";
					out.write(str1.getBytes());
				}
				str1 = "\r\n";
				out.write(str1.getBytes());
			}
			str1 = "\r\n\r\n";
			out.write(str1.getBytes());
			str1 = "�Ѱ�" + ",";
			out.write(str1.getBytes());
			str1 = totalcost + ",";
			out.write(str1.getBytes());
			// final.csv�� ������� �ش�.

			/*in.close();
			din.close();*/
			out.close();
			dout.close();
		}
	
		
		
		catch (Exception e){
		}
	}
	}
	

