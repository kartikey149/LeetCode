class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character,Integer> map=new HashMap<>();
        // int i=0;
        // int co=0;
        // int anns=0;
        // while(i<s.length()){
        //     if(!map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i),i);
        //         i++;
        //         co++;
        //         anns=Math.max(co,anns);
        //     }
        //     else{
        //         i=map.get(s.charAt(i))+1;
        //         map.clear();
        //         co=0;
        //     }
        // }
        // return anns;


        // HashMap<Character,Integer> map=new HashMap<>();
        // // int i=0;
        // int ans=0,j=0;
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     map.put(c,map.getOrDefault(c,0)+1);
        //     if(map.containsKey(c) && map.get(c)>1){
        //         map.put(c,map.getOrDefault(c,0)+1);
        //         j=i;
        //     }
        //     ans=Math.max(ans,map.size());
        // }
        // return ans;
        HashMap<Character,Integer> map=new HashMap<>();
        int ans=0,l=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c) && map.get(c)>=l){
                l=map.get(c)+1;
                map.put(c,i);
            }
            map.put(c,i);
            ans=Math.max(i-l+1,ans);
        }
        return ans;
        
    }
}