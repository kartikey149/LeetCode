class Solution {
    public int minChanges(String s) {
     
        int count=0;
        for(int i=0;i<s.length();i+=2){
            String h=s.substring(i,i+2);
            if(h.equals("11") || h.equals("00")){
                continue;
            }
            count++;
        }
        
        return count;
    }
}