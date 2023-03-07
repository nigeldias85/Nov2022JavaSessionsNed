package SeleniumSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		int j = 20;
		System.out.println(i==j);
		int k=10;
		System.out.println(i==k);
		
		if(i==j) {
			System.out.println("THEY ARE EQUAL");
		}
		else {
			System.out.println("THEY ARE UNEQUAL");
		}
		
		if(j>=i)
			System.out.println("j is GREATER than i");
		else
			System.out.println("j is LESS than i");
		
		int total = 100;
		if(total != 100)
			System.out.println("Bye");
		else 
			System.out.println("Hi");
		
		
		int marks = 101;
		if(marks <= 100) {
			if(marks >= 90)
				System.out.println("A GRADE");
				if(marks >= 95) {
					System.out.println("SCHOLARSHIP");
					if(marks == 100)
						System.out.println("FEE WAIVER");
				}
			else {
				if(marks <= 80)
					System.out.println("B GRADE");
			}
		}
		else
			System.out.println("Invalid Marks");
		
		
		String browser = "ie";
		if(browser.equals("chrome")) 
			System.out.println("CHROME LAUNCED");
		else if(browser.equals("firefox"))
			System.out.println("FF LAUNCED");
		else if(browser.equals("safari"))
			System.out.println("SAFARI LAUNCED");
		else if(browser.equals("edge"))
			System.out.println("EDGE LAUNCED");
		else
			System.out.println("INVALID BROWSER");
	
	}

}
