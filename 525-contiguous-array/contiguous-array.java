class Solution {
    public int findMaxLength(int[] nums) {
        int ans2=0;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans2++;
            }else if(nums[i]==1){
                ans2--;
            }
            if(map.containsKey(ans2)){
                int idx=map.get(ans2);
                int count=i-idx;
                if(count>ans){
                    ans=count;
                }
            }
            else{
                map.put(ans2,i);
            }
        }
        return ans;

    }
}