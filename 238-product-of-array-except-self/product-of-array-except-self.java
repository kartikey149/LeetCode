class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int rightp=1;
        int leftp=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=leftp;
            leftp*=nums[i];
        }
        int[] arrr=new int[nums.length];
        int l=0;
        for(int i=nums.length-1;i>=0;i--){
            arrr[l]=rightp;
            rightp*=nums[i];
            l++;
        }
        int loe=0;
        int high=nums.length-1;
        while(loe<=high){
            int temp=arrr[loe];
            arrr[loe]=arrr[high];
            arrr[high]=temp;
            loe++;
            high--;
        }
        for(int i=0;i<nums.length;i++){
            arr[i]*=arrr[i];
        }
    return arr;
    }
}