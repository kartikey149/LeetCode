class Solution {
public int maxCapacity(int[] costs, int[] capacity, int budget) {
    int n = costs.length;
    int[][] items = new int[n][2];
    for (int i = 0; i < n; i++) {
        items[i][0] = costs[i];
        items[i][1] = capacity[i];
    }

    // 1. Sort by Cost
    Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

    // 2. Create a Prefix Max array for capacities
    // prefMax[i] = the highest capacity available among items 0 to i
    int[] prefMax = new int[n];
    prefMax[0] = items[0][1];
    for (int i = 1; i < n; i++) {
        prefMax[i] = Math.max(prefMax[i - 1], items[i][1]);
    }

    int max = 0;
    
    // 3. For each item (as the 'right' item), find the best 'left' item
    int left = 0;
    for (int right = n - 1; right > 0; right--) {
        // Move left as far as possible for this specific 'right'
        while (left < right && items[left][0] + items[right][0] < budget) {
            left++;
        }
        
        // The best left item is at (left - 1)
        if (left > 0) {
            int actualLeft = Math.min(left - 1, right - 1);
            max = Math.max(max, items[right][1] + prefMax[actualLeft]);
        }
    }

    // 4. Single item fallback
    for (int i = 0; i < n; i++) {
        if (costs[i] < budget) max = Math.max(max, capacity[i]);
    }

    return max;
}
}