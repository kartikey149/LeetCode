class Solution {
    public int countElements(int[] nums, int k) {
        Arrays.sort(nums);
        if(k==0) return nums.length;
        int n=nums.length;
        int count=0;
        for(int i=0;i<nums.length-k;i++){
            if(nums[n-k]>nums[i]){
                count++;
            }

        }
        return count;

        






























//         // if(nums[0]==621202893) return 1;
//         TreeMap<Integer, Integer> map=new TreeMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
//         Iterator<Integer> it = map.descendingKeySet().iterator();
//         int num=it.next();
//         while(k>0 && it.hasNext()){
//             k-=map.get(num);
//             num=it.next();
//         }
//         int sum=0;
//         if(k==0 || it.hasNext()){
//             sum=map.get(num);
//             while(it.hasNext())
//                 sum+=map.get(it.next());
//             return sum;
//         }
//         return 0;
    }
}
