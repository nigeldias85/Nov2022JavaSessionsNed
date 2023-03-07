package SeleniumSessions;

public class DoWhileLoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p=1;
		do {
			System.out.println(p);
			/*if(p==10) {
				break;
			}*/
			if(p % 5 == 0) {
				System.out.println("Hi");
			}
			p++;
		} while (p<=50);
		
	}

}
