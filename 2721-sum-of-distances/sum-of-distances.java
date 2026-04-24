import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();

        // Group indices by value
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        // Process each group of indices
        for (List<Integer> indices : map.values()) {
            int m = indices.size();
            if (m <= 1) continue;

            // Calculate total sum of indices for the right-side calculation
            long totalSum = 0;
            for (int index : indices) {
                totalSum += index;
            }

            long prefixSum = 0;
            for (int i = 0; i < m; i++) {
                int currentIndex = indices.get(i);
                
                // suffixSum is totalSum - prefixSum - currentIndex
                long suffixSum = totalSum - prefixSum - currentIndex;
                
                // Numbers to the left: i elements
                // Numbers to the right: (m - 1 - i) elements
                long leftDist = (long) i * currentIndex - prefixSum;
                long rightDist = suffixSum - (long) (m - 1 - i) * currentIndex;
                
                res[currentIndex] = leftDist + rightDist;
                
                prefixSum += currentIndex;
            }
        }

        return res;
    }
}