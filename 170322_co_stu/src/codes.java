import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class codes {

	public static void main(String[] args) throws Exception {
		final int EVENT11 = 2;
		final int EVENT12 = 6;
		final int EVENT21 = 3; // ����ǰ�� �ϳ��� ã�ƹٲ����ʰ� ���� ���ڸ� �ٲٸ� �ٲ�(�׷��� csv����
								// ���ιٲ������)
		InputStream in = new FileInputStream("C:\\test\\goods.csv");
		DataInputStream din = new DataInputStream(in);
		OutputStream out = new FileOutputStream("C:\\test\\finish.csv");
		DataOutputStream dout = new DataOutputStream(out);
		int row = 5; // csv�� �Է��� row�� ���� csv�� �������� �ø��� ���� �ٲ��ָ��
		int a = 0; // csv�� ó���� ���ںκ��� pass�����ֱ����� ����
		Scanner sc = new Scanner(System.in);
		// String[][] demo = new String[100][3];
		int[] goods_barcode = new int[100];
		int[] goods_price = new int[100]; // ��ǰ�� ���� ������ ���� �迭
		int[] goods_count = new int[100]; // ��
		String[] goods_name = new String[100]; // ��ǰ�� �̸��� ���� �迭
		String[] goods_event = new String[100]; // �̺�Ʈ�� �����ִ� �迭
		String[][] thisPOS = new String[100][row + 1]; // �Ѽմ��� ���� �����ִ� pos

		String[][] POS = new String[100][row + 1]; // �������� �Ѱ��� ����ϱ����� pos

		int count = 0; // ���Ͼȿ� ������ �ִ����� �����ִ� ����
		int max[] = new int[100]; // �� ��ǰ���� ����� max���� �������ִ� ����
		int buycount = 0; // �������� �ߺ��� �����ֱ����� ����
		int totalcost = 0; // �������� �Ѱ踦 �����ֱ� ���� ����
		String str;
		String[] str2 = new String[20];

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
		} // csv�� �ִ� �͵��� ������ �´�

		for (int i = 0; i < count; i++) {
			max[i] = goods_count[i];
		} // max���� �������ش�

		int eventcount = 0;
		int thiscount = 0;
		int arraycount =0;
		while (true) {

			thiscount = 0;
			int thistotalcost = 0; // �ѻ���� ���� ������ ���� ����ؾ��ϱ⶧���� 0���� �ʱ�ȭ���ش�
			while (true) {
				System.out.println("���ڵ�\t��ǰ\t���\t����\t�̺�Ʈ");
				for (int i = 0; i < count; i++) {
					System.out.print(goods_barcode[i] + "\t");
					System.out.print(goods_name[i] + "\t");
					System.out.print(goods_count[i] + "\t");
					System.out.print(goods_price[i] + "\t");
					System.out.println(goods_event[i] + "\t");
				}
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
				thisPOS[thiscount][0] = String.valueOf(goods_barcode[goodnum - 1]);
				thisPOS[thiscount][1] = goods_name[goodnum - 1];
				thisPOS[thiscount][2] = String.valueOf(goods_price[goodnum - 1]);
				thisPOS[thiscount][3] = String.valueOf(goodscount);
				if (goodnum == EVENT11 || goodnum == EVENT12) {
					if (goodscount % 2 == 0) {
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
				} else if (goodnum == EVENT21) {	//2+1�� ������ ((����+1)*2/3)*��ǰ���� ������
					thisPOS[thiscount][4] = String.valueOf(((goodscount + 1) * 2 / 3) * goods_price[goodnum - 1]);
					thisPOS[thiscount][5] = goodscount / 3 + "�� ����";
				} else {
					thisPOS[thiscount][4] = String.valueOf(goods_price[goodnum - 1] * goodscount);
					thisPOS[thiscount][5] = "������";
				} // 2+1, 1+1���� ó��
				for (int i = 0; i < thiscount; i++) {
					if (thisPOS[i][0].equals(thisPOS[thiscount][0])) {
						thisPOS[i][3] = String.valueOf((Integer.parseInt(thisPOS[i][3]) + goodscount));
						thisPOS[i][4] = String
								.valueOf((Integer.parseInt(thisPOS[i][4]) + goodscount * goods_price[goodnum - 1]));
						thiscount--;// ���� ��ǰ�� �ִٸ� ���������� �ѹ��������� �ϱ⿡
						buycount--;
						break;// �迭�� ������ ��ĭ���̰� �̹��ִ� ��ǰ�� ������ ����������(�ѻ��)
					}
				}
				thiscount++;
				buycount++; // ����� �ѹ������� �������� ����������
				System.out.println("��� �Է��Ͻðڽ��ϱ�? (1.Yes, 2. No) : ");
				int go = sc.nextInt();
				if (go == 2) {
					for (int i = 0; i < thiscount; i++) {
						if (Integer.parseInt(thisPOS[i][0]) == EVENT11 || Integer.parseInt(thisPOS[i][0]) == EVENT12) {
							if (Integer.parseInt(thisPOS[i][3]) % 2 == 0) {
								thisPOS[i][4] = String.valueOf(
										(Integer.parseInt(thisPOS[i][2]) * Integer.parseInt(thisPOS[i][3])) / 2);
								thisPOS[i][5] = Integer.parseInt(thisPOS[i][3]) / 2 + "�� ����";
							} else {
								thisPOS[i][4] = String.valueOf((Integer.parseInt(thisPOS[i][2])
										* Integer.parseInt(thisPOS[i][3]))
										- (Integer.parseInt(thisPOS[i][2]) * (Integer.parseInt(thisPOS[i][3]) / 2)));
								thisPOS[i][5] = Integer.parseInt(thisPOS[i][3]) / 2 + "�� ����";
							}
						} else if (Integer.parseInt(thisPOS[i][0]) == EVENT21) {
							thisPOS[i][4] = String.valueOf(
									((Integer.parseInt(thisPOS[i][3]) + 1) * 2 / 3) * Integer.parseInt(thisPOS[i][2]));
							thisPOS[i][5] = Integer.parseInt(thisPOS[i][3]) / 3 + "�� ����";
						} else {
							thisPOS[i][4] = String
									.valueOf(Integer.parseInt(thisPOS[i][2]) * Integer.parseInt(thisPOS[i][3]));
							thisPOS[i][5] = "������";
						} // �Ѽմ��� ����ǰ�� ���ݻ�ٰ� �������� ��������� ���ֱ����� �ʿ��� �κ�
					}
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
					for (int i = 0; i < thiscount; i++) {
						for (int j = 0; j < row + 1; j++) {
							POS[i+arraycount][j] = new String(thisPOS[i][j]);
						}
					}	//�ѻ���� ���Ÿ� ���ϸ� �׶� POS�� ��������ش�.
					break;
				}
			}
			System.out.println("��� �Ͻðڽ��ϱ�?(1.yes, 2.ȯ��, 3.����)"); // 1�̸� �ٽý��� 2�̸�
			int conti = sc.nextInt(); // ȯ�� 3�̸� ����
			if(conti ==1){
				arraycount++;
				continue;
			}
			else if (conti == 2) {
				System.out.println("���ڵ�\t��ǰ\t����\t����\t�Ұ�\t�̺�Ʈ");
				for (int i = 0; i < buycount; i++) {
					for (int j = 0; j < row + 1; j++) {
						System.out.print(POS[i][j] + "\t");
					}
					System.out.println();
				} // ���ݱ��� ����Ѱ͵��� ������
				System.out.println();
				System.out.println("���°���� ȯ���Ͻðڽ��ϱ�?");
				int refund = sc.nextInt();
				if (refund <= buycount) {
					System.out.println(refund + "�� ��ǰ ==> ");
					for (int j = 0; j < row + 1; j++) {
						System.out.print(POS[refund - 1][j] + "\t");
					} // �������� ���° ���� ȯ���Ұ����� ���
					System.out.println();
					System.out.println("��¥ ȯ���Ͻðڽ��ϱ�?(1.ok,2.no)");
					int real = sc.nextInt(); // ȯ�� �Ұ��� �ѹ��� Ȯ����
					if (real == 1) {
							int refundnum = Integer.parseInt(POS[refund-1][3]);
							POS[refund-1][3] = "0";
							POS[refund-1][4] = "0";
							POS[refund-1][5] = "0������";
							goods_count[Integer.parseInt(POS[refund-1][0]) - 1] += refundnum;	// �ȸ����� ������ �ٽ� ���������ش�.

							buycount--;	//ȯ���� ������ �Ǹŷ��� 1���پ��⿡ ī��Ʈ�� �Ѱ��ٿ��ش�
							for (int k = refund-1; k < buycount; k++) {
								for (int j = 0; j < row + 1; j++) {
									POS[k][j] = new String(POS[k + 1][j]);
								}	// ���� ȯ���� �������� �ƴ϶�� ��ĭ�� ���ܼ� �������ش�.
								
							}
							System.out.println("ȯ�ҿϷ�");
							continue;
						}
					
				}
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

		in.close();
		din.close();
		out.close();
		dout.close();
	}
}
