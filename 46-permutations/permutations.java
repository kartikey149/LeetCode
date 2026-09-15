class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        count(new ArrayList<>(),new HashSet<>(),nums, ans);
        return ans;
    }
    static void count(ArrayList<Integer> ls,Set<Integer> s,int[] arr,List<List<Integer>> ans){
        if(s.size()==arr.length){
            ans.add(new ArrayList<>(ls));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                ls.add(arr[i]);
                count(ls,s,arr,ans);
                ls.remove(ls.size()-1);
                s.remove(arr[i]);
            }
        }
    }
}