class Solution {
   public int getVal(char c){
    switch(c){
        case 'I':
        return 1;

        case 'V':
        return 5;

        case 'X':
        return 10;

        case 'L':
        return 50;

        case 'C':
        return 100;

        case 'D':
        return 500;

        case 'M':
        return 1000;

        default :
        return 0;
    }}
    public int romanToInt(String s) {
        int sum=0;
        for(int i =0;i<s.length()-1;i++){
            int current = getVal(s.charAt(i));
            int next = getVal(s.charAt(i+1));
            if(current<next){
                sum-=current;
            }
            else{
                sum+=current;
            }
        }
        return sum + getVal(s.charAt(s.length()-1));
    }
}