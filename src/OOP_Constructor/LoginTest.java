package OOP_Constructor;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp1 = new LoginPage("admin@gmail.com", "admin123");
		if(lp1.doLogin())
			System.out.println("Display the menu items");
		
		LoginPage lp2 = new LoginPage("tom@gmail.com", "tom123");
		System.out.println(lp2.userName);
		System.out.println(lp2.password);
	}

}
