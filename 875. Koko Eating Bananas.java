class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1;
        for(int pile : piles){
            right = Math.max(right, pile);
        }
        int res = right;
        while(left <= right){
            int mid = (left + right)/2;
            int hours = 0;
            for(int i : piles){
                hours += Math.ceil((double)i/mid);
            }
            if(hours <= h){
                res = Math.min(mid, res);
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return res;
    }
}