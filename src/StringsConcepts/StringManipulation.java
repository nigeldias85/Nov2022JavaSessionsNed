package StringsConcepts;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "This is my Java Code and I am in Bangalore.";
		
		System.out.println("String Length: "+str1.length());
		int len = str1.length();
		int low =0;
		int high = len-1;
		
	
		//Char At
		System.out.println("Char at 0: "+low);
		System.out.println("Char at 15: "+str1.charAt(16));
		System.out.println("Char at 40: "+str1.charAt(42));
		//System.out.println("Char at 40: "+str1.charAt(43)); //StringIndexOutOfBound Exception
		
		
		//Index of
		System.out.println("Index of B: "+str1.indexOf('B'));
		System.out.println("Index of Java: "+str1.indexOf("Java"));
		
		
		String m1 = "Welcome Admin";
		if(m1.indexOf("Admin") == 8)
			System.out.println("Admin user is present");
		else 
			System.out.println("Admin user is not present");
		
		//Find index of a given char
		int firstIndex = str1.indexOf('i');
		System.out.println("Index of i "+firstIndex); //First occurrence of i
		System.out.println("Index of second i "+str1.indexOf('i', firstIndex+1)); //2nd occurrence of i
		int secondIndex = str1.indexOf('i', firstIndex+1);
		System.out.println("Index of third i "+str1.indexOf('i', secondIndex+1)); //3rd occurrence of i
		
		System.out.println("Index of invalid string "+str1.indexOf("Python"));
		
		
		String m2 = "Product name is Macbook";
		if(m2.indexOf("macbook") != -1)
			System.out.println("Macbook is present");
		else 
			System.out.println("Macbook is not present");
		
		//To UPPERCASE & to lowercase
		String m3 = "this is a java program";
		System.out.println("m3 uppercase: "+m3.toUpperCase());
		
		String m4 = "THIS IS BANGALORE";
		System.out.println("m4 lowercase: "+m4.toLowerCase());
		
		//Trim
		String m5 = "   Hello World      ";
		System.out.println("m5 trimmed: "+m5.trim());
		
		//Replace
		String m6 = "Hello World";
		String m6Update = m6.replace(" ", "");
		System.out.println("m6 replaced: "+m6Update);
		
		String dob="01-01-1990";
		System.out.println("dob update: "+dob.replace('-', '/'));
		
		System.out.println("m6 updated "+m6.replace("World", "Bangalore"));
		
		System.out.println("m5 updated: "+m5.replaceAll(" ", ""));
		
		//equals
		String e1="Hello Selenium";
		String e2="Hello selenium";
		if(e1.equals(e2))
			System.out.println("String are equal");
		else 
			System.out.println("Strings are not equal");
		
		
		//equalsignorecase
		String e3="Hello Selenium";
		String e4="Hello selenium";
		if(e3.equalsIgnoreCase(e4))
			System.out.println("String are equal");
		else 
			System.out.println("Strings are not equal");
		
		//contains
		String tg = "Welcome to Naveen Training";
		System.out.println(tg.contains("naveen"));
		
		//Split
		String lang = "JAVA_PYTHON_RUBY_DOTNET";
		String[] langArray  = lang.split("_");
		System.out.println(Arrays.toString(langArray));
		for (String ele : langArray) {
			System.out.println(ele);
		}
		
		
		String pop = "xXtestingxXseleniumXxXautomationXXxXtrainingX";
		System.out.println(pop.split("xX")[0].length());
		System.out.println(pop.split("xX")[1]);
		System.out.println(pop.split("xX")[2]);
		System.out.println(pop.split("xX")[3]);
		System.out.println(pop.split("xX")[4]);
	}

}
