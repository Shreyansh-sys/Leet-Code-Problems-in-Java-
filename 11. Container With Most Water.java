class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int result = 0;
        while(left < right){
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left], height[right]);
            result = Math.max(result, area);

            if(height[left] < height[right])
            left++;
            else
            right--;
        }
        return result;
    }
}