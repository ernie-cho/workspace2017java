import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class test {

	public static void main(String[] args) {
	
		//Emart영수증 출력 , 0524_Lec5_03, 김남영
		
		//상품 이름 저장 배열
		String [] k02_itemname = {"새우깡 매운맛 4봉지 입","오사쯔 new","허니버터칩 2Plus","칙촉","빠다코코넛  1980년 버전","포카칩은 역시 onion","오감자","수미칩","칸쵸","감자깡",
							  "시리얼","뿌셔뿌셔 5입/봉지","고구마과자","바나나킥 스페셜","콘치","갓찐감자","눈을감자","예감","허니통통","치토스",
							  "웨하스 바나나맛일까 아닐까","유산균샌드 먹고싶다 과자","쿠키&크림맛 4입 오레오 스페셜 에디션","오징어땅콩","홈런볼 10봉지 묶음","뽀또",
							  "빼빼로프링글스","포키","프링글스 한정판프링글스","꿀꽈배기","꿀꽈배기 한정판 4봉지입"};
		//상품 가격 저장 배열
		int [] k02_price = {800,1500,2000,2500,3000,3500,4000,4500,5000,5500,
						6000,6500,7000,7500,8000,8500,9000,9500,10000,10500,
						11000,1150000,120000,12500,13000,13500,14000,14500,15000,15500,15000};
		//상품 수량 저장 배열
		int [] k02_num = {2,4,6,8,10,1,3,5,7,9,
					  3,4,5,6,7,8,9,10,11,12,
					  10,9,8,7,6,5,4,3,2,1,2};
		//면세 상품 여부 저장 배열
		boolean [] k02_taxFree = {true,false,true,true,false,true,false,true,true,false,
							  true,false,true,true,false,true,false,true,true,false,
							  true,false,true,true,false,true,false,true,true,false,true};
		
		int k02_taxVal = 0;	//세금(부 가 세)
		int k02_no_tax = 0;	//면세 물품 가격 총 합
		int k02_total = 0;	//총 결제 금액
		int k02_nettax = 0;	//과세 물품
		
		//3자리 수 마다 ,찍는 포멧 설정.
		DecimalFormat df = new DecimalFormat( "###,###,###,###,###" );
		//Calendar 클래스를 사용하여 현재 시간을 가져옴.
		Calendar calt = Calendar.getInstance();
		//필요한 날짜 포멧 형식을 지정해줌.
		SimpleDateFormat ymd = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat hms = new SimpleDateFormat("HH:mm:ss");
		
		//영수증 출력 시작
		System.out.printf("%-5.5s %31.31s %15.15s\n", "emart","이마트 죽전점","(031)888-1234");
		System.out.printf("%56.56s\n", "206-86-50913  이갑수");
		System.out.printf("%49.49s\n", "용인시 수지구 보은대로552");
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%-35.35s\n", "영수증 미지참시 교환/환불 불가(30일내)");		
		System.out.printf("%-35.35s\n", "교환/환불 구매점에서 가능(결제카드 지참)");	
		System.out.printf("%-35.35s\n", "체크카드/신용카드 청구취소 반영은");	
		System.out.printf("%-35.35s\n", "최대 3~5일 소요 (주말,공휴일제외)");
		System.out.printf("\n");
		//결제 날짜 출력
		System.out.printf("[%-3.3s]%10.10s %5.5s %35.35s\n", "구 매", ymd.format(calt.getTime()), hms.format(calt.getTime()), "POS:0009-2418");
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%-18.18s %13.13s %6.6s %10.10s\n", "    상 품 명", "단  가", "수 량", "금  액");
		System.out.printf("-----------------------------------------------------------\n");
		byte by[];
		//판매 상품 등록
		for(int i = 0; i < k02_itemname.length; i++){
			String k02_input_str = ""; //최종 상품명 출력 String
			//상품 명이 18바이트자리 초과인 경우 글자 자르기
			k02_itemname[i] = k02_itemname[i].replaceAll("\t", "");
			k02_itemname[i] = k02_itemname[i].replaceAll("\n", "");
			k02_itemname[i] = k02_itemname[i].replaceAll("\r", "");
			
			if(k02_itemname[i].getBytes().length <= 18){	//글자 수가 18바이트 이하인 경우 글자를 그대로 사용
				k02_input_str = k02_itemname[i];
			}else{
				
				
				//글자 수가 18바이트 초과인 경우 substring을 이용하여 byte가 18 이상일때까지만 사용.
				for(int j = 1; j < 18; j++){
					if(k02_input_str.getBytes().length >= 18){	//상품명의 바이트 길이가 18이상이면 반복문을 빠져나감.
						break;
					}
					k02_input_str = k02_itemname[i].substring(0, j);  //상품 명의 바이트 길이가 18이상이 될 때까지 글자를 절삭함.
				}
				
			}
			
			//상품명 출력 바이트 수가 20바이트보다 적으면 " " 문자로 20바이트까지 추가.
			if(k02_input_str.getBytes().length < 20){
				while(true){
					if(k02_input_str.getBytes().length >= 20){	//상품명의 바이트 길이가 20 이상인경우 반복문을 빠져나간다.
						break;
					}
					k02_input_str +=  " ";	//바이트 수가 동일할때까지 공백문자 추가.
				}
			}
					
			String k02_str_i = String.format("%02d", i+1);	//품목 순서 포멧 형식
			if (k02_taxFree[i]){	//면세 물품인 경우
									//면세 물품인 경우에는 풍목 숫자 뒤에 *을 추가해준다.
			System.out.printf("%-4.4s%10s %12.12s %8.8s %12.12s\n",
					//각각의 포멧에 맞춰서 출력한다.
					String.valueOf(k02_str_i)+"*", k02_input_str, df.format(k02_price[i]), df.format(k02_num[i]), df.format(k02_price[i]*k02_num[i]));
			k02_no_tax = k02_no_tax + (k02_price[i]*k02_num[i]);	//면세 물품 가격 누적
			}	
			else{	//과세 물품인 경우.
					//과세 물품인 경우 품목 숫자 뒤에 *을 추가하지 않는다.
			System.out.printf("%-4.4s%10s %12.12s %8.8s %12.12s\n", 
					//각각의 포멧에 맞춰서 출력한다.
					String.valueOf(k02_str_i), k02_input_str, df.format(k02_price[i]), df.format(k02_num[i]), df.format(k02_price[i]*k02_num[i]));
			}
			k02_total = k02_total + (k02_price[i]*k02_num[i]);	//총 결제 금액 누적
		}
		
		k02_nettax = (int)((k02_total-k02_no_tax) / 1.1);	//과세 물품 가격 계산
		k02_taxVal = k02_total-k02_no_tax-k02_nettax;			//부가세 금액 계산
		System.out.printf("%41.41s %13.20s\n", "(*)면 세  물 품", df.format(k02_no_tax));	//면세 물품 가격 출력
		System.out.printf("%41.41s %13.20s\n", "과 세  물 품", df.format(k02_nettax));		//과세 물품 가격 출력
		System.out.printf("%42.42s %13.20s\n", "부   가   세", df.format(k02_taxVal));		//총 가격 중에 부가세 가격 출력
		System.out.printf("%43.43s %13.20s\n", "합        계", df.format(k02_total));		//총 금액 합 출력
		System.out.printf("%-28.28s %24.24s\n", "결 제 대 상 금 액", df.format(k02_total));	//결제 대상 금액 출력
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%-4.4s %5.5s %46.46s\n", "0024", "하  나", "5417**8890/07850246");
		System.out.printf("%-7.7s %44.44s\n", "카드결제", "일시불 /"+df.format(k02_total));	//일시불로 결제하는 금액 출력
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%-30.30s", "홍*두 고객님의 포인트 현황입니다.");
		
	}
}






















