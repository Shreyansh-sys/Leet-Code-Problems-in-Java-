class Solution {
    public boolean circularArrayLoop(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            boolean isForward = nums[i] >= 0;
            int slow = i; int fast = i;
            
            do {
                slow = findNextIndex(nums, isForward, slow);
                fast = findNextIndex(nums, isForward, fast);

                if(fast != -1)
                    fast = findNextIndex(nums, isForward, fast);
            } while(slow != -1 && fast != -1 && slow != fast);

            if(slow != -1 && slow == fast)
            return true;
        }
        return false;
    }

    private static int findNextIndex(int[] nums, boolean isForward, int currentIndex){
        boolean direction = nums[currentIndex] >= 0;
        if(direction != isForward)
        return - 1;

        int nextIndex = (currentIndex + nums[currentIndex]) % nums.length;

        if(nextIndex < 0)
        nextIndex += nums.length;

        if(nextIndex == currentIndex)
        nextIndex = -1;

        return nextIndex;
    }
}