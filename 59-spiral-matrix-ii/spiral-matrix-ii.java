class Solution {
    public int[][] generateMatrix(int n) {

        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;
        int h=0;
        int value=1;
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=0;
            }
        }

        // int[] store=new int[n*n];
        while(h<n*n){
            for(int i=left;i<=right;i++){
                matrix[top][i]=value;
                h++;
                value++;

            }
            top++;
            
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=value;
                h++;
                value++;

            }
            right--;
            for(int i=right;i>=left;i--){
                matrix[bottom][i]=value++;
                h++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                matrix[i][left]=value++;
                h++;

            }
            left++;

        }

        return matrix;
        
        
    }
}