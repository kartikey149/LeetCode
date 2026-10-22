class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        // int c=1;
        int sum=0;
        List<Integer> ls=new ArrayList<>();
        ls.add(a);
        ls.add(b);
        // ls.add(c);
        int i=1;
        while(sum<=n){
            i++;
            int h=a+b;
            ls.add(h);
            sum=ls.get(i-2)+ls.get(i-1)+ls.get(i);
            a=ls.get(i-1);
            b=ls.get(i);
            // c=ls.get(i);
            System.out.println(sum+" "+a+" "+b);
            if(sum==n) return true;

        }
        return false;
    }
}