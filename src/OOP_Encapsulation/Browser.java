package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		checkRam();
		checkVersion();
		System.out.println("Launch Browser");
	}
	
	private void checkRam() {
		System.out.println("Check RAM");
	}
	
	private void checkVersion() {
		System.out.println("Check Version");
	}

}
