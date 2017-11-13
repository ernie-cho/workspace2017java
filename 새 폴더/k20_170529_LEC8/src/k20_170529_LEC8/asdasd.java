package k20_170529_LEC8;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class asdasd {
	public static void main(String[] args) throws IOException{ //�Է¿���ó��(try - catch)
		File f = new File("C:\\Users\\kopo\\Desktop\\������Ŭ���̾�Ʈ"
				+ "\\�ڹٺ���\\�ǽ�������\\���������������ǥ�ص�����.txt"); //��������������(.txt , tab����)
		FileReader fr = new FileReader(f); //�ش� File�� ���� Reader ����
		BufferedReader br = new BufferedReader(fr); //File >> FileReadr >> BufferedReader
		
		File f1 = new File("C:\\test\\���������������ǥ�ص�����_SKT.txt"); //���������͸� �з��� ����� txt���� ����
		File f2 = new File("C:\\test\\���������������ǥ�ص�����_KT.txt");
		File f3 = new File("C:\\test\\���������������ǥ�ص�����_LGU.txt");
		File f4 = new File("C:\\test\\���������������ǥ�ص�����(����)_��Ÿ.txt");
		
		BufferedWriter bw1 = new BufferedWriter( new FileWriter(f1)); //���� BufferedWriter�� FileWriter �̾� ����
		BufferedWriter bw2 = new BufferedWriter( new FileWriter(f2)); //File >> FileWriter >> BufferedWriter
		BufferedWriter bw3 = new BufferedWriter( new FileWriter(f3)); 
		BufferedWriter bw4 = new BufferedWriter( new FileWriter(f4)); 
		
		ArrayList<String> Pservice = new ArrayList<>(); //������������� ������ ���ڿ� ArrayList����
			
		String readtxt; //���ڵ带 ������ ���ڿ� ���� ����
		if((readtxt = br.readLine()) == null){ //������ ���� ����? = ������
			System.out.println("�� �����Դϴ�.");
			return;
		}
		bw1.write(readtxt);bw1.newLine(); //�� ������ ù�࿡ �÷��� ���� 
		bw2.write(readtxt);bw2.newLine();
		bw3.write(readtxt);bw3.newLine();
		bw4.write(readtxt);bw4.newLine();
		
		int LineCnt = 0; //�� ī��Ʈ, ������ ���� ����, �ʱ�ȭ
		
		while((readtxt = br.readLine()) != null){ //EOF�� ���� ������
			String[] field = readtxt.split("\t"); //���� ���ڵ� ���ڿ��� ������(tab)�� �����Ͽ� ���ڿ� �迭�� ����
			if(field[5].trim().contains("SK")||field[5].trim().contains("sk")){ //���񽺰��޾�ü�� SKT�� �������� ���
				field[5] = "SKT"; //������������� SKT�� ����, ����
				for(int i=0 ; i<field.length ; i++){ //������ ���ڵ� �ʵ� ó������ ������
					bw1.write(field[i]+"\t"); //���Ͽ� ���� tab���� ����
				}
				bw1.newLine(); //���� ���ڵ�
			}else if(field[5].trim().contains("KT")||field[5].trim().contains("����Ƽ")){ //���񽺰��޾�ü�� KT�� �������� ���
				field[5] = "KT";  //������������� KT�� ����, ����
				for(int i=0 ; i<field.length ; i++){ //������ ���ڵ� �ʵ� ó������ ������
					bw2.write(field[i]+"\t"); //���Ͽ� ���� tab���� ����
				}
				bw2.newLine(); //���� ���ڵ�
			}else if(field[5].trim().contains("LG")||field[5].trim().contains("Lg")||field[5].trim().contains("U+")
					||field[5].trim().contains("�������÷���")){ //���񽺰��޾�ü�� LGU+�� �������� ���
				field[5] = "LGU+"; //������������� LGU+�� ����, ����
				for(int i=0 ; i<field.length ; i++){ //������ ���ڵ� �ʵ� ó������ ������
					bw3.write(field[i]+"\t"); //���Ͽ� ���� tab���� ����
				}
				bw3.newLine(); //���� ���ڵ�
			}else{
				Pservice.add(field[5]); //���� ArrayList�� ����������� ����(�߰�)
				Pservice = distinct(Pservice); //���� method��ȯ ������ Pservice ����
				for(int i=0 ; i<field.length ; i++){ //������ ���ڵ� �ʵ� ó������ ������
					bw4.write(field[i]+"\t"); //���Ͽ� ���� tab���� ����
				}
				bw4.newLine(); //���� ���ڵ�
			}//SKT >> KT >> LGU+ �켱����
			LineCnt++; //��ī��Ʈ ����
		}
		for(int i=0 ; i<Pservice.size() ; i++){ //ArrayList ��ü
			System.out.println(Pservice.get(i)); //���� ArrayList, ������������� �� 3�簡 �ƴ� ��� ���
		}
		br.close(); //����� ��ü ��ȯ
		bw1.close(); bw2.close(); bw3.close(); bw4.close();
	}
	public static ArrayList<String> distinct(ArrayList<String> Pservice) { //ArrayList �ߺ��� ���� method
		
		ArrayList<String> DPservice = new ArrayList<>(); //�ߺ��� ������ ���ڿ� ArrayList ����
		for(int i=0 ; i< Pservice.size() ; i++){ //�Ű������� ArrayList �߿�
			if(!DPservice.contains(Pservice.get(i))){ //�ߺ����� ���� ��
				DPservice.add(Pservice.get(i)); //���ο� ArrayList(DPservice)�� ����
			}
		}
		return DPservice; //ArrayList(DPservice)�� ��ȯ
	}
}	
