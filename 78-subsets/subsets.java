class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls2=new ArrayList<>();
        count(nums,0,new ArrayList<>(),ls2);
        return ls2;


    }
    static void count(int[] nums,int i,List<Integer> ls,List<List<Integer>> ls2){
        if(i==nums.length){
            ls2.add(new ArrayList<>(ls));
            return;
        }

        ls.add(nums[i]);
        count(nums,i+1,ls,ls2);
        ls.removeLast();
        count(nums,i+1,ls,ls2);
    }
}