package Lec41;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,15,7,11,2,5};
		int target = 26;
		
		System.out.println(Arrays.toString(twoSum(nums,target)));

	}
	
	public static int[] twoSum(int[] nums, int target) {
        
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++)
		{
			if(map.containsKey(target-nums[i]))
			{
				return new int[] {i,map.get(target-nums[i])};
			}
			else
			{
				map.put(nums[i], i);
			}
		}
		
		
		return null;
		
    }

}
