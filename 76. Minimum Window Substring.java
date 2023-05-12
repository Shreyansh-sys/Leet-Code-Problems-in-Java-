class Solution {
    public String minWindow(String s, String t) {
        int windowStart = 0, minLength = s.length() + 1, subStrStart = 0,match = 0;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        
        for(char ch : t.toCharArray())
        charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);

        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char rightChar = s.charAt(windowEnd);
            if(charFreqMap.containsKey(rightChar)){
                charFreqMap.put(rightChar, charFreqMap.get(rightChar) - 1);
                if(charFreqMap.get(rightChar) >= 0)
                match++;
            }


            while(match == t.length()){
                if(minLength > windowEnd - windowStart + 1){
                    minLength = windowEnd - windowStart + 1;
                    subStrStart = windowStart;
                }

                char leftChar = s.charAt(windowStart++);
                if(charFreqMap.containsKey(leftChar)){
                    if(charFreqMap.get(leftChar) == 0)
                    match--;
                    charFreqMap.put(leftChar, charFreqMap.get(leftChar) + 1);
                }
            }
        }
        return minLength > s.length() ? "" : s.substring(subStrStart, subStrStart + minLength);
    }
}