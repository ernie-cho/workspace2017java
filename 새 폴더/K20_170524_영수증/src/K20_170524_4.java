//  Lec05_03, ������, �̸�Ʈ ������ ���

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.FormatFlagsConversionMismatchException;
import java.util.GregorianCalendar;

public class K20_170524_4 {

	public static void main(String[] args) {
		
			// Lecture5 page9 -----------------------important
			DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###");//�ݾ� ���� ���� ����
			GregorianCalendar k20_calender = new GregorianCalendar();//��¥ ���ϱ� �Լ�
			SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");// ����Ͻú� ����
			String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());//�ð� ���� ���� ����
			//��ǰ ���� �迭
			String k20_itemname2[] = {"���ڿ���180ml*4","BE���座Ʈ15F-16BK","(G)�⺻����4-7","������� 2.3L","�׸� �����ͽ�95g*8",
								"�ϸ� ġŲ�ʰ�480+1","�η��������Ϻ긮","�ٳ�������� 240ml","��������Ŷ312.5G","Ǯ���� ġ��&ġ��",
								"��)HG ��������� 2","������ ���� �ް���","Ŀ�Ǹ����� 240ml*4","Ʈ���� �����ѻ���","��귣�� ����ä��",
								"��ŰǪ��Ŀ���͵�2","�����������̾�����","�޸��ٿ����ٸ���","�����ֵ��ī����","�����ڵ��������20",
								"�õ���纣��1.13kg","���̱�ġ","�������500ml 3���� ","û�ۻ�� 5��/��","���ǹ���Ƽ R��BLACk",
								"DWƮ��ġ��ƮNAVYS","ġŰŸ ���������̾�","��� ","����","Ǯ��������",
								"�ٳ����䱸��Ʈ","������ĵĿ��","���̽�������6����*3sn","����������Ǹſ��","����Ʈ ����"};
			boolean k20_noTax[] = {true,true,false,true,false    //������ǰ ���� �迭
										,true,false,true,false,true
										,true,false,true,false,false
										,false,true,true,false,true
										,true,false,true,true,true
										,false,false,false,true,false
										,true,true,false,true,false};
			
			int k20_price2[] = {3780,1500,200,9500,5980,		   //��ǰ���� ���� �迭
								10000,13500,5900,2980,4700,
								9900,14400,4250,2700,9800,
								2980,2500,10130,4060,3900,
								1240,1000,8500,9800,9900,
								10000,5400,5400,1200,5000,
								400,1500,1000,1500,2750};
			int k20_num2[] = {1,2,1,1,1,								//���� ���� �迭
								1,1,2,1,2,
								2,1,1,1,3,
								1,2,1,1,1,
								1,2,1,1,1,
								1,1,1,3,1,
								3,1,1,1,2};
			int k20_totalPrice2 =0;									//�� �ݾ� ����
			String k20_date7= k20_dateTime.substring(0,4) +"-"+ k20_dateTime.substring(4,6) +"-"+ k20_dateTime.substring(6,8)
	        + " " + k20_dateTime.substring(8,10) +":"+ k20_dateTime.substring(10, 12); //��¥ ��� ����
			
			//�̸�Ʈ ������ ��� ����
			System.out.printf("%53.30s\n","�̸�Ʈ ������ (031)888-1234"); //��ü�� �� ��ȭ��ȣ
			System.out.printf("%10.20s%32.30s\n","   e  m  a  r  t","208-86-50918 �̰���"); //�ΰ� �� ����ڹ�ȣ, ��ǥ�ڸ�
			System.out.printf("%48.30s\n","���ν� ������ ������� 552"); //�ּ�
			System.out.printf("\n");//���� ���
			System.out.printf("%1.30s\n","������ �������� ��ȯ/ȯ�� �Ұ�(30��)");//�ȳ���1
			System.out.printf("%1.30s\n","��ȯ/ȯ�� ���������� ����(����ī������)");//�ȳ���2
			System.out.printf("%1.30s\n","üũī��/�ſ�ī�� û����� �ݿ���");//�ȳ���3
			System.out.printf("%1.30s\n","�ִ� 3~5�� �ҿ� (�ָ�,����������)");//�ȳ���4
			System.out.printf("\n");//���� ���
			System.out.printf("%1.30s%17.20s%39.20s\n","[�� ��]",k20_date7,"POS:0009-2418");//���� �ð� �� ���� ��ȣ
			System.out.printf("---------------------------------------------------------------\n");//���м� �ֱ�
			System.out.printf("%8.15s%23.10s%11.10s%12.10s\n", "�� ǰ ��","��  ��","����","��  ��");//������ ��� �׸�
			System.out.printf("---------------------------------------------------------------\n");//���м� �ֱ�
			int k20_taxSum = 0;//�����ݾ� ���� ����
			for(int k20_i = 0; k20_i < k20_itemname2.length; k20_i++){ //�ݺ��Ͽ� �迭�� ����� ������ ���
				String k20_saveName = ""; //���ڼ��� 20byte ������ �ڸ� ���� ����Ͽ� ������ ����	
				if(k20_itemname2[k20_i].getBytes().length <= 18){//�ڸ� �ʿ䰡 ���� ��ǰ�� �״�� ���
						k20_saveName = k20_itemname2[k20_i];     //���� ��ǰ�� ����
				}else{  //���ڰ� 18byte �̻��̸� �ڸ��鼭 ���鹮 �߰��ϱ�
					for(int k20_j = 1; k20_j < 18; k20_j++){ //��ǰ�� ����Ʈ ���� 18�̸��� ������ �ݺ�
						if(k20_saveName.getBytes().length >= 18){
							break;//18byte�� ���ų� ũ�� break�� ��������
						}
						k20_saveName = k20_itemname2[k20_i].substring(0,k20_j);
					  }//18byte�� ����� ���� �������� �ڸ�
						
					}
				if(k20_saveName.getBytes().length < 20){//��ǰ���� ���̰� 20byte���ϸ� �������� 1byte�� ä���� ���� ����
					while(true){
						//��ǰ��� ������ ���� 20byte �̻��� �� �ݺ��� ����
						if(k20_saveName.getBytes().length >= 20){	
							break;
						}
						k20_saveName +=  " ";//���� �ֱ�
					  }
				}
				if(k20_noTax[k20_i]){ //�鼼 ��ǰ �����ؼ� ���
					//�鼼�� ���
					System.out.printf("%02d%1s%10s %12.12s %11.9s %13.13s\n", //�鼼�׸� * �� 1byte���� �߰�
							k20_i+1,"* ", k20_saveName, k20_df.format(k20_price2[k20_i]), k20_df.format(k20_num2[k20_i]),
							k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
					k20_taxSum += k20_price2[k20_i]*k20_num2[k20_i]; //�鼼�� ��쿡�� ����ϸ� �鼼��ǰ ������ ������
				}else{//���� �� ���
					System.out.printf("%02d%1s%10s %12.12s %11.9s %13.13s\n", //asterisk�κп� ���� 2byte�߰�
							k20_i+1,"  ", k20_saveName, k20_df.format(k20_price2[k20_i]), k20_df.format(k20_num2[k20_i]),
							k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
					}
			   k20_totalPrice2 +=  (k20_price2[k20_i]*k20_num2[k20_i]);//��ǰ����* ������ ���հ迡 ����
			}
			int k20_taxAmount4 = (int)((k20_totalPrice2-k20_taxSum) / 1.1);; //�Ѿ׿��� �鼼��ǰ���� �� ����/1.1(����)
			int k20_taxation3 = k20_totalPrice2-k20_taxSum-k20_taxAmount4; //���հ�-�鼼����-�������� = �ΰ��� ���
			System.out.printf("%23.20s%36.20s\n","(*)�� ��  �� ǰ",k20_df.format(k20_taxSum)); //�鼼��ǰ���� ����
			System.out.printf("%23.20s%36.20s\n","�� ��  �� ǰ",k20_df.format(k20_taxAmount4));//���� ��ǰ�� �ΰ����� �� ����
			System.out.printf("%24.20s%36.20s\n","��   ��   ��",k20_df.format(k20_taxation3));//������ǰ ������ �ΰ��� ���
			System.out.printf("%25.20s%36.20s\n","��        ��",k20_df.format(k20_totalPrice2));//�ѻ�ǰ�� ����* ����
			System.out.printf("%1.20s%46.20s\n","�� �� �� �� �� ��",k20_df.format(k20_totalPrice2));//���հ�
			System.out.printf("---------------------------------------------------------------\n");//���м� �ֱ�
			System.out.printf("%1.20s%52.20s\n","0024 ��  ��","5417**8890/07850246");//ī������
			System.out.printf("%1.20s%52.20s\n","ī�����","�Ͻú� / "+k20_df.format(k20_totalPrice2));//�Ͻú� ����
			System.out.printf("---------------------------------------------------------------\n");//���м� �ֱ�
			System.out.printf("%1.20s\n","ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");//�� ����Ʈ ��Ȳ

	}

}
