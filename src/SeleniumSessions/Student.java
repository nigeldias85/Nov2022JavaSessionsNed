package SeleniumSessions;

public class Student {
	
	public int getStudentMarks(String studentName) {
		System.out.println("Get Student Marks");
		if(studentName.equals("Neha")) {
			return 100;
		}
		else if(studentName.equals("Tom")) {
			return 90;
		}
		else if(studentName.equals("Somesh")) {
			return 80;
		}
		else {
			System.out.println("Student not found.");
			return -1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		int result = st.getStudentMarks("Tom");
		System.out.println("Output: "+result);
		result = st.getStudentMarks("Nigel");
		if(result == -1)
			System.out.println("No marks sheet available");

	}

}
