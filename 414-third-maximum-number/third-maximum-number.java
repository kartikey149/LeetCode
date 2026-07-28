class Solution {
    public int thirdMax(int[] nums) {
        // if(nums.length==1) return nums[0];
        

        long f=Long.MIN_VALUE;
        long s=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>s && nums[i]!=f){
                s=nums[i];
                if(s>f ){
                    long temp=f;
                    f=s;
                    s=temp;
                }
            }
        }
        
        
        long t=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>t && nums[i]<s && nums[i]!=s ){
                t=nums[i];
            }
        }
        if(t==Long.MIN_VALUE) return (int)f;
        

        
        return (int)t ;
    }
}