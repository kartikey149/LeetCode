class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map2 = new HashMap<>();
        HashMap<String, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            }


            if (s.charAt(i) == ' ' || i == s.length() - 1) {


                if(j>=pattern.length()){
                    return false;
                }

                if (!map2.containsKey(pattern.charAt(j))) {
                    map2.put(pattern.charAt(j), sb.toString());
                    if (map.containsKey(sb.toString())) {
                        if (pattern.charAt(j) != (map.get(sb.toString()))) {
                            return false;
                        }

                    } else {
                        map.put(sb.toString(), pattern.charAt(j));
                    }
                    j++;

                    sb.setLength(0);
                    
                } else {
                    if (map2.get(pattern.charAt(j)).equals(sb.toString())) {

                        sb.setLength(0);
                        j++;
                    } else {
                        return false;
                    }
                }
            }
            
        }
        return j==pattern.length();
    }
}