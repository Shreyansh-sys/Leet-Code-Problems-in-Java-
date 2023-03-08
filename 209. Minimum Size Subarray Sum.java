class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0; int minLength = Integer.MAX_VALUE;
        int windowSum = 0;
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            windowSum += nums[windowEnd];
            while(windowSum >= target){
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}