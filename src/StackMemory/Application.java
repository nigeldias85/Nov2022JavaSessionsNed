package StackMemory;

public class Application {
	
	public void m1() {
		System.out.println("M1 Method");
		m2();
	}
	
	public void m2() {
		System.out.println("M2 Method");
		m3();
	}
	
	public void m3() {
		System.out.println("M3 Method");
		//m1();  Causes a stackoverflow error
	}
	
	public static void t1() {
		System.out.println("Static Method : t1");
		t2();
	}
	
	public static void t2() {
		System.out.println("Static Method : t2");
		t3();
	}
	
	public static void t3() {
		System.out.println("Static Method : t3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application app1 = new Application();
		app1.m1();
		
		Application.t1();

	}

}
