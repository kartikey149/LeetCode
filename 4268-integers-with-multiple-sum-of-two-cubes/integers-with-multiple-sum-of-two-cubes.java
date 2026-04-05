class Solution {
    public List<Integer> findGoodIntegers(int n) {
        int kahatak=(int)Math.cbrt(n);
        int start=0;
        HashMap<Integer,Integer> map=new HashMap<>();
            while(kahatak>=0){
                int x=(start*start*start)+(kahatak*kahatak*kahatak);
                if(map.containsKey(x)){
                    map.put(x,map.getOrDefault(x,1)+1);
                }else{
                    map.put(x,1);
                }

                if (x > n || start >= kahatak) {
                
                kahatak--;
                start = 0;
            } else {
                start++;
            }
            }
            List<Integer> ls=new ArrayList<>();
            for(int key:map.keySet()){
                if (map.get(key) > 1 && key <= n) {
                ls.add(key);
            }
            }
            Collections.sort(ls);
            return ls;
        
    }
}