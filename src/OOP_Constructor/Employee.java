package OOP_Constructor;

public class Employee {
	
	//Constructor - Looks like a function is not a function
	//Has same name as class name
	//Does not have a return type
	//Helps to control object creation
	//Will be called, when we create a object
	
	public Employee() {
		System.out.println("This is defaul constructor for employee");
	}
	
	public Employee(int a) {
		System.out.println("This is a 1 param constructor: "+a);
	}
	
	public Employee(int a, int b) {
		System.out.println("This is a 1 param constructor: "+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		Employee e2 = new Employee(10);
		Employee e3 = new Employee(10, 20);
	}

}
