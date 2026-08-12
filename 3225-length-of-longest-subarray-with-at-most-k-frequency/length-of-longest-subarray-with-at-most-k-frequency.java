class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i=0;
        int j=0;
        int ans=0,len=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(i<nums.length){
            int c=nums[i];
            map.put(c,map.getOrDefault(c,0)+1);
            if(j<i && map.containsKey(c) && map.get(c)>k){
                ans=Math.max(ans,i-j);
                while(map.get(c)>k){

                    map.put(nums[j],map.getOrDefault(nums[j],0)-1);
                    j++;
                }
                // j++;
                i++;
                

            }
            else{
                i++;
            }
        }
        ans=Math.max(ans,i-j);
        return ans;

    }
}