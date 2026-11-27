class Solution {
    public String countAndSay(int n) {
        StringBuilder sb=new StringBuilder("1");
        int cout=1;
        while(cout<n){
            StringBuilder sb2=new StringBuilder();
            int count=1;
            for(int i=0;i<sb.length();i++){
                if(i+1<sb.length() && sb.charAt(i)==sb.charAt(i+1)){
                    count++;
                }
                else if(i+1<sb.length() && sb.charAt(i)!=sb.charAt(i+1)){
                    sb2.append(count);
                    sb2.append(sb.charAt(i));
                    count=1;
                }
                if(i==sb.length()-1){
                    sb2.append(count);
                    sb2.append(sb.charAt(i));
                    
                }
            }
            sb=new StringBuilder(sb2.toString());
            cout++;

            

        }
        return sb.toString();
        // return "";
    }
}