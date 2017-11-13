package k20_170529_LEC8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class test {
	public static void main(String[] args){

		ArrayList<String> test = new ArrayList<String>();
		
		test.add("SKT");
		test.add("kt");
		test.add("KT");
		test.add("SKT");
		test.add("lg");
		test.add("SKT");
		test.add("LG");
		test.add("lg");
	
		
		HashSet<String> test1 = new HashSet<String>(test); //중복을 제거할 문자열 ArrayList 선언
		ArrayList<String> xx = new ArrayList<String>(test1);
		System.out.println(xx.size());
		System.out.println();
		for(int i=0;i<xx.size();i++)
			System.out.println(xx.get(i));
	}
}
