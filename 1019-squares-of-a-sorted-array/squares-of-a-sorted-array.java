class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        // int max=0;
        // for(int num:nums){
        //     if(max<num){
        //         max=num;
        //     }
        // }
        // int[] freq=new int[max+1];
        // for(int i=0;i<nums.length;i++){
        //     freq[nums[i]]++;
        // }
        // int j=0;
        // for(int i=0;i<freq.length;i++){
        //     while(freq[i]>0){
        //         nums[j]=i;
        //         j++;
        //         freq[i]--;
        //     }
        // }

        int a=0;
        int b=nums.length-1;
        int[] aa=new int[nums.length];
        int k=nums.length-1;
        while(a<=b){
            if(nums[a]>=nums[b]){
                aa[k]=nums[a];
                a++;
            }
            else if(nums[a]<nums[b]){
                aa[k]=nums[b];
                b--;
            }
            k--;
            
        }

        return aa;
    }
}