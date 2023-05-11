class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> resultIndices = new ArrayList<Integer>();
        int windowStart = 0, match = 0;
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for(char ch: p.toCharArray())
        charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);
        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char rightChar = s.charAt(windowEnd);
            if(charFreqMap.containsKey(rightChar)){ 
             charFreqMap.put(rightChar, charFreqMap.get(rightChar) - 1);
             if(charFreqMap.get(rightChar) == 0)
             match++;
            }
            if(match == charFreqMap.size())
            resultIndices.add(windowStart);

            if(windowEnd >= p.length() - 1){
                char leftChar = s.charAt(windowStart++);
                if(charFreqMap.containsKey(leftChar)){
                    if(charFreqMap.get(leftChar) == 0)
                    match--;
                 charFreqMap.put(leftChar, charFreqMap.get(leftChar) + 1);
                }
            }
        }
        return resultIndices;
    }
}