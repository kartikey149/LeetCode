class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        HashMap<Character,Integer> map3=new HashMap<>();
        char[] keys = {'q', 'r', 'w', 'e', 't', 'y', 'u', 'i', 'o', 'p'};
        for(char a:keys){
            map.put(a,0);
        }
         char[] keys2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'j', 'k', 'l'};
         char[] keys3 = { 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
         for(char a:keys2){
            map2.put(a,0);
         }
         for(char a:keys3){
            map3.put(a,0);
         }
         List<String> ls=new ArrayList<>();
         for(String i:words){
            int a=0,b=0,c=0;
            String d=i;
            i=i.toLowerCase();

            for(char j:i.toCharArray()){
                if(map.containsKey(j) ){
                    a++;
                }
                if(map2.containsKey(j) ){
                    b++;
                }
                if(map3.containsKey(j) ){
                    c++;
                }
            }
            if(a==i.length() || b==i.length() || c==i.length()){
                ls.add(d);
            }
         }
         int g=0;
         String arr[]=new String[ls.size()];
         for(String v:ls){
            arr[g++]=v;
         }
         return arr;




    }
}