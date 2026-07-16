class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        // String str=Integer.toString(n,3);
        // System.out.print(str);
        // int ans=0;
        // int un=0;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='1'){
        //         ans++;
        //     }
        //     else if(str.charAt(i)!='1' && str.charAt(i)!='0') un++;
            
        // }
        
        // System.out.print(ans);
        // if(ans==0) return false;
        // return ans>1 || un>0?false:true;
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}