import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class array_work 
{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		// TODO input 1,2,3's Students score and Total with average
		
		try
		{
			InputStream in = new FileInputStream("C:\\test\\scoreInput.csv");		// read csv file from path
			OutputStream out = new FileOutputStream("C:\\test\\scoreOutput.csv");	// overwrite more students score and save it 
			DataInputStream dataIn = new DataInputStream(in);
			Scanner myInput = new Scanner(System.in);
			
			int[][] score = new int[100][100]; 										// store index score, total, average		
			String dataStr = null;													// temperary save output index
			int askIf = 0;															// question's answer
			int subjectCnt = 0;														// subject count
			int studentCnt = 0; 													// student's count
			
			System.out.print("Import input file? (1. Yes  2. No) : ");
			askIf = myInput.nextInt();
			subjectCnt = 5; 
			if (askIf == 1) 
			{
				while (dataIn.available() > 0) 
				{
					String str;
					String[] str2 = new String[100];
					str = dataIn.readLine();
					str2 = str.split(",");
					for (int i = 0; i < subjectCnt + 2; i++) 
					{ 							
						score[i][studentCnt] = Integer.parseInt(str2[i + 1]); 		
					}
					studentCnt++;										
				}//while (dataIn.available() > 0) 
			}//if (askIf == 1) 	
		
			do 
			{
				System.out.println((studentCnt + 1) + ". student's");
				for (int i = 0; i < subjectCnt; i++) 
				{					
					System.out.print((i + 1) + "subject's score is :");
					score[i][studentCnt] = myInput.nextInt();									// input score					
					score[subjectCnt][studentCnt] += score[i][studentCnt]; 	 					// total
				}
				score[subjectCnt + 1][studentCnt] = score[subjectCnt][studentCnt] / subjectCnt;	//average
				
				System.out.print("1. more 2. quit : ");										
				askIf = myInput.nextInt();
				studentCnt++; //next student

			} while (askIf != 2);		
			System.out.println("\nPrint score's");
			
			for (int j = 0; j < subjectCnt; j++) 
			{
				System.out.print((j + 1) + "subject\t");
			}
			System.out.println("total\taverage");

			
			for (int j = 0; j < studentCnt; j++)  //input score
			{
				for (int k = 0; k < subjectCnt; k++) 
				{
					System.out.print(score[k][j] + "\t");
				}
				System.out.print(score[subjectCnt][j] + "\t" + score[subjectCnt + 1][j] + "\n");//total & average
			}

			System.out.print("\nsave?(1.yes 2. no) : ");  // csv save
			askIf = myInput.nextInt();

			if (askIf == 1) 
			{ 
				dataStr = "ID,"; // student's ID
				for (int j = 0; j < subjectCnt; j++) 
				{					
					dataStr += (j + 1) + "subject,";
				}
				dataStr += "total, average\n";
				out.write(dataStr.getBytes());

				for (int j = 0; j < studentCnt; j++) 
				{
					dataStr = (j + 1) + ","; 
					for (int k = 0; k < subjectCnt; k++) // score
					{			
						dataStr += score[k][j] + ",";
					}
					//total & average & line change
					dataStr += score[subjectCnt][j] + "," + score[subjectCnt + 1][j] + "\n"; 	//total & average
					out.write(dataStr.getBytes());
				}

			}
			myInput.close();
			out.close();
			
		}//try
		catch (Exception e)
		{
			
		}//catch (Exception e)
				
	}//public static void main(String[] args) 

}//public class array_work 
