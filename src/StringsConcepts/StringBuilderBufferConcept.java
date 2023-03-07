package StringsConcepts;

public class StringBuilderBufferConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MUTABLE
		//String Builder
		StringBuilder sb1 = new StringBuilder("selenium"); 
		//Will be stored in the heap
		//Not created in the string contant pool
		///This is mutable. SCP only stores immutable objects
		sb1.append("testing");
		System.out.println(sb1);
		
		
		//IMMUTABLE
		String s1="cypress";
		s1.concat("testing");
		System.out.println(s1);
		
		
		
		
		
	}

}
