class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>= minK && nums[i]<=maxK){
                count+=i-left+1;
            }
            if(nums[i]>maxK){
                left=i+1;
            }
            if(minK>nums[i]){
                left=i+1;
            }
        }
        return count;
    }
}