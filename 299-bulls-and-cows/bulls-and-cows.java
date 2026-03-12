class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<secret.length();i++){
            map.put(secret.charAt(i),map.getOrDefault(secret.charAt(i),0)+1);
        }

        int cow=0;
        int bull=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bull++;
            }
            if(map.getOrDefault(guess.charAt(i),0)>0){
                cow++;
                map.put(guess.charAt(i),map.get(guess.charAt(i))-1);
            }
        }
        // cow=cow-bull;
        return bull+"A"+(cow-bull)+"B";
    }
}