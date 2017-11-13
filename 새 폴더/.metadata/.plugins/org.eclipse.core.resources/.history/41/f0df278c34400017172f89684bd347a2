import java.text.DecimalFormat;

public class K20_170523 {

	public static void main(String[] args) {
		// Lecture4 page15 -----------------------important
		int k20_iA, k20_iB; //variables for while loop
		
		k20_iA = 0; 		//initialization variable for 0
		while(true){		//while clause begin
			k20_iB = 0;		//initialization variable for 0
			while(true){	//second while clause begin
				System.out.printf("*"); //print Asterisk
				if(k20_iA==k20_iB) break; //break when iA equals iB
				k20_iB++;			 //iB count add
			}
			System.out.println(" "); //change next line
			k20_iA++;				 //iA count add
			if(k20_iA == 30) break;  //if iA increase to 30 break
		}
		
		// Lecture4 page16 -----------------------important
		int k20_il;			//variable for integer
		double k20_iD;		//variable for double
		k20_il = 10/3;		//insert value of 10/3 to il
		k20_iD = 10/3.0;	//insert value of 10/3.0 to iD
		// integer & double is integer operation & real number operation
		if(k20_il == k20_iD) System.out.println("equal"); //if il equals iD print equal
		//else print real number
		else System.out.printf("Not equal [%f][%f]\n", (double)k20_il,k20_iD);
		// if iD's value equals to 3.333333 print equal
		if(k20_iD ==3.333333) System.out.println("equal");
		// if condition is not matched than print else clause
		else System.out.printf("Not equal [3.333333][%f]\n", k20_iD);
		
		k20_iD = (int)k20_iD; // iD's data type declare to integer
		if (k20_il == k20_iD) System.out.println("equal");//if il equals iD print equal
		//else print real number
		else System.out.printf("Not equal [%f][%f]\n", (double)k20_il,k20_iD);
		//print result as integer
		System.out.printf("int로 인쇄[%d][%f]\n",k20_il,k20_iD);
		//print result as real number
		System.out.printf("double로 인쇄[%f][%f]\n", (double)k20_il,k20_iD);
		//variable k20_a declare as 'c'
		char k20_a = 'c';
		//condition of character 
		if(k20_a == 'b')System.out.println("k20_a는 b이다");//k20_a equals 'b'
		if(k20_a == 'c')System.out.println("k20_a는 c이다");//k20_a equals 'c'
		if(k20_a == 'd')System.out.println("k20_a는 d이다");//k20_a equals 'd'
		//declare string type k20_aa
		String k20_aa = "abcd";
		//condition of string, if match with 'abcd' print value
		if(k20_aa.equals("abcd")) System.out.println("k20_aa는 abcd이다");
		else System.out.println("k20_aa는 abcd가 아니다");//else condition
		//declare boolean type k20_bb
		boolean k20_bb = true;
		//if k20_bb is true print value
		if(!!k20_bb)System.out.println("k20_bb가 아니고 아니면 참이다");
		//if k20_bb is false pritn value
		else System.out.println("k20_bb가 아니고 아니면 거짓이다");
		
		// Lecture4 page17 -----------------------important
		int k20_iVal; //variable of integer
		for(int k20_i=0; k20_i <300 ; k20_i++){ //for loop condition
			k20_iVal = 5* k20_i; //insert value to k20_iVal
			//if condition of k20_iVal matches, print value of k20_iVal
			if(k20_iVal >= 0 && k20_iVal < 10) System.out.printf("일 %d\n", k20_iVal);
			//if condition range is  over 10 under 100 print next value
			else if(k20_iVal >= 10 && k20_iVal <100) System.out.printf("십 %d\n", k20_iVal);
			//if condition range is over 100 under 1000 print next value
			else if(k20_iVal >= 100 && k20_iVal <1000) System.out.printf("백 %d\n", k20_iVal);
			else System.out.printf("천 %d\n", k20_iVal); // else condition print next value
		}
		
		
		// Lecture4 page18 -----------------------important
		for(int k20_i = 1; k20_i < 13 ; k20_i++){    //for loop condition
			System.out.printf(" %d월 =>", k20_i);     //print outside for loop
			for(int k20_j=1; k20_j < 32 ; k20_j++){  //inside for loop
				System.out.printf("%d,", k20_j);     //print inside for loop
				if(k20_i == 1 && k20_j == 31) break; //January condition
				if(k20_i == 2 && k20_j == 28) break; //February condition 
				if(k20_i == 3 && k20_j == 31) break; //March condition
				if(k20_i == 4 && k20_j == 30) break; //April condition
				if(k20_i == 5 && k20_j == 31) break; //May condition
				if(k20_i == 6 && k20_j == 30) break; //June condition
				if(k20_i == 7 && k20_j == 31) break; //July condition
				if(k20_i == 8 && k20_j == 31) break; //August condition
				if(k20_i == 9 && k20_j == 30) break; //September condition
				if(k20_i == 10 && k20_j == 31) break;//October condition
				if(k20_i == 11 && k20_j == 30) break;//November condition
				if(k20_i == 12 && k20_j == 31) break;//December condition
			}
			System.out.println(" ");//print blank to make line changing
		}
		
		System.out.println(" ");
		
		// Lecture4 page19-1 -----------------------important
		for(int k20_i = 1; k20_i < 13; k20_i++) { //for loop condition(outside)
			System.out.printf(" %d월 => ", k20_i); //print outside(for) values
			for(int k20_j=1; k20_j < 32; k20_j++){//for loop condition(inside)
				System.out.printf("%d,", k20_j);  //print inside(for) values
				if(k20_i == 4 || k20_i == 6|| k20_i == 9 //if condition
						|| k20_i == 7 || k20_i == 11){
					if(k20_j == 30)break;	//break when value matches variable
				}
				if(k20_i == 2) {			//February condition
					if (k20_j == 28) break; //when matched break
				}
			}
			System.out.println(" ");		//print blank for line changing
		}
		
		System.out.println(" ");
		
		// Lecture4 page19-2 -----------------------important
		for (int k20_i = 1; k20_i < 13; k20_i++){ //for loop condition(outside)
			System.out.printf(" %d월 =>", k20_i);  //print outside(for) values
			for(int k20_j=1; k20_j <32; k20_j++){ //for loop condition(inside)
				System.out.printf("%d,", k20_j);  //print inside(for) values
				if((k20_i == 4|| k20_i == 6 ||k20_i ==9|| //if condition
						k20_i ==7||k20_i == 11)&&(k20_j==30)) break;
				if(k20_i ==2 && k20_j == 28) break; //February condition
			}
			System.out.println(" "); //print blank for line changing
		}
		
		System.out.println(" ");
		
		// Lecture4 page20 -----------------------important
		for(int k20_i = 1; k20_i < 13; k20_i++){ //for loop condition(outside)
			System.out.printf(" %d월 =>", k20_i); //print outside(for) values
			LOOP:for(int k20_j=1; k20_j<32; k20_j++){ //for loop condition(inside)
				System.out.printf("%d,", k20_j); //print inside(for) values
				switch(k20_i){	//used switch for cases 
					case 4: case 6: case 9: case 7: case 11:
						if(k20_j ==30)break LOOP; //case condition
						break;				//break when ends condition
					case 2:					//February condition
						if(k20_j == 28) break LOOP;
						break;				//break when ends condition
				}
			}
			System.out.println(" "); //print blank for line changing
		}
		
		System.out.println(" ");		
		
		// Lecture4 page21 -----------------------important
		// array for calendar
		int [] k20_LMD = {31,28,31,30,31,30,31,31,30,31,30,31};
		// create default Last Month Date values to array
		for(int k20_i=1; k20_i <13; k20_i++){ //for loop condition(outside)
			System.out.printf(" %d월 =>",k20_i);//print outside(for) values
			for(int k20_j = 1; k20_j < 32; k20_j++){//for loop condition(inside)
				System.out.printf("%d", k20_j);//print inside(for) values
				if(k20_LMD[k20_i-1]==k20_j) break;//break when condition matched
				System.out.printf(","); //if last date meet array data than skip (,)
			}
			System.out.println(" "); //changing line
		}
		System.out.println(" ");
		
		// Lecture4 page22 -----------------------important
		// array for character matching with number
		String [] k20_units = {"영","일","이","삼","사","오","육","칠","팔","구"};
		for (int k20_i = 0; k20_i < 101; k20_i++) { //for condition loop 100 times
			if(k20_i >= 0 && k20_i < 10) { //under 10 condition
				System.out.printf("일의 자리 : %s\n", k20_units[k20_i]);// 10 values
			} // over 10 and under 100 
			else if(k20_i >= 10 && k20_i < 100) {
				int k20_i10, k20_i0; //variable for values/10 and values%10
				k20_i10 = k20_i/10;  //indicate first number
				k20_i0 = k20_i %10;  //indicate second number
				if(k20_i0 ==0) { //if second number match with 0 
					System.out.printf("십의자리 : %s십\n", k20_units[k20_i10]);//print value
				}else{//else second number not match with 0
					//print whole numbers character
					System.out.printf("십의자리 : %s십%s\n", k20_units[k20_i10],k20_units[k20_i0]);
				}
			}//print last number of variable
			else System.out.printf("==> %d\n", k20_i);
		}
		
		// Lecture4 page23 -----------------------important
		int k20_iNumVal = 1001034567; //read number
		//variables of number value, number voice
		String k20_sNumVal = String.valueOf(k20_iNumVal);//Number data type change to character
		String k20_sNumVoice = ""; //string type 
		// get length of values character
		System.out.printf("==> %s [%d자리]\n", k20_sNumVal, k20_sNumVal.length());
		// variable of values
		int k20_i,k20_j;
		// array for character data
		//String [] k20_units = {"영","일","이","삼","사","오","육","칠","팔","구"}; 
		String [] k20_unitx = {"","십","백","천","만","십","백","천","억","십"};
		// default set of variables
		k20_i = 0;
		// array begins with 0, have to -1
		k20_j = k20_sNumVal.length()-1;
		// while clause begin
		while(true){ 
			if(k20_i >= k20_sNumVal.length()) break;// end condition
			System.out.printf("%s[%s]", // print values to string 
					k20_sNumVal.substring(k20_i,k20_i+1), //split number of character
					// parsing each data and compare with substring data
					k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i,k20_i+1))]);
			//if substring data equals with 0 
			if(k20_sNumVal.substring(k20_i,k20_i+1).equals("0")) {
				// if condition of number unit equals ten thousand and one hundred million
				if(k20_unitx[k20_j].equals("만")||k20_unitx[k20_j].equals("억")){
					k20_sNumVoice = k20_sNumVoice +  k20_unitx[k20_j];
				}else{//else has none of values
					
				}
			}else {//sNumVoice has unit data and unit values with character
				k20_sNumVoice = k20_sNumVoice
						+ k20_units[Integer.parseInt(k20_sNumVal.substring(k20_i,k20_i+1))]
						+ k20_unitx[k20_j];
			}
			k20_i++; k20_j--; //increase unit number and decrease unit data
							  //read from last number
		}//print values to string which parsed
		System.out.printf("\n %s[%s]\n", k20_sNumVal, k20_sNumVoice);
		
		
		
		
		// Lecture4 page24 -----------------------important
		// print number with blank
		for(int k20_ii = 0; k20_ii < 10; k20_ii++){//for condition loops 10 time
			//for condition to print blank and value
			for (int k20_jj = 0; k20_jj < k20_ii; k20_jj++)System.out.printf(" ");
			// print value
			System.out.printf("%d\n",k20_ii);
		}
		
		
		// Lecture4 page25 -----------------------important
		double k20_fSin; //float Sin variable
		for (int k20_ii=0; k20_ii <360; k20_ii++ ){ // for condition to  loop 360 times
			k20_fSin = Math.sin(k20_ii * 3.141592/180); // insert values to fSin
			//print 360 values of fSin
			System.out.printf("%d sin ==>%f\n", k20_ii,k20_fSin);
		}	//for condition to loop 360 times
		for (int k20_ii=0; k20_ii <360; k20_ii++ ){
			k20_fSin = Math.sin(k20_ii * 3.141592/180); // insert values to fSin
			int k20_iSpace = (int)((1.0-k20_fSin) *50); // multiply 50 to express 0~100
			// make space for fSin graph
			for(int k20_jj=0; k20_jj <k20_iSpace; k20_jj++)System.out.printf(" ");
			// print space with fSin values
			System.out.printf("*[%f][%d]\n", k20_fSin, k20_iSpace);
		}
		
		// Lecture4 page26 -----------------------important
		// print pyramid shape
		int k20_n, k20_m; // variables for blank and Asterisk
		k20_m=20; k20_n=1; //declare blank space and number of asterisk
		while(true){ //while begin
			// print blank condition
			for(int k20_ii=0; k20_ii <k20_m; k20_ii++) System.out.printf(" ");
			// print asterisk condition
			for(int k20_ii=0; k20_ii <k20_n; k20_ii++) System.out.printf("*");
			System.out.printf("\n"); //changing line
			
			k20_m = k20_m -1; //next blank value insert
			k20_n = k20_n+2;  //next asterisk value insert
			if(k20_m < 0) break; //when blank value is under 0 end loop
		}
		
		System.out.println(" ");
		
		// Lecture4 page27 -----------------------important
		// print as receipt
		String k20_item = "사과"; //string value
		int k20_unit_price = 5000; //price value
		int k20_num = 500; //unit number value
		int k20_total = 0; //price * unit number
		
		DecimalFormat k20_df = new DecimalFormat("###,###,###,###,###"); // Decimal Format
		System.out.println("==============================================="); //print first line
		//% x.y s, x = number of box, y = which will use in x_box
		System.out.printf("%20.20s%8.8s%8.8s%14.8s\n","품목","단가","수량","합계");
		System.out.println("==============================================="); //print second line
		// print value as formated 
		System.out.printf("%20.20s%10.10s%5.10s%10.10s\n", 
				k20_item,k20_df.format(k20_unit_price), k20_df.format(k20_num),k20_df.format(k20_unit_price*k20_num));
		System.out.println("==============================================="); //print last line
		
		
		int k20_num2 = 5;
		while (k20_num2 > 0){
			System.out.println(k20_num2);
			k20_num2--;	
		}
	}

}
