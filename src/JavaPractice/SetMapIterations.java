package JavaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SetMapIterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> booksSet1 = new HashSet<String>();
		System.out.println(booksSet1.add("Head First Java"));
		System.out.println(booksSet1.add("Clean Code"));
		System.out.println(booksSet1.add("Data structures in java"));
		System.out.println(booksSet1.add("Head First Java"));
		
		System.out.println("The books in the set are:");
		for(String book: booksSet1) {
			System.out.println(book);
		}
		
		System.out.println("******************");
		Set<String> booksSet2 = new LinkedHashSet<String>();
		System.out.println(booksSet2.add("Head First Java"));
		System.out.println(booksSet2.add("Clean Code"));
		System.out.println(booksSet2.add("Data structures in java"));
		System.out.println(booksSet2.add("Head First Java"));
		
		System.out.println("The books in the set are:");
		for(String book: booksSet2) {
			System.out.println(book);
		}
		
		
		System.out.println("******************");
		Map<String, Integer> bookCountMap1 = new HashMap<>();
		bookCountMap1.put("HeadFirstJava", 2);
		bookCountMap1.put("CleanCode", 1);
		bookCountMap1.put("DataStructures", 4);
		bookCountMap1.put("HeadFirstJava", 5);
		
		for(String key: bookCountMap1.keySet()) {
			System.out.println("Key: "+key);
			System.out.println("Value: "+bookCountMap1.get(key));
			System.out.println("");
		}
		
		
		System.out.println("******************");
		Map<String, Integer> bookCountMap2 = new LinkedHashMap<>();
		bookCountMap2.put("HeadFirstJava", 2);
		bookCountMap2.put("CleanCode", 1);
		bookCountMap2.put("DataStructures", 4);
		bookCountMap2.put("HeadFirstJava", 5);
		
		//Set<Entry<String, Integer>> entrySet = bookCountMap2.entrySet();
		
		for(Map.Entry<String, Integer> mp: bookCountMap2.entrySet()) {
			System.out.println("Key: "+mp.getKey()+ " , "+"Value: "+mp.getValue());
		}
		
		
		
		
		

	}

}
