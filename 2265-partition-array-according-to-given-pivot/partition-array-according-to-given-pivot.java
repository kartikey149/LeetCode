class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // while(start<end){
        //     if(nums[start]<pivot){
        //         start++;
        //         mid++;
        //     }
        //     else if(nums[start]==pivot){
        //         mid++;
        //     }else{
                
        //     }
        // }
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        List<Integer> ls3=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ls1.add(nums[i]);
            }
            else if(nums[i]==pivot){
                ls2.add(nums[i]);
            }
            else{
                ls3.add(nums[i]);
            }
        }
        ls1.addAll(ls2);
        ls1.addAll(ls3);
        for(int i=0;i<nums.length;i++){
            nums[i]=ls1.get(i);
        }
        return nums;
    }
}