class Solution {
    public boolean isPalindrome(int x) {
        int rem, rev=0,digit=x;
        if(x<0){
            return false;
        }
        while(x!=0){
        rem=x%10;
        rev=(10*rev)+rem;
        x=x/10;
        }
        return rev==digit?true:false;   
    }  
}
