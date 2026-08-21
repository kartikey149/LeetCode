class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        
        
        // for (int i = 0; i < nums.length; i++) {
        //     int currentSum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         currentSum += nums[j];
        //         if (currentSum == k) {
        //             count++;
        //         }
        //     }
        // }
        // int ans=0;
        // int sum=nums[0];
        // if(sum==k) ans++;
        // int j=0;
        // for(int i=1;i<nums.length;i++){

        //     sum+=nums[i];
            
        //     while(sum>k){
        //         sum-=nums[j++];
        //     }
        //     if(sum==k){

        //         ans++;
        //     }
            
        // }
        // return ans;

        // return count;
        // int sum=0;
        // int ans=0;
        // int j=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     if(sum==k){
        //         ans++;
        //     }
        //     if(sum>=k){
        //         while(j<nums.length && sum>=k){
        //             sum-=nums[j++];
        //             if(j>1 && sum==k) ans++;
        //         }
        //     }
        // }
        // // if(sum==k) ans++;
        // return ans;

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int co=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
           int f=map.getOrDefault(sum-k,0);
           ans+=f;
           map.put(sum,map.getOrDefault(sum,0)+1);
           
        }
        return ans;
    }
}