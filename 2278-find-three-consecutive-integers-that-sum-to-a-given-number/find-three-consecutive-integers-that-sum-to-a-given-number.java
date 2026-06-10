class Solution {
    public long[] sumOfThree(long num) {
        if(num%3==0){
            long nums[]=new long[3];
            long a=num/3-1;
            for(int i=0;i<nums.length;i++){
                nums[i]=a++;
            }
            return nums;
        }
        return new long[]{};
    }
}