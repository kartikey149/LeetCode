class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[i];
        }
        int h=0;
        for(int i=nums.length;i<res.length;i++){
            res[i]=nums[h];
            h++;
        }
        return res;
    }
}