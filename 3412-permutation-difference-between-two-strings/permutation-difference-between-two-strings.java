class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
            map1.put(t.charAt(i),i);
        }
        int ans=0;
        for(char key:map.keySet()){
            ans+=Math.abs(map.get(key)-map1.get(key));
        }
        return ans;
    }
}