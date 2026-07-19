class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Stack<Character> st=new Stack<>();
        boolean[] visit =new boolean[26];
        int i=0;
        while(i<s.length()){
            char curr = s.charAt(i);
            map.put(curr, map.get(curr) - 1);
            if(visit[curr-'a']){
                i++;
                continue;
            }
            
                //check krenge agar peek ki occurence 1 hai toh seedha push krenge
                // if(map.get(st.peek())==1){
                //     st.push(s.charAt(i++));
                // }
                

                while(st.size()>0 && (int )st.peek()>=(int)s.charAt(i) && map.get(st.peek())>0){
                    
                    char c=st.pop();
                    visit[c-'a']=false;
                }
               
            
        
                st.push(s.charAt(i++));
                visit[curr-'a']=true;

            
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}