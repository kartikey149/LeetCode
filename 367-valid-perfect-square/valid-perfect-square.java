class Solution {
    public boolean isPerfectSquare(int num) {
        // for(long i=0;i*i<=num;i++){
        //     if(i*i==num){
        //         return true;
        //     }

        // }
        long low=0;
        long high=num;
        while(low<=high){
            long mid=low+(high-low)/2;
            // mid*=mid;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                low=mid+1;
            }else if(mid*mid>num){
                high=mid-1;

            }
        }
        return false;
    }
}