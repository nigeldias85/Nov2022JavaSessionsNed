package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] {3,0,1};
		missingNumberBruteForce(nums);
		System.out.println("/**********************/");
		missingNumberOptimal1(nums);

	}

	public static void missingNumberOptimal1(int[] nums) {
		//Formula: n(n+1)/2;
		
		int len = nums.length;
		int expectedSum = (len *(len+1))/2;
		
		int actualSum=0;
		for(int i =0; i<nums.length; i++) {
			actualSum = actualSum + nums[i];
		}
		
		System.out.println("ExpectedSum: "+expectedSum);
		System.out.println("ActualSum: "+actualSum);
		System.out.println("Missing Ele is: "+(expectedSum-actualSum));
	}
	
	public static void missingNumberBruteForce(int[] nums) {

		char[] output = new char[nums.length+1];
		
		for(int i=0; i<nums.length; i++) {
			int index = nums[i];
			output[index] = 'V';
		}
		
		for(int j=0; j<output.length; j++) {
			if(output[j]!= 'V') {
				System.out.println("Missing Ele is: "+j);
			}
		}
		
	}
}
