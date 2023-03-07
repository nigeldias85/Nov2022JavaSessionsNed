package SeleniumSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "ie";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome launched");
			break;
			
		case "firefox":
			System.out.println("firefox launched");
			break;
			
		case "safari":
			System.out.println("safari launched");
			break;
			
		case "edge":
			System.out.println("edge launched");
			break;
			
		default:
			System.out.println("invalid browser");
			break;
//		case "naveen":
//			System.out.println("naveen launched");
//			break;	
		}
		
		int marks = 90;
		switch (marks) {
		case 90:
			System.out.println("A Grade");
			break;
			
		case 80:
			System.out.println("B Grade");
			break;
			
		case 70:
			System.out.println("C Grade");
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		
		char ch = 'e';
		switch (ch) {
		case 'a':
			System.out.println("Vowel");
			break;
			
		case 'e':
			System.out.println("Vowel");
			break;
			
		case 'i':
			System.out.println("Vowel");
			break;
			
		case 'o':
			System.out.println("Vowel");
			break;
			
		case 'u':
			System.out.println("Vowel");
			break;

		default:
			System.out.println("Not a vowel");
			break;
		}

	}

}
