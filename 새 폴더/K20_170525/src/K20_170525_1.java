import java.text.DecimalFormat;

public class K20_170525_1 {

	public static void main(String[] args) {
		// TODO 콤마제거 (replaceAll)
		// 콤마 제거한 문자의 공백 제거
		// 문자열 integer로 바꾸기
		// 계산잘못된것 출력 수정 출력
	//  Lec07, 조영도, 고정길이에서 필드 추출
			String [] k20_OneRec ={ //영수증 출력할 배열
			"01*  초코에몽180ml*4              3,780         1         3,780",
			"02*  BE정장벨트15F-16BK           1,500         2         3,000",
			"03   (G)기본고무줄4-7               200         1           200",
			"04*  서울우유 2.3L                9,500         1         9,500",
			"05   그릭 베리믹스95g*8           5,980         1         5,980",
			"06*  하림 치킨너겟480+1          10,000         1        10,000",
			"07   로레알헤어오일브리          13,500         1        13,500",
			"08*  바나나스페셜 240ml           5,900         2        11,800",
			"09   로투스비스킷312.5G           2,980         1         2,980",
			"10*  풀무원 치즈&치즈            47,000         2        94,000",
			"11*  균)HG 은사수세미 2           9,900         2        19,800",
			"12   강원도 원주 햇감자          14,400         1        14,400",
			"13*  커피맛우유 240ml*4           4,250         1         4,250",
			"14   트리오 투명한생각            2,700         1         2,700",
			"15   노브랜드 매일채움            9,800         3        29,400",
			"16   밀키푸딩커스터드2            2,980         1         2,980",
			"17*  국내산프리미엄양파           2,500         2         5,000",
			"18*  달링다운냉장꾸리살          10,130         1        10,130",
			"19   ▲제주등심카레용             4,060         1         4,060",
			"20*  데톨핸드워쉬리필20           3,900         1         3,900",
			"21*  냉동블루베리1.13kg           1,240         1         1,240",
			"22   얼갈이김치얼갈이김치         1,000         2         2,000",
			"23*  봉평샘물5000ml 3개입         8,500         1         8,500",
			"24*  청송사과 5입/봉              9,800         1         9,800",
			"25*  스판반팔티 R넥BLACK          9,900         1         9,900",
			"26   DW트렌치코트NAVYS           10,000         1        10,000",
			"27   치키타 슈퍼프리미엄          5,400         1         5,400",
			"28   당근                         5,400         1         5,400",
			"29*  얼음                         1,200         3         3,600",
			"30   풀무원샘물                     500         1           900",
			"31*  바나나요구르트                 400         3         1,200",
			"32*  조지아캔커피                 1,500         1         1,500",
			"33   참이슬프레쉬6개입*3N        10,000         1        10,000",
			"34*  새우깡한정판매운맛           1,500         1         1,500",
			"35   하이트 맥주                  2,750         2         5,500"};
			
			for(int k20_i = 0; k20_i < k20_OneRec.length ; k20_i++ ){//반복문 안에서 출력을 위한 준비와 에러Line, Update라인 출력
				//문자열 -> integer 변환 & 콤마 제거 & 문자의 공백 제거
				int k20_price = Integer.parseInt( (new String(k20_OneRec[k20_i].getBytes(),32,7)).replaceAll(",","").trim());//금액
				int k20_num = Integer.parseInt( (new String(k20_OneRec[k20_i].getBytes(),45,4)).replaceAll(",","").trim());//개수
				int k20_total = Integer.parseInt( (new String(k20_OneRec[k20_i].getBytes(),54,9)).replaceAll(",","").trim());//총합
				//문자열을 출력하기 위한 String
				String errName =(new String(k20_OneRec[k20_i].getBytes(),5,20)).replaceAll(",","").trim();//에러-아이템명
				String errPrice =(new String(k20_OneRec[k20_i].getBytes(),32,7)).replaceAll(",","").trim();//에러-금액
				String errNum =(new String(k20_OneRec[k20_i].getBytes(),45,4)).replaceAll(",","").trim();//에러-개수문자 
				String errTotal =(new String(k20_OneRec[k20_i].getBytes(),54,9)).replaceAll(",","").trim();//에러-총합문자
				//계산의 오류가 있을 시 에러난 것을 출력하고, 수정함
				if(k20_total != k20_price * k20_num){ //총합이 금액*개수가 아닐 때
					System.out.printf("=========================\n");//구분선 출력
					System.out.printf("Error Line -> ["+k20_i+"] \n");//에러난 라인 출력
					System.out.printf(errName+" ");//에러발생한 아이템명
					System.out.printf(errPrice+" * ");//에러발생한 금액
					System.out.printf(errNum+" = ");//에러발생한 개수
					System.out.println(errTotal);//에러발생한 총합
					System.out.printf("=========================\n");//구분선 출력
					System.out.printf("Update Line -> ["+k20_i+"] \n");//수정한 라인 출력
					System.out.printf(errName+" ");//수정할 아이템명 출력
					System.out.printf(k20_price+" * ");//수정할 금액출력
					System.out.printf(k20_num+" = ");//수정할 개수 출력
					System.out.println(k20_price*k20_num);//수정된 금액 출력
					System.out.printf("=========================\n");//구분선 출력
					
				}
			}
			
	}

}
