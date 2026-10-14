class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(num==1 && sum>=10) return "";
        int ans=Integer.MIN_VALUE;
        int count=0;
        int counter=9;
        StringBuilder sb=new StringBuilder();
        while(count<num && counter>=0){
            if(counter>sum){
                counter--;
            }
            else{
                sb.append(counter);
                sum-=counter;
                count++;
            }
        }
        return sum==0?sb.toString():"";

    }
}