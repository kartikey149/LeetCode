class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return count(nums,k)-count(nums,k-1);

    }
    static int count(int[] nums,int k){
         int left=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])<1){
                    map.remove(nums[left]);
                }
                left++;
            }
            ans+=i-left+1;
            
           
          
            
        }
        return ans;
    }
}