package OOP_Constructor;

public class User {
	
	String name;
	int age;
	String email;
	String pwd;
	String phNumber;
	
	//Default constructor called by jvm
	public User(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public User(String name, int age, String email, String pwd, String phNumber) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.pwd = pwd;
		this.phNumber = phNumber;
	}



	public void print(User userObj) {
		System.out.println("Name: "+userObj.name);
		System.out.println("Age: "+userObj.age);
		System.out.println("Email: "+userObj.email);
		System.out.println("Password: "+userObj.pwd);
		System.out.println("PhoneNumber: "+userObj.phNumber);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User("Tom", 30, "tom@dummy.com", "welcome@1", "+1(213) 345-5678");
		u1.print(u1);
		
		User u2 = new User("Lisa", 32, "lisa@gmail.com", null, "+1(456) 777-5003");
		u2.print(u2);
		
		User u3 = new User("Matt", 25);
		u3.print(u3);
		

	}

}
