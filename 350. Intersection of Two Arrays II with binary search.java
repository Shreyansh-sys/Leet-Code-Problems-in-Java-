class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      if(nums1.length>nums2.length)
      return intersect(nums2, nums1);
      Arrays.sort(nums1);
      Arrays.sort(nums2);

      List<Integer> result = new ArrayList<>();
        int leftIndex=0;
        for(int i=0;i<nums1.length;i++){
           int index = binarySearch(nums2, nums1[i], leftIndex);
            if(index!=-1){
                result.add(nums1[i]);
                leftIndex= index+1;
            }
        }
            return result.stream().mapToInt(Integer::intValue).toArray();
    }
    int binarySearch(int []num, int target, int left){
        int index = -1;
        int right = num.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(num[mid]==target){
                index = mid;
                right=mid-1;
            }
                else if(num[mid]>target)
                right=mid-1;
                else
                left=mid+1;
        }
        return index;
        } 
    } 