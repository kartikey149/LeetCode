class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=0;
        int dec=0;
        // int left=0,left2=0;
        int i=0;
        while(i<nums.length){
            int k=0;
            if(i+1<nums.length && nums[i]<nums[i+1]){
                while(i+1<nums.length && nums[i]<nums[i+1]){
                k++;
                i++;
            }
            }
            else{
                i++;
            }
            
            
            
            inc=Math.max(k+1,inc);
        }
        i=0;
        while(i<nums.length){
            int k=0;
            if(i+1<nums.length && nums[i]>nums[i+1]){
                while(i+1<nums.length && nums[i]>nums[i+1]){
                k++;
                i++;
            }
            }
            else{
                i++;
            }
            
            dec=Math.max(k+1,dec);
        }
        return Math.max(inc,dec);
    }
}