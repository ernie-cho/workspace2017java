import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class k20_170522 {

	public static void main(String[] args) {
		// Lecture3 page6 practice.4 -----------------------important - x
		// substitute after operation 
		int k20_ii;   // k20_ii variable
		k20_ii = 1+2; // substitute at k20_ii
		System.out.printf("#1-1 : %d\n", k20_ii); // print #1-1 result
		
		// sequence of operation
		k20_ii = 1+2*3; // substitute at k20_ii
		System.out.printf("#1-2 : %d\n", k20_ii); // print #1-2 result
		
		//Lecture3 page7 practice. -------------------------important☆☆
		//#2. 누적하기(accumulate), sum
		int k20_sum; // variable of sum
		k20_sum = 0; // declare sum as 0
		// for loop for 1 to 100 sum
		for (int i=0; i <= 10; i++){
			k20_sum = k20_sum + i; // add result to k20_sum
		}
			// get result of sum 1 to 100
			System.out.printf("#2 : %d\n", k20_sum);
			// average of previous result
			System.out.printf("#2-2 : %d\n", k20_sum/10);
		// use array	
		int [] k20_v = {1,2,3,4,5}; //array of 1 to 5
		int k20_vSum;				//variable of array result 
		
		k20_vSum = 0;				//declare k20_vSum as 0
		
		for (int i=0; i <5; i++){	//for loop of array 0 to 4
			k20_vSum = k20_vSum + k20_v[i]; //sum array 0 to 4 and insert to k20_vSum
		}   //print result of array's result
			System.out.printf("#2-3 : %d\n", k20_vSum);
			
		// Lecture3 page8 practice. -------------------------important☆☆
		// in integer divide means truncate   	
		k20_ii = 1000/3; // k20_ii variable has result of 1000/3 
		System.out.printf("#3-1 : %d\n", k20_ii); // print #3-1 result
		// remainder use %
		k20_ii = 1000%3; // k20_ii variable has result of 1000%3
		System.out.printf("#3-2 : %d\n", k20_ii); // print #3-2 result
		// example of remainder
		for(int i =0; i < 20; i++){ // for loop of print #3-3 twenty times
			System.out.printf("#3-3 : %d", i); // print #3-3 result
			// line changing with 5 times
			if (((i+1) %5) == 0) {
				System.out.printf("\n"); // line changing
			}
		}
		
		//Lecture3 page9 practice. -------------------------important☆☆
		// truncate & rounding lecture
		k20_ii = 12345; //variable of k20_ii
		int k20_j = (k20_ii/10) * 10; // truncate under 10won
		System.out.printf("#4-1 : %d\n", k20_j);  // print #4-1 result
		
		k20_ii = 12345; //variable of k20_ii
		k20_j = ((k20_ii+5)/10)*10; // rounding under 10won
		System.out.printf("#4-2 : %d\n", k20_j);// print #4-2 result
		
		k20_ii = 12344; //variable of k20_ii
		k20_j = ((k20_ii+5)/10) * 10; // rounding under 10won 
		System.out.printf("#4-3 : %d\n", k20_j); // print #4-3 result
		
		k20_ii = 12345; //variable of k20_ii
		k20_j = ((k20_ii + 50) / 100) * 100; // truncate under 100won
		System.out.printf("#4-4 : %d\n", k20_j); // print #4-4 result
		
		k20_ii = 12501; //variable of k20_ii
		k20_j = ((k20_ii + 50) / 100) * 100; // rounding over 100won
		System.out.printf("#4-5 : %d\n", k20_j); // print #4-5 result
		
		k20_ii = 12345; //variable of k20_ii
		k20_j = ((k20_ii + 500) / 1000) * 1000; // truncate under 1,000won
		System.out.printf("#4-6 : %d\n", k20_j); // print #4-6 result
		
		k20_ii = 12545; //variable of k20_ii
		k20_j = ((k20_ii + 500) / 1000) * 1000; // rounding over 1,000won
		System.out.printf("#4-7 : %d\n", k20_j); // print #4-7 result
		
				
		//Lecture3 page10 practice. -------------------------important☆☆
		// truncate & rounding of decimal		
		int k20_MyVal = 14/5; // result is 2.8 but for integer it might be truncated
		System.out.printf("#5-1 : %d\n", k20_MyVal); // print #5-1 result		
		double k20_MyValF; //k20_MyValF use double data type
		
		k20_MyValF = 14/5; // same result of #5-1 but used float
		System.out.printf("#5-2 : %f\n", k20_MyValF); // print #5-2 result
		
		k20_MyValF = 14.0 /5; // float operated by integer & float type would show whole float
		System.out.printf("#5-3 : %f\n", k20_MyValF); // print #5-3 result
		
		k20_MyValF = (14.0)/5+0.5; // float operated with float
		System.out.printf("#5-4 : %f\n", k20_MyValF); // print #5-4 result
		
		k20_MyVal = (int) ((14.0) / 5 + 0.5); // used integer type returns truncate result
		System.out.printf("#5-5 : %d\n", k20_MyVal); // print #5-5 result	
		System.out.println(" "); // line changing
		
		//Lecture3 page13 practice. -------------------------important☆☆
		int k20_val = 271; //before tax
		int k20_rate = 3;  //tax rate
		int k20_tax = 0;   //tax operated result insert to k20_tax variable
		// tax operate 
		if( ((double)k20_val*(double)k20_rate/100.0) == k20_val/100) //used double data type
			k20_tax = k20_val*k20_rate/100; // insert to k20_tax variable
		else // other operate of k20_tax
			k20_tax =  k20_val*k20_rate/100 +1;
		System.out.println("----------------PAGE 13------------------"); // print page
		System.out.println("*****************************************"); // print Asterisk
		System.out.println("*                단순 세금 계산                        *"); // print first line
		// print tax operate to float
		System.out.printf("*           실제 세금계산 : %f         *\n" , k20_val*k20_rate/100.0); 
		System.out.printf("*   세전가격 : %d 세금 : %d 세포함가격 : %d    *\n", 
				k20_val,k20_tax,k20_val+k20_tax); // before tax & tax & include tax
		System.out.println("*****************************************"); // print Asterisk
		System.out.println("-----------------------------------------"); // print last line
		System.out.println(" "); // changing line
		
		//Lecture3 page15 practice. -------------------------important☆☆
		// if integer operated with float result would be float
		int k20_custom = 280; // before tax
		int k20_taxrate = 3;  // tax rate
		int k20_taxval, k20_netval; // create variable for 
		// but data type changes to integer it'll return integer
		k20_netval = (int) (k20_custom / (1 + k20_taxrate/100.0));
		k20_taxval = k20_custom - k20_netval; // and result will be truncated under float
		System.out.println("----------------PAGE 15------------------");// print page
		System.out.println("*****************************************");// print Asterisk
		System.out.println("*            소비자가 중심 세금 계산                   *");	// print first line	
		System.out.printf("*   소비자가격 : %d  세전가격 : %d 세금  : %d  *\n",
				k20_custom,k20_netval,k20_taxval); // customer price, before tax, tax
		System.out.println("*****************************************");// print Asterisk
		System.out.println("-----------------------------------------");// print last line
		System.out.println(" ");// changing line
		
		//Lecture3 page17 practice.-------------------------important☆☆
		// if we have to change currency exchange we have to pay commission
		int k20_MyWon = 1000000;      // exchange won
		double k20_MoneyEx = 1238.21; // rate per dollar
		double k20_commission = 0.003;// exchanging commission
		// used integer data type and returns truncated result
		int k20_usd = (int) (k20_MyWon / k20_MoneyEx ); // exchanging dollar 
		int k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx ); //rest money
		System.out.println("----------------------PAGE 17-----------------------");// print page
		System.out.println("****************************************************");// print Asterisk
		System.out.println("*                    수수료없이 계산                                  *");;// print Asterisk
		System.out.printf("* 총 한화환전금액 : %d원 => 미화 : %d달러, 잔돈 : %d원 *\n",
				k20_MyWon, k20_usd, k20_remain); // total exchange amount, usd, rest
		System.out.println("****************************************************");;// print Asterisk
		System.out.println("----------------------------------------------------");// print last line
		System.out.println(" ");// changing line
		
		//Lecture3 page18 practice.-------------------------important☆☆
		// calculated with commission
		double k20_ComPerOne = k20_MoneyEx * k20_commission; // commission per dollar
		//total commission is exchanging dollar * commission per dollar
		double k20_totalcom = k20_usd * k20_ComPerOne;
		// print page
		System.out.println("---------------------------PAGE 18-----------------------------");
		// print Asterisk
		System.out.println("***************************************************************");
		// print first line
		System.out.println("*                            수수료 계산                                            *");
		// total commission, usd, dollar per commission
		System.out.printf("* 총 수수료 : %f원 => 미화 : %d달러, 달라당 수수료 : %f원 *\n",
				k20_totalcom, k20_usd, k20_ComPerOne);
		// print Asterisk
		System.out.println("***************************************************************");
		// print last line
		System.out.println("---------------------------------------------------------------");
		System.out.println(" ");// changing line
		
		//Lecture3 page19 practice.-------------------------important☆☆
		// if we change currency exchange as whole dollars commission it would be wrong calculate
		// right way is dollar per commission
		int k20_i_totalcom; // final commission
		if (k20_totalcom != (double)((int)k20_totalcom)) //if total commission float
			k20_i_totalcom = (int)k20_totalcom +1; // plus 1 of result
		else // other condition
			k20_i_totalcom = (int)k20_totalcom; //if total commission integer
		// print page
		System.out.println("---------------------------PAGE 19-----------------------------");
		// print Asterisk
		System.out.println("***************************************************************");
		// print first line
		System.out.println("*                          수수료 적용환전                                           *");
		// total commission, usd, commission per dollar
		System.out.printf("*    총 수수료 : %d원 => 미화 : %d달러, 달라당 수수료 : %f원        *\n",
				k20_i_totalcom, k20_usd, k20_ComPerOne);
		// integer amount
		k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom );
		// total exchange amount , usd, tax have to pay
		System.out.printf("*    총 한화환전금액 : %d원 => 미화 : %d달러, 수수료징구 : %d     *\n",
				k20_MyWon, k20_usd, k20_i_totalcom, k20_remain);	
		// print Asterisk
		System.out.println("***************************************************************");
		// print last line
		System.out.println("---------------------------------------------------------------");
		System.out.println(" ");// changing line
		
		//Lecture3 page20 practice.-------------------------important☆☆
		// same as page19 practice but calculated with float
		k20_usd = (int) (k20_MyWon / (k20_MoneyEx + k20_ComPerOne)); //exchange dollar with truncate
		k20_totalcom = k20_usd * k20_ComPerOne; //total commission
		// total commission rounding
		if (k20_totalcom != (double)((int)k20_totalcom)) //if total commission float rounding
			k20_i_totalcom = (int)k20_totalcom +1;		 // plus 1 of result
		else
			k20_i_totalcom = (int)k20_totalcom; //if total commission integer truncate
		// print page
		System.out.println("---------------------------PAGE 20-----------------------------");
		// print Asterisk
		System.out.println("***************************************************************");
		// print first line
		System.out.println("*                      (정확한) 수수료 적용환전                                     *");
		// total commission, usd, commission per dollar
		System.out.printf("*     총 수수료 : %d원 => 미화 : %d달러, 달라당 수수료 : %f원      *\n",
				k20_i_totalcom, k20_usd, k20_ComPerOne); // total commission
		// rest of amount
		k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom );
		// total exchange , usd, tax have to pay
		System.out.printf("*     총 한화환전금액 : %d원 => 미화 : %d달러, 수수료징구 : %d    *\n",
				k20_MyWon, k20_usd, k20_i_totalcom, k20_remain);	
		// print Asterisk
		System.out.println("***************************************************************");
		// print last line
		System.out.println("---------------------------------------------------------------");
		System.out.println(" ");// changing line
		
		//Lecture3 page22 practice. -------------------------important☆☆
		// same result with decimal format
		DecimalFormat k20_df = new DecimalFormat( "###,###,###,###,###");
		// used Calendar class with SimpleDateFormat class 
		Calendar k20_calt = Calendar.getInstance();
		SimpleDateFormat k20_sdt = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
		// print page
		System.out.println("-------------------------------PAGE 22----------------------------------");
		// print Asterisk
		System.out.println("************************************************************************");
		// print first line
		System.out.println("*                           콤마 찍기, 날짜 적용                                                  *");
		// total commission, usd, commission per dollar
		System.out.printf("*      총 수수료 : %s원 => 미화 : %s달러,  달러당 수수료 : %f           *\n",
				k20_df.format(k20_i_totalcom), //format of total commission
				k20_df.format(k20_usd),		   //format of usd
				k20_ComPerOne);				   //commission per dollar
		// rest of amount
		k20_remain = (int) (k20_MyWon - k20_usd * k20_MoneyEx - k20_i_totalcom);
		// total exchange amount, usd, have to pay tax, rest amount
		System.out.printf("*  총 한화환전 금액 : %s원 => 미화 : %s달러 수수료징구 : %s원 잔돈 : %s원   *\n",
				//data format of variables
				k20_df.format(k20_MyWon), k20_df.format(k20_usd), k20_df.format(k20_i_totalcom), 
				k20_df.format(k20_remain)); //format of rest of amount
		// final execute time
		System.out.printf("*                    최종실행시간 : %s                    *\n",
		// format of time
				k20_sdt.format(k20_calt.getTime()));
		// print Asterisk
		System.out.println("************************************************************************");
		// print last line
		System.out.println("------------------------------------------------------------------------");
		System.out.println(" ");// changing line
				
				
				
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
}
