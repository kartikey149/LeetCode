class Solution {
    public int countCommas(int n) {
        int count=0;
        if(n<1000) return 0;
        else if(n<1000000) {
            count+=n-999;
        }
        return count;

    }
}