class Solution {
    public void sortColors(int[] nums) {
        int[] freq=new int[3];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=1;i<freq.length;i++){
            freq[i]+=freq[i-1];
        }
        int[] temp=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            temp[freq[nums[i]]-1]=nums[i];
            freq[nums[i]]--;
        }
        for(int u=0;u<nums.length;u++){
            nums[u]=temp[u];
        }
    }
}