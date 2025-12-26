class Solution {
    public int missingNumber(int[] nums) {
        boolean[] arr=new boolean[nums.length+1];

        for(int i:nums){
            arr[i]=true;
            
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                ans=i;
            }
        }
        return ans;
    }
}