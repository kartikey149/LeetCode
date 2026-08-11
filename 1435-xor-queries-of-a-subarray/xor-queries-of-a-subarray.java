class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
        int ans[]=new int[q.length];
        for(int i=0;i<q.length;i++){
            int start=q[i][0];
            int end=q[i][1];
            int s=arr[start];
            for(int j=start+1;j<=end;j++){
                s^=arr[j];
            }
            ans[i]=s;
        }
        return ans;
    }
}