class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int shift = k % cols;
        // int k=k%mat.length;

        if(k==0) return true;
        for(int i=0;i<mat.length;i++){
            int[] originalRow = mat[i].clone();
            if (i % 2 == 0) {

                reverse(mat[i], 0, shift - 1);
                reverse(mat[i], shift, cols - 1);
                reverse(mat[i], 0, cols - 1);
            } else {
                
                reverse(mat[i], 0, cols - 1);
                reverse(mat[i], 0, shift - 1);
                reverse(mat[i], shift, cols - 1);
            }
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] != originalRow[j]) return false;
            }
        }
        return true;
    }
    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
    }
}