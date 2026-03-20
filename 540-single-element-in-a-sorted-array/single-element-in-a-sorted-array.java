class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int a=0;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                a=i;
            }
        }
        return a;
    }
}