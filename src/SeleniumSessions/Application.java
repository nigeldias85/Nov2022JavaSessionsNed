package SeleniumSessions;

public class Application {
	
	//What is Method overloading
	//Within the same class
	//1. With the same name
	//2. With different number of parameters and with different type
	//3. With different sequence of parameters
	//4. Return type doesn't matter
	
	//Poly(Many) + Morphism(Forms)
	//Method Overloading - Compile time(static) polymorphism
	
	public void test() {
		System.out.println("test() method with 0 parameters");
	}
	
	public void test(int i) {
		System.out.println("test() with 1 param: "+i);
	}
	
	public void test(String s) {
		
	}
	
	public void test(int i, int j) {
		
	}
	
	public void test(int i, String s) {
		
	}
	
	public void test(String s, int j) {
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application obj = new Application();
		obj.test();
		obj.test(10);
				
		
	}

}
