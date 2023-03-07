package JavaPractice;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

	public static void implementPriorityQueue(int[] input) {
		
		//Impl PQ as min heap
		PriorityQueue<Integer> pqAsMinHeap = new PriorityQueue<>();
		
		//Impl PQ as max heap
		PriorityQueue<Integer> pqAsMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
				
				
		for (Integer i : input) {
			pqAsMinHeap.add(i);
			pqAsMaxHeap.add(i);
		}
		
		System.out.println("Print Min Heap");
		while(!pqAsMinHeap.isEmpty()) {
			System.out.println(pqAsMinHeap.peek());
			pqAsMinHeap.poll();
			
		}
		
		
		System.out.println("Print Max Heap");
		while(!pqAsMaxHeap.isEmpty()) {
			System.out.println(pqAsMaxHeap.peek());
			pqAsMaxHeap.poll();
			
		}
	}
	
	public static void findLargestNumberAtK(int[] input, int k) {
		
		//Add k number into priority queue
		PriorityQueue<Integer> pqAsMinHeap = new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pqAsMinHeap.add(input[i]);
		}
		
		for(int i =k; i<input.length; i++) {
			
			if(pqAsMinHeap.peek() < input[i]) {
				pqAsMinHeap.poll();
				pqAsMinHeap.add(input[i]);
			}
		}
		
		System.out.println("Kth Largest number is: "+pqAsMinHeap.peek());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = new int[] {20, 10, 15, 40, 60, 5, 1}; //1, 5, 10, 15, 20, 40, 60
		implementPriorityQueue(input);
		
		int k =4;
		findLargestNumberAtK(input, k);
	}

}
