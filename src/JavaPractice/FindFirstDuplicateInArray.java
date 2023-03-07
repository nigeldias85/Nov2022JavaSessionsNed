package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class FindFirstDuplicateInArray {
	
	
	public static boolean findFirstDuplicate(int[] input) {
	
		Set<Integer> st = new HashSet<>();
		//Get length
		int len = input.length;
		for(int i=0; i<len ; i++) {
			if(!st.add(input[i])) {
				System.out.println("First Duplicate is: "+input[i]+" located at index: "+i);
				break;
			}
		}
		return false;
		
	}
	
	public static int findFirstDuplicateOptimum(int[] input) {
		
		//Get length
		int len = input.length;
				
				
		for(int i=0;i<len;i++) {
			int index = Math.abs(input[i])-1;
			if(input[index] < 0) {
				return Math.abs(input[i]);
			}
			else {
				int value = Math.abs(input[index]);
				input[index] = -(value);
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = new int[] {1,2,1,2,3,3};
		findFirstDuplicate(input1);
		
		int[] input2 = new int[] {2,1,3,5,3,2};
		findFirstDuplicate(input2);
		
		int[] input3 = new int[] {1,2,3,4,5,6};
		if(!findFirstDuplicate(input3))
			System.out.println("There are no duplicates");
		
		
		int result = findFirstDuplicateOptimum(input1);
		System.out.println("Result: "+result);
		
		result = findFirstDuplicateOptimum(input2);
		System.out.println("Result: "+result);
	}

}
