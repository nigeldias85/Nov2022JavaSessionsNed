package OOP_AbstractClasses;

public abstract class Page implements Web {
	
	//Abstracts Classes
	//0% Abstraction - No Abstract methods
	//x% abstraction - partial abstraction
	//100% Abstraction - All Abstract methods
	
	//Diff between Interface and Abstract Classes
	//With Interface we have 100% abstraction whereas with Abstract Classes, we can have 0% to 100% abstraction
	//With Interface no constructors are allowed whereas with Abstract Classes constructors are allowed.
	
	//Cannot create object of Abstract classes
	//BUT we can create constructor of abstract classes
	//And it will be when the object of childclass is created. For eg: LoginPage lp1 = new LoginPage();
	public Page() {
		System.out.println("Page ----- Constructor");
	}
	
	public Page(int i) {
		System.out.println("Page ----- Constructor "+i);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public final void displayLogo() {
		System.out.println("Page ---- logo");
	}
	
	public void pageLoadingTime() {
		System.out.println("Page loading time is 10 seconds");
	}
	
	public static void pageCycle() {
		System.out.println("Page ----- Page Cycle");
	}

	@Override
	public void privacyPolicy() {
		System.out.println("Page --- This is privacy policy from Web Interface(GrandParent)");
	}

}
