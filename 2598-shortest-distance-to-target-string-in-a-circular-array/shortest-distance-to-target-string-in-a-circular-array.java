class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int i=startIndex,j=startIndex;
        int ans=0,ans2=0,ans1=0;

        while(!words[i].equals(target)){
            
            i=(i-1+words.length)%words.length;
            
            ans1++;
            System.out.println(ans1);
            if(ans1>words.length){
                return -1;
            }

        }
        while(!words[j].equals(target)){
            j=(j+1)%words.length;
            ans2++;
            if(ans2>words.length){
                return -1;
            }
            System.out.println(ans2);

        }
        ans=Math.min(ans1,ans2);
        return ans;

    }
}