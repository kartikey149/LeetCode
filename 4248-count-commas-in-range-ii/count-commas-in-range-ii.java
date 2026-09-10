class Solution {
    public long countCommas(long n) {
        long count=0;
        for (long boundary = 1000; boundary <= n; boundary *= 1000) {
            count += (n - boundary + 1);
        }
        return count;
    }
}