class Solution {
    public int gcdOfOddEvenSums(int n) {
        
        long b = ((2+n*2)*(n))/2;
        
        long a = ((n*2-1+1)*(n))/2;
        System.out.println(a+" "+b);
        
        
        return (int)getGCD(a, b);
    }
    
    private long getGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    
}