class Solution {
    public void nextPermutation(int[] nums) {
        // int last=nums[nums.length
        int i=nums.length-2;
       
        // int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
        while(j>i && nums[j]<= nums[i]){
            // min=Math.min(min,nums[j]);/
            j--;
        }
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        }

        
        
            reve(nums,i+1,nums.length);
        

        
    }
    public static void reve(int[] nums ,int start,int end){
        int a=start;
        int b=end-1;
        while(a<b){
            int temp=nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b--;
        }
    }
}