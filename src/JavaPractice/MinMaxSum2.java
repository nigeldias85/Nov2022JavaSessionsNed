package JavaPractice;

public class MinMaxSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] {1,3,5,7,9};
		
		printMinMaxSum(input);

	}
	
	
	public static void printMinMaxSum(int[] input) {
		
		
		
		int min = input[0]; //1
		int max = input[0]; //1
		int totalSum = 0;
		
		for(int val: input) {
			totalSum = totalSum + val;
			if(val < min) {
				min = val;
			}
			
			if(val > max) {
				max = val;
			}
		}
		
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		System.out.println("TotalSum: "+totalSum);
		int minSum = totalSum - max;
		int maxSum = totalSum - min;
		
		System.out.println("******************");
		System.out.println(minSum +" : "+maxSum);
	}

}
