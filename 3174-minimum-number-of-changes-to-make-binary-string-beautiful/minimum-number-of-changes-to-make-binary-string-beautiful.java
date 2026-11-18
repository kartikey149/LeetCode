class Solution {
    public int minChanges(String s) {
        Map<String,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i+=2){
            String h=s.substring(i,i+2);
            map.put(h,map.getOrDefault(h,0)+1);
        }
        for(String h:map.keySet()){
            if(h.equals("11") || h.equals("00")){
                continue;
            }
            count+=map.get(h);
        }
        return count;
    }
}