class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int h=1;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        int rev=26-(c-'a');
        sum=sum+(rev )*h;
        h++;
       } 
       return sum;
    }
}