package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class k20_stock {
	/*Lec08. 17-05-29, ������, �� ���� �ְ������� �ҷ�����*/
	public static void main(String[] args) {
		
		try{
			/*���� ��� ����*/
			File k20_f = new File("C:\\Users\\kopo\\Desktop\\������Ŭ���̾�Ʈ"
					+ "\\�ڹٺ���\\�ǽ�������\\day_data\\THTSKS010H00.dat");
			/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*������ �ֱ� ���� ���� ���� ����*/
			int k20_LineCnt = 0;
			/*���� �����Ͱ� ������ ���ǹ��� ���������� ���� ����*/
			int k20_n = -1;
			/*StringBuffer�� �̿��� ���ڿ� ����*/
			StringBuffer k20_s = new StringBuffer();
			/*������ ���� �����ϱ� ������ ������ ���ڿ� ���԰� ����*/
			while(true){
				/*���ڿ��� ������ �迭 ����*/
				char[] k20_ch = new char[1000];
				/*������ �����Ͱ� ���ٸ�*/
				k20_n = k20_br.read(k20_ch);
				/*���ǹ��� ���� ����*/
				if(k20_n == -1)break;
				/*�����͸� �迭�� �ݺ��Ͽ� ����*/
				/*�迭�� ����� ���� ��ŭ k20_c�� �־��*/
				for(char k20_c: k20_ch){ 
					/*���ǽĿ� �����ϸ�*/
					if(k20_c =='\n'){
						/*�ش� ������ ����ϰ� ������ ���� ��ŭ ����*/
						System.out.printf("[%s]***\n", k20_s.toString());
						k20_s.delete(0,k20_s.length());
						/*���ǽĿ� �������� ������*/
					}else{
						/*���ڿ� ����*/
						k20_s.append(k20_c);
					}
					
				}
				/*�ݺ����� �����ϸ� ���� �� ����*/
				k20_LineCnt++;	
				if(k20_LineCnt == 10)
					break;
			}/*������ ���� ���*/
			System.out.printf("[%s]********\n", k20_s.toString());
			/*BufferedReader �ݱ�*/
			k20_br.close();
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
