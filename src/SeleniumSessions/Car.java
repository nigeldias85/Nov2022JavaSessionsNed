package SeleniumSessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels=4;
	
	public static void speedTest() {
		System.out.println("Car --- SpeedTest");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		c1.name = "Swift";
		c1.price = 10;
		c1.color = "Blue";
		//c1.wheels = 4;
		
		Car c2 = new Car();
		c2.name = "i20";
		c2.price = 15;
		c2.color = "Red";
		//c2.wheels = 4;
		
		Car c3 = new Car();
		c3.name = "City";
		c3.price = 20;
		c3.color = "Black";
		//c3.wheels = 4;
		
		//How to access static variables
		//1.Direct Calling
		System.out.println("Wheels: "+wheels);
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+wheels);
		
		
		//2. By using class name
		System.out.println(c2.name+" "+c2.price+" "+c2.color+" "+Car.wheels);
		
		//1. Direct Calling static method
		speedTest();
		
		//2. By using class name
		Car.speedTest();
		
		//Static is used to have one copy across references
		//Final is used from preventing , change to the value

	}

}
