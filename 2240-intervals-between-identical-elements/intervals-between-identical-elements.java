import java.util.*;

class Solution {
    public long[] getDistances(int[] arr) {
        int n = arr.length;
        long[] res = new long[n];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], k -> new ArrayList<>()).add(i);
        }

        for (List<Integer> indices : map.values()) {
            int m = indices.size();
            long totalSum = 0;
            for (int index : indices) {
                totalSum += index;
            }

            long prefixSum = 0;
            for (int i = 0; i < m; i++) {
                long currentIndex = indices.get(i);
                long suffixSum = totalSum - prefixSum - currentIndex;

                long leftCount = i;
                long rightCount = m - 1 - i;

                res[(int) currentIndex] = (leftCount * currentIndex - prefixSum) + (suffixSum - rightCount * currentIndex);

                prefixSum += currentIndex;
            }
        }

        return res;
    }
}