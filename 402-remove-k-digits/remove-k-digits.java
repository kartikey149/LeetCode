class Solution {
    public String removeKdigits(String s, int k) {
        // Stack<Character> st=new Stack<>();
        // if(k==s.length()) return "0";
        
        // if(k==1 && s.length()==1) return "0";
        // for(int i=0;i<s.length();i++){
        //     if(!st.isEmpty() && k>0 && st.peek()<s.charAt(i)){
        //         k--;

        //     }
        //     else if(!st.isEmpty() && k>0 && st.peek()>s.charAt(i)){
        //         char sa=st.pop();
        //         System.out.println(sa);
        //         st.push(s.charAt(i));
        //         k--;
        //     }
        //     else{
        //         st.push(s.charAt(i));
        //     }
        //     // if(!st.isEmpty() && k>0){
        //     //      while(!st.isEmpty() && st.peek()>s.charAt(i)){
        //     //         st.pop();
        //     //     }
        //     //     k--;
        //     // }
           
        //     // st.push(s.charAt(i));
        // }
        // System.out.print(k);

        // StringBuilder sb=new StringBuilder();
        // for(char c:st){
        //     sb.append(c);
        // }
        // sb.delete(0,k);
        int n = s.length();
        if (k >= n) return "0";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            while (sb.length() > 0 && k > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            
            sb.append(c);
        }

        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

  
        int start = 0;
        while (start < sb.length() && sb.charAt(start) == '0') {
            start++;
        }

       
        String result = sb.substring(start);
        return result.isEmpty() ? "0" : result;
        

        

    }
}