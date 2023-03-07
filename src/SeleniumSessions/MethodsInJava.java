package SeleniumSessions;

public class MethodsInJava {
	
	//Function1: no input & no return
	public void test() {
		System.out.println("This is a test method");
	}
	
	//Funciton2: no input and return
	public int getBillAmount() {
		System.out.println("Get Billing Amount");
		int foodBill = 100;
		int drinksBill = 50;
		int totalBill = foodBill + drinksBill;
		return totalBill;
	}
	
	//Funciton3: input and return
		public int getBillAmount(int foodBill, int drinksBill) {
			System.out.println("Get Billing Amount");
			int totalBill = foodBill + drinksBill;
			return totalBill;
		}
		
	//Function 4 : Multiply int * double
		public double getMultiplication(int x, double y) {
			System.out.println("Multiply "+x+" and "+y);
			return x * y;
		}
		
	//Function 5 : get emp salary
		public String getEmpSalary(String empName, int bonusAmt) {
			System.out.println("Employee Salary....");
			return empName + bonusAmt;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsInJava mij = new MethodsInJava();
		mij.test();
		
		int totalAmt1 = mij.getBillAmount();
		System.out.println(totalAmt1);
		
		int totalAmt2 = mij.getBillAmount(450,  250);
		System.out.println(totalAmt2);
		
		double result = mij.getMultiplication(10,  25.65);
		System.out.println(result);
		
		System.out.println(mij.getEmpSalary("Amit", 1000));

	}

}
