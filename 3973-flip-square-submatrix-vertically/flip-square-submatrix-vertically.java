class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
       return reverse(grid,x,y,k); 
    }
    public int[][] reverse(int[][] grid,int row,int col,int k){
        int left=row;
        int right=row+k-1;
        // int right=col;
        while(left<right){
            for(int i=col;i<col+k;i++){
                int temp=grid[left][i];
                grid[left][i]=grid[right][i];
                grid[right][i]=temp;
            }
            left++;
            right--;
        }
        return grid;
    }
}