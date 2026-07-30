class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:word.toCharArray()){
            if(map.size()<8){
                map.put(c,1);
            }
            else if(map.size()>=8 && map.size()<16){
                map.put(c,2);
            }
            else if(map.size()>=16 && map.size()<24){
                map.put(c,3);
            }
            else{
                map.put(c,4);
            }
        }
        int ans=0;
        for(char c:word.toCharArray()){
            System.out.println(map.get(c));
            ans+=map.get(c);
        }
        return ans;
    }
}