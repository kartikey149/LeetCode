class Solution {
    public int numRabbits(int[] answers) {
       
        int ans=0;

        Arrays.sort(answers);
        int i=0;
        while(i<answers.length){
            int a=answers[i];
            int limit=a;
            int h=i+1;
            while(h<answers.length && answers[h]==a && limit>0){
                limit--;
                h++;
            }
            ans+=a+1;
            i=h;

           
            
        }
        return ans;

    }
}