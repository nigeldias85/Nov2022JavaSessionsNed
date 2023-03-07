package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b1 = new BMW();
		b1.start(); //Over-ridden method
		b1.refuel(); //Inherited method
		b1.stop(); //Inherited method
		b1.autoParking(); //Individual method
		BMW.billing();
		BMW.display();
		b1.running();
		b1.payment("naveen@hdfcbank");
		b1.engine();
		
		
		System.out.println("------------------");
		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		Car.billing();
		c1.payment("1234 5678 9089 1233", "452");
		c1.engine();
		
		
		System.out.println("------------------");
		//Child class object can be referenced by parent class variable
		//Top/Up Casting
		Car c2 = new BMW();
		c2.start();
		c2.stop();
		c2.refuel();
		
		//Down Casting
		//Parent class object can be referenced by child class variable
		//BMW b2 = (BMW) new Car(); //Class Cast exception at run-time
		
		System.out.println("------------------");
		Audi au1 = new Audi();
		au1.start();
		au1.engine();
		au1.theftSafety();
		au1.stop();
		
		//Child class object can be referenced by grand parent reference variable
		System.out.println("------------------");
		Vehicle v1 = new BMW();
		v1.engine();
		v1.petrolEngine();
		
		//Down Casting
		//Parent class object can be referenced by child class variable
		//BMW b3 = (BMW) new Vehicle(); //Class Cast exception at run-time
		
		
		
		
		
		

	}

}
