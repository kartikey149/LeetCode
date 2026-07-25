class Solution {
    public int maxProduct(int n) {
        List<Integer> ls=new ArrayList<>();

        int a=n;
        while(a!=0){
            int temp=a%10;
            ls.add(temp);
            a/=10;

        }
        Collections.sort(ls);
        return ls.get(ls.size()-1)*ls.get(ls.size()-2);
    }
}