package SeleniumSessions;

public class Testing {
	
	//Get marks of a student
	public int getStudentMarks(String studentName) {
		System.out.println("Get Student Marks for: "+studentName);
		int marks = -1;
		switch (studentName) {
		case "Ravi":
			marks = 100;
			//return 100;
			//break;
			
		case "Rashmi":
			marks = 90;
			//return 90;
			//break;
			
		case "Naveen":
			marks = 50;
			//return 50;
			//break;

		default:
			System.out.println("Student not found: "+studentName);
			//return -1;
		}
		return marks;
	}
	
	
	
	//WAF:
	//Launch a Browser based on the name
	public boolean launchBrowser(String browserName) {
		
		boolean launchFlag = false;
		
		//Force the browser name to lowercase
		//Removing trailing spaces
		browserName = browserName.trim().toLowerCase();
		System.out.println("Launching browser: "+browserName);
		
		switch (browserName) {
		case "chrome":
			System.out.println("Chrome is launched");
			launchFlag = true;
			break;
			
		case "firefox":
			System.out.println("Firefox is launched");
			launchFlag = true;
			break;
			
		case "safari":
			System.out.println("Safari is launched");
			launchFlag = true;
			break;
			
		case "ie":
			System.out.println("IE is launched");
			launchFlag = true;
			break;

		default:
			System.out.println(browserName + " is not found");
			break;
		}
		
		return launchFlag;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testing obj = new Testing();
		int output = obj.getStudentMarks("Ravi");
		System.out.println("Marks: "+output);
		
		output = obj.getStudentMarks("Tom");
		System.out.println("Marks: "+output);
		
		if(obj.launchBrowser("    Chrome  "))
			System.out.println("Launch the Url... ");
		else
			System.out.println("No need to enter the Url...  ");

	}

}
