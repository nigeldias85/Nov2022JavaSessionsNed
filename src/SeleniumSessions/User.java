package SeleniumSessions;

public class User {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User();
		u1.name="Ravi";
		u1.age=25;
		u1.city="B'lore";
		
		User u2 = new User();
		u2.name="Ravi";
		u2.age=25;
		u2.city="B'lore";
		
		User u3 = new User();
		u3.name="Ravi";
		u3.age=25;
		u3.city="B'lore";
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		
		

	}

}
