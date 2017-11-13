package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class k20_FreeWifi {
	// Lec08. 17-05-29, 조영도, 전국무료와이파이표준데이터
	public static void main(String[] args) {
		
		try{
			/*파일 경로 지정*/
			File k20_f = new File("C:\\Users\\kopo\\Desktop\\웹서버클라이언트"
					+ "\\자바복습\\실습데이터\\전국무료와이파이표준데이터.txt");
			/*파일 연결하는데 FileReader를 이용하게 됨*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*임시로 파일에서 한 문장씩 불러와서 저장할 문자열 변수*/
			String k20_readtxt;
			/*파일이 빈파일일 경우 출력*/
			if((k20_readtxt = k20_br.readLine())==null){
				System.out.printf("빈 파일입니다\n");
				return;
			}
			/*데이터를 ("\t")로 분리하여 필드네임 배열에 저장함*/
			String[] k20_field_name = k20_readtxt.split("\t");
			/*Line 개수 출력용 변수*/
			int k20_LineCnt = 1;
			/*파일의 끝에 도달하기 전까지 한 문장씩 line에 저장하여 출력함*/
			while((k20_readtxt = k20_br.readLine()) != null){
				/*데이터를 ("\t")로 분리하여 필드 배열에 저장함*/
				String[] k20_field = k20_readtxt.split("\t");
				/*라인 수 출력*/
				System.out.printf("**[%d번째 항목]****************\n",k20_LineCnt);
				/*필드명 배열의 길이 만큼 반복하여, 필드명과 필드의 데이터를 출력함 */
				for(int k20_i = 0; k20_i < k20_field_name.length ; k20_i++){
					System.out.printf(" %s : %s\n", k20_field_name[k20_i], k20_field[k20_i]);
				}
				k20_LineCnt++;
				/*라인 수의 제한 까지 수행*/
				if(k20_LineCnt == 15000)
					break;
			}
			/*BufferedReader 닫기*/
			k20_br.close();
			
		}catch (Exception e){
			
		}
		
		
		
		
	}

}
