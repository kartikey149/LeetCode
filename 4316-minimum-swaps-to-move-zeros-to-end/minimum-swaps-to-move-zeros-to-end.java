class Solution {
    public int minimumSwaps(int[] nums) {
       int start=0;
       int end=nums.length-1;
       int count=0;
       while(start<end){
        if(nums[end]==0){
            end--;
        }
        else if(nums[start]==0){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            count++;
        }
        else{
            start++;
        }
       }
       return count;
        
    }
}