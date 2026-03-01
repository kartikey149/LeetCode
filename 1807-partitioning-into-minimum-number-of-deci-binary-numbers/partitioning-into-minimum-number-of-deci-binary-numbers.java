class Solution {
    public int minPartitions(String n) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n.length();i++){
            int chaar=n.charAt(i) - '0';
            if(chaar>max){
                max=chaar;
            }
        }
        return max;
    }
}