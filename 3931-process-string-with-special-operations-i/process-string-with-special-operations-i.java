class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='*'){
                if(sb.length()!=0){
                    sb.deleteCharAt(sb.length()-1);
                }

            }else if(c=='#'){
                sb.append(sb);
            }
            else if(c=='%'){
                int start=0;
                int end=sb.length()-1;
                while(start<end){
                    char a=sb.charAt(start);
                    sb.setCharAt(start,sb.charAt(end));
                    sb.setCharAt(end,a);
                    start++;
                    end--;
                }
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}