class Solution {
    static class Pair{
        int r;
        int c;
        Pair(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    public int countIslands(int[][] grid, int k) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0 && !visited[i][j]){
                    visited[i][j]=true;
                    long sum=getsum(i,j,grid,visited);
                    if(sum%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    static long getsum(int i,int j,int[][] grid,boolean[][] visited){
        //left
        Queue<Pair> q=new LinkedList<>();
        long sum=grid[i][j];
        q.add(new Pair(i,j));
        while(!q.isEmpty()){
            Pair k=q.poll();
            int r=k.r;
            int c=k.c;
            //top
            if((r>0) && (!visited[r-1][c] && grid[r-1][c]!=0)){
                visited[r-1][c]=true;
                sum+=grid[r-1][c];
                q.add(new Pair(r-1,c));
            }
            //left
            if(c>0 &&  (!visited[r][c-1] && grid[r][c-1]!=0)){
                visited[r][c-1]=true;
                sum+=grid[r][c-1];
                q.add(new Pair(r,c-1));
            }
            //right
            if( c<grid[0].length-1 && (!visited[r][c+1] && grid[r][c+1]!=0)){
                visited[r][c+1]=true;
                sum+=grid[r][c+1];
                 q.add(new Pair(r,c+1));

            }
            //down
            if((r<grid.length-1) && (!visited[r+1][c] && grid[r+1][c]!=0)){
                visited[r+1][c]=true;
                sum+=grid[r+1][c];
                q.add(new Pair(r+1,c));
            }
        }
        return sum;
        
    }
}