package JavaPractice;

import java.util.Arrays;

public class MinMaxSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = new int[]{1,2,3,4,5};
		
		printMinMaxSum(input1);

	}
	
	public static void printMinMaxSum(int[] input) {
		
		Arrays.sort(input);
		int len = input.length;
		
		//Print min Sum
		int minSum =0;
		for(int i=0;i<len-1;i++) {
			minSum = minSum + input[i];
		}
		System.out.println("MinSum: "+minSum);
		
		
		//Print max Sum
		int maxSum =0;
		for(int i=len-1; i >=1; i--) {
			maxSum = maxSum + input[i];
		}
		System.out.println("MaxSum: "+maxSum);
	}

}
