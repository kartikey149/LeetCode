class Solution {
    public int longestSubsequence(int[] nums) {
        int ans=nums[0],co=0;
        for(int i=1;i<nums.length;i++){
            ans^=nums[i];
            if(nums[i]==0){
                co++;
            }
        }
        if(ans==0 && co==0){
            return nums.length-1;
        }
        else if(ans!=0){
            return nums.length;
        }
        if(co==nums.length-1){
            return 0;
        }
        return nums.length-1;
    }
}