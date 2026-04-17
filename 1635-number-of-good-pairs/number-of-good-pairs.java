class Solution {
    public int numIdenticalPairs(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // List<List<<Integer>> ls=new ArrayList<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            // List<Integer> ls1=new ArrayList<>();
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) ans++;
                
            }
        }
        
        return ans;


    }
}