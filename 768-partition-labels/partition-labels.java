class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int k=0;k<s.length();k++){
            map.put(s.charAt(k),k);
        }
        
        List<Integer> ls=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int ans=map.get(s.charAt(i));
            
            int start=i;
            for(int j=i;j<=ans;j++){
                ans=Math.max(ans,map.get(s.charAt(j)));
                
            }
            ls.add(Math.abs(i-ans)+1);
            i=ans;
            i++;
        }
        return ls;
    }
}