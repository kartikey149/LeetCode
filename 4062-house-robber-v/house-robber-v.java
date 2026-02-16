class Solution {
    public long rob(int[] arr, int[] colors) {
        int n = arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        long pre2 = 0;
        
        long pre1 = arr[0];

        for(int i=1;i<n;i++){
            long take = arr[i];

            if(colors[i]==colors[i-1]){
                take+=pre2;
            }else{
                take+=pre1;
            }
            long skip =pre1;
            long curr = Math.max(take,skip);

            pre2=pre1;
            pre1=curr;
        }
        return pre1;
    }
}