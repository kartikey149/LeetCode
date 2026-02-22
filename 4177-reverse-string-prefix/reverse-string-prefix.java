class Solution {
    public String reversePrefix(String s, int k) {

        if(k==-1){
            return s;
        }
        int left=0;
        int right=k-1;
        StringBuilder str=new StringBuilder(s);
        while(left<right){
            char temp=str.charAt(left);
            str.setCharAt(left,str.charAt(right));
            str.setCharAt(right,temp);
            left++;
            right--;
        }
        return str.toString();
        
    }
}