class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=0;
        while(left<right){
            if(height[left]<height[right]){
                int diff=right-left;
                ans=Math.max(diff*height[left],ans);
                left++;
            }else{
                int diff=right-left;
                ans=Math.max(diff*height[right],ans);
                right--;

            }
        }
        return ans;
    }
}