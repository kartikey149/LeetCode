class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=0;
        while(n<4){
            
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            
                for(int i=0;i<mat.length;i++){
                    for(int j=i;j<mat[i].length;j++){
                        int temp=mat[i][j];
                        mat[i][j]=mat[j][i];
                        mat[j][i]=temp;
                    }
                }
            
            
                int top=0;
                int bottom=mat.length-1;
                while(top<bottom){
                    for(int i=0;i<mat[top].length;i++){
                        int temp=mat[top][i];
                        mat[top][i]=mat[bottom][i];
                        mat[bottom][i]=temp;
                    }
                        top++;
                        bottom--;
                }
            
            n++;
            
        }
        return false;
    }
}