class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length; int m= queries.length;
        int []answer=new int[m];
        Arrays.sort(nums);
        for(int i=1;i<n;i++){    //prefix array
            nums[i]+=nums[i-1];
        }
        for(int j=0;j<m;j++){
        int index = binarySearch(nums, queries[j]);
        answer[j]=index;
        }
        return answer;
    }

    int binarySearch(int []nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
        int mid = (left+right)/2;
            if(nums[mid]==target)
            return mid+1;
            if(nums[mid]<target)
            left=mid+1;
            else
            right=mid-1;
        }
        return nums[left]>target?left:left+1; // if sum of the entire nums array is less than target, return the length of the nums array.
        }
    }