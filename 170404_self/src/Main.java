

/*public class Main {						//강아지출력해보기
public static void main(String[] args) {   
   System.out.println("|\\_/|");
   System.out.println("|q p|   /}");
   System.out.println("( 0 )\"\"\"\\");  
   System.out.println("|\"^\"`    |");
   System.out.println("||_/=\\\\__|");
    }
}*/
/*public class Main {						//두줄출력해보기
public static void main(String[] args) {
	System.out.println("강한친구 대한육군");
	System.out.println("강한친구 대한육군");
	}
}*/
/*import java.util.Scanner;
public class Main {							//입력받은 내용  공백 없이 출력해보기
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
public class Main {							//곱셈
public static void main(String[] args) {
    Scanner m = new Scanner(System.in);
    int A = 0; int B = 0;
    A = m.nextInt();
    B = m.nextInt();
   System.out.println(A*B);

    }
}*/
/*import java.util.Scanner;
public class Main {							//나눗셈인데 9자리까지 출력해보기
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
public static void main(String[] args) {	//사칙연산출력해보기
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
public static void main(String[] args) {	//나머지연산 계산비교
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