class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return count(nums,k)-count(nums,k-1);
    }
    static int count(int[] nums,int k){
        int oddc=0;
        int left=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(nums[i]%2!=0){
                oddc++;
            }
             
            
            while(left<nums.length && oddc>k){
                if(nums[left]%2!=0){
                    oddc--;
                }
               
                left++;
            }
            ans+=i-left+1;
           
        }
        return ans;
    }
}