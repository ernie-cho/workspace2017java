package baekjoon;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=0, a1=0;
	String b ="0", c ="";
	int result =0;
	
	String insert = "";
	int cnt=0;
	System.out.println("���ڸ� �Է��ϼ���");
	Scanner scan = new Scanner(System.in);
	String newResult="";
	insert = scan.nextLine();
	
		
	System.out.println("�Էµ� ���ڴ�"+ insert+ "�Դϴ�");	
	
	String saveInsert = insert;
	if(saveInsert.length()==1){
		saveInsert = "0"+saveInsert;
	}
	
		while(true){	
			newResult = "";
			b="0";
			c="";
			
			//a =  Integer.parseInt(insert);
		
				if(insert.length()==1){
					c= b+insert;
				}else{
					c= insert;
				}
			
			b = c.substring(0, 1);
			c = c.substring(1, 2);
			
			System.out.println("���1: "+b +"��"+ c);
			
		
			a = Integer.parseInt(b);
			a1 = Integer.parseInt(c);
				
			result = a+a1;
			String StrResult = String.valueOf(result);
			if(StrResult.length()==1){
				newResult = String.valueOf(a1) + String.valueOf(StrResult);
			}else{
				newResult = String.valueOf(a1) + String.valueOf(StrResult).substring(1, 2);
			}
			
			
				
			System.out.println("���2 : "+newResult);
			
			insert = newResult;
			System.out.println("���3 : "+insert);
			cnt++;
			
			if(saveInsert.equals(newResult)){
				System.out.println("�ݺ�Ƚ�� : "+cnt);
				break;
			}
			
		}
	
	}

}
