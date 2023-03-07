package OOP_Interface;

public class HospitalTest {
	
	//Assignment
	//Impl a College which has 3 interfaces: Us Uni, Uk Uni & Indian Uni
	//All 3 interfaces have a parent interface : WES
	//Super Uni as parent to the college
	//Have 3 such colleges
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FortisHospital fh1 = new FortisHospital();
		
		
		//From USMedical Interface
		System.out.println("USMedical Interface");
		fh1.cardioServices();
		fh1.nueroServices();
		fh1.physioServices();
		
		//From UKMedical Interface
		System.out.println("");
		System.out.println("UKMedical Interface");
		fh1.entServices();
		fh1.dentalServices();
		
		//From IndianMedical Interface
		System.out.println("");
		System.out.println("Indian Medical Interface");
		fh1.oncologyServices();
		fh1.gynaecServices();
		fh1.orthoServices();
		
		//Access the common method
		System.out.println("");
		System.out.println("Common Method");
		fh1.emergencyServices();
		
		//Access individual methods
		System.out.println("");
		System.out.println("Individual Methods");
		fh1.medicalTraining();
		fh1.medicalInsurance();
		
		//Access methods from base class
		//These are inherited methods
		System.out.println("");
		fh1.medicalRD();
		fh1.medicalNews();
		
		//Access Methods from super-parent interface
		System.out.println("");
		fh1.covidVaccination();
		
		//Access Methods from super-parent interface
		System.out.println("");
		fh1.childCareServices();
		
		//Access interface variables
		System.out.println(FortisHospital.minFee);
		System.out.println(USMedical.minFee);
		System.out.println(fh1.minFee);
		
		//Call static implemented methods
		USMedical.taxCalculation();
		FortisHospital.taxCalculation();
		
		//Call the default implemented method from interface
		fh1.getMedicalServices();
		
		//Call the constants
		System.out.println(Constants.DEFAULT_TIME_OUT);
		
		//Cannot create object of interface due to "Cannot instantiate the type USMedical"
		//USMedical us1 = new USMedical();
		
		//Top Casting
		//Child class object can be accessed from parent reference interface variable
		System.out.println("----------------------");
		USMedical us1 = new FortisHospital();
		us1.cardioServices();
		us1.nueroServices();
		us1.physioServices();
		us1.emergencyServices();
		
		System.out.println("----------------------");
		UKMedical uk1 = new FortisHospital();
		uk1.entServices();
		uk1.dentalServices();
		uk1.emergencyServices();
		
		System.out.println("----------------------");
		IndianMedical in1 = new FortisHospital();
		in1.gynaecServices();
		in1.oncologyServices();
		in1.emergencyServices();
		
		//Down Casting
		//This is not allowed due to Cannot instantiate the type USMedical
		//FortisHospital fh2 = new USMedical()
		

	}

}
