package k20_170529_LEC8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class k20_distance_parking {
	/*Lec08. 17-05-29, ������, ����������ǥ�ص����� - �Ÿ� ���ϱ�*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			/*���� ��� ����*/
			File k20_f = new File("C:\\test\\����������ǥ�ص�����.txt");
			/*���� �����ϴµ� FileReader�� �̿��ϰ� ��*/
			BufferedReader k20_br = new BufferedReader(new FileReader(k20_f));
			/*�ӽ÷� ���Ͽ��� �� ���徿 �ҷ��ͼ� ������ ���ڿ� ����*/
			String k20_readtxt;
			/*������ �������� ��� ���*/
			if((k20_readtxt = k20_br.readLine())==null){
				System.out.printf("�� �����Դϴ�\n");
				return;
			}
			/*�����͸� (\t)������ �и��Ͽ� �ʵ���� �迭�� ������*/
			String[] k20_field_name = k20_readtxt.split("\t");
			/*�Ÿ��� ���ϱ� ���� Default ��ġ �� ����*/
			double k20_lat = 37.3860521;
			double k20_lng = 127.1214038;
			/*�Ÿ� ����� ���� ����*/
			double k20_dist = 0;
			/*���� ��¿� ����*/
			int k20_LineCnt = 1;
			/*�Ÿ����� �ִ�� ����*/
			double k20_max = 0;
			/*�Ÿ����� �ּҿ� ���� �ʱ� �񱳸� ���� ���� ������*/
			double k20_min = 999;
			/*�ּ� ����� ����*/
			String k20_address = null;
			/*�ִ� �Ÿ� �ּ� ����� ����*/
			String k20_max_address = null;
			/*�ּ� �Ÿ� �ּ� ����� ����*/
			String k20_min_address = null;
			/*������ ���� �����ϱ� ������ �� ���徿 line�� �����Ͽ� �����*/
			while((k20_readtxt = k20_br.readLine())!= null){
				/*�����͸� (\t)������ �и��Ͽ� �ʵ� �迭�� ������*/
				String[] k20_field = k20_readtxt.split("\t");
				/*ó�� �ʵ� �����Ͱ� 30��° �׸���� �ۿ� ��� 31���� ū ������ ��*/
				if(k20_field.length > 31){
					/*�ʵ� ������ ����, �浵�� �� ���*/
					if(k20_field[31].equals("") && k20_field[32].equals("") ){
					/*�ƹ��� ������ ���� ����*/	
					}else{
						/*���� �� ���*/
						System.out.printf("**[%d��° �׸�]****************\n",k20_LineCnt);
						/*���������θ��ּ� �� ���*/
						System.out.printf(" %s : %s\n", k20_field_name[5], k20_field[4]);
						/*���� ������ �� ���*/
						System.out.printf(" %s : %s\n", k20_field_name[31], k20_field[31]);
						/*�浵 ������ �� ���*/
						System.out.printf(" %s : %s\n", k20_field_name[32], k20_field[32]);
						/*��Ÿ��� ������ �Ÿ� ���ϱ�*/
						k20_dist = Math.sqrt( Math.pow(Double.parseDouble(k20_field[31]) - k20_lat, 2)
								+ Math.pow(Double.parseDouble(k20_field[32]) - k20_lng, 2));
						/*���� �ʵ��ּҸ� �ּҺ����� ������*/
						k20_address = k20_field[4];
					}
					 
					 /*���������� �Ÿ� ���*/
					System.out.printf("���������� �Ÿ� : %f\n",k20_dist);
					/*���м� �ֱ�*/
					System.out.printf("********************************\n");	
					/*���� ����*/
					k20_LineCnt++;
					
					/*�Ÿ��� �ִ� �� ���ϱ�*/
					if(k20_dist > k20_max){
						k20_max = k20_dist;
						/*�ִ� �Ÿ� �ּ� ����*/
						k20_max_address = k20_address;
					}
					/*�Ÿ��� �ּ� �� ���ϱ�*/
					if (k20_dist < k20_min){
						k20_min = k20_dist;
						/*�ּ� �Ÿ� �ּ� ����*/
						k20_min_address = k20_address;
					}
				}
			}
			/*�Ÿ��� �ִ�, �ּ� �� ���*/
			System.out.printf("\n");	
			System.out.printf("���� �� ���� %s �̸�,\n  �Ÿ��� %f �Դϴ�.\n",k20_max_address, k20_max);
			System.out.printf("���� ����� ���� %s �̸�,\n �Ÿ��� %f�Դϴ�.\n",k20_min_address, k20_min);
			/*BufferedReader �ݱ�*/
			k20_br.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
