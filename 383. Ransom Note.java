class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char note[] = ransomNote.toCharArray();
        char mag[] = magazine.toCharArray();
        
        Arrays.sort(note);
        Arrays.sort(mag);
        
        int r_pointer = 0;
        int m_pointer = 0;
        while(m_pointer<magazine.length()){
        if(note[r_pointer] == mag[m_pointer]) r_pointer++;
        if(r_pointer == ransomNote.length()) 
        return true;
        m_pointer++;
        }
        return false;
    }
}