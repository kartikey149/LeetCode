class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        StringBuilder st1=new StringBuilder(s1);
        StringBuilder st2=new StringBuilder(s2);

        for(int i=0;i<4;i++){
            if(i<2 && st1.charAt(i)!=st2.charAt(i)){
                
            char temp=st1.charAt(i);
            st1.setCharAt(i,st1.charAt(i+2));
            st1.setCharAt(i+2,temp);
            System.out.println(st1);
            }
            
            // if(i>=2 && st1.charAt(i)!=st2.charAt(i)){
            //     return false;
            // }
            



        }
        return st1.toString().equals(st2.toString());

    }
}