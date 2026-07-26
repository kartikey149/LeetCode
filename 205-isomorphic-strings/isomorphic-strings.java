class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        int k=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char ss=t.charAt(i);
            if(map.containsKey(c) && map.get(c)!=ss){
                return false;
            }
            if(map2.containsKey(ss) && map2.get(ss)!=c){
                return false;
            }
            map.put(c,ss);
            map2.put(ss,c);
        }
        return true;
   
       
    }
}