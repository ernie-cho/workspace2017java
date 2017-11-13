package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class k20_stock_csv {
	/*Lec08. 17-05-29, ������, �� ���� �ְ������� ����� ��  �ǽ�1 */
	public static void main(String[] args) {
		
		try{
			/*���� ��� ����*/
			File k20_f = new File("C:\\Users\\kopo\\Desktop\\������Ŭ���̾�Ʈ"
					+ "\\�ڹٺ���\\�ǽ�������\\day_data\\THTSKS010H00.dat");
			/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*�Ｚ����(�����ڵ�A005930)�� �����Ͽ� csv���� �����*/
			File k20_f1 = new File("C:\\test\\StockDailyPrice_total2.csv");
			/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
			BufferedWriter k20_bw = new BufferedWriter(new FileWriter(k20_f1));
			/*�ӽ÷� ���Ͽ��� �� ���徿 �ҷ��ͼ� ������ ���ڿ� ����*/
			String k20_readtxt;
			/*���� �ð��� ������ ����*/
			long startTime = System. currentTimeMillis ();
			/*���� ī��Ʈ�� �� ������*/
			int k20_cnt=0, k20_wcnt=0;
			/*������ ���� �����ϱ� ������ ������ ���ڿ� �˻�, ��ü,�ڸ��� */
			while((k20_readtxt=k20_br.readLine())!=null){
				/*StringBuffer�� �̿��� ���ڿ� ����*/
				StringBuffer k20_s = new StringBuffer();
				/*(%_%)�� �߶� ������ �ʵ�迭�� ����*/
				String[] k20_field = k20_readtxt.split("%_%");
				/*�������� 3��° �׸���  A�� ��ġ�ϸ� �Ʒ� ������ ����*/
				if(k20_field.length > 2&&k20_field[2].replace("^","").trim().substring(0, 1).equals("A")){
					k20_s.append(k20_field[0].replace("^","").trim());
					/*�ʵ��� ũ�⸸ŭ �ݺ��ϸ鼭 �޸� �߰�*/
					for(int k20_i= 1 ; k20_i < k20_field.length ; k20_i++){
						k20_s.append(","+k20_field[k20_i].replace("^","").trim());
					}
					/*k20_s�� ������� ����*/
					k20_bw.write(k20_s.toString());
					/*�����ϱ�*/
					k20_bw.newLine();
					/*������ ������ ����*/
					k20_wcnt++;
					System.out.printf("write [%d][%d][%s]\n", k20_cnt,k20_wcnt,k20_s.toString());
				}
				/*�˻��ߴ� ��ü ������ ����*/
				k20_cnt++;
			}
			/*���� �ð� ������ ����*/
			long endTime = System. currentTimeMillis (); 
			/*BufferedReader ����*/
			k20_br.close();
			/*BufferedWriter ����*/
			k20_bw.close();
			System.out.printf("Program End[%d][%d]records\n", k20_cnt,k20_wcnt);
			/*���� ���*/
			System.out.println("Finish");
			/*���� ���� ���*/ 
			System.out.println("TimeCheck: " + (endTime - startTime) +"ms"); 
			
		}catch (Exception e){
			
		}
		
	}

}
