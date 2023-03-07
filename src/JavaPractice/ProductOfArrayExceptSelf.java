package JavaPractice;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	
	//With division operation
	public static void printProdArray(int[] input) {
		
		//Get prod for entire array
		int prod=1;
		for(int i=0;i<input.length;i++) {
			prod = prod * input[i];
		}
		System.out.println("Product:"+prod);
		
		for(int i=0;i<input.length;i++) {
			int tempOutput = prod / input[i];
			input[i] = tempOutput;
		}
		
		System.out.println("Array: "+Arrays.toString(input));
	}
	
	//Without division operation
	public static void buildPrefixArray(int[] input) {
		//Get array size
		int len = input.length;
		
		//Build a prefix array
		int[] prefix = new int[len];
		prefix[0] = 1;
		for(int i=1 ; i<len; i++) {
			prefix[i] = prefix[i-1] * input[i-1];
		}
		System.out.println("Prefix: "+Arrays.toString(prefix));
		
		
		//Build a postfix array
		int[] postfix = new int[len];
		postfix[len-1] = 1;
		for(int i=len-2; i>=0 ; i--) {
			postfix[i]=postfix[i+1] * input[i+1];
			
		}
		System.out.println("Postfix: "+Arrays.toString(postfix));
		
		//int[] output = new int[len];
		//int tempPostFix = 1;
		//output[i+1]= tempPostFix * prefix[i];
		//tempPostFix = input[i+1];
		
		//Build a output array
		int[] output = new int[len];
		for(int i=0; i<len; i++) {
			output[i]=prefix[i] * postfix[i];
		}
		System.out.println("Output: "+Arrays.toString(output));
	}
	
	//Without division and without extra space
	public static void buildOutputArray(int[] input) {
		//Get array size
		int len = input.length;
		
		//Build a prefix array
		int[] output = new int[len];
		output[0] = 1;
		for(int i=1 ; i<len; i++) {
			output[i] = output[i-1] * input[i-1];
		}
		System.out.println("Prefix: "+Arrays.toString(output));
		
		int tempPostFix = 1;
		for(int i=len-1; i>=0; i--) {
			output[i] = output[i] * tempPostFix;
			tempPostFix = tempPostFix * input[i];
		}
		System.out.println("Output: "+Arrays.toString(output));
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input1 = new int[] {1,2,3,4};
		//printProdArray(input1);
		
		System.out.println("--------------");
		System.out.println("Input: "+Arrays.toString(input1));
		buildPrefixArray(input1);
		
		System.out.println("--------------");
		System.out.println("Input: "+Arrays.toString(input1));
		buildOutputArray(input1);
 
	}

}
