class Solution {
    public int myAtoi(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if( (sb.length() == 0 && (s.charAt(i)=='+' || s.charAt(i)=='-'))){
                sb.append(s.charAt(i));
            }

            else if(i>0 && (s.charAt(i)=='+' || s.charAt(i)=='-')) break;
            else if(((int)c>=65 && (int)c<=90) || ((int)c>=97 && (int)c<=122)){
                break;
            }
            else if(sb.length() == 0 && c==' '){
                continue;
            }
            else if(sb.length() != 0 && c==' ') break;
            else if(c=='.') break;
            else{
                sb.append(c);
            }
        }
        long a=0;
        boolean check=false;
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(i==0 && c=='-'){
                check =true;
                
            }
            else if (i == 0 && c == '+') {
                continue; 
            }
            else{
                a*=10;
                System.out.println((int)c);
                System.out.println(c);
                a+=(int)c-(int)'0';
                if (a > Integer.MAX_VALUE && !check) {
                    return Integer.MAX_VALUE;
                }
                if (a > (long)Integer.MAX_VALUE + 1 && check) {
                    return Integer.MIN_VALUE;
                }
            }

            
                
            
        }
        if(check) return (int)(-1*a);
        return (int)a;

        
    }
}