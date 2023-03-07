package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   List<String> list1 =  new ArrayList<String>();
	   
	   list1.add("Tom");
	   list1.add("Peter");
	   list1.add("Ravi");
	   list1.add("Rashmi");
	   System.out.println(list1);
	   System.out.println(list1.size());
	   
	   for (String ele : list1) {
		  System.out.println(ele);
		  if(ele.equals("Peter")) {
			  System.out.println("Peter is a manager");
			  break;
		  }
	}
	   
	   
	//Usages of Arrays.asList("", ..... );
	//This is a immutable list. Adding of new element is not allowed: UnsupportedOperationException
	List<String> browserList = Arrays.asList("chrome", "firefox", "ie", "edge", "safari");
	System.out.println(browserList.size());
	System.out.println(browserList);
	
	//Usages of Arrays.asList in storing integers
	List<Integer> numberList = Arrays.asList(100, 200, 300, 400, 500);
	
	//Convert static array to dynamic array
	String countriesArray[] = {"India", "USA", "Canada", "France", "Germany"}; //Static Array
	List<String> countryList =  Arrays.asList(countriesArray); //Dynamic Array
	System.out.println(countryList);
	countryList.add("Brazil"); //UnsupportedOperationException
	System.out.println(countryList);
	

	}

}
