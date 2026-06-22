class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        String a="balloon";
        int k=0;
        int ans=0;
        for(int i=0;i<text.length();i++){
            if(map.containsKey(a.charAt(k)) && map.get(a.charAt(k))>0 ){
                map.put(a.charAt(k),map.getOrDefault(a.charAt(k),0)-1);
                k++;
                if(k==a.length()){
                ans++;
                k=0;
                }
                    
            }else {
                return ans;
            }
        }
        return ans;
    }
}