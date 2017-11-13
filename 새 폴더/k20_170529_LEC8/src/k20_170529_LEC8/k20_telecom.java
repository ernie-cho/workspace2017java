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
	/*Lec08. 17-05-29, ������, ���� �и�, ������ ����*/
	public static void main(String[] args) throws IOException{ 
		/*���� ��� ����*/
		File k20_f = new File("C:\\Users\\kopo\\Desktop\\������Ŭ���̾�Ʈ"
				+ "\\�ڹٺ���\\�ǽ�������\\���������������ǥ�ص�����.txt"); 
		/*���� Reader ����*/
		FileReader k20_fr = new FileReader(k20_f); 
		/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
		BufferedReader k20_br = new BufferedReader(k20_fr); 
		/*��������������� ��Ż纰 & �ߺ����� ����*/
		File k20_f1 = new File("C:\\test\\SKT.txt"); 
		File k20_f2 = new File("C:\\test\\KT.txt");
		File k20_f3 = new File("C:\\test\\LGU.txt");
		File k20_f4 = new File("C:\\test\\�ߺ�.txt");
		/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
		BufferedWriter k20_bw1 = new BufferedWriter( new FileWriter(k20_f1)); 
		BufferedWriter k20_bw2 = new BufferedWriter( new FileWriter(k20_f2)); 
		BufferedWriter k20_bw3 = new BufferedWriter( new FileWriter(k20_f3)); 
		BufferedWriter k20_bw4 = new BufferedWriter( new FileWriter(k20_f4)); 
		/*Array List ����*/
		ArrayList<String> k20_telecom = new ArrayList<>();
		/*�ӽ÷� ���Ͽ��� �� ���徿 �ҷ��ͼ� ������ ���ڿ� ����*/
		String k20_readtxt; 
		/*������ �������϶� ����*/
		if((k20_readtxt = k20_br.readLine()) == null){
			System.out.println("�� ����");
			return;
		}
		/*�� �࿡ �÷��� ����*/
		k20_bw1.write(k20_readtxt);k20_bw1.newLine(); 
		k20_bw2.write(k20_readtxt);k20_bw2.newLine();
		k20_bw3.write(k20_readtxt);k20_bw3.newLine();
		k20_bw4.write(k20_readtxt);k20_bw4.newLine();
		/*���� ī��Ʈ ����*/
		int k20_LineCnt = 0; 
		int k20_sktCnt =0, k20_ktCnt =0, k20_lguCnt=0, k20_otherCnt=0;;
		/*������ ���� �����ϱ� ������ �� ���徿 line�� �����Ͽ� �����*/
		while((k20_readtxt = k20_br.readLine()) != null){ 
			/*�����͸� (\t)������ �и��Ͽ� �ʵ� �迭�� ������*/
			String[] k20_field = k20_readtxt.split("\t"); 
			/*�ߺ� ��Ż� �켱 ���� SKT -> KT -> LGT*/
			/*SKT���� ���ڿ��� ������ �� contains�� trim���� ������ ����*/
			if(k20_field[5].trim().contains("SK")||k20_field[5].trim().contains("sk")){
				/*[5]�� �迭�� SKT�� */
				k20_field[5] = "SKT";
				/*�ʵ��� ���̸�ŭ �ݺ��ϸ鼭*/
				for(int k20_i=0 ; k20_i<k20_field.length ; k20_i++){ 
					/*(\t)������ �и��Ͽ�, ���Ͽ� Write*/
					k20_bw1.write(k20_field[k20_i]+"\t"); 
				}
				/*����*/
				k20_bw1.newLine();
				k20_sktCnt++;
				/*KT���� ���ڿ��� ������ �� contains�� trim���� ������ ����*/
			}else if(k20_field[5].trim().contains("KT")||k20_field[5].trim().contains("����Ƽ")){ 
				/*[5]�� �迭�� KT�� */
				k20_field[5] = "KT"; 
				/*�ʵ��� ���̸�ŭ �ݺ��ϸ鼭*/
				for(int k20_i=0 ; k20_i<k20_field.length ; k20_i++){ 
					/*(\t)������ �и��Ͽ�, ���Ͽ� Write*/
					k20_bw2.write(k20_field[k20_i]+"\t"); 
				}
				/*����*/
				k20_bw2.newLine();
				k20_ktCnt++;
				/*LGU+���� ���ڿ��� ������ �� contains�� trim���� ������ ����*/
			}else if(k20_field[5].trim().contains("LG")||k20_field[5].trim().contains("U+")
					||k20_field[5].trim().contains("Lg")
					||k20_field[5].trim().contains("�������÷���")){ 
				/*[5]�� �迭�� LGU+�� */
				k20_field[5] = "LGU+"; 
				/*�ʵ��� ���̸�ŭ �ݺ��ϸ鼭*/
				for(int k20_i=0 ; k20_i<k20_field.length ; k20_i++){
					/*(\t)������ �и��Ͽ�, ���Ͽ� Write*/
					k20_bw3.write(k20_field[k20_i]+"\t"); 
				}
				/*����*/
				k20_bw3.newLine(); 
				k20_lguCnt++;
			}else{
				/*[5]�� �迭�� �ߺ����� �Ȱ��� */
				k20_telecom.add(k20_field[5]); 
				/*�Ʒ��� ����� �޼ҵ忡�� ������ �����͸� ȣ��*/
				k20_telecom = k20_distinct(k20_telecom);
				/*��Ż���� ���� �� �������� ó�� ���� ����������*/ 				 
				for(int k20_i=0 ; k20_i<k20_field.length ; k20_i++){ 
					/*���Ͽ� ("\t")������ �����ϸ� Write*/
					k20_bw4.write(k20_field[k20_i]+"\t"); 
				}
				/*����*/
				k20_bw4.newLine();
				k20_otherCnt++;
			}
			/*ī��Ʈ ����*/
			k20_LineCnt++; 
		}
		/*ArrayList�� ������ ��ŭ �ݺ�*/
		for(int k20_i=0 ; k20_i<k20_telecom.size() ; k20_i++){ 
			/*�ֿܼ� ��Ż� ���� �����͸� ���*/
			System.out.println(k20_telecom.get(k20_i));
		}
		/*������ �Է� ī��Ʈ, ��� �����Ϳ� �񱳿�*/
		System.out.println("SKT ������ �Է� :" + k20_sktCnt);
		System.out.println("KT ������ �Է� :" + k20_ktCnt);
		System.out.println("LGU+ ������ �Է� :" + k20_lguCnt);
		System.out.println("Others ������ �Է� :" + k20_otherCnt);
		/*BufferedReader �ݱ�*/
		k20_br.close(); 
		/*BufferedWriter �ݱ�*/
		k20_bw1.close();	
		k20_bw2.close();
		k20_bw3.close(); 
		k20_bw4.close();
		
		
	}
	/*Method ����*/
	public static ArrayList<String> k20_distinct(ArrayList<String> k20_telecom){
		/*TreeSet�� �̿��� �ߺ� ����*/
		TreeSet<String> k20_tree = new TreeSet<String>(k20_telecom); 
		/*TreeSet���� ���� �� �����͸� ArrayList�� ����*/
		ArrayList<String> k20_treeDistinct = new ArrayList<String>(k20_tree);
		/*�����Ǵ� Method�� ��ȯ*/
		return k20_treeDistinct;
		
	}

}	
