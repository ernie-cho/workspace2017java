import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class classs {

	public static void main(String[] args) throws IOException {//����
		// TODO Auto-generated method stub
	//  Lec07, ������, ���� ���۸� �̿��� ��	
		FileWriter k20_fw =new FileWriter("C:\\test\\error2.txt",true); //�����ϰ��� �ϴ� �����̸�
		BufferedWriter k20_bw=new BufferedWriter(k20_fw);
		StringBuffer k20_sf=new StringBuffer();
		
		BufferedReader k20_br=new BufferedReader(new InputStreamReader(System.in));//system.inȭ�鿡�� ġ�� �ִ°��� ���������
		String k20_str = "";
		while(!(k20_str=k20_br.readLine()).startsWith("s"))//read line ���� ĥ������ ��ٸ�
			k20_sf.append(k20_str+"\n");//
		
		k20_br.close();
		k20_fw.write(k20_sf.toString());
		k20_fw.flush();
		k20_fw.close();
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
		System.out.println(k20_br);
	}

}
