class Solution {
    public boolean checkPowersOfThree(int n) {
        int g=0;
        for(int i=0;i<20;i++){
            int h=(int)Math.pow(3,i);
            if(h<=n){
                g=i;

            }
            else{
                g=i-1;
                break;
            }
        }
        while(n>0){
            if(n-(int)Math.pow(3,g)>=0){
                n-=(int)Math.pow(3,g);
            }
            if(g<0) return false;
            System.out.println(g+" "+n);

            g--;
        }
        return n==0;

    }
}