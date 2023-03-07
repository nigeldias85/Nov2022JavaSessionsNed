package StringsConcepts;

import java.util.Arrays;

public class StringReverse {
	
	public static String getReversedString(String input) {
		
		
		int len = input.length();
		if(len==1) {
			return input;
		}
		StringBuilder sb = new StringBuilder();
		
		for(int i=len-1; i>=0 ; i--) {
			sb.append(input.charAt(i));
		}
		//System.out.println(sb.toString());
		
		if(sb.toString() !=null)
			return sb.toString();
		
		return null;
	}
	
	public static String getReversedString(char[] input, int start, int end) {
		
		while(start < end) {
			char temp = input[start];
			input[start] = input[end];
			input[end] = temp;
			
			start++;
			end--;
		}
		
		return String.valueOf(input);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String rev = getReversedString("legin");
		System.out.println("Rev: "+rev);
		
		int i = 123;
		rev = getReversedString(String.valueOf(i));
		System.out.println("Rev: "+Integer.parseInt(rev));
		
		String input = null;
		if(input != null) {
			if(input.length()==1) {
				System.out.println("Rev: "+input);
			}
			else {
					rev = getReversedString(input.toCharArray(), 0, input.length()-1);
					System.out.println("Rev: "+rev);
			}
		}
		else {
			System.out.println("String is null");
		}
		
		

	}

}
