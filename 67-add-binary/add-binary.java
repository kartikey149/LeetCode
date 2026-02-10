class Solution {
    public String addBinary(String a, String b) {
        int[] res = new int[Math.max(a.length(), b.length()) + 1];
        int i=a.length()-1;
        int j=b.length()-1;
        int h=res.length-1;
        int carry=0;
        while(i>=0 && j>=0){
            if(a.charAt(i)=='1' && b.charAt(j)=='1'){
                if(carry==1){
                    res[h--]=1;
                    carry=1;
                }
                else{

                    res[h--]=0;
                    carry=1;
                }
                
                
            }
            else if(a.charAt(i)=='1' && b.charAt(j)=='0'){
                if(carry==1){
                    res[h--]=0;
                    carry=1;
                }
                else{

                    res[h--]=1;
                    carry=0;
                }
            }
            else if(a.charAt(i)=='0' && b.charAt(j)=='1'){
                if(carry==1){
                    res[h--]=0;
                    carry=1;
                }
                else{

                    res[h--]=1;
                    carry=0;
                }
                
            }
            else{
                if(carry==1){
                    res[h--]=1;
                    carry=0;
                }else{

                    res[h--]=0;
                    carry=0;
                }
            }
            i--;
            j--;


        }
        while(i>=0){
            if(a.charAt(i)=='1'){
                if(carry==1){
                    res[h--]=0;
                    carry=1;
                }
                else{
                    res[h--]=1;
                    carry=0;
                }       
            }
            else{
                if(carry==1){
                    res[h--]=1;
                    carry=0;
                }
                else{
                    res[h--]=0;
                    carry=0;
                }
            }
            i--;
        }
        while(j>=0){
            if(b.charAt(j)=='1'){
                if(carry==1){
                    res[h--]=0;
                    carry=1;
                }
                else{
                    res[h--]=1;
                    carry=0;
                }   
            }
            else{
                if(carry==1){
                    res[h--]=1;
                    carry=0;
                }
                else{
                    res[h--]=0;
                    carry=0;
                }
            }
            j--;
        }
        if (carry == 1) {
            res[h] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < res.length; k++) {
            
            if (k == 0 && res[k] == 0) {
                continue;
            }
            sb.append(res[k]);
        }

        
        String finalresult = sb.length() == 0 ? "0" : sb.toString();
        return finalresult;

    }
}