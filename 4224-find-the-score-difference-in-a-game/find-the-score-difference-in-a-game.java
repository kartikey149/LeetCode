class Solution {
    public int scoreDifference(int[] nums) {
        int score1=0;
        int score2=0;
        boolean p1=true;
        boolean p2=false;


        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                p1=!p1;
                p2=!p2;

            }
            if(i%6==5){
                p1=!p1;
                p2=!p2;
            }
            if(p1){
                score1+=nums[i];
            }
            if(p2){
                score2+=nums[i];
            }
        }
        return score1-score2;
    }
}