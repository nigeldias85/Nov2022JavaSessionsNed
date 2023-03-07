package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee();
		e1.name = "tom";
		e1.age = 25;
		e1.setSalary(150.55);
		System.out.println(e1.getSalary()+ " " +e1.name + " " + e1.age);
		
		//Company c1 = new Company();
		//c1.setName("IBM");
		//c1.setEmpCount(100);
		//c1.setSharePrice(555);
		
		Company c1 = new Company("IBM", 100, 555);
		c1.setName("ORACLE");
		System.out.println(c1.getName());
		System.out.println(c1.getEmpCount());
		System.out.println(c1.getSharePrice());
		
		Company c2 = new Company("SAP", 500, 135);
		System.out.println(c2.getName());
		System.out.println(c2.getEmpCount());
		System.out.println(c2.getSharePrice());
		
		
		RegisterPage r1 = new RegisterPage("TOM", 30, "Bangalore 560078", "15-NOV-1950");
		System.out.println("Name: "+r1.getName());
		System.out.println("DOB: "+r1.getDob());
		System.out.println("Address: "+r1.getAddress());
		r1.setAddress("Bombay 450067");
		System.out.println("Name: "+r1.getName());
		System.out.println("Address: "+r1.getAddress());
		
		Browser br1 = new Browser();
		br1.launchBrowser();
	}

}
