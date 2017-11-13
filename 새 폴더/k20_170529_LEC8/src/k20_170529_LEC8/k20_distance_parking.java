package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class k20_distance_parking {
	/*Lec08. 17-05-29, 조영도, 전국주차장표준데이터 - 거리 구하기*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			/*파일 경로 지정*/
			File k20_f = new File("C:\\test\\전국주차장표준데이터.txt");
			/*파일 연결하는데 FileReader를 이용하게 됨*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*임시로 파일에서 한 문장씩 불러와서 저장할 문자열 변수*/
			String k20_readtxt;
			/*파일이 빈파일일 경우 출력*/
			if((k20_readtxt = k20_br.readLine())==null){
				System.out.printf("빈 파일입니다\n");
				return;
			}
			/*데이터를 (\t)탭으로 분리하여 필드네임 배열에 저장함*/
			String[] k20_field_name = k20_readtxt.split("\t");
			/*거리를 구하기 위한 Default 위치 값 변수*/
			double k20_lat = 37.3860521;
			double k20_lng = 127.1214038;
			/*거리 계산을 위한 변수*/
			double k20_dist = 0;
			/*라인 출력용 변수*/
			int k20_LineCnt = 1;
			/*거리차이 최대용 변수*/
			double k20_max = 0;
			/*거리차이 최소용 변수 초기 비교를 위해 값을 지정함*/
			double k20_min = 999;
			/*주소 저장용 변수*/
			String k20_address = null;
			/*최대 거리 주소 저장용 변수*/
			String k20_max_address = null;
			/*최소 거리 주소 저장용 변수*/
			String k20_min_address = null;
			/*파일의 끝에 도달하기 전까지 한 문장씩 line에 저장하여 출력함*/
			while((k20_readtxt = k20_br.readLine())!= null){
				/*데이터를 (\t)탭으로 분리하여 필드 배열에 저장함*/
				String[] k20_field = k20_readtxt.split("\t");
				/*처음 필드 데이터가 30번째 항목까지 밖에 없어서 31보다 큰 조건을 줌*/
				if(k20_field.length > 31){
					/*필드 내용중 위도, 경도가 빈 경우*/
					if(k20_field[31].equals("") && k20_field[32].equals("") ){
					/*아무런 조건을 넣지 않음*/	
					}else{
						/*라인 수 출력*/
						System.out.printf("**[%d번째 항목]****************\n",k20_LineCnt);
						/*소재지도로명주소 값 출력*/
						System.out.printf(" %s : %s\n", k20_field_name[5], k20_field[4]);
						/*위도 데이터 값 출력*/
						System.out.printf(" %s : %s\n", k20_field_name[31], k20_field[31]);
						/*경도 데이터 값 출력*/
						System.out.printf(" %s : %s\n", k20_field_name[32], k20_field[32]);
						/*피타고라스 정리로 거리 구하기*/
						k20_dist = Math.sqrt( Math.pow(Double.parseDouble(k20_field[31]) - k20_lat, 2)
								+ Math.pow(Double.parseDouble(k20_field[32]) - k20_lng, 2));
						/*현재 필드주소를 주소변수에 저장함*/
						k20_address = k20_field[4];
					}
					 
					 /*현재지점과 거리 출력*/
					System.out.printf("현재지점과 거리 : %f\n",k20_dist);
					/*구분선 넣기*/
					System.out.printf("********************************\n");	
					/*라인 증가*/
					k20_LineCnt++;
					
					/*거리의 최대 값 구하기*/
					if(k20_dist > k20_max){
						k20_max = k20_dist;
						/*최대 거리 주소 저장*/
						k20_max_address = k20_address;
					}
					/*거리의 최소 값 구하기*/
					if (k20_dist < k20_min){
						k20_min = k20_dist;
						/*최소 거리 주소 저장*/
						k20_min_address = k20_address;
					}
				}
			}
			/*거리의 최대, 최소 값 출력*/
			System.out.printf("\n");	
			System.out.printf("가장 먼 곳은 %s 이며,\n  거리는 %f 입니다.\n",k20_max_address, k20_max);
			System.out.printf("가장 가까운 곳은 %s 이며,\n 거리는 %f입니다.\n",k20_min_address, k20_min);
			/*BufferedReader 닫기*/
			k20_br.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
