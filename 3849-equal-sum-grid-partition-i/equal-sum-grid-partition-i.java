class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                sum+=grid[i][j];
            }
        }
            long su=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                su+=grid[i][j];
            }

            if(i<grid.length-1 && su==sum-su){
                return true;
            }
        }
            long suu=0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                suu+=grid[j][i];
            }
            if(i<grid[0].length-1 && suu==sum-suu){
                return true;
            }
        }
        return false;
        
    }
}