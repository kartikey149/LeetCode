class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] nums) {
        Arrays.sort(nums);
        int ans=nums[0];
        if(nums[0]!=1){
             nums[0]=1;
            ans=nums[0];
        }
        for(int i=1;i<nums.length;i++){
            int diff=Math.abs(nums[i]-nums[i-1]);
            if(diff>1){
                nums[i]=nums[i-1]+1;
                // ans++;
                ans=Math.max(nums[i],ans);

            }
            else{
                ans=Math.max(ans,nums[i]);
                continue;
            }
        }
        return ans;
    }
}