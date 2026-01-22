class Solution {
    public String longestCommonPrefix(String[] strs) {
        String word=strs[0];
        // int wordlen=word.length()-1;
        int itert=0;
        StringBuilder count=new StringBuilder("");
        

        while(itert<word.length()){
            char chh=word.charAt(itert);
            for(int i=1;i<strs.length;i++){
                // st=Math.min(st,strs[i].length());
                
                if(itert == strs[i].length() ||chh!=strs[i].charAt(itert)){
                    return count.toString();

                }
                

            }
            count.append(chh);
            
            itert++;
        }
        return count.toString();
        
    }
}