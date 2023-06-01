class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int []> result = new ArrayList<>();
        int i = 0, j = 0;
        int startMax = 0, endMin = 0;
        while(i < firstList.length && j < secondList.length){
            if(((firstList[i][0] >= secondList[j][0]) && (firstList[i][0] <= secondList[j][1])) || ((secondList[j][0] >= firstList[i][0]) && (secondList[j][0] <= firstList[i][1])))    {  
            startMax = Math.max(firstList[i][0],secondList[j][0]);
            endMin = Math.min(firstList[i][1],secondList[j][1]);
            result.add(new int[] {startMax, endMin});
        }
            if(firstList[i][1] < secondList[j][1])
                i++;
                else j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}