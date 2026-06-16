class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0){
        int a=x%10;
        
        // if(rev==Integer.MAX_VALUE/10 && a>7) return 0;
        // if(rev==Integer.MIN_VALUE/10 && a<-8) return 0;

        rev=rev*10+a;
        x/=10;
    }
    if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
    
    return (int)rev;
    }
}