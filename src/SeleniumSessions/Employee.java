package SeleniumSessions;

public class Employee {
	
	//Declare Variables
	String name;
	int age;
	String city;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.setName("Tom");
		emp1.setAge(30);
		emp1.setCity("LA");
		emp1.setSalary(50.55);
		System.out.println("Name: "+emp1.getName()+" , Age: "+emp1.getAge()+", City: "+emp1.getCity()+" , Salary:  "+emp1.getSalary());;
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
