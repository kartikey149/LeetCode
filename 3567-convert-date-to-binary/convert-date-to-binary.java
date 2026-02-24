class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder str=new StringBuilder();
        StringBuilder res=new StringBuilder();

        for(int i=0;i<date.length();i++){
            if(date.charAt(i)=='-'){
                int a=Integer.parseInt(str.toString());
                res.append(Integer.toString(a, 2));
                res.append('-');

                str.setLength(0);

            }else{
                str.append(date.charAt(i));
            }
        }
        int a=Integer.parseInt(str.toString());
        res.append(Integer.toString(a,2));
        return res.toString();
    }
}