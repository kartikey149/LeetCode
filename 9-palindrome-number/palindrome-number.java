class Solution {
    public boolean isPalindrome(int x) {
        // String str=Integer.toString(x);
    
        // char[] charArray =str.toCharArray();
        
        // int low=0;
        // int high=str.length()-1;
        
        // while(low<=high){
        //     char temp=charArray[low];
        //     charArray[low]=charArray[high];
        //     charArray[high]=temp;
            
        //     low++;
        //     high--;
            

            
        // }
        // String revstr=new String(charArray);
        // if(revstr.equals(str)){
        //     return true;
        // }
        
        if(x<0 || (x>0 && x%10==0)){
            return false;
        }
        int z=x;
        int rev=0;
        while(z!=0){
            int a=z%10;

            // System.out.println(a);
            z=z/10;
            rev=rev*10+a;
            


        }
        if(x==rev){
            return true;
        }

        return false;
        
    

        
    }
}