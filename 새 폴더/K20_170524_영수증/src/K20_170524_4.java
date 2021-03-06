//  Lec05_03, 조영도, 이마트 영수증 출력

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.FormatFlagsConversionMismatchException;
import java.util.GregorianCalendar;

public class K20_170524_4 {

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
								"냉동블루베리1.13kg","얼갈이김치","봉평샘물500ml 3개입 ","청송사과 5입/봉","스판반팔티 R넥BLACk",
								"DW트렌치코트NAVYS","치키타 슈퍼프리미엄","당근 ","얼음","풀무원샘물",
								"바나나요구르트","조지아캔커피","참이슬프레쉬6개입*3sn","새우깡한정판매운맛","하이트 맥주"};
			boolean k20_noTax[] = {true,true,false,true,false    //과세물품 구분 배열
										,true,false,true,false,true
										,true,false,true,false,false
										,false,true,true,false,true
										,true,false,true,true,true
										,false,false,false,true,false
										,true,true,false,true,false};
			
			int k20_price2[] = {3780,1500,200,9500,5980,		   //상품가격 정보 배열
								10000,13500,5900,2980,4700,
								9900,14400,4250,2700,9800,
								2980,2500,10130,4060,3900,
								1240,1000,8500,9800,9900,
								10000,5400,5400,1200,5000,
								400,1500,1000,1500,2750};
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
			int k20_taxSum = 0;//과세금액 누적 변수
			for(int k20_i = 0; k20_i < k20_itemname2.length; k20_i++){ //반복하여 배열에 저장된 데이터 출력
				String k20_saveName = ""; //글자수가 20byte 넘으면 자른 값을 계산하여 저장할 변수	
				if(k20_itemname2[k20_i].getBytes().length <= 18){//자를 필요가 없는 상품은 그대로 출력
						k20_saveName = k20_itemname2[k20_i];     //기존 상품명 저장
				}else{  //글자가 18byte 이상이면 자르면서 공백문 추가하기
					for(int k20_j = 1; k20_j < 18; k20_j++){ //상품명 바이트 값이 18미만일 때까지 반복
						if(k20_saveName.getBytes().length >= 18){
							break;//18byte와 같거나 크면 break로 빠져나감
						}
						k20_saveName = k20_itemname2[k20_i].substring(0,k20_j);
					  }//18byte와 비슷한 값을 가지도록 자름
						
					}
				if(k20_saveName.getBytes().length < 20){//상품명의 길이가 20byte이하면 공백으로 1byte씩 채워서 줄을 맞춤
					while(true){
						//상품명과 공백의 합이 20byte 이상일 시 반복문 종료
						if(k20_saveName.getBytes().length >= 20){	
							break;
						}
						k20_saveName +=  " ";//공백 넣기
					  }
				}
				if(k20_noTax[k20_i]){ //면세 물품 구분해서 출력
					//면세일 경우
					System.out.printf("%02d%1s%10s %12.12s %11.9s %13.13s\n", //면세항목에 * 과 1byte공백 추가
							k20_i+1,"* ", k20_saveName, k20_df.format(k20_price2[k20_i]), k20_df.format(k20_num2[k20_i]),
							k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
					k20_taxSum += k20_price2[k20_i]*k20_num2[k20_i]; //면세일 경우에서 출력하면 면세물품 가격이 누적됨
				}else{//과세 일 경우
					System.out.printf("%02d%1s%10s %12.12s %11.9s %13.13s\n", //asterisk부분에 공백 2byte추가
							k20_i+1,"  ", k20_saveName, k20_df.format(k20_price2[k20_i]), k20_df.format(k20_num2[k20_i]),
							k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
					}
			   k20_totalPrice2 +=  (k20_price2[k20_i]*k20_num2[k20_i]);//상품가격* 개수를 총합계에 저장
			}
			int k20_taxAmount4 = (int)((k20_totalPrice2-k20_taxSum) / 1.1);; //총액에서 면세물품가를 뺀 가격/1.1(세율)
			int k20_taxation3 = k20_totalPrice2-k20_taxSum-k20_taxAmount4; //총합계-면세가격-과세가격 = 부가세 계산
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
