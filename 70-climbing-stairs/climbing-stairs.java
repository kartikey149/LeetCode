class Solution {
    public int climbStairs(int n) {
        // if(n <=0)return 1;
        // if(n<=3)return n;
        // return climbStairs(n-1) + climbStairs(n-2);

        if(n<3) return n;
        int a=1,b=2;
        int ans=0;
        for(int i=3;i<=n;i++){
            ans=a+b;
            a=b;
            b=ans;
        }
        return ans;
    }
}