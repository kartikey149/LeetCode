class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
    
        char[] charArray =str.toCharArray();
        
        int low=0;
        int high=str.length()-1;
        
        while(low<=high){
            char temp=charArray[low];
            charArray[low]=charArray[high];
            charArray[high]=temp;
            
            low++;
            high--;
            

            
        }
        String revstr=new String(charArray);
        if(revstr.equals(str)){
            return true;
        }

        return false;
        
    

        
    }
}