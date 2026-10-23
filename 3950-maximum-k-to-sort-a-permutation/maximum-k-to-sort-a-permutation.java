class Solution {
    public int sortPermutation(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                ans&=nums[i];
                count++;
            }
        }
        return count>0?ans:0;
    }
}