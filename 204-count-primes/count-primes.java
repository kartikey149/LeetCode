// class Solution {
//     public int countPrimes(int n) {
//         int a=1;
//         if(n<=2){
//             return 0;
//         }
//         int primecount=1;
        
//         for(int i=3;i<n;i++){
//             for(int j=2;j*j<=i;j++){
//                 if(i%j==0 ){
//                     a=i;
//                 }
                
                
//             }
//             if(i%a==0 && a!=1){
                
//                 if(i==a){
//                     primecount++;
//                 }
                
                
                

//             }
            
            
            
            
//         }
//         if(n==2){
//             return 1;
//         }
//         return n-primecount-1;
//     }
// }
// class Solution {
//     public int countPrimes(int n) {
//         if (n <= 2) {
//             return 0;
//         }
        
//         // Start with 1 to account for the prime '2'
//         int primeCount = 1; 

//         // Check odd numbers from 3 up to n-1
//         for (int i = 3; i < n; i += 2) { 
//             if (isPrime(i)) {
//                 primeCount++;
//             }
//         }
//         return primeCount;
//     }

//     // Helper function to check if a number is prime
//     private boolean isPrime(int num) {
//         // Only need to check divisors up to the square root of num
//         for (int j = 3; j * j <= num; j += 2) {
//             if (num % j == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        // Assume all numbers are prime initially (from 0 to n-1)
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }

        // 0 and 1 are not prime
        isPrime[0] = false;
        isPrime[1] = false;

        // Iterate up to sqrt(n)
        for (int p = 2; p * p < n; p++) {
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[p]) {
                // Update all multiples of p starting from p^2
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}