package OOP_Interface;

public class Hospital {
	
	public void medicalRD() {
		System.out.println("Hospital - Medical R & D");
	}
	
	//Made as final to prevent child class(FortisHospital) from overriding this
	public final void medicalNews() {
		System.out.println("Hospital - Medical Journal & News");
	}

}
