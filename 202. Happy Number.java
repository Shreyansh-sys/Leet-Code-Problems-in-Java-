class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do{
            slow = findSquaredSum(slow);
            fast = findSquaredSum(findSquaredSum(fast));
        } while(slow != fast);
        return slow == 1;
    }

    public int findSquaredSum(int num){
        int sum = 0, digit;
        while( num > 0){
            digit = num % 10;
            sum += digit * digit;
            num = num/10;
        }
        return sum;
    }
}