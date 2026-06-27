class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int len=0;
        if(map.containsKey(1)){
            int count=map.get(1);
            len=map.get(1)%2==0?count-1:count;
        }
        int ans2=0;
        for(int i:map.keySet()){
            if(i==1) continue;
            int ans=0;
            long current=i;
            while( map.containsKey((int)current) && map.get((int)current)>=2 ){
                ans+=2;
                current=current*current;
                if(current>(long) Math.pow(10,9)) break;
            }
            if(map.containsKey((int) current)){
                ans+=1;
            }
            else{
                ans-=1;
            }

            ans2=Math.max(ans,ans2);

        }
        return ans2>len?ans2:len;
    }
}