class Solution {
    public String reverseWords(String s) {
        
        StringBuilder ans=new StringBuilder();
            StringBuilder d=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char in=s.charAt(i);
            if(s.charAt(i)!=' '){
                d.append(in);
            }
            else if(d.length()>0){
                ans.append(reverse(d.toString()));
                ans.append(' ');
                d.setLength(0);

                
            }
            

        }
        if(d.length()>0){
                ans.append(reverse(d.toString()));
            }
        return ans.toString().trim();
        
    }

    public String reverse(String s){
        StringBuilder a=new StringBuilder(s);
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            char temp=a.charAt(left);
            a.setCharAt(left,a.charAt(right));
            a.setCharAt(right,temp);
            left++;
            right--;
        }
        return a.toString();
    }
}