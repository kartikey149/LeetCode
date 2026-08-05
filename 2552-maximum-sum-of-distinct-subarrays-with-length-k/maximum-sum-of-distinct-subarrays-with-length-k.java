class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            
            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        long ans = (map.size() == k) ? sum : 0;
   
        for(int i=k;i<nums.length;i++){

            // diff krne ka logic
            sum-=nums[i-k];
            map.put(nums[i-k],map.getOrDefault(nums[i-k],0)-1);
            if(map.get(nums[i-k])<=0){
                map.remove(nums[i-k]);
            }

            //sum krne ka logic

            sum+=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);


            if(map.size()==k){
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}