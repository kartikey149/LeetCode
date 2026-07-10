class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1) || map.containsKey(nums[i]+1)){
                continue;
            }
            else if(map.get(nums[i])>1){
                continue;
            }
            else{
                ls.add(nums[i]);
            }
        }
        return ls;

    }
}