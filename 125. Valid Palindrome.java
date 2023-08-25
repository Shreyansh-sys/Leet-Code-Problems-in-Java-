class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while(start <= end){
            char currFirst = s.charAt(start);
            char currEnd = s.charAt(end);
            if(!Character.isLetterOrDigit(currFirst)){
                start++;
            }
            else if(!Character.isLetterOrDigit(currEnd)){
                end--;
            }
            else {

            if(Character.toLowerCase(currFirst) != Character.toLowerCase(currEnd)){
                return false;
            }
            start++;
            end--;
        }
        }
        return true;
    }
}