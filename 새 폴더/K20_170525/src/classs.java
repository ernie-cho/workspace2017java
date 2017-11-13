import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class classs {

	public static void main(String[] args) throws IOException {//파일
		// TODO Auto-generated method stub
	//  Lec07, 조영도, 파일 버퍼를 이용한 것	
		FileWriter k20_fw =new FileWriter("C:\\test\\error2.txt",true); //저장하고자 하는 파일이름
		BufferedWriter k20_bw=new BufferedWriter(k20_fw);
		StringBuffer k20_sf=new StringBuffer();
		
		BufferedReader k20_br=new BufferedReader(new InputStreamReader(System.in));//system.in화면에서 치고 있는것을 연결해줬다
		String k20_str = "";
		while(!(k20_str=k20_br.readLine()).startsWith("s"))//read line 엔터 칠때까지 기다림
			k20_sf.append(k20_str+"\n");//
		
		k20_br.close();
		k20_fw.write(k20_sf.toString());
		k20_fw.flush();
		k20_fw.close();
		System.out.println("저장이 완료되었습니다.");
		
		System.out.println(k20_br);
	}

}
