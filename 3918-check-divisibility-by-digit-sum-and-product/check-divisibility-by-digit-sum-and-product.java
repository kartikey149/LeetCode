class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int a=n;
        while(a!=0){
            int r=a%10;
            sum+=r;
            a/=10;
        }
        int pro=1;
        int b=n;
        while(b!=0){
            int r=b%10;
            pro*=r;
            b/=10;
        }
        return n%(sum+pro)==0;
    }
}