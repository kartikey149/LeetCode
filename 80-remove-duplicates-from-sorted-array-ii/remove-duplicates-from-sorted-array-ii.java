class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=0;
        int j=1;
        while(i+1<nums.length){
            if(i+1<nums.length && nums[i]==nums[i+1]){
                count++;
                if(count<=2){
                    nums[j]=nums[i];
                    j++;
                    i++;
                }
                else{
                    i++;
                }
            }
            else if(i+1<nums.length && nums[i]!=nums[i+1]){
                count=1;
                nums[j++]=nums[i+1];
                i++;

            }
        }
        
        return j;
    }
}