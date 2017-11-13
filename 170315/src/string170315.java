import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class string170315 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
/*	//string연습
		String a = " high ";
		
		if (a.equals("high"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if (a == "high")
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		for(int i =0; i <=5; i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.println("=======charAt=======");
		for(int i =0; i <=3; i++)
		{
			System.out.println(a.trim());
		}
		System.out.println("=======trim=======");
		System.out.println(a.getBytes());
		//byte[] getBytes(a) ;
*/		
/*
			InputStream in = new FileInputStream("C:\\Users\\kopo\\Desktop\\Linux\\youngdo\\hdmovielogo-2802.png");	
			
			OutputStream out = new FileOutputStream("C:\\Users\\kopo\\Desktop\\Linux\\youngdo\\hdmovielogo-copy.png");
				
				byte[] buffer = new byte[1024*8];
			
				long start = System.currentTimeMillis();
				
				while(true)
				{
					int count = in.read(buffer);
					
					if (count == -1 )
					{
						break;
					}
					out.write(buffer, 0, count);
				}
		
				long end = System.currentTimeMillis();
				
				System.out.println(end - start);
				
				in.close();
				out.close();
*/
	//split
/*		InputStream in = new FileInputStream("C:\\code\\input.csv");
		DataInputStream din = new DataInputStream(in);
		try{
		while(din.available() > 0)
			{
			String value =  din.readLine();
			String[] split = value.split(",");	
			System.out.println("원래 값" + value);
			System.out.println("split[0] 값" + split[0]);
			System.out.println("split[1] 값" + split[1]);
			//System.out.println("split[2] 값" + split[2]);
			//System.out.println("split[3] 값" + split[3]);
			}
	    
	    din.close();
	    
		}  catch (Exception e)
			{
			System.out.println("error");
			}
		*/
		
		
		/*String str = "\nkoposwYoungdoCho\n\nLearning JAVA\tTAB is also working\n\n\n";
		String toString = str.toString();
		System.out.println("toString: " + toString);*/
		
		/*String str1 = "Cho";
		String str2 = "Youngdo";
		String concat = str1.concat(str2);
		System.out.println("concat: " + concat);*/
		
		/*String str = "abcdefghijklmnopqrstuvwxyz";
		int length = str.length();
		System.out.println("length: " + length);*/
		
		/*int i = 1234567890;
		String str = String.format("%,d", i);
		System.out.println("format: " + str);
		*/
		
		String str = "A*B*C*D";
		String replace = str.replace("*", "&");
		System.out.println("replace: " + replace);
		
		
	} 

}
