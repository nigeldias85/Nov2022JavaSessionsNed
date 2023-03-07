package SeleniumSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Print 1 to 10 
		//While loop
		
//		int i =1;
//		while(i<10) {
//			System.out.println("i Value: "+ i);
//			//i++;
//			//++i;
//			i = i + 1;
//		}
		
//		byte j = -127;
//		while(j <=126) {
//			System.out.println("byte range: "+j);
//			j++;
//		}
		
		int p = 2;
		while(p <=100) {
			System.out.println(p);
			p = p +2;
		}
		
		
		System.out.println("-----------------------------------");
		int num = 1;
		while(num<=100){
			System.out.println(num);
			if(num % 5  == 0) {
				System.out.println("Hi..");
				break;
			}
			num++;
		}
		
		System.out.println("-----------------------------------");
		int n = 1;
		while(n<=5) {
			System.out.println("Hello: = "+ n);
			++n;
		}
		
		
		System.out.println("-----------------------------------");
		int counter = 100;
		while(counter >= 100) {
			System.out.println(counter);
			if(counter  == 200) {
				System.out.println("Bye");
				break;
			}
			counter++;
		}
		
		System.out.println("-----------------------------------");
		int score = 0;
		while(score <= 100) {
			
			switch (score) {
			case 25:
				System.out.println(score + " , Score is 25.... ");
				break;
				
			case 50:
				System.out.println(score + " , Half Century.... ");
				break;
				
			case 100:
				System.out.println(score + " , Century.... ");
				break;

			default:
				System.out.println(score);
				break;
			}
			
			score++;
		
		}

	}

}
