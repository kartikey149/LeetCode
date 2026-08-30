class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length==1) return 1;
        int max=nums[0];
        int min=nums[0];
        int maxi=0;
        int mini=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                maxi=i;
                max=nums[i];
            }
            if(nums[i]<min){
                mini=i;
                min=nums[i];
            }
        }
        int a=Math.max(mini,maxi);
        int c=Math.min(mini,maxi);

        int start=a+1;
        int end=nums.length-c;
        int both=nums.length-a+c+1;
        return Math.min(both,Math.min(start,end));




       
    }
}