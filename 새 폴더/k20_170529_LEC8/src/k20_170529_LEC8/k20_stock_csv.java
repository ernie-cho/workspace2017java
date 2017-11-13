package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class k20_stock_csv {
	/*Lec08. 17-05-29, 조영도, 전 종목 주가데이터 입출력 및  실습1 */
	public static void main(String[] args) {
		
		try{
			/*파일 경로 지정*/
			File k20_f = new File("C:\\Users\\kopo\\Desktop\\웹서버클라이언트"
					+ "\\자바복습\\실습데이터\\day_data\\THTSKS010H00.dat");
			/*파일 연결하는데 FileReader를 이용하게 됨*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*삼성전자(단축코드A005930)을 추출하여 csv파일 만들기*/
			File k20_f1 = new File("C:\\test\\StockDailyPrice_total2.csv");
			/*파일 연결하는데 FileReader를 이용하게 됨*/
			BufferedWriter k20_bw = new BufferedWriter(new FileWriter(k20_f1));
			/*임시로 파일에서 한 문장씩 불러와서 저장할 문자열 변수*/
			String k20_readtxt;
			/*시작 시간을 저장할 변수*/
			long startTime = System. currentTimeMillis ();
			/*라인 카운트를 할 변수들*/
			int k20_cnt=0, k20_wcnt=0;
			/*파일의 끝에 도달하기 전까지 조건의 문자열 검색, 대체,자르기 */
			while((k20_readtxt=k20_br.readLine())!=null){
				/*StringBuffer를 이용한 문자열 생성*/
				StringBuffer k20_s = new StringBuffer();
				/*(%_%)를 잘라낸 라인을 필드배열에 저장*/
				String[] k20_field = k20_readtxt.split("%_%");
				/*데이터의 3번째 항목이  A와 일치하면 아래 내용을 수행*/
				if(k20_field.length > 2&&k20_field[2].replace("^","").trim().substring(0, 1).equals("A")){
					k20_s.append(k20_field[0].replace("^","").trim());
					/*필드의 크기만큼 반복하면서 콤마 추가*/
					for(int k20_i= 1 ; k20_i < k20_field.length ; k20_i++){
						k20_s.append(","+k20_field[k20_i].replace("^","").trim());
					}
					/*k20_s의 결과값을 저장*/
					k20_bw.write(k20_s.toString());
					/*개행하기*/
					k20_bw.newLine();
					/*생성된 데이터 개수*/
					k20_wcnt++;
					System.out.printf("write [%d][%d][%s]\n", k20_cnt,k20_wcnt,k20_s.toString());
				}
				/*검색했던 전체 데이터 개수*/
				k20_cnt++;
			}
			/*종료 시간 측정할 변수*/
			long endTime = System. currentTimeMillis (); 
			/*BufferedReader 종료*/
			k20_br.close();
			/*BufferedWriter 종료*/
			k20_bw.close();
			System.out.printf("Program End[%d][%d]records\n", k20_cnt,k20_wcnt);
			/*종료 출력*/
			System.out.println("Finish");
			/*종료 시점 출력*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			
		}catch (Exception e){
			
		}
		
	}

}
