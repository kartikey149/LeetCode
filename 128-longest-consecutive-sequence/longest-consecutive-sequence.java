class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        if(nums.length==0) return 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){

            map.put(i,0);
        }
        int ans=0;
        for(int i:map.keySet()){
            if(map.containsKey((i)-1)){
                continue;
            }else{
                int a=i;
            int count=1;
                // a++;
                // map.remove(a);
                while(map.containsKey(a+1)){
                    count++;
                    a++;
                    // map.remove(a);
                }
                ans=Math.max(count,ans);
            }
        }
        return ans;

    }
}