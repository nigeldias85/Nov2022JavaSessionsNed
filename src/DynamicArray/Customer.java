package DynamicArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 =  new ArrayList<String>();

		list1.add("Tom");
		list1.add("Peter");
		list1.add("Ravi");
		list1.add("Rashmi");
		list1.add("Naveen");
		
		for(int i=list1.size()-1; i>=0; i--) {
			System.out.println(list1.get(i));
		}
		
		//Reverse the order in the list using Collections class
		System.out.println("----------------");
		Collections.reverse(list1);
		System.out.println(list1);
		
		//Sort the elements
		System.out.println("----------------");
		Collections.sort(list1);
		System.out.println("DefaultOrdering: "+list1);
		Collections.sort(list1, Comparator.reverseOrder());
		System.out.println("ReverseOrdering: "+list1);
		
		//Swap the elements
		System.out.println("-----------------");
		System.out.println(list1);
		Collections.swap(list1, 0, list1.size()-1);
		System.out.println(list1);
		
		//Add more elements to the list1
		list1.add("Amrita");  //Add a new element to the array list
		System.out.println(list1); 
		list1.add(0, "Kath"); //Add Kath to position1 and all the elements further shift down
		System.out.println(list1);
		//list1.add(9, "Marcus"); //Gives array index out of bound exception
		//list1.get(9); //Gives array index out of bound exception
		System.out.println(list1);
		
		//Remove an element from the list
		list1.remove(1);
		System.out.println(list1);
		System.out.println(list1.get(1));
	}

}
