class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s;
        TreeMap<Character,Integer> map=new TreeMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        boolean check=false;
        char odd=' ';
        
        
        StringBuilder sb = new StringBuilder();

        List<Character> keys = new ArrayList<>(map.keySet());
        System.out.print(keys.toString());
        for(int i=0;i<keys.size();i++){
            char c = keys.get(i);
            if(map.get(c)%2!=0){
                odd=c;
                check=true;
            }
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