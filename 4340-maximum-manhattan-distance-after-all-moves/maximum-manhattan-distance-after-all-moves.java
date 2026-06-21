class Solution {
    public int maxDistance(String moves) {
        int gr=0,he=0,hh=0;
        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='U'){
                he++;
            }
            else if(c=='D'){
                he--;
            }
            else if(c=='L'){
                gr--;
            }
            else if(c=='R'){
                gr++;
            }
            else{
                hh++;
            }
        }
        return Math.abs(gr)+Math.abs(he)+Math.abs(hh);
    }
}