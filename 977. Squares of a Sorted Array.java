class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int right = nums.length - 1, left = 0;
        int [] squares = new int[n];
        int nextSquare = n - 1;
        while(left <= right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare > rightSquare){
                squares[nextSquare--] = leftSquare;
                left++;
            }
            else {
                squares[nextSquare--] = rightSquare;
                right--;
            }
        }
        return squares;
    }
}