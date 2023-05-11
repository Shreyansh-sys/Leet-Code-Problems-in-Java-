class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int windowStart = 0, match = 0;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for( char ch: s1.toCharArray())
        charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);
        for(int windowEnd = 0; windowEnd < s2.length(); windowEnd++){
            char rightChar = s2.charAt(windowEnd);
            if(charFreqMap.containsKey(rightChar)){ 
             charFreqMap.put(rightChar, charFreqMap.get(rightChar) - 1);
             if(charFreqMap.get(rightChar) == 0)
             match++;
            }
            if(match == charFreqMap.size())
            return true;

            if(windowEnd >= s1.length() -1){
                char leftChar = s2.charAt(windowStart++);
                if(charFreqMap.containsKey(leftChar)){
                    if(charFreqMap.get(leftChar) == 0)
                    match--;
                 charFreqMap.put(leftChar, charFreqMap.get(leftChar) + 1);
                }
            }
        }
        return false;
    }
}