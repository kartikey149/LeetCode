class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] f=new int[26];
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'a';
            f[d]++;
        }
        int sum=0;
        int count=1;
        int left=0;
        for(int i=0;i<s.length();i++){
            sum+=widths[s.charAt(i)-'a'];
            if(sum>100){
                count++;
                left=widths[s.charAt(i)-'a'];
                sum=widths[s.charAt(i)-'a'];
            }
        }
        left=sum;
        return new int[]{count,left};
    }
}