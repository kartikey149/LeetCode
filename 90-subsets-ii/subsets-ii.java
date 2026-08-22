class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> s=new ArrayList<>();
        
        count(nums,0,new ArrayList<>(),s);
        Set<List<Integer>> s1=new HashSet<>(s);
        


        return new ArrayList<>(s1);
    }
    static void count(int nums[],int i,List<Integer> ls,List<List<Integer>> ls2){
        if(i==nums.length){
            // Collections.sort(ls);
            ls2.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[i]);
        count(nums,i+1,ls,ls2);
        ls.removeLast();
        count(nums,i+1,ls,ls2);
    }
}