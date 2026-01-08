class Solution {
    public int lengthOfLastWord(String s) {
        // String s="   fly me   to   the moonrjfrtgt";
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        for(int i=sb.length()-1;i>=0;i--){
            Character c=sb.charAt(i);
            

            if(c!=' '){
                count++;
            }
            if(c==' ' && count>0){
                break;
            }
        }
        return count;
        
    }
}