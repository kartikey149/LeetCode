class Solution {
    public long gcdSum(int[] nums) {
        int max=nums[0];
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);

            System.out.println(gcd(nums[i],max));
            arr[i]=gcd(nums[i],max);
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
        int start=0;
        int end=arr.length-1;
        long sum=0;
        while(start<end){
            sum+=gcd(arr[start],arr[end]);
            start++;
            end--;
        }
        return sum;

    }
    static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}