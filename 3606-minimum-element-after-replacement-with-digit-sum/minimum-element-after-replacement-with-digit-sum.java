class Solution {
    public int minElement(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i:nums){
            int summ=sum(i);
            ans=Math.min(summ,ans);
        }
        return ans;
    }
    public static int sum(int n){
        int a=n;
        int summ=0;
        while(a!=0){
            int rem=a%10;
            summ+=rem;
            a/=10;
        }
        return summ;
    }
}