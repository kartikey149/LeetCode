class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        // int j=nums.length-1;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            System.out.print("enter"+i);
            int j=nums.length-1;
            while(j>i && nums[j]<=nums[i]){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        rev(nums,i+1,nums.length-1);

        

    }
    static void rev(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}