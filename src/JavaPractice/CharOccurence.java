package JavaPractice;

public class CharOccurence {
	
	public static int getCharOccurence(String input, char ch) {
		
		int len = input.length();
		int startIndex =0;
		int count=0;
		//char c = 'a';
		while(true) {
			
			//Termination
			if(startIndex == len) {
				break;
			}
			
			
			if(input.charAt(startIndex) == ch) {
				count++;
			}
			startIndex++;
		}
		
		
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = getCharOccurence("malayalam", 'a');
		System.out.println(count);
	}

}
