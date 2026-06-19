class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int currsum = 0;
        for (int i = 0; i < gain.length; i++) {
            currsum += gain[i];
            if (sum < currsum) {
                sum = currsum;
            }
        }
        return sum;

    }
}