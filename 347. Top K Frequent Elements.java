class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    List<Integer>[] freqSorted = new List[nums.length + 1];
    HashMap<Integer, Integer> map = new HashMap<>();
		int [] res = new int [k];

		for(int num : nums)
		map.put(num, map.getOrDefault(num, 0) + 1);

		for(int key : map.keySet()){
			if(freqSorted[map.get(key)] == null)
			freqSorted[map.get(key)] = new ArrayList<>();
			freqSorted[map.get(key)].add(key);
		}

		int j = 0;
		for(int i = freqSorted.length - 1; i >= 0 && j < k; i--){
			
			if(freqSorted[i] != null){
			
			for(int ele : freqSorted[i])
			res[j++] = ele;
			
			}
		}

		return res;
	}

}
