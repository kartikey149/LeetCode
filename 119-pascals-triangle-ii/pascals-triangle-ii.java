class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<rowIndex+1;i++){
            List<Integer> ls2=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    ls2.add(1);
                }else{
                    int val=ls.get(i-1).get(j)+ls.get(i-1).get(j-1);

                    ls2.add(val);
                }
            }
            ls.add(ls2);
        }
        // ls.remove(0);
        return ls.get(rowIndex);
    }
}