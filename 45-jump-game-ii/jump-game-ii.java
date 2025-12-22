class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int farthest=0;
        int currentend=0;
        int jump=0;
        for(int i=0;i<nums.length;i++){
            farthest=Math.max(farthest,i+nums[i]);
            // farthest = Math.max(farthest, i + nums[i]);

            if(i==currentend){
                jump++;
                currentend=farthest;
                if(currentend>=nums.length-1){
                    return jump;
                }
            }
        }
        

            
        return 0;

        
    }
}