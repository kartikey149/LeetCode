class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<0){
                ans=Math.max(sum,ans);
                sum=0;
            }
            else{
                ans=Math.max(sum,ans);
            }
        }
        return ans;
      
    }
}