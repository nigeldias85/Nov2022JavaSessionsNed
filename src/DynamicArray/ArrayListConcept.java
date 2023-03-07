package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dynamic Array
		//ArrayList - DefaultClass
		//Order Based Collection - It maintains order/index
		
		ArrayList arrLst1 = new ArrayList<>(); 
		//Creates a Virtual Segment
		//Initially 10 virtual segments are created
		//Physical capacity is 0 , as arrLst1.size() is 0
		//After adding up 10 values, the physical capacity is 10
		//Subsequently , there will be CurrentPhysicalCapacity/2 virtual segments added
		//Load Factor(LF) = CurrentPhysicalCapacity/2 or CurrentSize/2
		
		//Get Array List Size
		System.out.println("Size: "+arrLst1.size());
		arrLst1.add(100);
		arrLst1.add(200);
		arrLst1.add(300);
		//Get Array List Size
		System.out.println("Size: "+arrLst1.size());
		arrLst1.add(400);
		arrLst1.add(500);
		System.out.println("Size: "+arrLst1.size());
		
		//Add values of different data types
		arrLst1.add("testing");
		arrLst1.add("23.44");
		arrLst1.add(true);
		arrLst1.add("600");
		arrLst1.add(false);
		System.out.println("Size: "+arrLst1.size());
		
		//Print Array List Contents
		for (Object ele : arrLst1) {
			System.out.println(ele);
		}
		
		System.out.println("--------------");
		for(int i =0; i< arrLst1.size(); i++) {
			
			System.out.print(arrLst1.get(i)+ " ");
		}
		
		arrLst1.add("1000");
		System.out.println("");
		
		System.out.println("---------------------");
		ArrayList empData = new ArrayList<>();
		empData.add("Tom");
		empData.add("Bangalore");
		empData.add(1000);
		empData.add(true);
		System.out.println(empData.size());
		System.out.println(empData);
		
		
		

	}

}
