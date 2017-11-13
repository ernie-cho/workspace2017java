import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class pos_work {

	public static void main(String[] args) {

		Scanner myInput = new Scanner(System.in);		
		
		try {
			// 입출력 선언
			FileInputStream in = new FileInputStream("C:\\test\\goods.csv");
			DataInputStream din = new DataInputStream(in);
			
			FileOutputStream out = new FileOutputStream("C:\\test\\goods_result.csv");
			DataOutputStream dout = new DataOutputStream(out);
		
////////////////// 실전문제 1 ///////////////////////////////			
			
			// 변수 선언
			int rowCount = 0, colCount = 3;
			String inputData = null;
			String [] inputArr = new String [100];	
			String[][] outputArr = new String [100][100];
			
			// 파일 불러오기
			while((inputData = din.readLine()) != null) { // inputData : Kanu, 3000, 100,
				inputArr = inputData.split(",");	// inputArr[0] = kanu, inputArr[1] = 3000 ....
				// 출력배열에 넣기. 
				for(int i = 0; i < colCount; i++) {
						outputArr[rowCount][i] = inputArr[i];
				}
				rowCount++;	
			}
			// rowCount 현재 4
			
			System.out.println("======= 상품 리스트 =======");
			System.out.println("상품명" + "\t" + "가격" + "\t" + "남은 재고");
			// 불러온 파일(출력배열) 출력해보기
			for(int i = 0; i < rowCount; i++) {
				for(int j = 0; j < colCount; j++) {
					System.out.print(outputArr[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
			
/////////////// 실전문제 2 //////////////////////////////////
			
			// 각 필드별 배열선언
			String[] goodsName = new String [100]; // 상품명배열
			int[] goodsPrice = new int [100]; // 가격배열
			int [] goodsStock = new int [100]; // 재고배열
			
			// 필드별 고정값 변수
			int colGoodsName = 0, colGoodsPrice = 1, colstockCount = 2;
			// 레코드별 고정값 변수
			int rowKanu = 0, rowKimbab = 1, rowCoke = 2, rowBibim = 3;
			
			// 상품명배열에 상품넣기
			for(int i = 0; i < rowCount; i++) {
				goodsName[i] = outputArr[i][colGoodsName];
			}
			// 가격배열에 가격넣기
			for(int i = 0; i < rowCount; i++) {
				goodsPrice[i] = Integer.parseInt(outputArr[i][colGoodsPrice]);
			}
			// 재고배열에 재고넣기
			for(int i = 0; i < rowCount; i++) {
				goodsStock[i] = Integer.parseInt(outputArr[i][colstockCount]);
			}
			// 각각의 배열에 있는 것을 출력
			System.out.println("======= 상품 리스트 =======");
			System.out.println("상품명" + "\t" + "가격" + "\t" + "남은 재고");
			for(int i = 0; i < rowCount; i++) {
				System.out.println(goodsName[i] + "\t" + goodsPrice[i] + "\t"+ goodsStock[i]);
			}
			System.out.println();
			
/////////////// 실전문제 3 ////////////////////////////////////
			
			// 입력 받을 상품수, 수량, 주문종료 변수선언
			int goodsNum = 0, goodsCount = 0, jumunEnd = 0, todayEnd = 0;
			// 각 상품별 저장할 다른변수 만듬.
			int goodsNameKanu = 0, goodsNameKimbab = 0, goodsNameCoke = 0, goodsNameBibim = 0;
			int goodsCountKanu = 0, goodsCountKimbab = 0, goodsCountCoke = 0, goodsCountBibim = 0;
			// 소계
			int sum = 0;
			
			// 영업이 종료될때 사용할 변수
			int totalSum = 0; // 총소계
			int [] totalSumArr = new int [rowCount];
			int [] totalCountArr = new int [rowCount];
			
			while(true) { // 입력 반복문 시작
				System.out.println("상품을 입력해주세요.");
				System.out.println("1.카누, 2.김밥, 3.콜라, 4,비빔밥");
				System.out.print("상품번호 : ");
				goodsNum = myInput.nextInt();
				System.out.println(goodsNum + "번 상품" + " => " + goodsName[goodsNum-1] + ", " + goodsPrice[goodsNum-1] + "원");
				System.out.print("수량 : ");
				goodsCount = myInput.nextInt();	
				// 입력된 값을 상품별, 수량별로 다른 변수에  저장
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
				// 주문 종료 선택
				System.out.print("계속 입력하시겠습니까? (1:Yes, 2:No)");
				jumunEnd = myInput.nextInt();
				System.out.println();
				
				// 주문이 완료 되었으면
				if(jumunEnd == 2) {			
					System.out.println("=========== 폴리 마켓 ===========");
					System.out.println("상품명\t가격\t수량\t소계");
					
					// 선택된 것 출력
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
				 	
				 	
				 	//총합
				 	System.out.println();
					System.out.println("총계: " + sum + "원");
					System.out.println();
					System.out.println("계속 진행하시겠습니까? (1.Yes, 2.영업종료)");
					todayEnd = myInput.nextInt();
					System.out.println();
					sum = 0;
					
					if(todayEnd == 2){
						break;
					}
				}		
	
			} 
	
/////////////////////////// 실전문제 4 /////////////////////////////////////////////
			
			String lastOutputSave = null;
			String lastOutputTitle = null;
			
			// 영업 종료시				
			System.out.println("======== 폴리 마켓 전체 매출 ========");
			System.out.println("상품명\t가격\t판매수량\t남은재고\t소계");
			// 최종  출력
			for(int i = 0; i< rowCount; i++) {
				System.out.print(goodsName[i] + "\t" + goodsPrice[i] + "\t" + totalCountArr[i] + "\t" + goodsStock[i] + "\t"+ totalSumArr[i] + "\n");
			}		
			// 총 매출 계산
			for(int i = 0; i < rowCount; i++) {
				totalSum = totalSum + totalSumArr[i];
			}
			
			System.out.print("총 매출 : " + totalSum);
			
			// 영업종료에 따른 총매출 파일에 저장
			lastOutputTitle = "상품명"+ "," + "가격" + "," + "판매수량" + "," + "남은재고" + "," + "소계" + "\n";
			dout.write(lastOutputTitle.getBytes());
			for(int i = 0; i < rowCount; i++) {					
				lastOutputSave = goodsName[i] + "," + goodsPrice[i] + "," + totalCountArr[i] + "," + goodsStock[i] + "," + totalSumArr[i] + "\n";
				dout.write(lastOutputSave.getBytes());
			}
						
			din.close();
			dout.close();
			
		} catch(Exception e) {
			System.out.println("에러1");
		}
		
		myInput.close();
		System.out.println();
	}

}
