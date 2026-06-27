class Solution {
    public int addDigits(int num) {
        if(num<10) return num;
        while(num>=10){
            int a=0;
            int n=num;
            
            while(n!=0){
                int rem=n%10;
                a+=rem;
                n/=10;
            }
            num=a;

        }
        return num;
    }
}