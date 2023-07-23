package week1.day3;

import java.util.Arrays;

public class FindDuplicateArrayElement {

	public static void main(String[] args) {
		
		int[] nums = {2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(nums);
		//System.out.println(nums.length[]);
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==nums[i+1]) {
				System.out.println(nums[i]);
				
			}
			
			//for(int j=i+1;j<nums.length;j++)
			//{
			//	if(nums[i]==nums[j]) {
				//	System.out.println(nums[i]+ "is duplicate value");
				}
			}
		
		

	}


