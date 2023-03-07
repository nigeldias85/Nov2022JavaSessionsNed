package SeleniumSessions;

import java.util.Scanner;

public class MethodsAssignment {
	
	//1.Write a program to print the sum of two numbers entered by user by defining your own method
		public int SumOfTwoNumber(int x, int y) {
			return (x+y);
		}
	
	//2. Define a method that returns the product of two numbers entered by user
		public double ProdOfTwoNumbers(double x, double y) {
			return x*y;
		}
	
	//3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
		public void PrintCircumferenceAndAreaOfCircle(double radius) {
			final double pi = 3.142;
			
			double circumference = 2 * pi * radius;
			System.out.println("Cicrcumference of circle is: "+circumference);
			System.out.println("Rounded Value(Cicrcumference): "+Math.round(circumference));
			System.out.println("--------------------------------");
			double area = pi * Math.pow(radius, 2);
			System.out.println("Area of circle is: "+area);
			System.out.println("Rounded Value(Area): "+Math.round(area));
		}
		
	//4.Define two methods to print the maximum and the minimum number respectively 
		//among three numbers entered by user.
		public void PrintMaxAndMin(int x, int y, int z) {
			
			int maxNumber = x;
			int minNumber = x;
			//Compare only two number;
			if(y > x) {
				maxNumber = y;
			}
			
			if(z > maxNumber) {
				maxNumber = z;
			}
			
			if(y<x) {
				minNumber = y;
			}
			
			if(z < minNumber) {
				minNumber = z;
			}
			
			
			System.out.println("MaxNumber is: "+maxNumber);
			System.out.println("MinNumber is: "+minNumber);
		}
		 
		 
	//5.Def﻿ine a program to find out whether a given number is even or odd.
		public boolean IsNumberEven(int number) {
			boolean blnResult = false;
			
			if(number % 2 == 0) {
				blnResult = true;
			}
			return blnResult;
		}

	//6. A person is elligible to vote if his/her age is greater than or equal to 18.
		//Define a method to find out if he/she is elligible to﻿ vote
		public boolean IsEligibleToVote(int age) {
			boolean blnResult = false;
			if(age >= 18) {
				blnResult = true;
			}
			return blnResult;
		}
		
		
	//7. Define a method to find out if number ﻿is prime or not.
		public boolean IsNumberNotPrime(int number) {
			boolean blnResult = false;
			for(int i = 2; i<number; i++) {
					if((number % i == 0)) {
						blnResult = true;
						break;
					}
			}
			
			
			return blnResult;
		}
		
		
	//8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
		//Marks        Grade
		//91-100         AA
		//81-90          AB
		//71-80          BB﻿
		//61-70          BC
		//51-60          CD
		//41-50          DD
		//<=40          Fail
		
		public void PrintGradesForStudent(int marks) {
			
			if(marks >=91 && marks <=100) {
				System.out.println("Student with marks: "+marks+" has GRADE: AA");
			}
			else if(marks >=81 && marks <=90) {
				System.out.println("Student with marks: "+marks+" has GRADE: AB");
			}
			else if(marks >=71 && marks <=80) {
				System.out.println("Student with marks: "+marks+" has GRADE: BB");
			}
			else if(marks >=61 && marks <=70) {
				System.out.println("Student with marks: "+marks+" has GRADE: BC");
			}
			else if(marks >=51 && marks <=60) {
				System.out.println("Student with marks: "+marks+" has GRADE: CD");
			}
			else if(marks >=41 && marks <=50) {
				System.out.println("Student with marks: "+marks+" has GRADE: DD");
			}
			else if(marks <= 40) {
				System.out.println("Student with marks: "+marks+" has FAILED");
			}
		}
		
	
	//9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
		//Factorial of any number n is represente﻿d by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
		//4! = 1*2*3*4 = 24
		
		public void PrintFactorial(int number) {
			int factorialVaule =1;
			if(number == 1) {
				System.out.println("Factorial for"+number+" is: "+1);
			}
			
			for(int i=2;i<=number;i++) {
				factorialVaule = factorialVaule * i;
			}
			
			System.out.println("Factorial for "+number+" is: "+factorialVaule);
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsAssignment obj = new MethodsAssignment();
		System.out.println("Sum of Two Numbers: "+obj.SumOfTwoNumber(10, 34));
		/*Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int x = scn.nextInt();
		System.out.println("");
		System.out.print("Enter the second number: ");
		int y = scn.nextInt();
		System.out.println("");
		System.out.println("Sum of Two Numbers: "+obj.SumOfTwoNumber(x, y));*/
		System.out.println("Product of Two Numbers: "+obj.ProdOfTwoNumbers(24.5 , 45.897));
		
		obj.PrintCircumferenceAndAreaOfCircle(10.55);
		obj.PrintMaxAndMin(8, -3, 0);
		obj.PrintMaxAndMin(1, 10, -5);
		obj.PrintMaxAndMin(2, 16, 23);
		
		int num = 101;
		if(num != 0) {
			if(obj.IsNumberEven(num)) {
				System.out.println("Number: "+num+" is even");
			}
			else {
				System.out.println("Number: "+num+" is odd");
			}
		}
		else {
			System.out.println("Please give a non-zero number.");
		}
		
		int age = 19;
		if(obj.IsEligibleToVote(age)) {
			System.out.println("Citizen with age: "+age+" is elegible to vote");
		}
		else {
			System.out.println("Citizen with age: "+age+" is NOT elegible to vote");
		}
		
		int number = 101;
		if(!obj.IsNumberNotPrime(number))
			System.out.println("Number: "+number+" is PRIME");
		else
			System.out.println("Number: "+number+" is NOT PRIME");
			
		
		obj.PrintGradesForStudent(100);
		obj.PrintGradesForStudent(75);
		obj.PrintGradesForStudent(50);
		obj.PrintGradesForStudent(41);
		obj.PrintGradesForStudent(39);
		
		
		obj.PrintFactorial(4);
		obj.PrintFactorial(9);

		

	}

}
