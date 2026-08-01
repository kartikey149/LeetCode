class Solution {
    public int countTriplets(int[] num) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int c:num){
            for(int a:num){
                map.put((a&c),map.getOrDefault((a&c),0)+1);
            }
        }
        int ans=0;

        for(int s:num){
            for(int a:map.keySet()){
                if((s&a)==0){
                    ans+=map.get(a);
                }
            }
        }
        return ans;
    }
}