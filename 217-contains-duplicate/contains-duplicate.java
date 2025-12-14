class Solution {
    public boolean containsDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[i]==nums[j] && i!=j){
        //             return true;
        //         }
        //     }
        // }

        
        Arrays.sort(nums);
        
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    return true;
                }
            }
        
        return false;
    }
}