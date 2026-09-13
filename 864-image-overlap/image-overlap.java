class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        int ans=0;
        for(int i=-(n-1);i<=(n-1);i++){
            for(int j=-(n-1);j<=(n-1);j++){
                int count=0;
                for(int k=0;k<n;k++){
                    for(int l=0;l<n;l++){
                        if(img1[k][l]==1){
                            int r=k+i;
                        int c=l+j;
                        if(r>=0 && r<n && c>=0 && c<n){
                            if(img2[r][c]==1){
                                count++;
                            }
                        }
                        }
                    }
                }
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}