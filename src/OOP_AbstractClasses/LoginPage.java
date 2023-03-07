package OOP_AbstractClasses;

public class LoginPage extends Page {
	
	
	public LoginPage() {
		System.out.println("LP -- Constructor");
	}
	
	public LoginPage(int i) {
		System.out.println("LP -- Constructor "+i);
	}
	
	
	@Override
	public void title() {
		System.out.println("LP -- Title of the page");
	}

	@Override
	public void url() {
		System.out.println("LP -- URL of the page");
	}
	
	public void resetPwd() {
		System.out.println("LP - Reset the password");
	}
	
	@Override
	public void pageLoadingTime() {
		System.out.println("Page loading time is 5 seconds");
	}
	
	public static void pageCycle() {
		System.out.println("LP ----- Login Page Cycle");
	}

	@Override
	public void privacyPolicy() {
		System.out.println("LP --- This is privacy policy from Web Interface(GrandParent)");
	}
	
}
