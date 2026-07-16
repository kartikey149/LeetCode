class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i+=2*k){
            int left=i;
            int start = Math.min(i + k - 1, s.length() - 1);
            while(left<start){
                char c=sb.charAt(left);
                sb.setCharAt(left,sb.charAt(start));
                sb.setCharAt(start,c);
                left++;
                start--;
            }
        }
        return sb.toString();
    }
}