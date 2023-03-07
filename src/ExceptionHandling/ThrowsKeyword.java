package ExceptionHandling;

public class ThrowsKeyword {
	
	//throws keyword
	//This is used to pass the exception from one method to another
	
	public void m1(){
		System.out.println("M1 method");
		m2();
	}
	public void m2(){
		System.out.println("M2 method");
		try {
			m3();
			//System.out.println("Nigel"); //Will not be printed as control moves to catch
		}
		catch (ArithmeticException e) {
			System.out.println("AE is being thrown");
			e.printStackTrace();
		}
		
	}
	
	public void m3() throws ArithmeticException{
		System.out.println("M3 method");
		int a =9;
		int b = 0;
		int c = a/b;
	}

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		
		ThrowsKeyword th1 = new ThrowsKeyword();
		th1.m1();
		System.out.println("Bye");

	}

}
