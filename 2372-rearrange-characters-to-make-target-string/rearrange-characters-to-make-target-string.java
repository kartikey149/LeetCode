class Solution {
    public int rearrangeCharacters(String text, String target) {
         HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<text.length();i++){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        }
        
        int k=0;
        int ans=0;
        for(int i=0;i<text.length();i++){
            if(map.containsKey(target.charAt(k)) && map.get(target.charAt(k))>0 ){
                map.put(target.charAt(k),map.getOrDefault(target.charAt(k),0)-1);
                k++;
                if(k==target.length()){
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