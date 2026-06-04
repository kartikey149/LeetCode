class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        if(num1<100 && num2<=100) return 0;
        for(int i=num1;i<=num2;i++){
            if(i<=100) continue;
            else{
                int length = (int) Math.log10(Math.abs(i)) + 1;
                int[] digits = new int[length];
                int temp = Math.abs(i);
                for (int j = length - 1; j >= 0; j--) {
                    digits[j] = temp % 10;
                    temp /= 10;
                }
                for(int j=0;j<digits.length;j++){
                    if(j==0 || j==digits.length-1) continue;
                    else{
                        if(digits[j]>digits[j+1] && digits[j]>digits[j-1]) ans++;
                        else if(digits[j]<digits[j+1] && digits[j]<digits[j-1]) ans++;
                    }
                }
            }
        }
        return ans;
    }
}