class Solution {
    public boolean isAnagram(String s, String t) {
        char ana[] = s.toCharArray();
        char test[] = t.toCharArray();
        
        Arrays.sort(ana);
        Arrays.sort(test);
        int r_pointer = 0;
        int m_pointer = 0;
        if(ana.length == test.length){
        while(m_pointer<t.length()){
        if(ana[r_pointer] == test[m_pointer]) r_pointer++;
        if(r_pointer == s.length()) 
        return true;
        m_pointer++;
        }
        }
        return false;
    }
}