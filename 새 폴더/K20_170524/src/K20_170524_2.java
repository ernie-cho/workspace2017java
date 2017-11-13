//  Lec05_03, ������, �̸�Ʈ ������ ���

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.FormatFlagsConversionMismatchException;
import java.util.GregorianCalendar;

public class K20_170524_2 {

	public static void main(String[] args) {
		
			// Lecture5 page9 -----------------------important
			DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###");//�ݾ� ���� ���� ����
			GregorianCalendar k20_calender = new GregorianCalendar();//��¥ ���ϱ� �Լ�
			SimpleDateFormat k20_dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");// ����Ͻú� ����
			String k20_dateTime = k20_dateFormat.format(k20_calender.getTime());//�ð� ���� ���� ����
			//��ǰ ���� �迭
			String k20_itemname2[] = {"���ڿ���180ml*4","BE���座Ʈ15F-16BK","(G)�⺻����4-7","������� 2.3L","�׸� �����ͽ�95g*8" ,
								"�ϸ� ġŲ�ʰ�480+1","�η��������Ϻ긮","�ٳ�������� 240ml","��������Ŷ312.5G","Ǯ���� ġ��&ġ��" ,
								"��)HG ��������� 2","������ ���� �ް���","Ŀ�Ǹ����� 240ml*4","Ʈ���� �����ѻ���","��귣�� ����ä��" ,
								"��ŰǪ��Ŀ���͵�2","�����������̾�����","�޸��ٿ����ٸ���","�����ֵ��ī����","�����ڵ��������20" ,
								"�õ���纣��1.13kg","���̱�ġ","�������5000ml 3���� ","û�ۻ�� 5��/��","���ǹ���Ƽ R��BLACK" ,
								"DWƮ��ġ��ƮNAVYS","ġŰŸ ���������̾�","���","����","Ǯ��������" ,
								"�ٳ����䱸��Ʈ","������ĵĿ��","���̽�������6����*3","����������Ǹſ��","����Ʈ ����"};
			boolean k20_noTax[] = {true,true,false,true,false    //������ǰ ���� �迭
										,true,false,true,false,true
										,true,false,true,false,false
										,false,true,true,false,true
										,true,false,true,true,true
										,true,false,true,true,false
										,true,true,false,true,false};
			
			int k20_price2[] = {3780,1500,29800,95000,5980,		   //��ǰ���� ���� �迭
								12000,1330,5980,2980,4700,
								990,1440,4250,2750,9800,
								2980,25000,10130,4060,3900,
								12400,5000,8500,9800,9900,
								33900,5180,5400,1200,500,
								4,1500,1000,15,4200};
			int k20_num2[] = {1,1,1,1,1,								//���� ���� �迭
								1,1,1,1,2,
								2,1,1,1,1,
								1,1,1,1,1,
								1,1,1,1,1,
								1,1,1,1,1,
								1,1,1,1,2};
			int k20_totalPrice2 =0;									//�� �ݾ� ����
			String k20_date7= k20_dateTime.substring(0,4) +"-"+ k20_dateTime.substring(4,6) +"-"+ k20_dateTime.substring(6,8)
	        + " " + k20_dateTime.substring(8,10) +":"+ k20_dateTime.substring(10, 12); //��¥ ��� ����
			
			//�̸�Ʈ ������ ��� ����
			System.out.printf("%50.30s\n","�̸�Ʈ ������ (031)888-1234"); //��ü�� �� ��ȭ��ȣ
			System.out.printf("%7.20s%29.30s\n","   e  m  a  r  t","208-86-50918 �̰���"); //�ΰ� �� ����ڹ�ȣ, ��ǥ�ڸ�
			System.out.printf("%45.30s\n","���ν� ������ ������� 552"); //�ּ�
			System.out.printf("\n");//���� ���
			System.out.printf("%1.30s\n","������ �������� ��ȯ/ȯ�� �Ұ�(30��)");//�ȳ���1
			System.out.printf("%1.30s\n","��ȯ/ȯ�� ���������� ����(����ī������)");//�ȳ���2
			System.out.printf("%1.30s\n","üũī��/�ſ�ī�� û����� �ݿ���");//�ȳ���3
			System.out.printf("%1.30s\n","�ִ� 3~5�� �ҿ� (�ָ�,����������)");//�ȳ���4
			System.out.printf("\n");//���� ���
			System.out.printf("%1.30s%17.20s%35.20s\n","[�� ��]",k20_date7,"POS:0009-2418");//���� �ð� �� ���� ��ȣ
			System.out.printf("-----------------------------------------------------------\n");//���м� �ֱ�
			System.out.printf("%8.15s%25.10s%6.10s%11.10s\n", "�� ǰ ��","��  ��","����","��  ��");//������ ��� �׸�
			System.out.printf("-----------------------------------------------------------\n");//���м� �ֱ�
			String k20_taxStar = null;//���� ��ǰ ���� ����
			int k20_taxSum = 0;//�����ݾ� ���� ����
			int k20_space = 0; //���� ���� ����
			String k20_a1 = ""; //���ڼ��� 20byte ������ �ڸ� ���� ����Ͽ� ������ ����
			int k20_2space;    //���ڼ��� 20byte ���� ��, ������ ���� �����
			
			for(int k20_i = 0 ; k20_i < k20_itemname2.length; k20_i++){ //�ݺ��Ͽ� �迭�� ����� ������ ���
				try{
					int k20_a = k20_itemname2[k20_i].getBytes().length; //�����۸��� byte���̸� ���Ͽ� ������ ����
					int k20_b = Integer.toString(k20_price2[k20_i]).getBytes().length; //�ܰ� �ݾ��� byte���̸� ���Ͽ� ������ ����
					
					if(k20_a > 20){ //���� �����۸��� 20byte�� ���� �� ���� ����
						k20_a1 = k20_itemname2[k20_i].substring(1,13); //�����۸��� �߶� ������ ����
					}else{ // �ڸ� �ʿ䰡 ������ �״�� ���
						k20_a1 = k20_itemname2[k20_i];
					}
					if(k20_noTax[k20_i] == true){ //��ǰ�� ���� �׸����� �˾ƺ���
						k20_taxStar = "*";         //�鼼 �׸��̸� Asterisk ǥ��
					}else{
						k20_taxStar = " ";		   //���� �׸��̸� �������� ǥ��
					}
					k20_2space = k20_a1.getBytes().length; //20byte�� ���� ������ ����� ���ο� ���� ������ ����
					switch(k20_b){					//��ǰ�� ���̿� ���� ���ǽ� �ٲ��ֱ�
						case 10:					//�ݾ��� 10�� �����϶�
						case 9:						//�ݾ��� 1����� �϶�
							k20_space = (29-k20_2space-k20_b); //��ǰ��� �ܰ��� ���� 31�� �����Ͽ�, ����� �ܰ��� �� ����
							if(k20_space == 2){		//���� byte�� 2�� �� 
								k20_space =1;		//����Ʈ�� 1�� ����
							}
							//��� ��� - �� �׸��� ��ġ ���� �� ������ �� ������ �����Ͽ� ��ǰ��� �ܰ��� ���̸� ������
							System.out.printf("%02d%-1.3s  %1s%"+k20_space+".15s%-5.15s%9.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break; //���� �׸���� ����Ǿ� ��µǸ� switch���� ����
						case 6:						//�ݾ��� �ʸ����� �϶�
						case 5:						//�ݾ��� ������ �϶�
						case 4:						//�ݾ��� õ���� �϶�
							k20_space = (30-k20_2space-k20_b); //��ǰ��� �ܰ��� ���� 31�� �����Ͽ�, ����� �ܰ��� �� ����
							if(k20_space == 2){		//���� byte�� 2�� �� 
								k20_space =1;		//����Ʈ�� 1�� ����
							}
							//��� ��� - �� �׸��� ��ġ ���� �� ������ �� ������ �����Ͽ� ��ǰ��� �ܰ��� ���̸� ������
							System.out.printf("%02d%-1.3s  %1s%"+k20_space+".15s%5.15s%9.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break; //���� �׸���� ����Ǿ� ��µǸ� switch���� ����
						case 3: 					//�ݾ��� ����� �϶�
							k20_space = (29-k20_2space-k20_b); //��ǰ��� �ܰ��� ���� 31�� �����Ͽ�, ����� �ܰ��� �� ����
							if(k20_space == 2){  //���� byte�� 2�� ��
								k20_space =1;    //����Ʈ�� 1�� ����
								//��� ��� - �� �׸��� ��ġ ���� �� ������ �� ������ �����Ͽ� ��ǰ��� �ܰ��� ���̸� ������
							}System.out.printf("%02d%-1.3s  %1s%"+k20_space+".15s%5.15s%9.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break;//���� �׸���� ����Ǿ� ��µǸ� switch���� ����
						case 2: 					//�ݾ��� �ʴ��� �϶�
							k20_space = (28-k20_2space-k20_b); //��ǰ��� �ܰ��� ���� 31�� �����Ͽ�, ����� �ܰ��� �� ����
							if(k20_space == 2){   //���� byte�� 2�� ��
								k20_space =1;     //����Ʈ�� 1�� ����
								//��� ��� - �� �׸��� ��ġ ���� �� ������ �� ������ �����Ͽ� ��ǰ��� �ܰ��� ���̸� ������
							}System.out.printf("%02d%-1.3s  %1s%"+k20_space+".15s%5.15s%9.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break;//���� �׸���� ����Ǿ� ��µǸ� switch���� ����
						case 1: 					//�ݾ��� ������ �϶�
							k20_space = (27-k20_2space-k20_b); //��ǰ��� �ܰ��� ���� 31�� �����Ͽ�, ����� �ܰ��� �� ����
							if(k20_space == 2){//���� byte�� 2�� ��
								k20_space =1;//����Ʈ�� 1�� ����
								//��� ��� - �� �׸��� ��ġ ���� �� ������ �� ������ �����Ͽ� ��ǰ��� �ܰ��� ���̸� ������
							}System.out.printf("%02d%-1.3s  %1s%"+k20_space+".15s%5.15s%9.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break;//���� �׸���� ����Ǿ� ��µǸ� switch���� ����
						default: //�ݾ��� Ȥ�� �˼� ���� ���� ����ؼ� ����
							k20_space = (30-k20_2space-(k20_b+1));//��ǰ��� �ܰ��� ���� 31�� �����Ͽ�, ����� �ܰ��� �� ����
							if(k20_space == 2){//���� byte�� 2�� ��
								k20_space =1;//����Ʈ�� 1�� ����
							}//��� ��� - �� �׸��� ��ġ ���� �� ������ �� ������ �����Ͽ� ��ǰ��� �ܰ��� ���̸� ������
							System.out.printf("%02d%-1.3s  %1s%"+k20_space+".15s%5.15s%9.10s%14.20s\n",k20_i+1,k20_taxStar,k20_a1,
									"",k20_df.format(k20_price2[k20_i]),
									k20_df.format(k20_num2[k20_i]),k20_df.format(k20_price2[k20_i]*k20_num2[k20_i]));
									if(k20_taxStar == "*"){
										k20_taxSum = k20_taxSum + k20_price2[k20_i]*k20_num2[k20_i];
									}break;
					}
					k20_totalPrice2 +=  (k20_price2[k20_i]*k20_num2[k20_i]);//��ǰ����* ������ ���հ迡 ����
				}catch (FormatFlagsConversionMismatchException e){ //�ݾ� �ʰ��� ���� ���
					System.out.printf("**�ش��ǰ�� �Ǹ��� �� ���� ��ǰ�Դϴ� ���� �� ���˴ϴ�.*\n");
				}
			}
			int k20_taxAmount3 = k20_totalPrice2-k20_taxSum; //���հ迡�� �鼼��ǰ�� ���� ���� = ������������
			int k20_taxation3 = (int)(k20_taxAmount3*0.10000000)+1; //�������������� ���տ��� �ΰ����� �����
			int k20_taxAmount4 = k20_totalPrice2-k20_taxSum-k20_taxation3; //���� ��ǰ�� �ΰ����� �� ����(�������� �����)
			System.out.printf("%23.20s%32.20s\n","(*)�� ��  �� ǰ",k20_df.format(k20_taxSum)); //�鼼��ǰ���� ����
			System.out.printf("%23.20s%32.20s\n","�� ��  �� ǰ",k20_df.format(k20_taxAmount4));//���� ��ǰ�� �ΰ����� �� ����
			System.out.printf("%24.20s%32.20s\n","��   ��   ��",k20_df.format(k20_taxation3));//������ǰ ������ �ΰ��� ���
			System.out.printf("%25.20s%32.20s\n","��        ��",k20_df.format(k20_totalPrice2));//�ѻ�ǰ�� ����* ����
			System.out.printf("%1.20s%42.20s\n","�� �� �� �� �� ��",k20_df.format(k20_totalPrice2));//���հ�
			System.out.printf("-----------------------------------------------------------\n");//���м� �ֱ�
			System.out.printf("%1.20s%48.20s\n","0024 ��  ��","5417**8890/07850246");//ī������
			System.out.printf("%1.20s%35.20s%13.20s\n","ī�����","�Ͻú� / ",k20_df.format(k20_totalPrice2));//�Ͻú� ����
			System.out.printf("-----------------------------------------------------------\n");//���м� �ֱ�
			System.out.printf("%1.20s\n","ȫ*�� ������ ����Ʈ ��Ȳ�Դϴ�.");//�� ����Ʈ ��Ȳ
	}

}
