class Solution {
    public int removeCoveredIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); 
            }
            return Integer.compare(a[0], b[0]); 
        });
        int ans=0;
        int maxEnd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][1]>maxEnd){
                maxEnd=arr[i][1];
                ans++;
            }
        }
        return ans;
    }
}