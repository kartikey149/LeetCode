class Solution {
    public int numberOfSubstrings(String s) {
        int ans=0;
        HashMap<Character,Integer> map=new HashMap<>();
        // int ans=0;
        // for(int i=0;i<s.length();i++){
        //     for(int j=i;j<s.length();j++){
        //         char c=s.charAt(j);
        //         map.put(c,map.getOrDefault(c,0)+1);
        //         if(map.containsKey('a') && map.containsKey('b') && map.containsKey('c') && map.get('a')>0 && map.get('c')>0 && map.get('b')>0){
        //             ans++;
        //             ans+=s.length()-j-1;
        //             map.clear();
        //             break;
        //         } 

        //     }
        // }
        int i=0;
        int j=0;
        while(j<s.length() || (map.getOrDefault('a', 0) > 0 && map.getOrDefault('b', 0) > 0 && map.getOrDefault('c', 0) > 0)){
            if(  map.getOrDefault('a',0)>0 && map.getOrDefault('c',0)>0 && map.getOrDefault('b',0)>0){
                ans++;
                ans+=s.length()-j;
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)-1);
                i++;
            }
            else if(j<s.length()){
                char c=s.charAt(j);
                    map.put(c,map.getOrDefault(c,0)+1);
                j++;
            }
            else{
                break;
            }
        }


        return ans;
    }
}