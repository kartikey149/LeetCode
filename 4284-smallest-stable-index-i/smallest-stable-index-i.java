class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int max[] =new int[nums.length]; 
       int min[] =new int[nums.length];
       int m=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        m=Math.max(m,nums[i]);
        max[i]=m;
       } 
       System.out.println(Arrays.toString(max));
       m=Integer.MAX_VALUE;
       for(int i=nums.length-1;i>=0;i--){
        m=Math.min(m,nums[i]);
        min[i]=m;
       } 
       System.out.println(Arrays.toString(min));
       for(int i=0;i<nums.length;i++){
        if((max[i]-min[i])<=k){
            return i;
        }
       }
       return -1;
    }
}