class Solution {
    public boolean canPlaceFlowers(int[] nums, int n) {
        // int count=0;
        // int co=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==0){
        //         count++;
        //     }
        //     else{
        //         co++;
        //     }
            
        // }
        // if(co>1){
        //     if(count%2!=0){
        //         return count/2>=n?true:false;
        //     }
                
        //     else return count/2>n?true:false;
        // }
        
        // return count/2>=n?true:false;
        if (n == 0) {
            return true;
        }
        if(nums.length==1 && nums[0]==0){
            return n<=1;
        }
            int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                continue;
            }
            else{
                if(i==0 && i+1<nums.length && nums[i+1]==0){
                    ans++;
                    nums[i]=1;
                }
                else if(i-1>=0 && nums[i-1]==0 && i+1<nums.length && nums[i+1]==0){
                    ans++;
                    nums[i]=1;
                }
                else if(i-1>=0 && nums[i-1]==0 && i+1==nums.length){
                    ans++;
                    nums[i]=1;
                }
                // else if(nums)
            }
        }
        return ans>=n;
    }
}