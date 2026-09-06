class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int count=0;
        int left=0;
        // int ans=Integer.MAX_VALUE;
    
        String ans="";
        for(int i=0;i<s.length();i++){
            if( s.charAt(i)=='1' ){
                count++;
            }
            while(count>k ||(count==k && s.charAt(left)=='0')){
                // System.out.println("hi");

                if(s.charAt(left)=='1') count--;
                left++;
            }
            if(count==k){
                String c=s.substring(left,i+1);
                if(ans.isEmpty() || ans.length()>c.length()||(ans.length()==c.length() && c.compareTo(ans)<0)){
                    ans=c;
                }
            }
        }
        
        return ans;
        
    }
}
