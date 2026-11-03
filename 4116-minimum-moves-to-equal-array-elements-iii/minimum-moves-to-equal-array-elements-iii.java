class Solution {
    public int minMoves(int[] nums) {
        // Arrays.sort(nums);
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int diff=0;
        for(int i=0;i<nums.length;i++){
            diff+=max-nums[i];
        }
        return diff;
    }
}