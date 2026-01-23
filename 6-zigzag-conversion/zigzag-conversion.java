class Solution {
    public String convert(String s, int numRows) {
        int rows=numRows;
        if(rows==1){
            return s;
        }
        int k=0;
        char[][] matr=new char[rows][1000];
        int j=0;
        int i=0;
        
        // System.out.println(s.length());
        for(int l=0;l<matr.length;l++){
            for(int m=0;m<matr[l].length;m++){
                matr[l][m]='0';

                
            }
        }
        while(k<s.length()){
            if(i==0){
                for(int z=0;z<rows && k<s.length();z++){
                    
                    matr[i][j]=s.charAt(k);
                    k++;
                    if (z < rows - 1) i++;
                    
                    
                }
            }if(i==rows-1 && k < s.length()){
                while(i>1 && k<s.length()){
                    //  i-=1;
                    //  if(i==0){
                    //     break;
                    //  } 
                    matr[--i][++j]=s.charAt(k);
                    k++;
                }
                // i--;
            }
            i--;
            j++;
        }
        StringBuilder sb=new StringBuilder("");
        for(int l=0;l<matr.length;l++){
            for(int m=0;m<matr[l].length;m++){
                if(matr[l][m]!='0'){
                    sb.append(matr[l][m]);
                }
            }
            
        }
        return sb.toString();
        
    }
}