package BuilderPattern;

import java.util.Random;

public class EcommApplication {

	public EcommApplication login() {
		System.out.println("Login to Application");
		return this;
	}
	
	public EcommApplication login(String un, String pwd) {
		System.out.println("Login to Application with: "+un+" and "+pwd);
		return this;
	}
	
	public EcommApplication doSearch(String productName) {
		System.out.println("Seraching for "+productName);
		return this;
	}
	
	public EcommApplication doSearch(String productName, String price) {
		System.out.println("Searching for "+productName+" having price "+price);
		return this;
	}
	
	public EcommApplication doSearch(String productName, String price, String brandName) {
		System.out.println("Searching for "+productName+" having price "+price);
		return this;
	}
	
	public EcommApplication addToCart(String productName) {
		System.out.println("Adding to cart "+productName);
		return this;
		
	}
	
	public EcommApplication doPayment(String cc, String cvv) {
		System.out.println("Performing payment with credit card: "+cc);
		return this;
	}
	
	public EcommApplication doPayment(String upi) {
		System.out.println("Performing payment with upi: "+upi);
		return this;
	}
	
	public EcommApplication generateOrder() {
		Random rnd = new Random();
		System.out.println("Generating order for "+rnd.nextInt());
		return this;
	}
	
	public EcommApplication logout() {
		System.out.println("Logging out from application");
		return this;
	}

}
