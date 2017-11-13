//영수증 출력  Lec05_01, 조영도
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class K20_170524 {

	public static void main(String[] args) {		
		// Lecture5 page7 -----------------------important
		// 편의점 영수증 출력
		int k20_iPrice = 210000000; // 가격설정
		int k20_taxation = (int)(k20_iPrice*0.909)+1; //부과세 계산
		int k20_taxAmount = k20_iPrice-k20_taxation;  //세액 계산
		int k20_default = 0; //영수증에 0찍힌것 변수처리
		
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); //금액 포맷 지정 패턴
		GregorianCalendar k20_calender = new GregorianCalendar();		  //날짜 구하기 함수
		SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss"); // 년월일시분 포맷
		String k20_dateTime = k20_dateFormat.format(k20_calender.getTime()); //시간 포맷 지정 변수
		//첫번째 시간 출력용 변수
		String k20_date1= k20_dateTime.substring(0,4) + k20_dateTime.substring(4,6) + k20_dateTime.substring(6,8) ;
		//두번째 시간 출력용 변수
		String k20_date2= k20_dateTime.substring(0,4) + "-" + k20_dateTime.substring(4,6)+"-" + k20_dateTime.substring(6,8)
        + " " + k20_dateTime.substring(8,10) + ":" + k20_dateTime.substring(10, 12) + ":" +k20_dateTime.substring(12,14);
		//세번째 시간 출력용 변수
		String k20_date3= k20_dateTime.substring(0,4) + "-" + k20_dateTime.substring(4,6)+"-" + k20_dateTime.substring(6,8)
        + " " + k20_dateTime.substring(8,10) + ":" + k20_dateTime.substring(10, 12) ;
		//공백 출력		
		System.out.printf("\n\n");
		//영수증 출력 시작
		System.out.printf("%13.3s%5.5s%5.5s\n","영","수","증"); //영수증 첫줄 출력
		System.out.printf("--------------------------------------\n"); //구분선 넣기
		System.out.printf("%1.20s%14.20s\n", "종로상회(분당서현점)","129-17-77924");//업체 및 사업자번호
		System.out.printf("%1.8s%5.5s%4.5s%5.5s\n", "이상철","031", "781", "1596"); //대표자 및 연락처
		System.out.printf("%1.8s%5.5s%5.5s%6.5s\n", "성남시","분당구", "서현동", "269-3");//주소
		System.out.printf("%1.8s%3.5s\n", "테이블명  :","12"); //테이블명
		System.out.printf("%1.8s%9.30s%5.30s\n", "주문번호  :",k20_date1," 01 00041");//주문번호
		System.out.printf("--------------------------------------\n");//구분선 넣기
		System.out.printf("%1.8s%30.12s\n", "주문합계",k20_df.format(k20_iPrice));//주문 금액
		System.out.printf("%1.8s%30.12s\n", "할인금액","0"); //할인적용시 금액
		System.out.printf("%1.8s%30.12s\n", "주문합계",k20_df.format(k20_iPrice));//주문 합계
		System.out.printf("--------------------------------------\n");//구분선 넣기
		System.out.printf("%1.8s%11.10s%6.8s%13.11s\n", "현  금",k20_default,"과  세",k20_df.format(k20_taxation));//현금&과세
		//카드 계산시 가격 세액 총금액의 약10%
		System.out.printf("%1.8s%11.12s%6.8s%13.11s\n", "카  드",k20_df.format(k20_iPrice),"세  액",k20_df.format(k20_taxAmount));
		//포인트 및 면세
		System.out.printf("%1.8s%11.10s%6.8s%13.11s\n", "포인트",k20_default,"면  세",k20_default);
		System.out.printf("%23.8s%11.12s\n", "영수금액",k20_df.format(k20_iPrice));//총 금액
		System.out.printf("--------------------------------------\n");//구분선 넣기
		System.out.printf("%20.50s\n","[우리카드 신용 승인]");//결제 정보
		System.out.printf("%1.15s%20.50s\n", "승 인 일 시 :",k20_date2);//결제 시간
		System.out.printf("%1.15s%16.50s\n", "카 드 번 호 :","5522059****2021");//카드 정보
		System.out.printf("%1.15s%9.50s%7.10s%3.5s\n", "승 인 번 호 :","79753574","할부개월 :","00");//일시불, 할부 구분
		System.out.printf("%1.15s%7.50s\n", "승 인 금 액 :",k20_df.format(k20_iPrice));//가맹번호
		System.out.printf("%1.15s%10.50s%2.50s%6.50s\n", "가 맹 번 호 :","730461774","/","비씨카드사");//가맹번호
		System.out.printf("%1.15s%13.20s\n", "사업자 번호 :","129-17-77924");//사업자번호
		System.out.printf("--------------------------------------\n");//구분선 넣기
		System.out.printf("%1.30s%12.50s%8.10s\n", k20_date3, "CASHIER  :","직원");//시간 및 담당 직원
		System.out.printf("--------------------------------------\n");//구분선 넣기
		System.out.printf("%1.8s%5.10s\n", "감사","합니다.");//감사합니다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
