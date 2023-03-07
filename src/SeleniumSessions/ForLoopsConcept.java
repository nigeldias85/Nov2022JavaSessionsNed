package SeleniumSessions;

import java.util.Arrays;

public class ForLoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print 1 to 10
		//For loop
		int i = 1;
		for (; i <= 10;) {
			System.out.println(i);
			//i++;
			//++i;
			i=i+1;
		}
		
//		for(;true;) {
//			System.out.println("Bye");
//		}
		int count=1;
		for(;;) {
			System.out.println("Bye "+count);
			count++;
			if(count >50) {
				break;
			}
			
		}
		
		//Print a to z
		System.out.println("PRINTING a to z");
		for(char c = 'a' ; c <= 'z' ; c++) {
			System.out.print(c);
		}
		System.out.println("------------------");
		System.out.println("");
		for(byte b=1; b<=5 ; b++) {
			System.out.println(b);
		}
		System.out.println("------------------");
		System.out.println("");
		for(double d=1.1 ; d<=10.0 ; d++) {
			System.out.println(d);
		}
		System.out.println("------------------");
		System.out.println("");
		
		for(String s="world" ; s.equals("world"); ) {
			System.out.println("Hello "+s);
			break;
		}
		
		
		//Print array without loop
		int[] nums = new int[4];
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		System.out.println("/***********************/");
		System.out.println(Arrays.toString(nums));
		System.out.println("/***********************/");
		for (int j : nums) {
			System.out.println(j);
			if(j==0)
				System.out.println("Bye!!");
		}
		System.out.println("/***********************/");
		double d[] = new double[2];
		d[0]= 12.33;
		d[1]= 23.44;
		System.out.println(d[0] + d[1]);
		System.out.println(Arrays.toString(d));
		for (double e : d) {
			System.out.println(e);
		}
		System.out.println("/***********************/");
		char ch[] = new char[4];
		ch[0]='B';
		ch[1]='$';
		ch[2]='Z';
		ch[3]='8';
		System.out.println(Arrays.toString(ch));
		for (char e : ch) {
			System.out.print(e +" -> "+(int)e);
			System.out.println();
		}
		System.out.println("/***********************/");
		String lang[] = new String[4];
		lang[0]="java";
		lang[1]="python";
		lang[2]="sql";
		//lang[3]="javascript";
		System.out.println(Arrays.toString(lang));
		for (String s: lang) {
			if(s != null) {
				if(s.equals("java")) {
					System.out.println("I love java");
				}
				else if(s.equals("python")) {
					System.out.println("I hate python");
				}
				else {
					System.out.println(s);
				}
			}
			else {
				System.out.println(s);
			}
		}
		System.out.println("/***********************/");
		
		//Employee Info
		//Name(String), age(int) , salary(double), gender(char) , isPerm(boolean)
		Object empInfo[] = new Object[5];
		empInfo[0]="Nigel";
		empInfo[1]= 30;
		empInfo[2]= 10000;
		empInfo[3]='M';
		empInfo[4]=true;
		System.out.println(empInfo.length);
		for(Object obj: empInfo) {
			if(obj.equals("Nigel")) {
				System.out.println(obj + " is from QA");	
			}
			else {
				System.out.println(obj);
			}
			
		}
		
		System.out.println("/***********************/");
		
		//Array Literals
		String prod[] = {"iPhone", "iPod", "macBook", "iPad", "iWatch"};
		System.out.println("prod array length: "+prod.length);
		for(String ele: prod) {
			System.out.println(ele);
		}
		System.out.println(Arrays.toString(prod));
		
		System.out.println("/***********************/");
		
		Object obj[] = {"macBook", 1000 , "X" , true};
		System.out.println("obj array length: "+prod.length);
		for(Object ele: obj) {
			System.out.println(ele);
		}
		
		System.out.println(Arrays.toString(obj));
		
		System.out.println("/***********************/");
		
		
		
		
		//Assignments
		/*System.out.println("-----------------");
		printBatman();
		System.out.println("-----------------");
		printTenToOne();
		System.out.println("-----------------");
		printHwTenTimes();
		System.out.println("-----------------");
		printOneToTen();
		System.out.println("-----------------");
		int[] numbers = new int[] {3,90, 23, 100, 56, 17};
		findMaxNumber(numbers);
		System.out.println("-----------------");
		printAllOddEvenNumbers();
		System.out.println("-----------------");
		findOutputQues8();
		System.out.println("-----------------");
		printAsciiValuesInWhileLoop();
		System.out.println("");
		System.out.println("-----------------");
		printAsciiValuesInForLoop();
		System.out.println("-----------------");
		printFloatOneToTen();
		System.out.println("-----------------");
		printMutiplesOfFive();
		System.out.println("-----------------");
		printOnlyVowelsUsingWhileLoop();
		System.out.println("");
		System.out.println("-----------------");
		printOnlyVowelsUsingForLoop();
		System.out.println("-----------------");
		printOneToSeven();
		System.out.println("-----------------");
		printScoreCardUsingWhileLoop();
		System.out.println("");
		System.out.println("-----------------");
		printScoreCardUsingForLoop();*/

	}
	
	public static void printBatman() {
		
		for(int i=1; i<10; i++) {
			System.out.println("I am Batman "+i);
		}
	}
	
	public static void printTenToOne() {
		
		int i =10;
		while(true) {
			
			if(i <=0) {
				break;
			}
			
			System.out.println(i);
			i--;
		}
	}

	public static void printHwTenTimes() {
		int count = 1;
		while(true) {
			if(count > 10) {
				break;
			}
			System.out.println("Hello World");
			count++;
		}
	}

	public static void printOneToTen() {

		int i =1;
		while(true) {
			if(i > 10) {
				break;
			}
			System.out.println(i);
			i++;

		}
	}

	public static void findMaxNumber(int[] numbers) {
		int max = numbers[0];
		
		for(int i =1; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Max number is: "+max);
	}

	public static void printAllOddEvenNumbers() {
		
		//Print odd
		int i=1;
		System.out.print("Odd Numbers: ");
		while(true) {
			if(i > 100) {
				break;
			}
			System.out.print(i + " , ");
			i = i + 2;
		}
		
		//Print even
		System.out.println("");
		i=2;
		System.out.print("Even Numbers: ");
		while(true) {
			if(i > 100) {
				break;
			}
			System.out.print(i + " , ");
			i = i + 2;
		}
	}

	public static void findOutputQues8() {
		int i = 1;

		while(i<=1) {
			System.out.println("Hi Java");
			i++; //Added to break the while loop
		}
	}

	public static void printAsciiValuesInWhileLoop() {

		//Ascii Value Range: 97 to 122 (a to z)
		//Ascii Value Range: 65 to 90 (A to Z)
		//Ascii Value Range: 48 to 57 (0 to 9)


		//Print A to Z Ascii values
		char upperCaseStart = 'A';
		char upperCaseEnd = 'Z';

		int i = (int) upperCaseStart;
		int j = (int) upperCaseEnd;

		while(true) {
			if(i > j) {
				break;
			}
			System.out.print(upperCaseStart++);
			System.out.print(" -> "+i);
			System.out.print(" , ");
			i++;
		}

		//Print a to z Ascii values
		System.out.println("");
		char lowerCaseStart = 'a';
		char lowerCaseEnd = 'z';
		int p = (int) lowerCaseStart;
		int q = (int) lowerCaseEnd;
		while(true) {
			if(p > q) {
				break;
			}
			System.out.print(lowerCaseStart++);
			System.out.print(" -> "+p);
			System.out.print(" , ");
			p++;
		}

		//Print 0 to 9 Ascii values
		System.out.println("");
		char firstDigit = '0';
		char lastDigit = '9';
		int m = (int) firstDigit;
		int n = (int) lastDigit;
		while(true) {
			if(m > n) {
				break;
			}
			System.out.print(firstDigit++);
			System.out.print(" -> "+m);
			System.out.print(" , ");
			m++;
		}

	}

	public static void printAsciiValuesInForLoop() {

		//Ascii Value Range: 97 to 122 (a to z)
		//Ascii Value Range: 65 to 90 (A to Z)
		//Ascii Value Range: 48 to 57 (0 to 9)


		//Print A to Z Ascii values
		char upperCaseStart = 'A';
		char upperCaseEnd = 'Z';

		int startIndex = (int) upperCaseStart;
		int endIndex = (int) upperCaseEnd;

		for(int i = startIndex; i <= endIndex ; i++ ) {
			System.out.print(upperCaseStart++);
			System.out.print(" -> "+i);
			System.out.print(" , ");
		}


		//Print a to z Ascii values
		System.out.println("");
		char lowerCaseStart = 'a';
		char lowerCaseEnd = 'z';
		startIndex = (int) lowerCaseStart;
		endIndex = (int) lowerCaseEnd;
		for(int i = startIndex; i <= endIndex ; i++ ) {
			System.out.print(lowerCaseStart++);
			System.out.print(" -> "+i);
			System.out.print(" , ");
		}

		//Print 0 to 9 Ascii values
		System.out.println("");
		char firstDigit = '0';
		char lastDigit = '9';
		startIndex = (int) firstDigit;
		endIndex = (int) lastDigit;
		for(int i = startIndex; i <= endIndex ; i++ ) {
			System.out.print(firstDigit++);
			System.out.print(" -> "+i);
			System.out.print(" , ");
		}

	}

	public static void printFloatOneToTen() {
		float i = 1f;
		for(int j = 1; j <= 10; j++) {
			System.out.print(i + " , ");
			i++;
		}
	}

	public static void printMutiplesOfFive() {
		int i = 0;
		while(i <= 100) {
			if(i % 5 == 0) {
				System.out.print(i + " , ");
			}
			i++;
			
		}
	}

	public static void printOnlyVowelsUsingWhileLoop() {
		
		char startChar = 'a';
		int startIndex = (int) startChar;
		char endChar = 'z';
		int endIndex = (int) endChar;
		while(true) {
			if(startIndex > endIndex) {
				break;
			}
			
			switch (startChar) {
			case 'a':
				System.out.print(startChar);
				break;
			case 'e':
				System.out.print(startChar);
				break;
			case 'i':
				System.out.print(startChar);
				break;
			case 'o':
				System.out.print(startChar);
				break;
			case 'u':
				System.out.print(startChar);
				break;

			default:
				break;
			}
			startChar++;
			startIndex++;
		}
		
		
	}

	public static void printOnlyVowelsUsingForLoop() {
		char startChar = 'a';
		int startIndex = (int) startChar;
		char endChar = 'z';
		int endIndex = (int) endChar;
		
		for(int i = startIndex ; i <= endIndex; i++) {
			
			switch (startChar) {
			case 'a':
				System.out.print(startChar);
				break;
			case 'e':
				System.out.print(startChar);
				break;
			case 'i':
				System.out.print(startChar);
				break;
			case 'o':
				System.out.print(startChar);
				break;
			case 'u':
				System.out.print(startChar);
				break;

			default:
				break;
			}
			startChar++;
		}
	}

	public static void printOneToSeven() {
		int i = 1;
		while(true) {
			if(i == 7) {
				System.out.print(" bye, see you tomorrow");
				break;
			}
			System.out.print(i + " , ");
			i++;
		}
	}

	public static void printScoreCardUsingWhileLoop() {
		
		//if(score == 0) -- print - "Zero - duck"
		//if(score == 25) -- print - "good job"
		//if(score == 50) -- print - "good job - half century"
		//if(score == 100) -- print - "good job - century"

		int i =0;
		while(true) {
			if(i > 100) {
				break;
			}
			
			switch (i) {
			case 0:
				System.out.println("Zero - duck");
				break;
				
			case 25:
				System.out.println("good job");
				break;
				
			case 50:
				System.out.println("good job - half century");
				break;
				
			case 100:
				System.out.println("good job - century");
				break;
				

			default:
				System.out.println(i);
				break;
			}
			i++;
		}
	}

	public static void printScoreCardUsingForLoop() {
		//if(score == 0) -- print - "Zero - duck"
		//if(score == 25) -- print - "good job"
		//if(score == 50) -- print - "good job - half century"
		//if(score == 100) -- print - "good job - century"

		for(int i = 0; i <=100 ; i++) {

			switch (i) {
			case 0:
				System.out.println("Zero - duck");
				break;

			case 25:
				System.out.println("good job");
				break;

			case 50:
				System.out.println("good job - half century");
				break;

			case 100:
				System.out.println("good job - century");
				break;


			default:
				System.out.println(i);
				break;
			}
		}
	}
}
