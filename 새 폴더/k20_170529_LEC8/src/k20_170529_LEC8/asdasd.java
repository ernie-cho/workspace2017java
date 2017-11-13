package k20_170529_LEC8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class asdasd {
	public static void main(String[] args) throws IOException{ //입력오류처리(try - catch)
		File f = new File("C:\\Users\\kopo\\Desktop\\웹서버클라이언트"
				+ "\\자바복습\\실습데이터\\전국무료와이파이표준데이터.txt"); //원본데이터파일(.txt , tab구분)
		FileReader fr = new FileReader(f); //해당 File을 읽을 Reader 선언
		BufferedReader br = new BufferedReader(fr); //File >> FileReadr >> BufferedReader
		
		File f1 = new File("C:\\test\\전국무료와이파이표준데이터_SKT.txt"); //원본데이터를 분류한 결과별 txt파일 지정
		File f2 = new File("C:\\test\\전국무료와이파이표준데이터_KT.txt");
		File f3 = new File("C:\\test\\전국무료와이파이표준데이터_LGU.txt");
		File f4 = new File("C:\\test\\전국무료와이파이표준데이터(수정)_기타.txt");
		
		BufferedWriter bw1 = new BufferedWriter( new FileWriter(f1)); //다음 BufferedWriter를 FileWriter 이어 선언
		BufferedWriter bw2 = new BufferedWriter( new FileWriter(f2)); //File >> FileWriter >> BufferedWriter
		BufferedWriter bw3 = new BufferedWriter( new FileWriter(f3)); 
		BufferedWriter bw4 = new BufferedWriter( new FileWriter(f4)); 
		
		ArrayList<String> Pservice = new ArrayList<>(); //서비스제공사명을 저장할 문자열 ArrayList선언
			
		String readtxt; //레코드를 저장할 문자열 변수 선언
		if((readtxt = br.readLine()) == null){ //리더에 값이 없다? = 빈파일
			System.out.println("빈 파일입니다.");
			return;
		}
		bw1.write(readtxt);bw1.newLine(); //각 문서에 첫행에 컬럼명 저장 
		bw2.write(readtxt);bw2.newLine();
		bw3.write(readtxt);bw3.newLine();
		bw4.write(readtxt);bw4.newLine();
		
		int LineCnt = 0; //행 카운트, 정수형 변수 선언, 초기화
		
		while((readtxt = br.readLine()) != null){ //EOF를 만날 때까지
			String[] field = readtxt.split("\t"); //읽은 레코드 문자열을 구분자(tab)로 구분하여 문자열 배열에 저장
			if(field[5].trim().contains("SK")||field[5].trim().contains("sk")){ //서비스공급업체가 SKT로 여겨지는 경우
				field[5] = "SKT"; //서비스제공사명을 SKT로 수정, 저장
				for(int i=0 ; i<field.length ; i++){ //갱신한 레코드 필드 처음부터 끝까지
					bw1.write(field[i]+"\t"); //파일에 쓰고 tab으로 구분
				}
				bw1.newLine(); //다음 레코드
			}else if(field[5].trim().contains("KT")||field[5].trim().contains("케이티")){ //서비스공급업체가 KT로 여겨지는 경우
				field[5] = "KT";  //서비스제공사명을 KT로 수정, 저장
				for(int i=0 ; i<field.length ; i++){ //갱신한 레코드 필드 처음부터 끝까지
					bw2.write(field[i]+"\t"); //파일에 쓰고 tab으로 구분
				}
				bw2.newLine(); //다음 레코드
			}else if(field[5].trim().contains("LG")||field[5].trim().contains("Lg")||field[5].trim().contains("U+")
					||field[5].trim().contains("엘지유플러스")){ //서비스공급업체가 LGU+로 여겨지는 경우
				field[5] = "LGU+"; //서비스제공사명을 LGU+로 수정, 저장
				for(int i=0 ; i<field.length ; i++){ //갱신한 레코드 필드 처음부터 끝까지
					bw3.write(field[i]+"\t"); //파일에 쓰고 tab으로 구분
				}
				bw3.newLine(); //다음 레코드
			}else{
				Pservice.add(field[5]); //다음 ArrayList에 서비스제공사명 저장(추가)
				Pservice = distinct(Pservice); //다음 method반환 값으로 Pservice 갱신
				for(int i=0 ; i<field.length ; i++){ //갱신한 레코드 필드 처음부터 끝까지
					bw4.write(field[i]+"\t"); //파일에 쓰고 tab으로 구분
				}
				bw4.newLine(); //다음 레코드
			}//SKT >> KT >> LGU+ 우선순위
			LineCnt++; //행카운트 증가
		}
		for(int i=0 ; i<Pservice.size() ; i++){ //ArrayList 전체
			System.out.println(Pservice.get(i)); //다음 ArrayList, 서비스제공사명이 위 3사가 아닌 경우 출력
		}
		br.close(); //사용한 객체 반환
		bw1.close(); bw2.close(); bw3.close(); bw4.close();
	}
	public static ArrayList<String> distinct(ArrayList<String> Pservice) { //ArrayList 중복값 제거 method
		
		ArrayList<String> DPservice = new ArrayList<>(); //중복을 제거할 문자열 ArrayList 선언
		for(int i=0 ; i< Pservice.size() ; i++){ //매개변수인 ArrayList 중에
			if(!DPservice.contains(Pservice.get(i))){ //중복값이 없을 때
				DPservice.add(Pservice.get(i)); //새로운 ArrayList(DPservice)에 저장
			}
		}
		return DPservice; //ArrayList(DPservice)에 반환
	}
}	
