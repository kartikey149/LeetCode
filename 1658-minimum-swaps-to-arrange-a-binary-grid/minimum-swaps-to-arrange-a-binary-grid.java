class Solution {
    public int minSwaps(int[][] grid) {
        int[] foundzero=new int[grid.length];
        int h=0;
        int n=grid.length;
        for(int i=0;i<n;i++){
            int zero=0;
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==0){
                    zero++;
                }else{
                    break;
                }
            }
            foundzero[h++]=zero;
        }

        int ans=0;
        for(int i=0;i<n;i++){
            int reqzero=n-1-i;
            int indx=-1;
            for(int j=i;j<n;j++){
                if(foundzero[j]>=reqzero){
                    indx=j;
                    break;
                }
            }

            if(indx==-1) return -1;

            for(int j=indx;j>i;j--){
                int temp=foundzero[j];
                foundzero[j]=foundzero[j-1];
                foundzero[j-1]=temp;
                ans++;
            }


        }
        return ans;


    }
}