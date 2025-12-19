class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int h=nums[0];
        for(int i=0;i<nums.length;i+=3){
            if(i==nums.length-1){
                return nums[i];
            }
            if(h==nums[i+1]){
                h=nums[i+3];
            }
            else{
                return nums[i];
            }
        }

        return 0;
    }
}