package OOP_Inheritance;

public class Car extends Vehicle{
	
	//final
	//1. Used in declaring constants
	//2. To prevent method overriding & method hiding
	//3. To prevent inheritance
	
	public void start() {
		System.out.println("Starting the car");
	}
	
	public void stop() {
		System.out.println("Stopping the car");
	}
	
	
	public void refuel() {
		System.out.println("Refueling the car");
	}
	
	public static void billing() {
		System.out.println("Car ---- Billing");
	}
	
	public static final void display() {
		System.out.println("Car ---- display");
	}
	
	
	public final void running() {
		System.out.println("Car --- running");
	}
	
	public void payment(String cc, String cvv) {
		System.out.println("Paying using credit card: "+cc+ " and "+cvv);
	}
	
	
	public void payment(String upi) {
		System.out.println("Paying using UPI: "+upi);
	}
	
	@Override
	public void engine() {
		System.out.println("Car -- Engine Method");
	}
	

}
