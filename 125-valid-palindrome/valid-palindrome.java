class Solution {
    public boolean isPalindrome(String s) {
        String lowerstr=s.toLowerCase();
        // System.out.println(lowerstr);
        lowerstr=lowerstr.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder ss=new StringBuilder(lowerstr);

        int start=0;
        int end=lowerstr.length()-1;
        
        while(start<end){
            if(ss.charAt(start)!=ss.charAt(end)){
                return false;
            }
            start++;
            end--;
            

        }
        return true;

    }
}