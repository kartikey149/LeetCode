class Solution {
    // record Pair<V,K>(V first,K second){}
    public String reverseParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                while(s.charAt(i)!=')'){
                    if(s.charAt(i)=='('){
                        st.push(sb.length());
                        i++;
                        continue;
                    }
                    sb.append(s.charAt(i));
                    i++;
                }
                int t=st.pop();
                reverse(sb,t,sb.length()-1);
            }
            else{
                if(s.charAt(i)==')'){
                    reverse(sb,st.pop(),sb.length()-1);
                    continue;
                }
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    static void reverse(StringBuilder sb,int left,int right){

        while(left<right){
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }
}