class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
    static int count(int[] nums,int k){
        
        if(k < 0) return 0;

        int oddc=0;
        int left=0;
        int ans=0;

        for(int i=0;i<nums.length;i++){
    
            oddc += nums[i];
            while(left<nums.length && oddc>k){
                oddc -= nums[left];              
                left++;
            }
            ans += i-left+1;
           
        }
        return ans;
    }
}