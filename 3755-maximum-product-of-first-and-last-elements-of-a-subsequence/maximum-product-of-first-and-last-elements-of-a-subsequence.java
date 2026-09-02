class Solution {
    public long maximumProduct(int[] nums, int m) {
        long ans = Long.MIN_VALUE;
        long maxSoFar = Long.MIN_VALUE;
        long minSoFar = Long.MAX_VALUE;

        for (int j = m - 1; j < nums.length; j++) {

            long prev = nums[j - m + 1];
            maxSoFar = Math.max(maxSoFar, prev);
            minSoFar = Math.min(minSoFar, prev);

            long current = nums[j];
            ans = Math.max(ans, current * maxSoFar);
            ans = Math.max(ans, current * minSoFar);
        }

        return ans;
    }
}