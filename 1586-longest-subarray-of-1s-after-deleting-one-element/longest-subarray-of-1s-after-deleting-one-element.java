class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int cz=0;
        int k=1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cz++;
            }
            while(cz>k){
                if(nums[left]==0){
                    cz--;
                }
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans-1;
    }
}