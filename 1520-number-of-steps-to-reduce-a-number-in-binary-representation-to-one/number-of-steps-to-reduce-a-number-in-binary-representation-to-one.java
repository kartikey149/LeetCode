class Solution {
    public int numSteps(String s) {
        int count=0;
        int steps=0;
        for(int i=s.length()-1;i>0;i--){
            int a=Character.getNumericValue(s.charAt(i))+steps;
            if(a%2!=0){
                count+=2;
                steps=1;
        }
            else{
                count+=1;
                

            }


        }
        return count+steps;
        

    }
}