
public class works170316 
{
	//3월 16일 개인과제 String에 관한 Method 정리하기
	public static void main(String[] args) 
	{
			
		
//1.startsWith : 문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
		String str = "apple";
		String str1 = "banana";
		boolean startsWith = str.startsWith("a"); //apple은 a로 시작하므로 true---1
		System.out.println("startsWith: " +"str is: "+ startsWith);
		boolean startsWith1 = str1.startsWith("a");//banana는 b로 시작하므로 false---2
		System.out.println("startsWith: " +"str1 is: "+ startsWith1);

//2.endWith : 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
		String str2 = "test";
		String str3 = "exam";
		boolean endsWith = str2.endsWith("t");
		System.out.println("endsWith: " + endsWith);
		boolean endsWith1 = str3.endsWith("t");
		System.out.println("endsWith: " + endsWith1);
		
//3.replace : 문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
		String str4 = "A*B*C*D";
		String str5 = "w&&x&&y&&z";
		String replace = str4.replace("*", "-");
		System.out.println("replace: " + replace);
		String replace1 = str5.replace("&&", "||");
		System.out.println("replace: " + replace1);

//4.touppercase : 문자열에 소문자를 대문자로 변환한다.
		String str6 = "abcDEF";
		String str7 = "zxvYWZ";
		String toUppercase = str6.toUpperCase();
		System.out.println("toUppercase: " + toUppercase);
		String toUppercase1 = str7.toUpperCase();
		System.out.println("toUppercase: " + toUppercase1);
//5.tolowercase : 문자열에 대문자를 소문자로 변환한다.
		String str8 = "abcDEF";
		String str9 = "ZzXxVvYWZ";
		String toLowerCase = str8.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
		String toLowerCase2 = str9.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase2);
//6.equalsIgnoreCase :대소문자 관계 없이(ignore case) equals 검사
		String str10 = "HaHaHa";
		String str11 = "HohoHo";
		if (str10.equalsIgnoreCase("hahaha")) {
		      System.out.println("equalsIgnoreCase: " +"같은 문자열이군요!");
		    } else {
		      System.out.println("equalsIgnoreCase: " +"다른 문자열이군요...");
		    }
		if (str11.equalsIgnoreCase("hahaha")) {
		      System.out.println("equalsIgnoreCase: " +"같은 문자열이군요!");
		    } else {
		      System.out.println("equalsIgnoreCase: " +"다른 문자열이군요...");
		    }
//7.indexOf :지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
		String str12 = "abcdef";
		String str13 = "zxcvbnmas";
		int indexOf = str12.indexOf("d");
		System.out.println("indexOf: " + indexOf);
		int indexOf1 = str13.indexOf("s");
		System.out.println("indexOf: " + indexOf1);
//8.Length :문자열의 길이를 반환한다.
		String str14 = "abcdef";
		String str15 = "qweirutaskdfj";
		int length = str14.length();
		System.out.println("length: " + length);
		int length1 = str15.length();
		System.out.println("length: " + length1);
//9.Substring :문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
		String str16 = "ABCDEF";
		String str17 = "AFBCDEFQWEASD";
		String substring = str16.substring(0, 2);
		System.out.println("substring: " + substring);
		String substring1 = str17.substring(0, 5);
		System.out.println("substring: " + substring1);
//10.valueOf:지정한 개체의 원시 값을 반환
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: " + String.valueOf (i));
		System.out.println("valueOf: " + String.valueOf (l));
		System.out.println("valueOf: " + String.valueOf (c));
//11.split: 지정한 문자로 문자열을 나눌수 있다.(배열로 반환) 
		String str18 = "A:B:C:D:abcd";
		String str19 = "A,B,C,D,abcd";
		String[] split = str18.split(":");
		System.out.println("split: " + split[1]);
		String[] split1 = str19.split(",");
		System.out.println("split: " + split1[3]);
//12.equals :두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
		String str20 = "java";
		String str21 = "java";
		String str22 = "Java";
		boolean equals = str20.equals(str21);
		System.out.println("equals: " + equals);
		boolean equals1 = str20.equals(str22);
		System.out.println("equals: " + equals1);
//13.charAt: 지정한 index번째에 문자를 반환한다.
		String str23 = "charAt";
		String str24 = "demonstration";
		char charAt = str23.charAt(2);
		System.out.println("charAt: " + charAt);
		char charAt1 = str24.charAt(4);
		System.out.println("charAt: " + charAt1);
//14.trim: 문자열에 공백을 없에준다.
		String str25 = "     space    ";
		String str26 = "     land    ";
		String v, v2;
		v = str25.trim();
		System.out.println("trim:" + v);
		v2 = str26.trim();
		System.out.println("trim:" + v2);
//15.contains: 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
		String str27 = "abcd";
		String str28 = "c";
		String str29 = "s";
		boolean contains = str27.contains(str28);
		System.out.println("contains: " + contains);
		boolean contains1 = str27.contains(str29);
		System.out.println("contains: " + contains1);
//16.concat :문자와 문자를 결합해준다.
		String str30 = "kopo";
		String str31 = "sw";
		String str32 = "19";
		String concat = str30.concat(str31);
		System.out.println("concat: " + concat);
		String concat1 = str30.concat(str32);
		System.out.println("concat: " + concat1);
//17.matches:지정한 정규 표현과 일치 할때 true를 반환한다.
		int k = 123456;
		String str36 = String.format("%,d", k);
		String str37 = "123456";
		boolean matches = str1.matches(str2);
		System.out.println("matches: " + matches);
//18.format: 서식문자열을 이용해서 서식화된 문자열을 반환한다.
		int j = 1234567890;
		String str33 = String.format("%,d", j);
		System.out.println("format: " + str33);
//19.tostring:문자열을 그대로 반환해준다.
		String str34 = "%ER%#E";
		String str35 = "!!!@@@###qweasd";
		String toString = str34.toString();
		System.out.println("toString: " + toString);
		String toString1 = str35.toString();
		System.out.println("toString: " + toString1);

	
		
		
	} //public static void main
} //public class works170316 
