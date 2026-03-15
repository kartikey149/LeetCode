class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1=new int[nums.length/2];
        int[] arrneg=new int[nums.length/2];
        int k=0,h=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr1[h++]=nums[i];
            }else{
                arrneg[k++]=nums[i];
            }
        }
        int j=0,l=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=arr1[j++];
            }else{
                nums[i]=arrneg[l++];
            }
        }
        return nums;
    }
}