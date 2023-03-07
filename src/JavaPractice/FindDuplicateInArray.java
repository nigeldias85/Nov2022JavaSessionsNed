package JavaPractice;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = new int[] {1,2,3,4};
		boolean bln = findDuplicate(nums1);
		if(bln)
			System.out.println("CONTAINS DUPE");
		else 
			System.out.println("No Dupe");
		
		int[] nums2 = new int[] {1,2,3,1};
		bln = findDuplicate(nums2);
		if(bln)
			System.out.println("CONTAINS DUPE");
		else 
			System.out.println("NO DUPE");

	}
	
	public static boolean findDuplicate(int[] nums) {
		
		Set<Integer> st = new HashSet<>();
		for(int i : nums) {
			if(!st.add(i)) {
				return true;
			}
		}
		
		return false;
	}

}
