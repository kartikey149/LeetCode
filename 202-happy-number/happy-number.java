class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        int num=n;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(n,0);
        while(sum!=1){
            
            while(num>0){
                int rem=num%10;
                sum+=rem*rem;
                num/=10;
                System.out.println("rem"+rem);
            }
            if(sum==1){
                return true;
            }
            
            num=sum;
            System.out.println(sum+" "+num);

            if(map.containsKey(sum)){
                return false;
            }
            map.put(sum,0);
            sum=0;
        }
        return true;
    }
}