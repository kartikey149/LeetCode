class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> ans= new ArrayList<>();
    generate(nums,ans,new ArrayList<>(),0);
    Set<List<Integer>> ans2=new HashSet<>(ans);
    
    return new ArrayList<>(ans2);

    
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