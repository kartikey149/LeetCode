class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        // int l=Math.log10(low)+1;
        // int h=Math.log10(high)+1;
        String s="123456789";
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                String a=s.substring(i,j+1);
                int check=Integer.parseInt(a);
                if(check>=low && check<=high){
                    ls.add(check);
                }
                if(check>high){
                    break;
                }
            }
        }
        Collections.sort(ls);
        return ls;

    }
}