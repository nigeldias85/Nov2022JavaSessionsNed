package JavaPractice;

public class SubArrayDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[] {2,2,1,3,2};
		int d=4;
		int m=2;
		
		findMaxSubArray(input,d,m);

	}
	
	public static void findMaxSubArray(int[] input, int d, int m) {
		
		int count =0;
		for(int i=0; i<=input.length - m; i++) {
			int sum = 0;
			for(int j=i; j<i+m; j++) {
				sum = sum + input[j];
			}
			if(sum == d) {
				count++;
			}
		}
		
		System.out.println("Count is: "+count);
		
	}

}
