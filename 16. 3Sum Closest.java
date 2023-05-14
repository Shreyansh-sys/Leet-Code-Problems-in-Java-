class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int smallestDiff = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            int left = i+1, right = nums.length-1;
            while(left < right){
                int targetDiff = target - nums[i] - nums[left] - nums[right];
                
                if(targetDiff == 0)
                return target-targetDiff;
                
                if(Math.abs(targetDiff) < Math.abs(smallestDiff))
                smallestDiff = targetDiff;

                if(targetDiff > 0)
                left++;
                else right--;
            }
        }
        return target-smallestDiff;
    }
}