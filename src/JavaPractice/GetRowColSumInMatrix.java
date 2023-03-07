package JavaPractice;

import java.util.Arrays;

import javax.swing.event.MouseInputListener;

public class GetRowColSumInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] input1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printRowColSum(input1);
		
		System.out.println("");
		int[][] input2 = new int[][] { { 0, 2, 1 }, { 1, 1, 1 }, { 2, 0, 0 } };
		printRowColSum(input2);

	}
	
	
	public static void printRowColSum(int[][] input) {
		
		int rowSize = input.length;
		int colSize = input[0].length;
		int[] rowSum = new int[rowSize];
		int[] colSum = new int[colSize];
		int index =0;
		
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				rowSum[i] = rowSum[i]+ input[i][j];
				
			}
		}
		
		System.out.println(rowSum);
		
		
		for(int i=0;i<colSize;i++) {
			for(int j=0;j<rowSize;j++) {
				colSum[i] = colSum[i] + input[j][i];
			}
		}
		
		System.out.println(colSum);
		
		//Sort Both the Arrays
		Arrays.sort(rowSum);
		Arrays.sort(colSum);
		
		//Compare the elements of rowSum and colSum
		for(int i=0;i<rowSize;i++) {
			int id = (i+1);
			System.out.println("Data for: "+id);
			System.out.println(rowSum[i]);
			System.out.println(colSum[i]);
			System.out.println("");
		}
	}

}
