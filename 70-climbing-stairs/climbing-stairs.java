class Solution {
    public int climbStairs(int n) {
        // if(n <=0)return 1;
        // if(n<=3)return n;
        // return climbStairs(n-1) + climbStairs(n-2);

        if(n<=3) return n;
        int a=2,b=3;
        int ans=0;
        for(int i=4;i<=n;i++){
            ans=a+b;
            a=b;
            b=ans;
        }
        return b;
    }
}