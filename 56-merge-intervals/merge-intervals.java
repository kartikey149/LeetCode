// class Solution {
//     public int[][] merge(int[][] intervals) {
//         if(intervals.length<=1){
//             return intervals;
//         }
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         int[][] arr=new int[intervals.length][2];
//         int h=0;
//         for(int i=0;i<intervals.length;i++){
//             if(i>0 && intervals[i][0]<=intervals[i-1][1] ){
//                 // arr[h-1][0]=intervals[i-1][0];
//                 arr[h-1][1]=Math.max(arr[h-1][1], intervals[i][1]);
//                 // h++;
//             }
//             else{
//             arr[h][0]=intervals[i][0];
//             arr[h][1]=intervals[i][1];
//             h++;


//             }
//         }
//         return Arrays.copyOf(arr, h);
//     }
// }
class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // 1. Sort based on the start of each interval
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] arr = new int[intervals.length][2];
        int h = 0;

        for (int i = 0; i < intervals.length; i++) {
            // If current start is <= previous end, they overlap
            if (h > 0 && intervals[i][0] <= arr[h-1][1]) {
                // Update the previous end to the maximum of both
                arr[h-1][1] = Math.max(arr[h-1][1], intervals[i][1]);
            } else {
                // No overlap, add a new interval
                arr[h][0] = intervals[i][0];
                arr[h][1] = intervals[i][1];
                h++;
            }
        }

        // 2. Trim the array to the actual number of merged intervals
        return Arrays.copyOf(arr, h);
    }
}