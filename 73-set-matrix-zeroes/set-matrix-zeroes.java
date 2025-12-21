class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean[] rowzero=new boolean[r];
        boolean[] colzero=new boolean[c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rowzero[i]=true;
                    colzero[j]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(rowzero[i]||colzero[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}