class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int diff=10;
        boolean ans=true;
        while(n>=diff){
            n-=diff;
            diff--;
            ans=!ans;
        }
        return !ans;
    }
}