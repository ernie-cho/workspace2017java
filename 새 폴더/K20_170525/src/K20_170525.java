//  Lec07, 조영도, 좌/우 공백 채우기 & 한글 카운트
public class K20_170525 {
		//문자열 & 길이 입력됨
	public static String HanBlankForeword (String k20_str, int k20_blank){
		// 반복적으로 문자 길이를 계산하여 남는 공간에 공백을 입력
		for(int k20_i = k20_str.getBytes().length; k20_i < k20_blank; k20_i++) { 
			k20_str = " " + k20_str; //공백 추가
        }
		
		return k20_str; //공백을 결과값으로 반환해줌 (왼쪽)
		
	}
		//문자열 & 길이 입력됨
	public static String HanBlankBackword (String k20_str, int k20_blank){
		// 반복적으로 문자 길이를 계산하여 남는 공간에 공백을 입력
		for(int k20_i = k20_str.getBytes().length; k20_i < k20_blank; k20_i++) { 
			k20_str = k20_str +" "; //공백 추가
        }
		return k20_str;//공백을 결과값으로 반환해줌 (오른쪽)
			
	}
	    //한글 개수 Count하기
	public static int HanCount (String k20_str){
		int k20_length = 0;//한글의 글자 수 카운트용 변수
		String k20_words = "";//글자를 잘라서 저장할 변수
		//반복적으로 글자를 잘라주기
		for(int k20_i = 0; k20_i < k20_str.length(); k20_i++){
			k20_words = k20_str.substring(k20_i,k20_i+1);//글자를 하나씩 자름
			if( k20_words.getBytes().length == 2){//자른 글자가 2byte라면
				k20_length++;//한글로 인식하여 카운트를 증가시킴
			}
		}return k20_length;
		
	}                                      
	     //결과 출력용 main
	public static void main(String[] args) {
		//출력 공간을 15로 주고, 데이터를 왼쪽으로 배치하기 위해 오른쪽에 공백을 추가시킴
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("한글abcd",15));  //오른쪽정렬1
		System.out.printf("HanBlankForeword[%s]\n",HanBlankForeword("한글한글aa",15));//오른쪽정렬2 
		//출력 공간을 15로 주고, 데이터를 오른쪽으로 배치하기 위해 왼쪽에 공백을 추가시킴
		System.out.printf("HanBlankBackword[%s]\n",HanBlankBackword("한글ab",15));    //왼쪽정렬1
		System.out.printf("HanBlankBackword[%s]\n",HanBlankBackword("한글한글aa",15));//왼쪽정렬2
		//입력 되어있는 데이터에 한글을 2byte로 인식하여 그 개수를 출력함
		System.out.printf("한글은 [%d]개\n",HanCount("가나 다라abcd마바  사efg"));	   //한글 개수 카운트	

	}

}
