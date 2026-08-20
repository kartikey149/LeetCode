class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0;
        int ans=0;
        int left=0;
        int cost=0;
        while(i<s.length()){
            int a=s.charAt(i)-'a';
                int b=t.charAt(i)-'a';
                int diff=Math.abs(a-b);
                cost+=diff;
                while( left<s.length() && cost>maxCost){
                    
                int a1=s.charAt(left)-'a';
                int b1=t.charAt(left)-'a';
                int diff1=Math.abs(a1-b1);
                cost-=diff1;

                left++;
                }

                
                

                ans=Math.max(i-left+1,ans);
                
                i++;
        }
        
        return ans;
    }
}