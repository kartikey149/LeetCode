class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        // int count=0;
        // for(int i=0;i<time.length-1;i++){
        //     for(int j=i+1;j<time.length;j++){
        //         if((time[i]+time[j])%60==0) count++;
        //     }
        // }
        // return count;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
       
        for(int i=0;i<time.length;i++){
            int rem=time[i]%60;
            int need=(60-rem)%60;
            ans += map.getOrDefault(need, 0);
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}