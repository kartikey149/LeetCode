class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double ans=sum/k;
        for(int i=k-1;i<nums.length-1;i++){
            sum-=nums[i-k+1];
            sum+=nums[i+1];
            System.out.println(sum);
            ans=Math.max(ans,sum/k);
        }
        return ans;
    }
}