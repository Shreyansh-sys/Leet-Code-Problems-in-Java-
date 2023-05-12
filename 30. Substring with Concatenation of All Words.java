class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        Map<String, Integer> wordFreqMap = new HashMap <> ();
        for(String word : words)
        wordFreqMap.put(word, wordFreqMap.getOrDefault(word, 0) + 1);
        int wordCount = words.length; int wordLength = words[0].length();
        List<Integer> resultIndices = new ArrayList<Integer>();

        for(int i = 0; i <= s.length() - wordCount * wordLength; i++){
            Map<String, Integer> wordsSeen = new HashMap<>();
            for(int j = 0; j < wordCount; j++){
                int nextWordIndex = i + j * wordLength;
                String word = s.substring(nextWordIndex, nextWordIndex + wordLength);

                if(!wordFreqMap.containsKey(word))
                break;

                wordsSeen.put(word, wordsSeen.getOrDefault(word, 0) + 1);

                if(wordsSeen.get(word) > wordFreqMap.get(word))
                break;

                if(j + 1 == wordCount)
                resultIndices.add(i);
            }
        }
        return resultIndices;
    }
}