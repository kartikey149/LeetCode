class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       generate(nums,ans,new ArrayList<>(),0);
       return ans;


    }
    static void generate(int[] nums,List<List<Integer>> ans,List<Integer> ls,int i){
        if(i==nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[i]);
        generate(nums,ans,ls,i+1);
        ls.remove(ls.size()-1);
        generate(nums,ans,ls,i+1);
    }
    
}