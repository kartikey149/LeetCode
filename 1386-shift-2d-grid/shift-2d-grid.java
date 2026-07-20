class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ls.add(grid[i][j]);
            }
        }
         k=k%ls.size();
        reverse(ls,0,ls.size()-1);
        reverse(ls,0,k-1);
        reverse(ls,k,ls.size()-1);
        List<List<Integer>> ls2=new ArrayList<>();
        int h=0;
        for(int i=0;i<grid.length;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                l.add(ls.get(h++));
            }
            ls2.add(l);
        }
        return ls2;



    }
    static void reverse(List<Integer> ls,int start,int end){
        while(start<end){
            int temp=ls.get(start);
            ls.set(start,ls.get(end));
            ls.set(end,temp);
            start++;
            end--;
        }
    }
}