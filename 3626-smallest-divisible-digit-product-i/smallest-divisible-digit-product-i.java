class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=0;i<10;i++){
            boolean c=checkIfDivisible(n,t);
            if(c){
                break;
            }
            n++;
        }
        return n;

    }
    static boolean checkIfDivisible(int n,int t){
        int a=n;
        int mul=1;
        while(a!=0){
            int te=a%10;
            mul*=te;
            a/=10;
        }
        return mul%t==0;
    }
}