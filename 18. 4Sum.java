class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> quadruplets = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i-1])
            continue;
            for(int j = i+1; j < nums.length - 2; j++){
                if(j > i+1 && nums[j] == nums[j-1])
                continue;
                searchPair(nums, target, i, j, quadruplets);
            }
        }
        return quadruplets;
    }


    private static void searchPair(int[] nums, int targetSum, int first, int second,          List<List<Integer>> quadruplets){
        int left = second + 1, right = nums.length - 1;
        while(left < right){
            long sum = (long)nums[first] + (long)nums[second] + (long)nums[left] + (long)nums[right];
            if(sum == (long)targetSum){
                quadruplets.add(Arrays.asList(nums[first], nums[second], nums[left], 
                nums[right]));
                left++;
                right--;
                while(left < right && nums[left] == nums[left-1])
                left++;
                while(left < right && nums[right] == nums[right+1])
                right--;
            }
            
            else if(sum < (long)targetSum)
            left++;
            else right--;
        }
    }
}