package OOP_Constructor;

public class Car {
	
	String name;
	String color;
	int price;
	boolean isElectric;
	
	

	/**
	 * @param name
	 * @param color
	 * @param price
	 * @param isElectric
	 */
	public Car(String name, String color, int price, boolean isElectric) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.isElectric = isElectric;
	}


	/**
	 * @param name
	 * @param price
	 */
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}


	/**
	 * @param name
	 * @param price
	 * @param isElectric
	 */
	public Car(String name, int price, boolean isElectric) {
		this.name = name;
		this.price = price;
		this.isElectric = isElectric;
	}
	
	

}
