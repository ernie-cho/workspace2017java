

/*public class Main {						//����������غ���
public static void main(String[] args) {   
   System.out.println("|\\_/|");
   System.out.println("|q p|   /}");
   System.out.println("( 0 )\"\"\"\\");  
   System.out.println("|\"^\"`    |");
   System.out.println("||_/=\\\\__|");
    }
}*/
/*public class Main {						//��������غ���
public static void main(String[] args) {
	System.out.println("����ģ�� ��������");
	System.out.println("����ģ�� ��������");
	}
}*/
/*import java.util.Scanner;
public class Main {							//�Է¹��� ����  ���� ���� ����غ���
	public static void main(String[] args) {
		String [] a = new String[100];
		int cnt =0;
		Scanner input = new Scanner(System.in);
		while(input.hasNextLine()){
			a[cnt] = input.nextLine();//.trim();	
				System.out.println(a[cnt]);
				cnt++;		
		}
		input.close();
	}
}*/
/*import java.util.Scanner;
public class Main {							//����
public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    int A = 0; int B = 0;
    A = m.nextInt();
    B = m.nextInt();
   System.out.println(A*B);

    }
}*/
/*import java.util.Scanner;
public class Main {							//�������ε� 9�ڸ����� ����غ���
public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    double A = 0; double B = 0;
    
    A = m.nextDouble();
    B = m.nextDouble();
    //System.out.println(A/B);
   System.out.printf("%.10f", (A/B));

    }
}*/

/*import java.util.Scanner;
public class Main {
public static void main(String[] args) {	//��Ģ��������غ���
    Scanner input = new Scanner(System.in);
    int A = 0; int B = 0;   
    A = input.nextInt();
    B = input.nextInt();
    System.out.println(A+B);
    System.out.println(A-B);
    System.out.println(A*B);
    System.out.println(A/B);
    System.out.println(A%B);
    }
}*/

import java.util.Scanner;
public class Main {
public static void main(String[] args) {	//���������� ����
    Scanner input = new Scanner(System.in);
    int A = 0, B = 0, C = 0;   
    A = input.nextInt();
    B = input.nextInt();
    C = input.nextInt();
    System.out.println((A+B)%C);
    System.out.println((A%C + B%C)%C);
    System.out.println((A*B)%C);
    System.out.println((A%C * B%C)%C);
    }
}