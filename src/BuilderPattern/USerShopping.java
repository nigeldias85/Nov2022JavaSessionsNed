package BuilderPattern;

public class USerShopping {
	
	public static void main(String[] args) {
		
		EcommApplication app1 = new EcommApplication();
		
		app1.login("Tom", "welcome@123")
		.doSearch("iPhone", "500 USD")
		.addToCart("iPhone")
		.doPayment("3456 7897 7654 1223", "467")
		.generateOrder()
		.logout();
		
		System.out.println("----------");
		app1.login("Naveen", "welcome@123")
		.doSearch("Nike Shoes").addToCart("Air Jordan").logout();
		
		System.out.println("----------");
		app1.login("Naveen", "welcome@123").addToCart("Nike Shoes")
		.doPayment("naveen@hdfcbank").generateOrder().logout();
		
	}

}
