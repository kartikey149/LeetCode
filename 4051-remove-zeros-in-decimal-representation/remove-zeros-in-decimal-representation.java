class Solution {
    public long removeZeros(long n) {
        
        String st=String.valueOf(n);

        String s="";

        long res=0;

        for(int i=0;i<st.length();i++){

            if(st.charAt(i)=='0'){

                continue;

            }else{
                s+=st.charAt(i);




            }

        }

        res=Long.parseLong(s);

        return res;

    
    }
}