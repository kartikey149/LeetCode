class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs[0]==null) return new ArrayList<>();
        Map<String,List<String>> m=new HashMap<>();
        for(String s:strs){
            char[] a=s.toCharArray();
            Arrays.sort(a);
            String keyy=String.valueOf(a);
            if(!m.containsKey(keyy)){
                m.put(keyy,new ArrayList<>());
            }
            m.get(keyy).add(s);
        }
        return new ArrayList<>(m.values());
    }
}