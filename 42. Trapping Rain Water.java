class Solution {
    public int trap(int[] height) {
        //O(n)-space complexity
        // int left[] = new int[height.length];
        // int right[] = new int[height.length];
        // int max = height[0];
        // int res = 0;

        // for(int i = 0; i < height.length - 1; i++){
        //     left[i] = Math.max(max, height[i]);
        //     max = left[i];
        // }
        // max = height[height.length - 1];
        // for(int i = height.length - 1; i >= 0; i--){
        //     right[i] = Math.max(max, height[i]);
        //     max = right[i];
        // }
        // for(int i = 0; i < height.length - 1; i++){
        //     res += Math.min(left[i], right[i]) - height[i];
        // }

        // return res;
        //O(1)-space complexity

        int left = 0, right = height.length - 1;
        int maxLeft = height[left], maxRight = height[right];
        int res = 0;

        if(height.length == 0) return 0;

        while(left <= right){
            if(maxLeft < maxRight){
            maxLeft = Math.max(maxLeft, height[left]);
            res = res + maxLeft - height[left];
            left++;
            }
            else{
            maxRight = Math.max(maxRight, height[right]);
            res = res + maxRight - height[right];
            right--;
            }
        }
        return res;
    }
}