class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> a11=new ArrayList<>();
        int h=0;
         for(String s:words){
            char[] a=s.toCharArray();
            for(char a1:a){
                if(a1==x){
                    a11.add(h);
                    break;
                }
            }
            h++;
        }
        return a11;
    }
}