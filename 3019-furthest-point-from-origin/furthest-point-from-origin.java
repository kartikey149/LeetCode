class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        // boolean under=false;
        int ans1=0;
        int ans2=0;
        int ans3=0;

        for(int i=0;i<moves.length();i++){
            char c=moves.charAt(i);
            if(c=='L'){
                
                ans1--;


            }
            else if(c=='R'){
                
                ans2++;
            }
            else if(c=='_'){
                ans3++;
            }
        }
        return Math.abs(ans1+ans2)+ans3;
    }
}