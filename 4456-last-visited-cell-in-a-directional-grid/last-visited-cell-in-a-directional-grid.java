class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int r=0;
        int c=0;
        int row=grid.length;
        int col=grid[0].length;
        boolean[][] vis=new boolean[row][col];
        while(r >= 0 && r < row && c >= 0 && c < col){
            // System.out.println(r+" "+c +" "+grid[r][c]);
            vis[r][c]=true;
            if(grid[r][c]=='L'){
                c--;
                if( c<0 || vis[r][c]){
                    return new int[]{r,c+1};
                }
            }

            else if(grid[r][c]=='D'){
                r++;
                if(r>=row || vis[r][c]){
                    return new int[]{r-1,c};
                }
            }

            else if(grid[r][c]=='U')
            {
                r--;
                if(r<0 || vis[r][c]){
                    return new int[]{r+1,c};
                }
            }

            else if(grid[r][c]=='R'){
                c++;
                if(c>=col || vis[r][c]){
                    return new int[]{r,c-1};
                }
            }
        }
        return new int[]{r,c};
    }
}