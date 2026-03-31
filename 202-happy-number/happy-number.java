class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int num=n;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(n,0);
        while(sum!=1){
            num=get_no(num,sum);
            sum=get_no(num,sum);
            if(sum==1){
                return true;
            }
            
            // num=sum;
            System.out.println(sum+" "+num);

            if(map.containsKey(sum)){
                return false;
            }
            map.put(sum,0);
            sum=0;
        }
        return true;
    }
    public static int get_no(int n ,int sum){
        int num=n;
        while(num>0){
            int rem=num%10;
            sum+=rem*rem;
            num/=10;
        }
        return sum;
    }
}