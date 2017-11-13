/*
public class report1 {

	public static void main(String[] args){
		//  Lec07, 조영도, 클래스의 배열 성적표용 실행파일
		int k20_iPerson=10; //이 값을 주는 만큼 저장소 생성
		//클래스 형태의 배열 생성
		k20_OneRec [] inData = new k20_OneRec[k20_iPerson];
		
		for(int k20_i=0;k20_i <k20_iPerson ; k20_i++ ){
			String tmpName = String.format("홍길%02d", k20_i);
			int tmpKor = (int)(Math.random()*100);
			int tmpEng = (int)(Math.random()*100);
			int tmpMat = (int)(Math.random()*100);
			inData[k20_i] = new k20_OneRec(tmpName,tmpKor,tmpEng,tmpMat);
		}
		System.out.printf("=========================================\n");
	    System.out.printf("%5.5s %3.3s %3.3s %3.3s %3.3s %5.5s\n","이름","언어","영어","수학", "합계","평균");
	    System.out.printf("=========================================\n");
	    
	    //int k20_totalSum = 0;
	    for(int k20_i = 0; k20_i < k20_iPerson ; k20_i++){
	    	System.out.printf("%5.5s %5.3s %5.3s %5.3s %5.3s %7.5s\n",
	    			inData[k20_i].k20_name(),inData[k20_i].k20_kor(),inData[k20_i].k20_eng(),
	    			inData[k20_i].k20_mat(),inData[k20_i].sum(),inData[k20_i].ave());
	    }
	  
	    
	    
	    
	    
	    
	    
	    
	}

}
*/