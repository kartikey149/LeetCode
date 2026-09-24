class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(digit(nums[i])==i) return i;
        }
        return -1;
    }
    static int digit(int n){
        int a=n,sum=0;
        while(a!=0){
            int r=a%10;
            sum+=r;
            a/=10;
        }
        return sum;
    }
}