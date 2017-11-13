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
		final int EVENT21 = 3; // 행사상품을 하나씩 찾아바꾸지않고 여기 숫자를 바꾸면 바뀜(그러나 csv에서
								// 따로바꿔줘야함)
		InputStream in = new FileInputStream("C:\\test\\goods.csv");
		DataInputStream din = new DataInputStream(in);
		OutputStream out = new FileOutputStream("C:\\test\\finish.csv");
		DataOutputStream dout = new DataOutputStream(out);
		int row = 5; // csv에 입력한 row를 말함 csv에 가로줄을 늘리면 여길 바꿔주면됨
		int a = 0; // csv의 처음에 문자부분을 pass시켜주기위한 변수
		Scanner sc = new Scanner(System.in);
		// String[][] demo = new String[100][3];
		int[] goods_barcode = new int[100];
		int[] goods_price = new int[100]; // 상품의 마다 가격을 적는 배열
		int[] goods_count = new int[100]; // 상
		String[] goods_name = new String[100]; // 상품의 이름을 적는 배열
		String[] goods_event = new String[100]; // 이벤트를 적어주는 배열
		String[][] thisPOS = new String[100][row + 1]; // 한손님의 것을 적어주는 pos

		String[][] POS = new String[100][row + 1]; // 마지막에 총값을 출력하기위한 pos

		int count = 0; // 파일안에 몇줄이 있는지를 세어주는 변수
		int max[] = new int[100]; // 각 상품마다 재고의 max값을 저장해주는 변수
		int buycount = 0; // 마지막에 중복을 없애주기위한 변수
		int totalcost = 0; // 마지막에 총계를 적어주기 위한 변수
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
		} // csv에 있는 것들을 가지고 온다

		for (int i = 0; i < count; i++) {
			max[i] = goods_count[i];
		} // max값을 저장해준다

		int eventcount = 0;
		int thiscount = 0;
		int arraycount =0;
		while (true) {

			thiscount = 0;
			int thistotalcost = 0; // 한사람의 것이 끝나면 새로 계산해야하기때문에 0으로 초기화해준다
			while (true) {
				System.out.println("바코드\t상품\t재고\t가격\t이벤트");
				for (int i = 0; i < count; i++) {
					System.out.print(goods_barcode[i] + "\t");
					System.out.print(goods_name[i] + "\t");
					System.out.print(goods_count[i] + "\t");
					System.out.print(goods_price[i] + "\t");
					System.out.println(goods_event[i] + "\t");
				}
				System.out.println("물건을 사실건가요?(1.산다,2.안산다)");
				int buy = sc.nextInt();
				if (buy == 2) {
					System.out.println("안녕히가세요");
					break;
				}
				System.out.println("상품번호 : ");
				int goodnum = sc.nextInt();
				System.out.println(goodnum + "번 상품 ==> " + goods_name[goodnum - 1] + ", " + goods_price[goodnum - 1]);
				System.out.println("수량");
				int goodscount = sc.nextInt();
				if (goodnum == EVENT11 || goodnum == EVENT12) {
					System.out.println("행사상품입니다(1+1)");
				} else if (goodnum == EVENT21) {
					System.out.println("행사상품입니다(2+1)");
				} // 행사 상품임을 확인해줌
				if (goodscount > goods_count[goodnum - 1]) {
					System.out.println("재고가 부족합니다");
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
						thisPOS[thiscount][5] = goodscount / 2 + "개 증정";
					} else {
						POS[buycount][4] = String.valueOf((goods_price[goodnum - 1] * goodscount)
								- (goods_price[goodnum - 1] * (goodscount / 2)));
						POS[buycount][5] = goodscount / 2 + "개 증정";
						thisPOS[thiscount][4] = String.valueOf((goods_price[goodnum - 1] * goodscount)
								- (goods_price[goodnum - 1] * (goodscount / 2)));
						thisPOS[thiscount][5] = goodscount / 2 + "개 증정";
					}
				} else if (goodnum == EVENT21) {	//2+1의 공식은 ((수량+1)*2/3)*물품가격 으로함
					thisPOS[thiscount][4] = String.valueOf(((goodscount + 1) * 2 / 3) * goods_price[goodnum - 1]);
					thisPOS[thiscount][5] = goodscount / 3 + "개 증정";
				} else {
					thisPOS[thiscount][4] = String.valueOf(goods_price[goodnum - 1] * goodscount);
					thisPOS[thiscount][5] = "행사없음";
				} // 2+1, 1+1까지 처리
				for (int i = 0; i < thiscount; i++) {
					if (thisPOS[i][0].equals(thisPOS[thiscount][0])) {
						thisPOS[i][3] = String.valueOf((Integer.parseInt(thisPOS[i][3]) + goodscount));
						thisPOS[i][4] = String
								.valueOf((Integer.parseInt(thisPOS[i][4]) + goodscount * goods_price[goodnum - 1]));
						thiscount--;// 만약 물품이 있다면 영수증에는 한번만찍혀야 하기에
						buycount--;
						break;// 배열의 공간을 한칸줄이고 이미있는 물품에 갯수를 증가시켜줌(한사람)
					}
				}
				thiscount++;
				buycount++; // 계산을 한바퀴돌아 변수들을 증가시켜줌
				System.out.println("계속 입력하시겠습니까? (1.Yes, 2. No) : ");
				int go = sc.nextInt();
				if (go == 2) {
					for (int i = 0; i < thiscount; i++) {
						if (Integer.parseInt(thisPOS[i][0]) == EVENT11 || Integer.parseInt(thisPOS[i][0]) == EVENT12) {
							if (Integer.parseInt(thisPOS[i][3]) % 2 == 0) {
								thisPOS[i][4] = String.valueOf(
										(Integer.parseInt(thisPOS[i][2]) * Integer.parseInt(thisPOS[i][3])) / 2);
								thisPOS[i][5] = Integer.parseInt(thisPOS[i][3]) / 2 + "개 증정";
							} else {
								thisPOS[i][4] = String.valueOf((Integer.parseInt(thisPOS[i][2])
										* Integer.parseInt(thisPOS[i][3]))
										- (Integer.parseInt(thisPOS[i][2]) * (Integer.parseInt(thisPOS[i][3]) / 2)));
								thisPOS[i][5] = Integer.parseInt(thisPOS[i][3]) / 2 + "개 증정";
							}
						} else if (Integer.parseInt(thisPOS[i][0]) == EVENT21) {
							thisPOS[i][4] = String.valueOf(
									((Integer.parseInt(thisPOS[i][3]) + 1) * 2 / 3) * Integer.parseInt(thisPOS[i][2]));
							thisPOS[i][5] = Integer.parseInt(thisPOS[i][3]) / 3 + "개 증정";
						} else {
							thisPOS[i][4] = String
									.valueOf(Integer.parseInt(thisPOS[i][2]) * Integer.parseInt(thisPOS[i][3]));
							thisPOS[i][5] = "행사없음";
						} // 한손님이 행사상품을 조금샀다가 더삿을때 행사적용을 해주기위해 필요한 부분
					}
					System.out.println("===========폴리 마켓=============");
					System.out.println("바코드\t상품명\t가격\t수량\t소계\t행사");
					for (int i = 0; i < thiscount; i++) {
						for (int j = 0; j < row + 1; j++) {
							System.out.print(thisPOS[i][j] + "\t");
						}
						System.out.println();
					} // 한사람의 영수증을 보여줌
					for (int i = 0; i < thiscount; i++) {
						thistotalcost += Integer.parseInt(thisPOS[i][4]);
					}
					System.out.println();
					System.out.println("총계 :" + thistotalcost);
					thistotalcost = 0;
					for (int i = 0; i < thiscount; i++) {
						for (int j = 0; j < row + 1; j++) {
							POS[i+arraycount][j] = new String(thisPOS[i][j]);
						}
					}	//한사람이 구매를 다하면 그때 POS에 저장시켜준다.
					break;
				}
			}
			System.out.println("계속 하시겠습니까?(1.yes, 2.환불, 3.종료)"); // 1이면 다시시작 2이면
			int conti = sc.nextInt(); // 환불 3이면 종료
			if(conti ==1){
				arraycount++;
				continue;
			}
			else if (conti == 2) {
				System.out.println("바코드\t상품\t가격\t갯수\t소계\t이벤트");
				for (int i = 0; i < buycount; i++) {
					for (int j = 0; j < row + 1; j++) {
						System.out.print(POS[i][j] + "\t");
					}
					System.out.println();
				} // 지금까지 계산한것들을 보여줌
				System.out.println();
				System.out.println("몇번째것을 환불하시겠습니까?");
				int refund = sc.nextInt();
				if (refund <= buycount) {
					System.out.println(refund + "번 상품 ==> ");
					for (int j = 0; j < row + 1; j++) {
						System.out.print(POS[refund - 1][j] + "\t");
					} // 영수증중 몇번째 것을 환불할것인지 물어봄
					System.out.println();
					System.out.println("진짜 환불하시겠습니까?(1.ok,2.no)");
					int real = sc.nextInt(); // 환불 할건지 한번더 확인함
					if (real == 1) {
							int refundnum = Integer.parseInt(POS[refund-1][3]);
							POS[refund-1][3] = "0";
							POS[refund-1][4] = "0";
							POS[refund-1][5] = "0개증정";
							goods_count[Integer.parseInt(POS[refund-1][0]) - 1] += refundnum;	// 팔린것의 갯수를 다시 증가시켜준다.

							buycount--;	//환불이 됬으면 판매량이 1개줄었기에 카운트를 한개줄여준다
							for (int k = refund-1; k < buycount; k++) {
								for (int j = 0; j < row + 1; j++) {
									POS[k][j] = new String(POS[k + 1][j]);
								}	// 만약 환불이 제일위가 아니라면 한칸씩 땡겨서 저장해준다.
								
							}
							System.out.println("환불완료");
							continue;
						}
					
				}
			} else if (conti == 3) {
				for (int i = 0; i < buycount; i++) {
					totalcost += Integer.parseInt(POS[i][4]);
				}
				System.out.println("===========폴리 마켓=============");
				System.out.println("바코드\t상품명\t가격\t판매\t소계\t행사");
				for (int i = 0; i < buycount; i++) {
					for (int j = 0; j < row + 1; j++) {
						System.out.print(POS[i][j] + "\t");
					}
					System.out.println();
				}
				System.out.println();
				System.out.println("총계 :" + totalcost);
				break; // 마지막 종료시켜주면서 전체 총 판매량을 보여준다
			}
		}

		String str1 = "바코드" + "," + "상품명" + "," + "가격" + "," + "판매" + "," + "소계" + "," + "행사" + "\r\n";
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
		str1 = "총계" + ",";
		out.write(str1.getBytes());
		str1 = totalcost + ",";
		out.write(str1.getBytes());
		// final.csv에 저장시켜 준다.

		in.close();
		din.close();
		out.close();
		dout.close();
	}
}
