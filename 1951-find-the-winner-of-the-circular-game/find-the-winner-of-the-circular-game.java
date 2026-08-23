class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ls.add(i);
        }
        int c=0;
        while(ls.size()>1){
            c=(c+k-1)%(ls.size());

            ls.remove((c));
           
        }
        
        return ls.get(0);
    }
}