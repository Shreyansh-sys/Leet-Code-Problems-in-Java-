class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length; int m= queries.length;
        int []answer=new int[m];
        Arrays.sort(nums);
        for(int j=0;j<m;j++){
        int i=0; int sum=0;
        for(i=0;i<n;i++){
            if(sum+nums[i]>queries[j]){//checking if the sum is greater than the target if so return 0.
            answer[j]=i;
            break;
            }
            sum=sum+nums[i];
            }
            if(i==n) answer[j]=n;// if sum of the entire nums array is less than target, return the length of the nums array.
          
    }
    return answer;  
    }
    }