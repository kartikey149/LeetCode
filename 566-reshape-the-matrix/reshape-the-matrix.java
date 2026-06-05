class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][]=new int[r][c];
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                ls.add(mat[i][j]);
            }
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=ls.get(k++);
            }
        }
        return arr;
        
    }
}