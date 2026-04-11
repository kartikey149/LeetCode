
class Solution {
    public int maxValue(int[] nums1, int[] nums0) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums0[i];
        }

        Arrays.sort(pairs, (a, b) -> {
            String sA = "1".repeat(a[0]) + "0".repeat(a[1]);
            String sB = "1".repeat(b[0]) + "0".repeat(b[1]);
            
            String order1 = sA + sB;
            String order2 = sB + sA;
            return order2.compareTo(order1); 
        });

        long ans = 0;
        long mod = 1_000_000_007;

        for (int[] p : pairs) {
            for (int i = 0; i < p[0]; i++) {
                ans = (ans * 2 + 1) % mod;
            }
            for (int i = 0; i < p[1]; i++) {
                ans = (ans * 2) % mod;
            }
        }

        return (int) ans;
    }
}