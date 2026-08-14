class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int i=0,ans=0;
        while(i<s.length()){
            char c=s.charAt(i);

            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }
            ans=Math.max(i-left+1,ans);
            i++;



        }
        return ans;


    }
}