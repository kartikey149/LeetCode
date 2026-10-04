class Solution {
    public int longestOnes(int[] nums, int k) {
        // int count=0;
        // int ans=0;
        // int fz=k;
        // for(int i=0;i<nums.length;i++){
        //     // int fz=k;
        //     if(nums[i]==1){
        //         count++;
        //     }
        //     if(nums[i]==0 && count>0){
        //         int j=i;
        //         while(j<nums.length && nums[j]==0){
                    
                    
        //                 count++;
                    
        //             j++;

        //             fz--;
        //         }
        //         if(fz==0){
        //             fz=k;
        //         }
        //         if(i+1<nums.length && nums[i+1]==0){
        //             ans=Math.max(ans,count);
        //             count=0;
        //         }
        //     }
        // }
        
        // return ans;


        int ans=0;
        int countz=0;
        int j=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                countz++;
            }
            while(countz>k){
                if(nums[j]==0){
                    countz--;
                }
                j++;
            }
            ans=Math.max(i-j+1,ans);
        }
        return ans;
    }
}