package OOP_Inheritance;

public class BMW extends Car {
	
	//Method over-riding: Polymorphism -> RunTime/Dynamic 
	//When we have  a method in the parent class and the same method in the child class
	//with the following conditions:
	//1.With same method name
	//2.With same number and sequence of parameters
	//3.With same return type
	
	@Override
	public void start() {
		super.start();
		System.out.println("BMW -- Starting....");
	}
	
	
	public void autoParking() {
		System.out.println("Auto parking the BMW");
	}
	
	//Method Hiding
//	public static void billing() {
//		System.out.println("BMW ---- Billing");
//	}
	
	@Override
	public void payment(String cc, String cvv) {
		System.out.println("Paying using credit card: "+cc+ " and "+cvv);
	}
	
	
	@Override
	public void payment(String upi) {
		System.out.println("Paying using UPI: "+upi);
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- Engine Method");
	}
}
