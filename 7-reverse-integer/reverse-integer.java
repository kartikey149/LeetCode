class Solution {
    public int reverse(int x) {
        int z=x;
        int rev=0;
        while(z!=0){
            int a=z%10;

        if (rev > Integer.MAX_VALUE / 10) {
                return 0; 
            }
        
            if (rev == Integer.MAX_VALUE / 10 && a > 7) {

                return 0; 
            }
            
            
            if (rev < Integer.MIN_VALUE / 10) {
                return 0; 
            }

            if (rev == Integer.MIN_VALUE / 10 && a< -8) {
        
                return 0;
            }
            z=z/10;
            rev=rev*10+a;
            


        }
        
        return rev;

        
    }
}