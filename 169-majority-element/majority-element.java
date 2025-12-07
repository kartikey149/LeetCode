class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int a=nums[nums.length/2];
        return a;
        
    }
}