package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {

	//From USMedical Interface
	@Override
	public void cardioServices() {
		System.out.println("FH - This is cardio services");
	}

	//From USMedical Interface
	@Override
	public void nueroServices() {
		System.out.println("FH - This is nuero services");
	}

	//From USMedical Interface
	@Override
	public void physioServices() {
		System.out.println("FH - This is physio services");
	}

	//From UKMedical Interface
	@Override
	public void entServices() {
		System.out.println("FH - This is ENT services");
		
	}

	//From UKMedical Interface
	@Override
	public void dentalServices() {
		System.out.println("FH - This is dental services");		
	}

	//From Indian Medical Interface
	@Override
	public void oncologyServices() {
		System.out.println("FH - This is oncology services");
	}

	//From Indian Medical Interface
	@Override
	public void gynaecServices() {
		System.out.println("FH - This is gynaec services");
	}

	//From Indian Medical Interface
	@Override
	public void orthoServices() {
		System.out.println("FH - This is ortho services");
	}
	
	//Common Method
	@Override
	public void emergencyServices() {		
		System.out.println("FH - This is EMERGENCY services");
	}
	
	//Individual Methods
	public void medicalTraining() {
		System.out.println("FH - Medical Training");
	}
	
	public void medicalInsurance() {
		System.out.println("FH - Medical Insurance facility");
	}

	//Implemented based on definition in Super Class
	@Override
	public void covidVaccination() {
		System.out.println("FH - Covid Vaccination");
	}

	//Implemented from USHG (Parent of USMedical along with WHO)
	@Override
	public void childCareServices() {
		System.out.println("FH - Child Care Services");
		
	}
	
	//Method Hiding
	public static void taxCalculation() {
		System.out.println("FH Medical -- taxCalculation");
	}

	
	//Overriding default method from interface
	@Override
	public void getMedicalServices() {
		System.out.println("FH -- Getting Medical Services");
	}

	
	

}
