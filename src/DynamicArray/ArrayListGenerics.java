package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		System.out.println(numList.size());
		
		System.out.println("------------");
		//Print using for each
		for(Integer ele: numList) {
			System.out.println(ele);
		}
		
		ArrayList<String> empNamesList = new ArrayList<String>();
		empNamesList.add("Tom");
		empNamesList.add("Naveen");
		empNamesList.add("Peter");
		//Print using for each
		System.out.println("------------");
		for(String ele: empNamesList) {
			System.out.println(ele);
		}
		
		
		ArrayList<Object> empDataList = new ArrayList<Object>();
		empDataList.add("Tom");
		empDataList.add("01-12-1990");
		empDataList.add('M');
		empDataList.add(true);
		System.out.println("------------");
		for(Object ele: empDataList) {
			System.out.println(ele);
		}
		
		
		
	}

}
