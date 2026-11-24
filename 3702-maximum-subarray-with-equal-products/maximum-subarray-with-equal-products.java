class Solution {
    public int maxLength(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                if(prod>25200){
                    break;
                }
                else{
                    int gcd=GCD(nums,i,j);
                    int lcm=LCM(nums,i,j);
                    if(gcd*lcm==prod){
                        ans=Math.max(j-i+1,ans);
                    }
                }
            }
        }
        return ans;
    }
    static int gcd(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    static int GCD(int[] arr, int left, int right) {

        int result = arr[left];
        for (int i = left + 1; i <= right; i++) {
            result = gcd(result, arr[i]);
  
            if (result == 1) {
                return 1;
            }
        }
        return result;
    }
    static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs((a / gcd(a, b)) * b);
    }
    static int LCM(int[] arr, int left, int right) {
        int result = Math.abs( arr[left]);
        if (result == 0) return 0;

        for (int i = left + 1; i <= right; i++) {
            if (arr[i] == 0) {
                return 0; 
            }
            result = lcm(result, arr[i]);
        }
        return result;
    }
}