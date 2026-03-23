class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int[] array = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            array[i] = nums.get(i);
        }
        int ans=0;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]+array[j]<target && i!=j){
                    ans++;
                }
            }
        }
        return ans;
    }
}