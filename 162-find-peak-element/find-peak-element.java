class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int a=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                a=i+1;
            }

        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]>nums[i+1] && nums[i]>nums[i-1]){

                return i;
            }
            
            
        }
        
        return a;
        
    }
}