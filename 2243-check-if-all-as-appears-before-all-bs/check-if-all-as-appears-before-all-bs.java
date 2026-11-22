class Solution {
    public boolean checkString(String s) {
       for(int i=0;i<s.length();i++){
        if(i+1<s.length() && s.charAt(i)=='b' && s.charAt(i+1)=='a'){
            return false;
        }
       } 
       return true;
    }
}