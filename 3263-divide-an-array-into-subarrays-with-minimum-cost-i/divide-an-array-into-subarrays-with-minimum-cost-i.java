class Solution {
    public int minimumCost(int[] nums) {
        int[] ans=new int[nums.length-1];

        int h=1;
        for(int i=0;i<ans.length;i++){
            ans[i]=nums[h];
            h++;
        }
        Arrays.sort(ans);
        
        return nums[0] + ans[0]+ans[1];
        
    }
}