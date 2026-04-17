class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st=new Stack<>();
        int i=0,j=0;
        // st.push(pushed[0]);
        // i++;
        while(i<pushed.length){
                st.push(pushed[i]);
            if(st.peek()!=popped[j]){
                i++;
            }else{
                while(!(st.empty()) && st.peek()==popped[j]){
                    st.pop();
                    j++;
                }
                i++;
            }
        }
        return st.size()==0;
    }
}