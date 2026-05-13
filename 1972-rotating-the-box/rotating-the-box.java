class Solution {
    public char[][] rotateTheBox(char[][] b) {
        int m=b.length;
        int n=b[0].length;
        char[][] mat=new char[n][m];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[j][m-1-i]=b[i][j];
            }
        }
        int k=0;
        while(k<m){
            int l=n-1;
            
            
            for(int h=l;h>=0;h--){
                if(l>0 && mat[h][k]=='*') l=h-1;
                else if(mat[h][k]=='#'){
                    char c=mat[h][k];
                    mat[h][k]=mat[l][k];
                    mat[l][k]=c;
                    l--;
                }
            }
            k++;
        }
        return mat;
    }

}

