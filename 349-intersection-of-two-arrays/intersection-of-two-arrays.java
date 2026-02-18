class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        int a=0;
        int b=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(a<nums1.length && b<nums2.length){
            if (nums1[a] < nums2[b]) {
                a++;
            } else if (nums1[a] > nums2[b]) {
                b++;
            } else {
                
                set.add(nums1[a]);
                a++;
                b++;
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            result[i++] = num;
        }


        
        return result;
    }
}