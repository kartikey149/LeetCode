class Solution {
    public int findFinalValue(int[] nums, int original) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int[] freq=new int[max+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0 && original==i){
                original*=2;
            }
        }
        return original;
    }
}