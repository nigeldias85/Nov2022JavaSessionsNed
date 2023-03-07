package StringsConcepts;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "selenium"; 
		//Stored in the String Constant Pool(SCP) in the heap
		//str1 reference is stored in the stack
		String str2 = "selenium";
		System.out.println(str1 == str2); //Comparison on references
		System.out.println(str1.equals(str2));
		
		//Create a string with a new keyword
		String str3 = new String("testing"); //2 objects created= object in heap + "testing" in SCP
		//Creates a new object in the heap : new String("testing") and referred by ref variable
		//Creates a new entry in the String Constant Pool, which is referred by no one
		//The reference of str3 is stored in the stack
		String str4 = new String("testing"); //1 object created in heap
		String str5 = "testing";
		String str6 = "testing";
		System.out.println("----------------");
		System.out.println(str5 == str6); //Returns true | Comparison on references
		System.out.println(str3 == str4); //Returns false | Comparison on objects
		System.out.println(str3.equals(str4)); //Returns true | Comparison on values
		
		System.out.println("----------------");
		System.out.println(str3 == str5);
		System.out.println(str3.equals(str5));

	}

}
