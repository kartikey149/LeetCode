class Solution {
    public boolean isGood(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i])
                max = nums[i];
        }
        if (nums.length != max + 1)
            return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 1; i <= max; i++) {
            if (i < max) {
                if (map.getOrDefault(i, 0) != 1)
                    return false;
            } else {
                if (map.getOrDefault(i, 0) != 2)
                    return false;
            }
        }
        return true;

    }
}