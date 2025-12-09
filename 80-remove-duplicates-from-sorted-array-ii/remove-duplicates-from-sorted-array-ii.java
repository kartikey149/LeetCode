class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) return 0;

        int j = 1; 
        int t = 1; 

        
        for (int i = 1; i < nums.length; i++) {
            
            
            if (nums[i] == nums[i-1]) {
                t++; 
            } else {
                t = 1; 
            }

            
            if (t <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        
        return j; 
    }
}