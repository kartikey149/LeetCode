class Solution {
    public int maxArea(int[] height) {
        int[] num=new int[height.length];
        int low=0;
        int high=height.length-1;
        int k=0;
        while(low<high){
            if(height[low]>height[high]){
                num[k]=(high-low)*height[high];
                high--;
                k++;
            }
            else{
                num[k]=height[low]*(high-low);
                low++;
                k++;
               
            }
        }
        int max=num[0];
        for(int l=0;l<num.length;l++){
            if(max<num[l]){
                max=num[l];
            }
        }
        return max;
    }
}