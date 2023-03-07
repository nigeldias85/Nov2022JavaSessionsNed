package OOP_AbstractClasses;

public class LoginPageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp1 = new LoginPage(10);
		
		lp1.title();
		lp1.url();
		lp1.displayLogo();
		lp1.pageLoadingTime();
		lp1.resetPwd();
		lp1.privacyPolicy();
		
		
		Page.pageCycle();
		LoginPage.pageCycle();

		//Cannot create object of abstract class
		//Page pg1 = new Page();
		
		//Top Casting
		//Child class object referred by abstract parent class variable
		System.out.println("-----------------");
		Page pg1 = new LoginPage();
		pg1.title();
		pg1.url();
		pg1.displayLogo();
		pg1.pageLoadingTime();
		pg1.privacyPolicy();
		
		//Down Casting - NA (Since creating objects of abstract classes is not allowed)
		
		//IMPORTANT
		//Top Casting can be achieved through
		//Abstract Parent Class variable
		//Normal Class
		//Interface
		
	}

}
