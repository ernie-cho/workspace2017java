//  Lec05_03, 조영도, 이마트 영수증 출력

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.FormatFlagsConversionMismatchException;
import java.util.GregorianCalendar;

public class K20_170524_3 {

	public static void main(String[] args) {
		
			// Lecture5 page9 -----------------------important
			DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###");//금액 포맷 지정 패턴
			GregorianCalendar k20_calender = new GregorianCalendar();//날짜 구하기 함수
			SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");// 년월일시분 포맷
			String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());//시간 포맷 지정 변수
			//상품 정보 배열
			String k20_itemname2[] = {"초코에몽180ml*4","BE정장벨트15F-16BK","(G)기본고무줄4-7","서울우유 2.3L","그릭 베리믹스95g*8",
								"하림 치킨너겟480+1","로레알헤어오일브리","바나나스페셜 240ml","로투스비스킷312.5G","풀무원 치즈&치즈",
								"균)HG 은사수세미 2","강원도 원주 햇감자","커피맛우유 240ml*4","트리오 투명한생각","노브랜드 매일채움",
								"밀키푸딩커스터드2","국내산프리미엄양파","달링다운냉장꾸리살","▲제주등심카레용","데톨핸드워쉬리필20",
								"냉동블루베리1.13kg","얼갈이김치얼갈이김치김치","봉평샘물5000ml 3개입 ","청송사과 5입/봉","스판반팔티 R넥BLACK",
								"DW트렌치코트NAVYS","치키타 슈퍼프리미엄","당근","얼음","풀무원샘물",
								"바나나요구르트","조지아캔커피","참이슬프레쉬6개입*3NA","새우깡한정판   매운맛","하이트 맥주"};
			boolean k20_noTax[] = {true,true,false,true,false    //과세물품 구분 배열
										,true,false,true,false,true
										,true,false,true,false,false
										,false,true,true,false,true
										,true,false,true,true,true
										,false,false,false,true,false
										,true,true,false,true,false};
			
			int k20_price2[] = {3780,1500,200,9500,5980,		   //상품가격 정보 배열
								10000,13500,5900,2980,47000,
								9900,14400,4250,2700,9800,
								2980,2500,10130,4060,3900,
								1240,1000,8500,9800,9900,
								10000,5400,5400,1200,500,
								400,1500,10000,1500,2750};
			int k20_num2[] = {1,2,1,1,1,								//수량 정보 배열
								1,1,2,1,2,
								2,1,1,1,3,
								1,2,1,1,1,
								1,2,1,1,1,
								1,1,1,3,1,
								3,1,1,1,2};
			int k20_totalPrice2 =0;									//총 금액 변수
			String k20_date7= k20_dateTime.substring(0,4) +"-"+ k20_dateTime.substring(4,6) +"-"+ k20_dateTime.substring(6,8)
	        + " " + k20_dateTime.substring(8,10) +":"+ k20_dateTime.substring(10, 12); //날짜 출력 변수
			
			//이마트 영수증 출력 시작
			System.out.printf("%53.30s\n","이마트 죽전점 (031)888-1234"); //업체명 및 전화번호
			System.out.printf("%10.20s%32.30s\n","   e  m  a  r  t","208-86-50918 이갑수"); //로고 및 사업자번호, 대표자명
			System.out.printf("%48.30s\n","용인시 수지구 포은대로 552"); //주소
			System.out.printf("\n");//공백 출력
			System.out.printf("%1.30s\n","영수증 미지참시 교환/환불 불가(30일)");//안내문1
			System.out.printf("%1.30s\n","교환/환불 구매점에서 가능(결제카드지참)");//안내문2
			System.out.printf("%1.30s\n","체크카드/신용카드 청구취소 반영은");//안내문3
			System.out.printf("%1.30s\n","최대 3~5일 소요 (주말,공휴일제외)");//안내문4
			System.out.printf("\n");//공백 출력
			System.out.printf("%1.30s%17.20s%39.20s\n","[구 매]",k20_date7,"POS:0009-2418");//현재 시간 및 포스 번호
			System.out.printf("---------------------------------------------------------------\n");//구분선 넣기
			System.out.printf("%8.15s%23.10s%11.10s%12.10s\n", "상 품 명","단  가","수량","금  액");//영수증 출력 항목
			System.out.printf("---------------------------------------------------------------\n");//구분선 넣기
			String k20_taxStar = null;//과세 물품 구별 변수
			int k20_taxSum = 0;//과세금액 누적 변수
			int k20_space = 0; //공백 계산용 변수
			String k20_a1 = ""; //글자수가 20byte 넘으면 자른 값을 계산하여 저장할 변수
			int k20_2space;    //글자수가 20byte 넘을 시, 공백을 새로 계산함
			
			for(int k20_i = 0 ; k20_i < k20_itemname2.length; k20_i++){ //반복하여 배열에 저장된 데이터 출력
				
				try{
					int k20_a = k20_itemname2[k20_i].getBytes().length; //아이템명의 byte길이를 구하여 변수에 저장
					int k20_b = Integer.toString(k20_price2[k20_i]).getBytes().length; //단가 금액의 byte길이를 구하여 변수에 저장
					byte[] k20_bb = k20_itemname2[k20_i].getBytes(); //바이트 저장용 배열
					
					if(k20_a > 20){ //만약 아이템명이 20byte가 넘을 시 조건 수행
						 if (k20_bb[20] == 0x80){    //20byte에 값이 한글과 일치하면 아래 조건을 수행
							 k20_a1 = new String(k20_bb,0,18)+" "; //배열 값을 18바이트까지 잘라서 저장
						 }else {
							 k20_a1 = new String(k20_bb,0,20)+" "; //배열 값을 20바이트까지 잘라서 저장
						 }
						
					}else{ // 자를 필요가 없으면 그대로 출력
						k20_a1 = k20_itemname2[k20_i];
					}
					if(k20_noTax[k20_i] == true){ //상품이 과세 항목인지 알아보기
						k20_taxStar = "*";         //면세 항목이면 Asterisk 표시
					}else{
						k20_taxStar = " ";		   //과세 항목이면 공백으로 표시
					}
					k20_2space = k20_a1.getBytes().length; //20byte가 넘은 조건을 수행시 새로운 공백 변수에 저장
					switch(k20_b){					//상품명 길이에 따라 조건식 바꿔주기
						case 10://금액이 10억 단위일때
							k20_space = (32-k20_2space-k20_b); //상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
							if(k20_space == 2){		//남은 byte가 2일 때 
								k20_space =1;		//바이트를 1로 지정
							}
							//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
							System.out.printf("%02d%s  %1s%"+k20_space+".15s%12.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break; //위의 항목들이 적용되어 출력되면 switch문을 나옴
						case 9:	//금액이 1억단위 일때
							k20_space = (31-k20_2space-k20_b); //상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
							if(k20_space == 1){		//남은 byte가 1일 때 
								k20_space =2;		//바이트를 2로 지정
							}
							//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
							System.out.printf("%02d%s  %1s%"+k20_space+".15s%12.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break; //위의 항목들이 적용되어 출력되면 switch문을 나옴
						
						case 8:	//금액이 천만만단위 일때
							k20_space = (32-k20_2space-k20_b); //상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
							if(k20_space == 2){		//남은 byte가 2일 때 
								k20_space = 1;		//바이트를 1로 지정
							}
						//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
						System.out.printf("%02d%s  %1s%"+k20_space+".15s%5.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
								"",k20_df.format(k20_price2[k20_i]),
								k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
								if(k20_taxStar == "*"){
									k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
								}break; //위의 항목들이 적용되어 출력되면 switch문을 나옴
						case 7://금액이 백만단위 일때
							k20_space = (32-k20_2space-k20_b); //상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
							if(k20_space == 2){		//남은 byte가 2일 때 
								k20_space = 1;		//바이트를 1로 지정
							}
						//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
						System.out.printf("%02d%s  %1s%"+k20_space+".15s%5.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
								"",k20_df.format(k20_price2[k20_i]),
								k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
								if(k20_taxStar == "*"){
									k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
								}break; //위의 항목들이 적용되어 출력되면 switch문을 나옴
						case 6://금액이 십만단위 일때
						case 5://금액이 만단위 일때
						case 4://금액이 천단위 일때
							k20_space = (33-k20_2space-k20_b); //상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
								if(k20_space == 2){		//남은 byte가 2일 때 
									k20_space = 1;		//바이트를 1로 지정
								}
							//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
							System.out.printf("%02d%s  %1s%"+k20_space+".15s%5.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break; //위의 항목들이 적용되어 출력되면 switch문을 나옴
						case 3://금액이 백단위 일때
							k20_space = (32-k20_2space-k20_b); //상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
							if(k20_space == 2){  //남은 byte가 2일 때
								k20_space =1;    //바이트를 1로 지정
								//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
							}System.out.printf("%02d%s  %1s%"+k20_space+".15s%5.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break;//위의 항목들이 적용되어 출력되면 switch문을 나옴
						case 2://금액이 십단위 일때
							k20_space = (31-k20_2space-k20_b); //상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
							if(k20_space == 2){   //남은 byte가 2일 때
								k20_space =1;     //바이트를 1로 지정
								//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
							}System.out.printf("%02d%s  %1s%"+k20_space+".15s%5.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break;//위의 항목들이 적용되어 출력되면 switch문을 나옴
						case 1://금액이 원단위 일때
							k20_space = (30-k20_2space-k20_b); //상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
							if(k20_space == 2){//남은 byte가 2일 때
								k20_space =1;//바이트를 1로 지정
								//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
							}System.out.printf("%02d%s  %1s%"+k20_space+".15s%5.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break;//위의 항목들이 적용되어 출력되면 switch문을 나옴
						default: //금액이 혹시 알수 없을 때를 대비해서 저장
							k20_space = (33-k20_2space-(k20_b+1));//상품명과 단가의 폭을 31로 지정하여, 공백과 단가를 뺀 변수
							if(k20_space == 2){//남은 byte가 2일 때
								k20_space =1;//바이트를 1로 지정
							}//출력 계산 - 각 항목의 위치 지정 및 공백계산 한 변수를 대입하여 상품명과 단가의 사이를 저장함
							System.out.printf("%02d%s  %1s%"+k20_space+".15s%5.15s%10.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break;
					}
					//System.out.println(k20_space);
					k20_totalPrice2 +=  (k20_price2[k20_i]*k20_num2[k20_i]);//상품가격* 개수를 총합계에 저장
				}catch (FormatFlagsConversionMismatchException e){ //금액 초과시 에러 출력
					System.out.printf("**해당상품은 판매할 수 없는 상품입니다 제외 후 계산됩니다.*\n");
				}
			}
			int k20_taxAmount3 = k20_totalPrice2-k20_taxSum; //총합계에서 면세물품을 제한 가격 = 과세가격총합
			int k20_taxation3 = (int)(k20_taxAmount3*0.10000000)+1; //과세가격총합의 총합에서 부과세를 계산함
			int k20_taxAmount4 = k20_totalPrice2-k20_taxSum-k20_taxation3; //과세 상품의 부과세를 뺀 가격(영수증에 출력함)
			System.out.printf("%23.20s%36.20s\n","(*)면 세  물 품",k20_df.format(k20_taxSum)); //면세물품가격 총합
			System.out.printf("%23.20s%36.20s\n","과 세  물 품",k20_df.format(k20_taxAmount4));//과세 상품의 부과세를 뺀 가격
			System.out.printf("%24.20s%36.20s\n","부   과   세",k20_df.format(k20_taxation3));//과세상품 총합의 부과세 계산
			System.out.printf("%25.20s%36.20s\n","합        계",k20_df.format(k20_totalPrice2));//총상품의 가격* 개수
			System.out.printf("%1.20s%46.20s\n","결 제 대 상 금 액",k20_df.format(k20_totalPrice2));//총합계
			System.out.printf("---------------------------------------------------------------\n");//구분선 넣기
			System.out.printf("%1.20s%52.20s\n","0024 하  나","5417**8890/07850246");//카드정보
			System.out.printf("%1.20s%52.20s\n","카드결제","일시불 / "+k20_df.format(k20_totalPrice2));//일시불 구분
			System.out.printf("---------------------------------------------------------------\n");//구분선 넣기
			System.out.printf("%1.20s\n","홍*두 고객님의 포인트 현황입니다.");//고객 포인트 현황

	}

}
