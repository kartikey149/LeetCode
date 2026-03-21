class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int ans=0;
        int ans2=0;
        for(int i=0;i<s.length();i++){
            int len1=count(s,i,i);
            int len2=count(s,i,i+1);
            int anss=Math.max(len1,len2);

            if(anss>(ans2-ans)){
                ans=i-(anss-1)/2;
                ans2=i+anss/2;
            }
            
        }
        return s.substring(ans,ans2+1);
    }

    public int count(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}