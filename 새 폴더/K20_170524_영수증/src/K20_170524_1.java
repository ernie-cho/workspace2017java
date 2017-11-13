//영수증 출력  Lec05_02, 조영도
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class K20_170524_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Lecture5 page8 -----------------------important
		//
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###");//금액 포맷 지정 패턴
		GregorianCalendar k20_calender = new GregorianCalendar();//날짜 구하기 함수
		SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss"); // 년월일시분 포맷
		String k20_itemname[] = {"풀무원샘물","바나나요구르트","구글기프트카드","조지아캔커피"};//상품명 배열
		String k20_itemcode[] = {"8809169718205","8809169213424","8809169213340","8809169213365"};//아이템코드 배열
		int k20_price[] = {600,500,5000,1500};//금액 배열
		int k20_num[] = {5,10,4,2};//상품개수 배열
		int k20_totalPrice =0;//총 금액 변수
		String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());//시간 포맷 지정 변수
		//첫번째 시간 출력용 변수
		String k20_date4= k20_dateTime.substring(0,4) + k20_dateTime.substring(4,6) + k20_dateTime.substring(6,8)
        + " " + k20_dateTime.substring(8,10) + k20_dateTime.substring(10, 12) +k20_dateTime.substring(12,14);
		//두번째 시간 출력용 변수
		String k20_date5= k20_dateTime.substring(0,4) +"/"+ k20_dateTime.substring(4,6) +"/"+
							k20_dateTime.substring(6,8) + "-0002-0922";
		//세번째 시간 출력용 변수
		String k20_date6= k20_dateTime.substring(0,4) + k20_dateTime.substring(4,6) + k20_dateTime.substring(6,8)
         + k20_dateTime.substring(8,10) + k20_dateTime.substring(10, 12) +k20_dateTime.substring(12,14)
         + "]";
		//공백출력
		System.out.printf("\n\n");
		//휴게소 영수증 출력 시작
		System.out.printf("%1.13s\n","충주(양평)휴게소");//업체명
		System.out.printf("%1.20s\n","충북충주시가금면용전리380-4");//주소
		System.out.printf("%1.20s%17.20s\n","최병권 677-85-00239","TEL:043-857-9229");//대표자 및 연락처
		System.out.printf("\n");//공백 출력
		System.out.printf("\n");//공백 출력
		System.out.printf("%1.20s%14.20s%14.20s\n","[정상등록]",k20_date4,"POS번호: 0002");//현재시간 및 포스번호
		System.out.printf("-----------------------------------------\n");//구분선 넣기
		System.out.printf("%1.15s%15.10s%3.10s%9.10s\n", "품목코드","단가","수량","금액");//영수증 항목
		System.out.printf("-----------------------------------------\n");//구분선 넣기
		for(int k20_i = 0 ; k20_i < 4; k20_i++){//상품정보 받아오기
			System.out.printf("%1.15s\n",k20_itemname[k20_i]); //상품명 출력
			//아이템 코드, 단가, 수량, 금액 계산
			System.out.printf("%1.15s%11.20s%6.10s%11.10s\n",k20_itemcode[k20_i],k20_df.format(k20_price[k20_i]),
					k20_num[k20_i],k20_df.format(k20_price[k20_i]*k20_num[k20_i]));
			k20_totalPrice +=  (k20_price[k20_i]*k20_num[k20_i]);
		}
		System.out.printf("\n");//공백출력
		int k20_taxation2 = (int)(k20_totalPrice*0.909)+1;//부과세 계산
		int k20_taxAmount2 = k20_totalPrice-k20_taxation2;//세액 계산
		int k20_exceptTax = k20_totalPrice-k20_taxAmount2;//과세 물품 금액 계산
		System.out.printf("%1.20s%27.20s\n","과세 물품 합계",k20_df.format(k20_exceptTax)); //과세 금액 출력		
		System.out.printf("%1.20s%27.20s\n","부    과    세",k20_df.format(k20_taxAmount2));//부과세 출력
		System.out.printf("%1.20s%27.20s\n","합          계",k20_df.format(k20_totalPrice));//합계금액
		System.out.printf("%1.20s%27.20s\n","026-비씨카드사","00/00A");//카드사 정보
		System.out.printf("%1.20s%25.20s\n","카  드  번  호 :","5522-20**-****-BADD");//카드 정보
		System.out.printf("%1.20s%25.20s\n","카  드  매  출 :",k20_df.format(k20_totalPrice));//카드 결제시 출력
		System.out.printf("%1.20s%22.5s\n","거  래  구  분 :","일시불");//할부/일시불 구분
		System.out.printf("%1.20s%18.20s\n","승  인  번  호 :04-KICC","75549250");//승인번호
		System.out.printf("%1.22s\n","가 맹 점 번 호 :");//가맹점 번호
		System.out.printf("%1.20s%25.10s\n","받  은  금  액 :",k20_df.format(k20_totalPrice));//총 금액
		System.out.printf("%1.20s%25.10s\n","거    스    름 :","0");//현금시 거스름돈 지불
		System.out.printf("-----------------------------------------\n");//구분선 넣기
		System.out.printf("%1.20s%11.10s\n","주문번호:","0920");//주문번호
		System.out.printf("-----------------------------------------\n");//구분선 넣기
		System.out.printf("%1.20s%13.30s\n","판매원 :","000002 편의점2");//판매원 정보
		System.out.printf("%1.20s\n",k20_date5);//현재 시간 출력
		System.out.printf("%1.20s%17.30s\n","연동모듈:[00138705",k20_date6);//연동모듈 정보
	}

}
