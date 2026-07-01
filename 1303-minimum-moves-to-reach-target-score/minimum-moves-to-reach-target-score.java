class Solution {
    public int minMoves(int target, int d) {
        long x=(long)target;
        int ans=0;
        
        while(x>1){
            if (d == 0) {
                ans += (x - 1);
                break;
            }
            if( x%2==0){
                x/=2;
                d--;
                
            }else{
                x--;
            }
            ans++;
        }
        return ans;
    }
}