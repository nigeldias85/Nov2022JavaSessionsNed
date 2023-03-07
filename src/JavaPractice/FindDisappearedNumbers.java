package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);

	}
	
	public static void findDisappearedNumbers(int[] nums) {
		
		List<Integer> lst = new ArrayList<>();
		char[] charArray = new char[nums.length];
		
//		Set<Integer> st = new LinkedHashSet<>();
//		for(int i=0;i<nums.length;i++) {
//			if(!st.contains(nums[i])) {
//				st.add(nums[i]);
//			}
//			else {
//				lst.add(nums[i]);
//			}
//		}
//		
//		System.out.println("DuplicateNumbers are: ");
//		for (Integer ele : lst) {
//			System.out.println(ele);
//		}
		
		//Brute Force Approach1
//		for(int i=0;i<nums.length;i++) {
//			int index = nums[i]-1;
//			charArray[index]= 'V';
//		}
//		
//		for(int i=0; i<charArray.length; i++) {
//			if(charArray[i] != 'V') {
//				lst.add(i+1);
//			}
//		}
//		
//		System.out.println("DisappearedNumbers are: ");
//		for (Integer ele : lst) {
//			System.out.println(ele);
//		}
		
		System.out.println("/******************************/");
		//Brute Force Approach2
//		HashSet<Integer> numsSet = new HashSet<Integer>();
//		for(int i=0;i<nums.length;i++) {
//			numsSet.add(nums[i]);
//		}
//		
//		for(int i=1;i<=nums.length;i++) {
//			if(!numsSet.contains(i)) {
//				lst.add(i);
//			}
//		}
//		
//		System.out.println("DisappearedNumbers are: ");
//		for (Integer ele : lst) {
//			System.out.println(ele);
//		}
		
		//Optimal Approach
		for(int i=0;i<nums.length;i++) {
			int currIndex = Math.abs(nums[i]);
			nums[currIndex-1] = - Math.abs(nums[currIndex-1]);
		}
				
		for(int i=0;i<nums.length;i++) {
			if(nums[i] > 0) {
				lst.add(i+1);
			}
		}
		
		System.out.println("DisappearedNumbers are: ");
		for (Integer ele : lst) {
			System.out.println(ele);
		}
		
		
		
	}
	

}
