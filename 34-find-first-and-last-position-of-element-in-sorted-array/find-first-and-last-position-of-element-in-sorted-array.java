class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=-1;
        int b=-1;
        if(nums.length==1 && target==nums[0]){
            return new int[]{0,0};
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i] && count==0){
                a=i;
                count++;
            }
            if(target==nums[i] && count>0){
                count++;
                b=i;
            }
            
            
        }
        
        
        return new int[]{a,b};


    }
}