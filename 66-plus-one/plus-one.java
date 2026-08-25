class Solution {
    public int[] plusOne(int[] a) {
        int carry=0;
        a[a.length-1]+=1;
        carry=a[a.length-1]/10;
        a[a.length-1]%=10;
        List<Integer> ls=new ArrayList<>();
        ls.add(a[a.length-1]);

        for(int i=a.length-2;i>=0;i--){
            a[i]+=carry;
            carry=a[i]/10;
            a[i]%=10;
            ls.add(a[i]);
        }
        System.out.println(carry);
        if(carry==1){
            ls.add(carry);
        }
        int[] arr=new int[ls.size()];
        int h=0;
        for(int i=ls.size()-1;i>=0;i--){
            arr[h++]=ls.get(i);
        }
        return arr;
        

    }
}