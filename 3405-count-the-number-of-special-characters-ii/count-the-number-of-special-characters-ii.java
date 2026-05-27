class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> mapl = new HashMap<>();
        HashMap<Character, Integer> mapu = new HashMap<>();


        for (char c : word.toCharArray()) {
            map.put(c, (int) c);
        }
        for (int i = 0; i < word.length(); i++) {
            if ((int) word.charAt(i) > 91) {

                mapl.put(word.charAt(i), i);
            }
        }
        for(int i=0;i<word.length();i++){
            if  ((int)word.charAt(i)<91 && mapu.containsKey(word.charAt(i))){
                continue;
            }
            else{
                if((int)word.charAt(i)<91){

                mapu.put(word.charAt(i),i);
                }
            }
        }

        int count = 0;
        int first = Integer.MIN_VALUE;

        int last = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if ((int) c > 91 ) {
                if (mapl.containsKey(c) && mapu.containsKey((char)(c - 32))) {
                    int a=mapl.get(c);
                    int b=mapu.get((char)(c-32));
                    if (a<b) {
                        ans++;
                        mapu.remove((char) (c - 32));
                        mapl.remove(c);
                    }
                }

            }
        }

        return ans;

    }
}