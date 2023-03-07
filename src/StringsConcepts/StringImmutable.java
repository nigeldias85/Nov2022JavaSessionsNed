package StringsConcepts;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "selenium";
		s="cypress"; //At this stage both "selenium" and "cypress" exists in the scp
		//The reference of s changes from "selenium"  to "cypress"
		
		String t = "selenium"; //At this stage new entry is not created in the SCP
		//Instead , the reference t is pointing to existing entry in scp i.e. "selenium";
		
		System.out.println(s+"automation");
		System.out.println(s);
		
		System.out.println("------------");
		String p = "naveen";
		p = p + " automation labs"; //The reference p is no longer pointing to "naveen"
		System.out.println(p); //Instead it is pointing to "naveen automation labs"
		String q="naveen"; //The reference q is now pointing to "naveen"
		System.out.println(q);

	}

}
