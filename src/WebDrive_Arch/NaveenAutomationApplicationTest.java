package WebDrive_Arch;

public class NaveenAutomationApplicationTest {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		//Cross browser logic
		String browser = "edge";
		if(browser.equals("chrome"))
			driver = new ChromeDriver();
		else if(browser.equals("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equals("safari"))
			driver = new SafariDriver();
		else 
			System.out.println("Please give the right browser name.");
			
		
		if(driver != null) {
			driver.get("www.amazon.com");
			String actualTitle = driver.getTitle();
			System.out.println("Page Title: "+actualTitle);
			if(actualTitle.equals("NAL"))
				System.out.println("Title is CORRECT");
			else
				System.out.println("Title is INCORRECT");
			
			driver.sendKeys("emailId", "naveen@gmail.com");
			driver.sendKeys("password", "naveen@123");
			driver.click("loginBtn");
			driver.close();
		}
		
	}

}
