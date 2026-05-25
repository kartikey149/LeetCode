class Solution {
    public boolean doesAliceWin(String s) {
        boolean check=false;
        char ans=' ';
        int count=0;
        for(char i:s.toCharArray()){
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                count++;
            }
            
            
            
        }
        
        if(count==0) return false;
        return  true;
    }
}