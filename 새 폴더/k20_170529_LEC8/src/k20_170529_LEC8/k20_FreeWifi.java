package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class k20_FreeWifi {
	// Lec08. 17-05-29, ������, ���������������ǥ�ص�����
	public static void main(String[] args) {
		
		try{
			/*���� ��� ����*/
			File k20_f = new File("C:\\Users\\kopo\\Desktop\\������Ŭ���̾�Ʈ"
					+ "\\�ڹٺ���\\�ǽ�������\\���������������ǥ�ص�����.txt");
			/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*�ӽ÷� ���Ͽ��� �� ���徿 �ҷ��ͼ� ������ ���ڿ� ����*/
			String k20_readtxt;
			/*������ �������� ��� ���*/
			if((k20_readtxt = k20_br.readLine())==null){
				System.out.printf("�� �����Դϴ�\n");
				return;
			}
			/*�����͸� ("\t")�� �и��Ͽ� �ʵ���� �迭�� ������*/
			String[] k20_field_name = k20_readtxt.split("\t");
			/*Line ���� ��¿� ����*/
			int k20_LineCnt = 1;
			/*������ ���� �����ϱ� ������ �� ���徿 line�� �����Ͽ� �����*/
			while((k20_readtxt = k20_br.readLine()) != null){
				/*�����͸� ("\t")�� �и��Ͽ� �ʵ� �迭�� ������*/
				String[] k20_field = k20_readtxt.split("\t");
				/*���� �� ���*/
				System.out.printf("**[%d��° �׸�]****************\n",k20_LineCnt);
				/*�ʵ�� �迭�� ���� ��ŭ �ݺ��Ͽ�, �ʵ��� �ʵ��� �����͸� ����� */
				for(int k20_i = 0; k20_i < k20_field_name.length ; k20_i++){
					System.out.printf(" %s : %s\n", k20_field_name[k20_i], k20_field[k20_i]);
				}
				k20_LineCnt++;
				/*���� ���� ���� ���� ����*/
				if(k20_LineCnt == 15000)
					break;
			}
			/*BufferedReader �ݱ�*/
			k20_br.close();
			
		}catch (Exception e){
			
		}
		
		
		
		
	}

}
