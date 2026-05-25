class Solution {
    public int passwordStrength(String password) {
        int countn=0,counts=0,countl=0,countv=0;
        int ans=0;
        HashSet<Character> set=new HashSet<>();
        for(char i:password.toCharArray()){
            set.add(i);
        }
        for(char i:set){
            int asc=(int)i;
            if(asc>=48 && asc<=57){
                ans+=3;
                // if(countn>0){
                //     ans-=3;
                // }
                // countn++;
            }
            else if(asc>=65 && asc<=90){
                ans+=2;
                // if(counts>0){
                //     ans-=2;
                // }
                // counts++;
            }
            else if(asc>=97 && asc<=122){
                ans+=1;
                // if(countl>0){
                //     ans-=1;
                // }
                // countl++;
            }
            else if(asc==36 || asc==33 || asc==64 || asc==35){
                ans+=5;
                // if(countv>0){
                //     ans-=5;
                // }
                // countv++;
                
            }
        }
        return ans;
    }
}