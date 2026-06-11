class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<bills.length;i++){
            int c=bills[i];
            map.put(bills[i],map.getOrDefault(bills[i],0)+1);
            if(c==5){
                continue;
            }
            else if(c==10){
                if(map.containsKey(5) && map.get(5)>0){
                     map.put(5,map.getOrDefault(5,0)-1);
                }
                else return false;
            }
            else{
                if(map.containsKey(5) && map.get(5)>0 && map.containsKey(10) && map.get(10)>0){
                     map.put(5,map.getOrDefault(5,0)-1);
                     map.put(10,map.getOrDefault(10,0)-1);
                }
                else if (map.containsKey(5) && map.get(5) >= 3) {
                    map.put(5, map.get(5) - 3);
                } 
                else {
                    return false;
                }
            }
        }
        return true;
    }
}