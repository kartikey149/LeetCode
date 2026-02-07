class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map=new HashMap<>();

        for(String s:strs){
            char[] ke=s.toCharArray();
            Arrays.sort(ke);
            String key=Arrays.toString(ke);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}