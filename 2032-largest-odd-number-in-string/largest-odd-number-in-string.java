class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s=new StringBuilder();
        int j=-1;
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i) - '0')%2!=0){
                j=i;
                break;
                
                
            }
        }

        for(int i=0;i<=j;i++){
            s.append(num.charAt(i));
        }
        return s.toString();
    }
}