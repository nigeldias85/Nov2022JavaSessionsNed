package OOP_Constructor;

public class CarTest {
	
	public void print(Car carObj) {
		System.out.println("-------------------");
		System.out.println("Name: "+carObj.name);
		System.out.println("Price: "+carObj.price);
		System.out.println("Color: "+carObj.color);
		System.out.println("isElectric: "+carObj.isElectric);
		System.out.println("-------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car("HondaCity", 100000);
		CarTest ct = new CarTest();
		ct.print(c1);
		
		Car c2 = new Car("Tesla", 50000, true);
		ct.print(c2);
		
		Car c3 = new Car("HyundaiCreta", "white", 750000, false);
		ct.print(c3);
		

	}

}
