class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int ct=0;
        // for(int i=0;i<nums.length;i++){
        //     long p=1;
        //     for(int j=i;j<nums.length;j++){
        //         p*=nums[j];
        //         if(p<k){
        //             ct++;
        //         }
        //         else if(p>Integer.MAX_VALUE){
        //             break;
        //         }
        //     }
        // }
       int ct=0;
       int i=0;
       int p=1;
       for(int j=0;j<nums.length;j++){
        p*=nums[j];
        while (p >= k) {
                p /= nums[i];
                i++;
            }
            ct+=j-i+1;
       }
       
        return ct;
        

    }
}