package ExceptionHandling;

public class Student {
	
	public static int getMarks(String studentName) {
		
		System.out.println("Getting marks for: "+studentName);
		if(studentName.equals("Rashmi")) {
			try {
				int i = 9/0;	
			}
			catch (Exception e) {
				System.out.println("AE is being thrown");
				//e.printStackTrace();
				return 85;
			}
			finally {
				System.out.println("Printing Marks Sheet");
				//return 70;
			}
			
			return 90;
		}
		
		else if(studentName.equals("Tom")) {
			return 80;
		}
		
		else if(studentName.equals("Ravi")) {
			return 75;
		}
		
		else {
			System.out.println("Student not found");
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1 = Student.getMarks("Rashmi");
		System.out.println("Marks: "+m1);
		System.out.println("Bye");
	}

}
