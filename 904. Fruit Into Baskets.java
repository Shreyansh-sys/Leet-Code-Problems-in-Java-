class Solution {
    public int totalFruit(int[] fruits) {
        int windowStart = 0; int maxLength = 0;
        Map<Integer, Integer> fruitsFreqMap = new HashMap<>();
        for(int windowEnd = 0; windowEnd < fruits.length; windowEnd++){
            fruitsFreqMap.put(fruits[windowEnd], fruitsFreqMap.getOrDefault(fruits[windowEnd],0) + 1);
            while(fruitsFreqMap.size() > 2){
                fruitsFreqMap.put(fruits[windowStart], fruitsFreqMap.get(fruits[windowStart]) -1);
                if(fruitsFreqMap.get(fruits[windowStart]) == 0){
                    fruitsFreqMap.remove(fruits[windowStart]);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}