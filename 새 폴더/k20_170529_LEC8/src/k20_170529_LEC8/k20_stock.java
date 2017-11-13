package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class k20_stock {
	/*Lec08. 17-05-29, 조영도, 전 종목 주가데이터 불러오기*/
	public static void main(String[] args) {
		
		try{
			/*파일 경로 지정*/
			File k20_f = new File("C:\\Users\\kopo\\Desktop\\웹서버클라이언트"
					+ "\\자바복습\\실습데이터\\day_data\\THTSKS010H00.dat");
			/*파일 연결하는데 FileReader를 이용하게 됨*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*조건을 주기 위한 라인 개수 변수*/
			int k20_LineCnt = 0;
			/*파일 데이터가 없으면 조건문을 빠져나가기 위한 변수*/
			int k20_n = -1;
			/*StringBuffer를 이용한 문자열 생성*/
			StringBuffer k20_s = new StringBuffer();
			/*파일의 끝에 도달하기 전까지 조건의 문자열 삽입과 삭제*/
			while(true){
				/*문자열을 저장할 배열 생성*/
				char[] k20_ch = new char[1000];
				/*저장할 데이터가 없다면*/
				k20_n = k20_br.read(k20_ch);
				/*조건문을 빠져 나감*/
				if(k20_n == -1)break;
				/*데이터를 배열에 반복하여 저장*/
				/*배열에 선언된 개수 만큼 k20_c에 넣어라*/
				for(char k20_c: k20_ch){ 
					/*조건식에 부합하면*/
					if(k20_c =='\n'){
						/*해당 라인을 출력하고 지정된 개수 만큼 삭제*/
						System.out.printf("[%s]***\n", k20_s.toString());
						k20_s.delete(0,k20_s.length());
						/*조건식에 부합하지 않으면*/
					}else{
						/*문자열 삽입*/
						k20_s.append(k20_c);
					}
					
				}
				/*반복문이 종료하면 라인 수 증가*/
				k20_LineCnt++;	
				if(k20_LineCnt == 10)
					break;
			}/*마지막 라인 출력*/
			System.out.printf("[%s]********\n", k20_s.toString());
			/*BufferedReader 닫기*/
			k20_br.close();
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
