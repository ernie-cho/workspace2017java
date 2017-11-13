package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class k20_telecom {
	/*Lec08. 17-05-29, 조영도, 파일 분리, 데이터 보정*/
	public static void main(String[] args) throws IOException{ 
		/*파일 경로 지정*/
		File k20_f = new File("C:\\Users\\kopo\\Desktop\\웹서버클라이언트"
				+ "\\자바복습\\실습데이터\\전국무료와이파이표준데이터.txt"); 
		/*파일 Reader 선언*/
		FileReader k20_fr = new FileReader(k20_f); 
		/*파일 연결하는데 FileReader를 이용하게 됨*/
		BufferedReader k20_br = new BufferedReader(k20_fr); 
		/*전국무료와이파이 통신사별 & 중복제거 파일*/
		File k20_f1 = new File("C:\\test\\SKT.txt"); 
		File k20_f2 = new File("C:\\test\\KT.txt");
		File k20_f3 = new File("C:\\test\\LGU.txt");
		File k20_f4 = new File("C:\\test\\중복.txt");
		/*파일 연결하는데 FileReader를 이용하게 됨*/
		BufferedWriter k20_bw1 = new BufferedWriter( new FileWriter(k20_f1)); 
		BufferedWriter k20_bw2 = new BufferedWriter( new FileWriter(k20_f2)); 
		BufferedWriter k20_bw3 = new BufferedWriter( new FileWriter(k20_f3)); 
		BufferedWriter k20_bw4 = new BufferedWriter( new FileWriter(k20_f4)); 
		/*Array List 선언*/
		ArrayList<String> k20_telecom = new ArrayList<>();
		/*임시로 파일에서 한 문장씩 불러와서 저장할 문자열 변수*/
		String k20_readtxt; 
		/*파일이 빈파일일때 조건*/
		if((k20_readtxt = k20_br.readLine()) == null){
			System.out.println("빈 파일");
			return;
		}
		/*각 행에 컬럼명 저장*/
		k20_bw1.write(k20_readtxt);k20_bw1.newLine(); 
		k20_bw2.write(k20_readtxt);k20_bw2.newLine();
		k20_bw3.write(k20_readtxt);k20_bw3.newLine();
		k20_bw4.write(k20_readtxt);k20_bw4.newLine();
		/*라인 카운트 변수*/
		int k20_LineCnt = 0; 
		int k20_sktCnt =0, k20_ktCnt =0, k20_lguCnt=0, k20_otherCnt=0;;
		/*파일의 끝에 도달하기 전까지 한 문장씩 line에 저장하여 출력함*/
		while((k20_readtxt = k20_br.readLine()) != null){ 
			/*데이터를 (\t)탭으로 분리하여 필드 배열에 저장함*/
			String[] k20_field = k20_readtxt.split("\t"); 
			/*중복 통신사 우선 순위 SKT -> KT -> LGT*/
			/*SKT관련 문자열을 만났을 때 contains와 trim으로 데이터 가공*/
			if(k20_field[5].trim().contains("SK")||k20_field[5].trim().contains("sk")){
				/*[5]을 배열을 SKT로 */
				k20_field[5] = "SKT";
				/*필드의 길이만큼 반복하면서*/
				for(int k20_i=0 ; k20_i<k20_field.length ; k20_i++){ 
					/*(\t)탭으로 분리하여, 파일에 Write*/
					k20_bw1.write(k20_field[k20_i]+"\t"); 
				}
				/*개행*/
				k20_bw1.newLine();
				k20_sktCnt++;
				/*KT관련 문자열을 만났을 때 contains와 trim으로 데이터 가공*/
			}else if(k20_field[5].trim().contains("KT")||k20_field[5].trim().contains("케이티")){ 
				/*[5]을 배열을 KT로 */
				k20_field[5] = "KT"; 
				/*필드의 길이만큼 반복하면서*/
				for(int k20_i=0 ; k20_i<k20_field.length ; k20_i++){ 
					/*(\t)탭으로 분리하여, 파일에 Write*/
					k20_bw2.write(k20_field[k20_i]+"\t"); 
				}
				/*개행*/
				k20_bw2.newLine();
				k20_ktCnt++;
				/*LGU+관련 문자열을 만났을 때 contains와 trim으로 데이터 가공*/
			}else if(k20_field[5].trim().contains("LG")||k20_field[5].trim().contains("U+")
					||k20_field[5].trim().contains("Lg")
					||k20_field[5].trim().contains("엘지유플러스")){ 
				/*[5]을 배열을 LGU+로 */
				k20_field[5] = "LGU+"; 
				/*필드의 길이만큼 반복하면서*/
				for(int k20_i=0 ; k20_i<k20_field.length ; k20_i++){
					/*(\t)탭으로 분리하여, 파일에 Write*/
					k20_bw3.write(k20_field[k20_i]+"\t"); 
				}
				/*개행*/
				k20_bw3.newLine(); 
				k20_lguCnt++;
			}else{
				/*[5]을 배열을 중복제거 된것을 */
				k20_telecom.add(k20_field[5]); 
				/*아래에 선언된 메소드에서 정제된 데이터를 호출*/
				k20_telecom = k20_distinct(k20_telecom);
				/*통신사명이 제거 된 데이터의 처음 부터 마지막까지*/ 				 
				for(int k20_i=0 ; k20_i<k20_field.length ; k20_i++){ 
					/*파일에 ("\t")탭으로 구분하며 Write*/
					k20_bw4.write(k20_field[k20_i]+"\t"); 
				}
				/*개행*/
				k20_bw4.newLine();
				k20_otherCnt++;
			}
			/*카운트 증가*/
			k20_LineCnt++; 
		}
		/*ArrayList의 사이즈 만큼 반복*/
		for(int k20_i=0 ; k20_i<k20_telecom.size() ; k20_i++){ 
			/*콘솔에 통신사 외의 데이터를 출력*/
			System.out.println(k20_telecom.get(k20_i));
		}
		/*데이터 입력 카운트, 출력 데이터와 비교용*/
		System.out.println("SKT 데이터 입력 :" + k20_sktCnt);
		System.out.println("KT 데이터 입력 :" + k20_ktCnt);
		System.out.println("LGU+ 데이터 입력 :" + k20_lguCnt);
		System.out.println("Others 데이터 입력 :" + k20_otherCnt);
		/*BufferedReader 닫기*/
		k20_br.close(); 
		/*BufferedWriter 닫기*/
		k20_bw1.close();	
		k20_bw2.close();
		k20_bw3.close(); 
		k20_bw4.close();
		
		
	}
	/*Method 생성*/
	public static ArrayList<String> k20_distinct(ArrayList<String> k20_telecom){
		/*TreeSet을 이용한 중복 제거*/
		TreeSet<String> k20_tree = new TreeSet<String>(k20_telecom); 
		/*TreeSet으로 정제 된 데이터를 ArrayList에 저장*/
		ArrayList<String> k20_treeDistinct = new ArrayList<String>(k20_tree);
		/*정제되는 Method를 반환*/
		return k20_treeDistinct;
		
	}

}	
