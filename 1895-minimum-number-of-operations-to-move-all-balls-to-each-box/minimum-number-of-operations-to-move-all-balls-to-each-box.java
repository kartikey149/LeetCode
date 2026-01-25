class Solution {
    public int[] minOperations(String boxes) {
        int ops=0;
        int count=0;
        int[] res=new int[boxes.length()];
        for(int i=0;i<boxes.length();i++){
            res[i]+=ops;
            if(boxes.charAt(i)=='1'){
                count++;
            }
            ops+=count;
        }
        ops=0;
        count=0;
        for(int i=boxes.length()-1;i>=0;i--){
            res[i]+=ops;
            if(boxes.charAt(i)=='1'){
                count++;
            }
            ops+=count;
        }
        return res;
    }
}