package WebDrive_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("Safari is launched...");
	}
	
	@Override
	public void findElement(String element) {
		System.out.println("Find element: "+element);
		
	}

	@Override
	public void get(String url) {
		System.out.println("Enter the URL: "+url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Get the page title");
		return "NAL";
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		System.out.println("Clicking on element: "+element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Entering the value: "+value+" into element "+element);
	}

	@Override
	public void close() {
		System.out.println("Closing the browser.");
	}

}
