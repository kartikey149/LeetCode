class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s=new StringBuilder();
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i) - '0')%2!=0){
                for(int j=0;j<=i;j++){
                    s.append(num.charAt(j));
                    // break;
                }
                
                return s.toString();
            }
        }
        return "";
    }
}