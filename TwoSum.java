package leetcode;

import java.util.HashMap;

//time O(n) space o(n)
	public class TwoSum {
	    public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	        for(int i=0; i<nums.length; i++) {
	        	if(hm.get(target- nums[i]) != null) {
	        		return new int[] {i, hm.get(target- nums[i])};
	        	}
	        	hm.put(nums[i], i);
	        }
	        return  new int[2];
	    }

}
