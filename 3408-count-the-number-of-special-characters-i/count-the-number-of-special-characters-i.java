class Solution {
    public int numberOfSpecialChars(String word) {
        

        // HashMap<Character, Interger> map = new HashMap<>();
        // HashMap<Character, Interger> map2 = new HashMap<>();


        // for(int i=65;i<=90;i++){
        //     map.put((char)i,i);
        // }

        
        // for(int i=97;i<=122;i++){
        //     map2.put((char)i,i);
        // }
        // StringBuilder sb=new StringBuilder(word)
        // for(char c:sb){
        //     if(map.containsKey(c)   ){
        //         int index = sb.indexOf(String.valueOf(c));
        //         int index2 = sb.indexOf(String.valueOf(c));



        //         sb.deleteCharAt(index);
        //         ans++;
        //     }

        // }

        // Set<Integer> map1 = new HashSet<>();
        // Set<Integer> map2 = new HashSet<>();

        // for(int i=0;i<word.length();i++){

        //     int j = (int)word.charAt(i);

        //     if(j>91)
        //         map1.add(j);
        //     else
        //         map2.add(32+j);

        // }

        // map1.retainAll(map2);

        // return map1.size();



        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:word.toCharArray()){
            map.put(c,(int)c);
        }
        int ans=0;

        // StringBuilder sb =new StringBuilder(word);
        for(char c:word.toCharArray()){
            // int index=sb.indexOf(String.valueOf(c));
            if((int)c>91){
                if(map.containsKey((char)(c-32))){
                    ans++;
                    map.remove(c);
                    map.remove((char)(c-32));

                }
            }
            else if((int)c>=65 && (int )c<=90){
                if(map.containsKey((char)(c+32))){
                    ans++;
                    map.remove(c);
                    map.remove((char)(c+32));
                }


            }
        }
        return ans;


        

    }
}