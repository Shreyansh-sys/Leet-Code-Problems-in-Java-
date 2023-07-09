class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();
        for( String s1 : strs){
            int [] arr = new int [26];

            for(char ch : s1.toCharArray()){
                arr[ch - 'a']++;
            }

            String str = Arrays.toString(arr);

            map.computeIfAbsent(str, k -> new ArrayList<>());
            map.get(str).add(s1);
        }
        return new ArrayList<>(map.values());
    }
}