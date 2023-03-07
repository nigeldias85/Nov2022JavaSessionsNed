package OOP_Constructor;

public class LoginPage {
	
	String userName;
	String password;
	
	
	/**
	 * @param userName
	 * @param password
	 */
	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	public boolean doLogin() {
		System.out.println("Enter username: "+userName);
		System.out.println("Enter password: "+password);
		System.out.println("Click on the login button");
		System.out.println("User is logged in");
		return true;
	}
	

}
