class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rotatee(nums , 0,nums.length-1);
        rotatee(nums,0,k-1);
        rotatee(nums,k,nums.length-1);
        
    }
    public void rotatee(int[] nums ,int low,int high){
        // int low=0;
        // int high=nums.length-1;
        while(low<high){
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}