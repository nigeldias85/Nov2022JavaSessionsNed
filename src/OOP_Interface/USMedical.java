package OOP_Interface;

public interface USMedical extends WHO, USHG {
	
	//Interface variable are always final and static be default
	int minFee  = 10;
	
	//Rules for interface
	//1.Only declare method prototype or declaration.
	//2.Method body not allowed - Abstract methods
	//3.Cannot create object of interface
	//4.Cannot have constructor of interface
	
	//Abstract Method
	//1.Cannot be final , since overriding is prevented and as a result classes cannot implement this
	//2.Cannot be static
	//3.Cannot be private
	
	//JDK 1.7 has 100% abstraction
	//JDK 1.8 has almost 100% abstraction , BUT default non-static methods allowed
	//Also 0% abstraction is allowed
	
	//Declare a method
	public void cardioServices();
	
	public void nueroServices();
	
	public void physioServices();
	
	public void emergencyServices();
	
	@Override
	public void covidVaccination();
	
	//After JDK 1.8
	//1.Static method can have method body unlike non-static
	//This method cannot be final
	
	public static void taxCalculation() {
		System.out.println("US Medical -- taxCalculation");
	}
	
	//2.Default Methods -> These non-static
	default void getMedicalServices() {
		System.out.println("US Medical -- Getting Medical Services");
	}
	

}
