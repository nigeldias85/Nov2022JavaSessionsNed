package MethodCalling;

public class Employee {
	
	String name;
	int age;
	
	public int add(int a, int b) {
		System.out.println("Sum of two numbers "+a+" and "+b);
		return (a+b);
	}
	
	public void getInfo(Employee emp) {
		System.out.println("Calling get info");
		emp.name = "Tom";
		emp.age = 30;
		System.out.println(emp.name + " " + emp.age );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		//e1.add(10, 20);
		//e1.getInfo(e1);
		//System.out.println(e1.name + " " + e1.age );
		
		e1.name = "Gaurav";
		e1.age = 35;
		System.out.println(e1.name + " " + e1.age );
		e1.getInfo(e1);
		

	}

}
