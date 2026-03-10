class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int co=0;
        int anns=0;
        while(i<s.length()){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                i++;
                co++;
                anns=Math.max(co,anns);
            }
            else{
                i=map.get(s.charAt(i))+1;
                map.clear();
                co=0;
            }
        }
        return anns;
    }
}