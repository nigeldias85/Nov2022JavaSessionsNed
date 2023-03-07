package SeleniumSessions;

public class NestedLoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Print 00 01 02 03 04 05
		//Print 10
		//Print 20
		//Print 30
		//Print 40
		//Print 50 51 52 53 54 55
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				if(i==j)
				System.out.print(i+""+j+" "); //Print only diagonal elements
				else
				System.out.print("**"+" ");	
			}
			System.out.println("");
		}
		
		System.out.println("/*********************************/");
		//Print 000 001 002 003 004 005
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				for(int k=0; k<=5; k++) {
					System.out.print(i+""+j+""+k+" ");
				}
				System.out.println("");
			}
			//System.out.println("");
		}

	}

}
