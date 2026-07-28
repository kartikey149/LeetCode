class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int co=1;
        int ans=1;
        int j=0;
        while(i+1<nums.length){
            if( nums[i]==nums[i+1]){
                if(co<2){
                    j++;
                nums[j]=nums[i+1];
                co++;
                ans++;

                }
                i++;
                
            }
            
            else {
                System.out.println(j+" "+i);
                j++;
                
                nums[j]=nums[i+1];
                co=1;
                ans++;
                i++;
            }
        }
        return ans;
    }
}