package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Store the objects as Key,Value pair: <k, v>
		//Does not maintain the order
		//After declaration, java initializes 15 virtual segments for the map
		//Internal logic for map.put(key, value);
		//Create a hashcode for key i.e.  h= hashcode(key);
		//index = mod(h); -> This will be equal to one index on the internal 15 internal virtual segments
		//For eg: index = 3;
		//HashCode can be same for multiple keys
		//A "COllISION" is said to happened when
		//java calculates the same hashcode for multiple keys
		//Java creates a parallel virtual segment or node , which is linked to a existing segment
		//For the same index, two nodes are present linked to each other i.e. Node1 --> Node2
		//Prior to Java 1.8, all the keys sharing the same hashcode were linked
		//N1 -> N2 -> N3 .......... [This has a complexity of O(n) ]
		//As a workaround, Java1.8 onwards, a threshold was introduced with default value of 8
		//During the map.get(key) call, on reaching the threshold during traversal, 
		//the list of nodes(LinkedList) was converted to BT(Binary Tree)
		//Once the alloted 15 virtual segments are filled up, the load factor = 15/2 i.e. 7
		
		
		
		
		//Internaly Stored as
		// __________ __ __
		//|          |  |  |
		//|<hashcode>|K_|V_|
		//Create a new HashMap
		
		
		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("Naveen", "SDET");
		empMap.put("Amrita", "SDET1");
		empMap.put("Rashmi", "SDET2");
		empMap.put("Ravi", "SDET MANAGER");
		empMap.put("Karim", "VP");
		empMap.put("Karim", "CEO");
		empMap.put("Sheela", null);
		empMap.put(null, "CTO");
		empMap.put(null, null);
		
		//USage of Get
		String role = empMap.get("Amrita");
		System.out.println("Role: "+role);
		role = empMap.get("Karim");
		System.out.println("Role: "+role);
		String getRoleForEmpNotPresent = empMap.get("Nigel");
		System.out.println("Role: "+getRoleForEmpNotPresent);
		
		role = empMap.get("Sheela");
		System.out.println("Role: "+role);
		role = empMap.get(null);
		System.out.println("Role: "+role);
		System.out.println(empMap);
		
		HashMap<String, Integer> browserMap = new HashMap<String, Integer>();
		browserMap.put("chrome", 100);
		browserMap.put("safari", 90);
		browserMap.put("ie", 7);
		browserMap.put("firefox", 155);
		System.out.println(browserMap);

	}

}
