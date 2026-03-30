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


        int left=0;
        int ans=0;
        int cz=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cz++;
            }
            while(cz>k){
                if(nums[left]==0){
                    cz--;
                }
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}