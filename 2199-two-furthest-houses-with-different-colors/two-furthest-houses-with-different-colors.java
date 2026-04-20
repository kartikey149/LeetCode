class Solution {
    public int maxDistance(int[] colors) {
        int left=0;
        int right=colors.length-1;
        int diff=0;
        while(left<right){
            if(colors[left]==colors[right]){
                
                right--;
            }else{
                diff=Math.max(diff,right-left);
                left++;
            }
        }
        left=0;
        right=colors.length-1;
        int diff2=0;
        while(left<right){
            if(colors[left]==colors[right]){
                left++;
            }
            else{
                diff2=Math.max(diff2,right-left);
                right--;
            }
        }
        return diff>diff2?diff:diff2;
    }
}