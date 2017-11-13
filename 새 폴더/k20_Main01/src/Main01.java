import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Main01 {
	static ArrayList<k20_OneRec> k20_ArrayOneRec = new ArrayList <k20_OneRec>();
	static int count_person = 0;//현재 페이지 사람 수 저장
	static int count_person2 = 0;//누적 페이지 사람 수 저장
	static int k20_sum_student_id =0;//학생 ID
	static int k20_sumkor, k20_sumkor2 = 0;//현재,누적 언어
	static int k20_sumeng, k20_sumeng2 = 0;//현재,누적 영어
	static int k20_summat, k20_summat2 = 0;//현재,누적 수학
	static int k20_sumsum, k20_sumsum2 = 0;//현재,누적 합계
	static int k20_sumave, k20_sumave2 = 0;//현재,누적 평균
	/*출력 인원수 설정*/
	static final int k20_iPerson = 100;
	
	DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###");//금액 포맷 지정 패턴
	static GregorianCalendar k20_calender = new GregorianCalendar();//날짜 구하기 함수
	static SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss"); // 년월일시분 포맷
	static String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());//시간 포맷 지정 변수
	 //첫번째 시간 출력용 변수
	static String k20_date= k20_dateTime.substring(0,4) +"."+ k20_dateTime.substring(4,6) +"."+ k20_dateTime.substring(6,8)
    + " " + k20_dateTime.substring(8,10) +":" + k20_dateTime.substring(10, 12) +":"+k20_dateTime.substring(12,14);
	
	
	//데이터 생성
	public static void dataSet(){
		for(int k20_i = 0 ; k20_i < k20_iPerson ; k20_i++){
			String k20_name = String.format("홍길%05d", k20_i+1); //이름 만들기
			int k20_kor =  (int)(Math.random()*100);			 //언어 점수 만들기
			int k20_eng =  (int)(Math.random()*100);			 //영어 점수 만들기
			int k20_mat =  (int)(Math.random()*100);			 //수학 점수 만들기
			// 하나의 OneRec클래스 생성 후, ArrayList에 insert
			k20_ArrayOneRec.add(new k20_OneRec(k20_i+1,k20_name,k20_kor,k20_eng,k20_mat));
			
		}
	}
	 //반복 출력을 위한 변수 선언
	static int k20_count = 0; //학생 ID번호를 저장할 변수
	static int k20_pageCount = 0; //페이지 번호를 저장할 변수
	//헤더인쇄
	public static void HeaderPrint() {
		
			System.out.printf("%29s\n", "성적집계표");/*제목 출력*/
			/*페이지 카운트 + 출력일시 출력*/
			System.out.printf("%5s %1d %24s %8.20s \n","PAGE : ",k20_pageCount+1, "출력일자 :",k20_date);
			System.out.printf("============================================================\n");/*구분자 넣기*/
			System.out.printf("%2s %4s %11s %5s %5s %7s   %4s\n","번호","이름","국어","영어","수학","합계","평균");
			System.out.printf("============================================================\n");/*구분자 넣기*/
			k20_pageCount ++;
		
	}
	//내용인쇄
	public static void ItemPrint(int k20_i){
		k20_OneRec k20_rec;
		/*배열로 선언된 값을 호출*/
		k20_rec = k20_ArrayOneRec.get(k20_i);
		/*랜덤으로 생성된 변수data 삽입 출력*/
		System.out.printf("%05d %8s %7d %7d %8d %8d %9d\n",
				k20_rec.k20_student_id(), k20_rec.k20_name(), k20_rec.k20_kor(), k20_rec.k20_eng(),
				k20_rec.k20_mat(),k20_rec.k20_sum(),k20_rec.k20_ave());
		/* 현재 페이지 */
		k20_sumkor += k20_rec.k20_kor();/*현재 언어 합계*/
		k20_sumeng += k20_rec.k20_eng();/*현재 영어 합계*/
		k20_summat += k20_rec.k20_mat();/*현재 수학 합계*/
		k20_sumsum += k20_rec.k20_sum();/*현재 합계 합계*/
		k20_sumave += k20_rec.k20_ave();/*현재 평균 합계*/
		/* 누적 페이지 */
		k20_sumkor2 += k20_rec.k20_kor();/*누적 언어 합계*/
		k20_sumeng2 += k20_rec.k20_eng();/*누적 영어 합계*/
		k20_summat2 += k20_rec.k20_mat();/*누적 수학 합계*/
		k20_sumsum2 += k20_rec.k20_sum();/*누적 합계 합계*/
		k20_sumave2 += k20_rec.k20_ave();/*누적 평균 합계*/
		count_person++; //현재 페이지의 사람 수 증가
		count_person2++;//누적 페이지의 사람 수 증가
		
	}
	//꼬리 인쇄
	static int k20_page_person = 30; //현 페이지의 인원수변수
	
	public static void TailPrint(){
		System.out.printf("============================================================\n");/*구분자 넣기*/
		System.out.printf("현재페이지\n"); /*현재 페이지*/
		/*현재 data 출력*/
		System.out.printf("%2s %19d %7d %8d %9d   %6d\n","합계",k20_sumkor,k20_sumeng,k20_summat,k20_sumsum,k20_sumave);
		System.out.printf("%2s %19d %7d %8d %9d   %6d\n","평균",k20_sumkor/count_person,
				k20_sumeng/count_person,k20_summat/count_person,
				k20_sumsum/count_person,k20_sumave/count_person);
		System.out.printf("============================================================\n");/*구분자 넣기*/
		System.out.printf("누적페이지\n"); /*누적 페이지*/
		/*누적 data 출력*/
		System.out.printf("%2s %19d %7d %8d %9d   %6d\n","합계",k20_sumkor2,k20_sumeng2,k20_summat2,k20_sumsum2,k20_sumave2);
		System.out.printf("%2s %19d %7d %8d %9d   %6d\n","평균",k20_sumkor2/count_person2,
				k20_sumeng2/count_person2,k20_summat2/count_person2,
				k20_sumsum2/count_person2,k20_sumave2/count_person2);
		System.out.printf("============================================================\n");/*구분자 넣기*/
		//새로운 데이터 생성을 위해 초기화 시켜줌
		k20_sumkor = 0;/*국어 초기화*/
		k20_sumeng = 0;/*영어 초기화*/
		k20_summat = 0;/*수학 초기화*/
		k20_sumsum = 0;/*합계 초기화*/
		k20_sumave = 0;/*평균 초기화*/		
	}
	//데이터 sort
	public static void dataSort(){
		Comparator<k20_OneRec> k20_compare = new Comparator<k20_OneRec>(){
			public int compare(k20_OneRec a1, k20_OneRec a2){ 
				return(a2.k20_sum()-a1.k20_sum());  //정렬 기준을 합계로 함
			}
		};
		Collections.sort(k20_ArrayOneRec, k20_compare); //합계로 정렬
		//Collections.reverse(k20_ArrayOneRec, k20_compare); //합계반대로 정렬
	}
	
	
	
	
	
	
	
	
	
}
