class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int row[]=new int[m];
        int col[]=new int[n];
        for(int i=0;i<indices.length;i++){
            row[indices[i][0]]++;
            col[indices[i][1]]++;

        }
        int[][] ma=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]!=0){
                    ma[i][j]=ma[i][j]+row[i];
                }
                if(col[j]!=0){
                    ma[i][j]=ma[i][j]+col[j];
                }

            }
            // row[i]--;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // if(row[i]!=0){
                //     m[i][j]++;
                // }
                // if(col[j]!=0){
                //     m[i][j]=m[i][j]+col[j];
                // }
                System.out.print(ma[i][j]);

            }
                System.out.println();
            // row[i]--;
        }
        
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // if(row[i]!=0){
                //     m[i][j]++;
                // }
                // if(col[j]!=0){
                //     m[i][j]=m[i][j]+col[j];
                // }
                if(ma[i][j]%2!=0) count++;

            }
          
            // row[i]--;
        }
        return count;

        
         
    }
}