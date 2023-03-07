package OOP_Encapsulation;

public class Application {
	String name;
	public void m1() {
		//Call static method from non-static
		t2();
		System.out.println("m1() method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2() method");
		m3();
	}

	public void m3() {
		System.out.println("m3() method");
		
	}
	
	public static void t1() {
		//Calling non-static from a static method
		Application a1 = new Application();
		a1.m1();
		
		System.out.println("t1() method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2() method");
		t3();
	}

	public static void t3() {
		System.out.println("t3() method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app = new Application();
		app.m1();
		//Application.t1();

	}

}
