
public class works170316 
{
	//3�� 16�� ���ΰ��� String�� ���� Method �����ϱ�
	public static void main(String[] args) 
	{
			
		
//1.startsWith : ���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ� ������ true��ȯ �ƴϸ� false�� ��ȯ�Ѵ�.(��ҹ��ڱ���)
		String str = "apple";
		String str1 = "banana";
		boolean startsWith = str.startsWith("a"); //apple�� a�� �����ϹǷ� true---1
		System.out.println("startsWith: " +"str is: "+ startsWith);
		boolean startsWith1 = str1.startsWith("a");//banana�� b�� �����ϹǷ� false---2
		System.out.println("startsWith: " +"str1 is: "+ startsWith1);

//2.endWith : ���ڿ� �������� ������ ���ڰ� �ִ����� �Ǵ��� ������ true, ������ false�� ��ȯ�Ѵ�.(��ҹ��ڱ���)
		String str2 = "test";
		String str3 = "exam";
		boolean endsWith = str2.endsWith("t");
		System.out.println("endsWith: " + endsWith);
		boolean endsWith1 = str3.endsWith("t");
		System.out.println("endsWith: " + endsWith1);
		
//3.replace : ���ڿ��� ������ ����" "�� ������ ���� ������ ����" "�� �ٲ㼭 ����Ѵ�.
		String str4 = "A*B*C*D";
		String str5 = "w&&x&&y&&z";
		String replace = str4.replace("*", "-");
		System.out.println("replace: " + replace);
		String replace1 = str5.replace("&&", "||");
		System.out.println("replace: " + replace1);

//4.touppercase : ���ڿ��� �ҹ��ڸ� �빮�ڷ� ��ȯ�Ѵ�.
		String str6 = "abcDEF";
		String str7 = "zxvYWZ";
		String toUppercase = str6.toUpperCase();
		System.out.println("toUppercase: " + toUppercase);
		String toUppercase1 = str7.toUpperCase();
		System.out.println("toUppercase: " + toUppercase1);
//5.tolowercase : ���ڿ��� �빮�ڸ� �ҹ��ڷ� ��ȯ�Ѵ�.
		String str8 = "abcDEF";
		String str9 = "ZzXxVvYWZ";
		String toLowerCase = str8.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
		String toLowerCase2 = str9.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase2);
//6.equalsIgnoreCase :��ҹ��� ���� ����(ignore case) equals �˻�
		String str10 = "HaHaHa";
		String str11 = "HohoHo";
		if (str10.equalsIgnoreCase("hahaha")) {
		      System.out.println("equalsIgnoreCase: " +"���� ���ڿ��̱���!");
		    } else {
		      System.out.println("equalsIgnoreCase: " +"�ٸ� ���ڿ��̱���...");
		    }
		if (str11.equalsIgnoreCase("hahaha")) {
		      System.out.println("equalsIgnoreCase: " +"���� ���ڿ��̱���!");
		    } else {
		      System.out.println("equalsIgnoreCase: " +"�ٸ� ���ڿ��̱���...");
		    }
//7.indexOf :������ ���ڰ� ���ڿ��� ���°�� �ִ����� ��ȯ�Ѵ�.
		String str12 = "abcdef";
		String str13 = "zxcvbnmas";
		int indexOf = str12.indexOf("d");
		System.out.println("indexOf: " + indexOf);
		int indexOf1 = str13.indexOf("s");
		System.out.println("indexOf: " + indexOf1);
//8.Length :���ڿ��� ���̸� ��ȯ�Ѵ�.
		String str14 = "abcdef";
		String str15 = "qweirutaskdfj";
		int length = str14.length();
		System.out.println("length: " + length);
		int length1 = str15.length();
		System.out.println("length: " + length1);
//9.Substring :���ڿ��� ������ ������ ���ϴ� ���ڿ��� ��ȯ�Ѵ�.(���۹����� ���� �����ϰ�, ������ ������ ���� ���������ʴ´�.)
		String str16 = "ABCDEF";
		String str17 = "AFBCDEFQWEASD";
		String substring = str16.substring(0, 2);
		System.out.println("substring: " + substring);
		String substring1 = str17.substring(0, 5);
		System.out.println("substring: " + substring1);
//10.valueOf:������ ��ü�� ���� ���� ��ȯ
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: " + String.valueOf (i));
		System.out.println("valueOf: " + String.valueOf (l));
		System.out.println("valueOf: " + String.valueOf (c));
//11.split: ������ ���ڷ� ���ڿ��� ������ �ִ�.(�迭�� ��ȯ) 
		String str18 = "A:B:C:D:abcd";
		String str19 = "A,B,C,D,abcd";
		String[] split = str18.split(":");
		System.out.println("split: " + split[1]);
		String[] split1 = str19.split(",");
		System.out.println("split: " + split1[3]);
//12.equals :�ΰ��� String�� ������ ���ؼ� ������ true, �ٸ��� false�� ��ȯ�Ѵ�.(��Һ�)
		String str20 = "java";
		String str21 = "java";
		String str22 = "Java";
		boolean equals = str20.equals(str21);
		System.out.println("equals: " + equals);
		boolean equals1 = str20.equals(str22);
		System.out.println("equals: " + equals1);
//13.charAt: ������ index��°�� ���ڸ� ��ȯ�Ѵ�.
		String str23 = "charAt";
		String str24 = "demonstration";
		char charAt = str23.charAt(2);
		System.out.println("charAt: " + charAt);
		char charAt1 = str24.charAt(4);
		System.out.println("charAt: " + charAt1);
//14.trim: ���ڿ��� ������ �����ش�.
		String str25 = "     space    ";
		String str26 = "     land    ";
		String v, v2;
		v = str25.trim();
		System.out.println("trim:" + v);
		v2 = str26.trim();
		System.out.println("trim:" + v2);
//15.contains: �ΰ��� String�� ���ؼ� �񱳴�� String�� �����ϰ� ������true, �ٸ��� false�� ��ȯ�Ѵ�.
		String str27 = "abcd";
		String str28 = "c";
		String str29 = "s";
		boolean contains = str27.contains(str28);
		System.out.println("contains: " + contains);
		boolean contains1 = str27.contains(str29);
		System.out.println("contains: " + contains1);
//16.concat :���ڿ� ���ڸ� �������ش�.
		String str30 = "kopo";
		String str31 = "sw";
		String str32 = "19";
		String concat = str30.concat(str31);
		System.out.println("concat: " + concat);
		String concat1 = str30.concat(str32);
		System.out.println("concat: " + concat1);
//17.matches:������ ���� ǥ���� ��ġ �Ҷ� true�� ��ȯ�Ѵ�.
		int k = 123456;
		String str36 = String.format("%,d", k);
		String str37 = "123456";
		boolean matches = str1.matches(str2);
		System.out.println("matches: " + matches);
//18.format: ���Ĺ��ڿ��� �̿��ؼ� ����ȭ�� ���ڿ��� ��ȯ�Ѵ�.
		int j = 1234567890;
		String str33 = String.format("%,d", j);
		System.out.println("format: " + str33);
//19.tostring:���ڿ��� �״�� ��ȯ���ش�.
		String str34 = "%ER%#E";
		String str35 = "!!!@@@###qweasd";
		String toString = str34.toString();
		System.out.println("toString: " + toString);
		String toString1 = str35.toString();
		System.out.println("toString: " + toString1);

	
		
		
	} //public static void main
} //public class works170316 
