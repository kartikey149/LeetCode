class Solution {
    public int[] searchRange(int[] nums, int target) {
       int start=binarySearch(nums,target,0,nums.length-1);
       if(start==-1){
        return new int[]{-1,-1};
       }
       int pstart=start;
       while(start!=-1){
        pstart=start;
        start=binarySearch(nums,target,0,start-1);
       }
        int end=binarySearch(nums,target,0,nums.length-1);
        int aend=end;
        while(end!=-1){
        aend=end;
        end=binarySearch(nums,target,end+1,nums.length-1);
       }
       return new int[]{pstart,aend};
    }
    static int binarySearch(int[] nums,int target,int start,int end){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
        
    }
}