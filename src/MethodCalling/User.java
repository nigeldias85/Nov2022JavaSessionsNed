package MethodCalling;

public class User {
	
	//Usages of this
	//Constructor
	//Methods
	//builder pattern
	//One constructor calling another constructor
	//Can be used in a method to call another method
	
	String name;
	int age;
	String city;
	
	
	/**
	 * @param name
	 * @param age
	 * @param city
	 */
	public User(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	/**
	 * @param name
	 * @param age
	 */
	public User(String name, int age) {
		this(name, age, "Bangalore");
		this.name = "Tom";
		this.age = 35;
	}
	
	
	public static void main(String[] args) {
		User u1 = new User("Gaurav", 30);
		
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);
	}
	

}
