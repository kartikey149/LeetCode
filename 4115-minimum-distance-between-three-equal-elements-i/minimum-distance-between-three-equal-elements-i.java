class Solution {
    public int minimumDistance(int[] nums) {
        
        // int target = Integer.MIN_VALUE;
        
        // int ans=Integer.MAX_VALUE;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for (int key : map.keySet()) {
        //     int h = 0;
        //     int freq[] = new int[3];
        //     if (map.get(key) >= 3) {
        //         target = key;
        //         for (int i = 0; i < nums.length && h < 3; i++) {
        //             if (target == nums[i]) {
        //                 freq[h] = i;
        //                 h++;
        //             }

        //         }
        //         int dist=Math.abs(freq[0] - freq[1]) + Math.abs(freq[1] - freq[2]) + Math.abs(freq[2] - freq[0]);
        //         ans=Math.min(dist,ans);
        //     }
        // }

        
        // return ans==Integer.MAX_VALUE?-1:ans;

        int ans=Integer.MAX_VALUE;
        // int sum=0;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[k] && nums[j]==nums[k]){
                        int sum=Math.abs(i-j) + Math.abs(j-k) + Math.abs(i-k);


                    ans=Math.min(ans,sum);
                    }
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
        






    }
}