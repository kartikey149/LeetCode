class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int res[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int val = -1;

            int cond = map.get(nums1[i]);

            while (cond < nums2.length - 1) {
                if (nums1[i] < nums2[cond + 1]) {
                    val = nums2[cond + 1];
                    break;
                }
                cond++;
            }
            res[i] = val;
        }
        return res;
    }
}