class Solution {
    public String simplifyPath(String s) {
        
        Stack<Character> st = new Stack<>();
        int i=0;

        while (i < s.length()) {
            // st.push(s.charAt(i));
            if (st.size()>0 && st.peek() == '/' && s.charAt(i) == '/') {
                i++;
                continue;
            }
            else if (s.charAt(i) == '.') {

                int count = 0;
                int j = i;

                while (j<s.length() && s.charAt(j) == '.') {

                    count++;
                    j++;
                }
                boolean isStandalone = (st.isEmpty() || st.peek() == '/') && (j == s.length() || s.charAt(j) == '/');

                if (count == 1 && isStandalone) {
                    
                    i += count;
                }
                 else if (count == 2 && isStandalone) {
                    int c = 2;
                    i+=count;
                    while (st.size()>1&&c > 0) {
                        if (st.peek() == '/') {
                            c--;
                        }
                        st.pop();
                    }
                    if (st.isEmpty() || st.peek() != '/') {
                        st.push('/');
                    }
                } 
                else {
                   while (i < j) {
                        st.push(s.charAt(i));
                        i++;
                    }
                }
            }
            else{
                st.push(s.charAt(i));
                i++;
            }
        }
        if(st.size()>1 && st.peek()=='/'){
            st.pop();
        }
        StringBuilder sb=new StringBuilder();
        for (Character element : st) {
            sb.append(element);
        }
        if(sb.length()==0){
            sb.append('/');
        }
        return sb.toString();

    }
}