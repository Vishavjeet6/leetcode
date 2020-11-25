package leetcode;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
    	if(nums.length == 0) {
    		return 0;
    	}
    	int currMax = nums[0];
    	int allMax = nums[0];
    	
    	for(int i=1; i<nums.length; i++) {
    		currMax = Math.max(nums[i], currMax+nums[i]);
    		allMax = Math.max(allMax, currMax);
    	}
		return allMax;   
    }
}
