class Solution {
    public String intToRoman(int num) {


String[] symbol={"I","V","X","L","C","D","M"};
        // int num=58;
    int x=num;
    int j=1;
    String s="";
    while(x!=0){
        int rem=x%10;
        if(rem==0){
            j+=2;
        }
        else if(rem<4){
            for(int i=0;i<rem;i++){
                // System.out.print(symbol[j]);
                s=s+symbol[j-1];
            }
            j+=2;
        }
        else if(rem==4){
            // System.out.print(symbol[j]);
            // System.out.print(symbol[j+1]);
            s=s+symbol[j]+symbol[j-1];
            j+=2;
            
        }
        else if(rem>4 && rem<9){
            // System.out.print(symbol[j+1]);
            int a=rem-5;
            for(int i=0;i<a;i++){
                // System.out.print(symbol[j]);
                s=s+symbol[j-1];
                
            }
            s=s+symbol[j];
            j+=2;
            
            
        }
        else if(rem==9){
            // System.out.print(symbol[j+2]);
            // System.out.print(symbol[j]);
            s=s+symbol[j+1]+symbol[j-1];
            j+=2;
            
            
        }
        x=x/10;
        
    }
    
    StringBuilder ss=new StringBuilder(s);
    ss.reverse();
    String reversedStr = ss.toString();
    return reversedStr;
    
    }


}