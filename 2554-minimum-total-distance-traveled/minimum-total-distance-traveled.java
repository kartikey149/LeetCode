

// class Solution {
//     public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
//         Collections.sort(robot);
        
//         int n = factory.length;
//         Integer[] indices = new Integer[n];
//         for (int i = 0; i < n; i++) indices[i] = i;
        
//         Arrays.sort(indices, (a, b) -> Integer.compare(factory[a][0], factory[b][0]));

//         int[][] sortedMatrix = new int[2][n];
//         for (int i = 0; i < n; i++) {
//             sortedMatrix[0][i] = factory[indices[i]][0];
//             sortedMatrix[1][i] = factory[indices[i]][1];
//         }

//         long ans = 0; 
//         for (int i = 0; i < robot.size(); i++) {
//             int rp = robot.get(i);
//             int pos1 = Integer.MAX_VALUE;
//             int pos2 = Integer.MAX_VALUE;
//             int idx1 = -1;
//             int idx2 = -1;

//             int j = 0;
//             while (j < n) {
//                 if (sortedMatrix[0][j] > rp && sortedMatrix[1][j] > 0) {
//                     int dist = Math.abs(rp - sortedMatrix[0][j]);
//                     if (dist < pos1) {
//                         pos1 = dist;
//                         idx1 = j;
//                     }
//                 }
//                 j++;
//             }

//             j = 0;
//             while (j < n) {
//                 if (sortedMatrix[0][j] <= rp && sortedMatrix[1][j] > 0) {
//                     int dist = Math.abs(rp - sortedMatrix[0][j]);
//                     if (dist < pos2) {
//                         pos2 = dist;
//                         idx2 = j;
//                     }
//                 }
//                 j++;
//             }

//             if (pos1 <= pos2 && idx1 != -1) {
//                 ans += pos1;
//                 sortedMatrix[1][idx1]--;
//             } else if (idx2 != -1) {
//                 ans += pos2;
//                 sortedMatrix[1][idx2]--;
//             }
//         }
//         return ans;
//     }
// }

import java.util.*;

class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> Integer.compare(a[0], b[0]));

        List<Integer> factorySlots = new ArrayList<>();
        for (int[] f : factory) {
            for (int i = 0; i < f[1]; i++) {
                factorySlots.add(f[0]);
            }
        }

        int n = robot.size();
        int m = factorySlots.size();
        long[][] dp = new long[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            dp[i][0] = (long) 1e15; 
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                long skip = dp[i][j - 1];
                long use = dp[i - 1][j - 1] + Math.abs((long) robot.get(i - 1) - factorySlots.get(j - 1));
                dp[i][j] = Math.min(skip, use);
            }
        }

        return dp[n][m];
    }
}