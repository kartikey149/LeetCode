class Solution {
    public int minimumPushes(String word) {
        
        int ans=0;
        // int n=word.length();
        
        for(int i=0;i<word.length();i++){
            // System.out.println(map.get(c));
            if(i<=7){
                ans+=1;
            }
            else if(i>7 && i<=15){
                ans+=2;
            }
            else if(i>15 && i<=23){
                ans+=3;
            }
            else{
                ans+=4;
            }
            // ans+=map.get(c);
        }
        return ans;
    }
}