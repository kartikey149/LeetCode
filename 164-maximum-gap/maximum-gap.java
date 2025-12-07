class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int sum=0;
        
        Arrays.sort(nums);
        sum=nums[1]-nums[0];
        int i=1;
        while(i<nums.length-1){
            if(sum<nums[i+1]-nums[i]){
                sum=nums[i+1]-nums[i];
            }
            i++;
        }

        
        return sum;
    }
}