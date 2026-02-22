class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int clossum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currsum=nums[i]+nums[left]+nums[right];
                
                if(Math.abs(target-currsum)<Math.abs(target-clossum)){
                    clossum=currsum;
                }
                if(currsum<target){
                    left++;
                }
                else if(currsum>target){
                    right--;
                }
                else{
                    return currsum;
                }


            }

        }
        return clossum;



    }
}