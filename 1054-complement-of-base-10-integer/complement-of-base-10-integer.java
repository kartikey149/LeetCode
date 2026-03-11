class Solution {
    public int bitwiseComplement(int n) {
        String ans=Integer.toBinaryString(n);
        StringBuilder s=new StringBuilder(ans);
        for(int i=0;i<ans.length();i++){
            if(s.charAt(i)=='0'){
                s.setCharAt(i,'1');
            }
            else{
                s.setCharAt(i,'0');
            }
        }
        String g=s.toString();
        
        int an=Integer.parseInt(g,2);
        return an;

    }
}