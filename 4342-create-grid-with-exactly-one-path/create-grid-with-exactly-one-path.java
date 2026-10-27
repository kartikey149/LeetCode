class Solution {
    public String[] createGrid(int m, int n) {
        
        String[] arr=new String[m];
        for(int i=0;i<m;i++){
        int start=i+2;
StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                if(m==1 || n==1){
                    sb.append('.');
                }
                else if(j==start-2 || j==start-1){
                    sb.append('.');
                    // start--;
                }
                else if(start>n && j==n-1){
                    sb.append('.');
                }
                else if(i==m-1 && j>=start ){
                    sb.append('.');
                }
                
                else{
                    sb.append('#');
                }
            }
            // s++;
            arr[i]=sb.toString();
        }

        // return new String[]{};
        return arr;
    }
}