class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0,maxSum=Integer.MIN_VALUE;
        for(int i=0;inums.length;i++){
            currentSum=Math.max(nums[i], currentSum+nums[i]);
            maxSum=Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}