class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s;
        TreeMap<Character,Integer> map=new TreeMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int[]arr=new int[map.size()];
        boolean check=false;
        char odd=' ';
        int j=0;
        for(char c:map.keySet()){
            if(map.get(c)%2!=0){
                odd=c;
                check=true;
            }
            arr[j]=map.get(c)/2;
            j++;
        }
        StringBuilder sb = new StringBuilder();

        List<Character> keys = new ArrayList<>(map.keySet());
        for(int i=0;i<keys.size();i++){
            char c = keys.get(i);
            for(int k=0;k<map.get(c)/2;k++){
                sb.append(c);
            }
        }
        StringBuilder sb2=new StringBuilder(sb);
        if(check){
            sb2.append(odd);
        }
        sb2.append(new StringBuilder(sb).reverse());
        return sb2.toString();


        
        
        
    }
    
}