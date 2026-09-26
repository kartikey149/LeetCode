class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> m=new HashMap<>();
        for(int i=0;i<knowledge.size();i++){
            List<String> ls=new ArrayList<>(knowledge.get(i));
            m.put(ls.get(0),ls.get(1));
        }
        StringBuilder ans =new StringBuilder();
        StringBuilder var =new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                i++;
                while(s.charAt(i)!=')'){
                    var.append(s.charAt(i));
                    i++;
                }
                
                if(m.containsKey(var.toString())){
                    ans.append(m.get(var.toString()));
                }
                else{
                    ans.append('?');
                }
                var.setLength(0);
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}