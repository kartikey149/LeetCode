class Solution {
    public int mirrorDistance(int n) {
        System.out.print(reverse(n));
        return Math.abs(reverse(n)-n);
    }
    private static int reverse(int m){
        int num=m;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
}