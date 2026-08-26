class Solution {
    public int minimumTotal(List<List<Integer>> t) {
    //     if (t.size() == 1) {
    //         return t.get(0).get(0);
    //     }
    //     List<List<Integer>> ls=new ArrayList<>();
    //     for(int i=1;i<t.size();i++){
    //         List<Integer> ls2=new ArrayList<>();

    //         for(int j=0;j<t.get(i).size();j++){
    //             if(j==0){
    //                 System.out.print(t.get(i-1).get(j)+t.get(i).get(j)+" ");
    //                 ls2.add(t.get(i-1).get(j)+t.get(i).get(j));
                    
    //             }
    //             else if(j==t.get(i).size()-1){
    //                 ls2.add(t.get(i-1).get(j-1)+t.get(i).get(j));
    //                  System.out.print(t.get(i-1).get(j-1)+t.get(i).get(j)+" ");
    //             }
    //             else{
    //                 int val=t.get(i-1).get(j-1)+t.get(i).get(j);
    //                 int val2=t.get(i-1).get(j)+t.get(i).get(j);
    //                 ls2.add(Math.min(val,val2));
    //                 System.out.print(Math.min(val,val2)+" ");
    //             }
    //         }
    //         System.out.println();
    //         ls.add(ls2);
    //     }
    //    int ans = Integer.MAX_VALUE;
    // //    System.out.print();
    //     for (int i = 0; i < ls.get(ls.size() - 1).size(); i++) {
    //         // System.out.print
    //         ans = Math.min(ls.get(ls.size() - 1).get(i), ans);
    //     }
    //     return ans;
   
        if (t == null || t.size() == 0) return 0;
        for (int i = 1; i < t.size(); i++) {
            List<Integer> prevRow = t.get(i - 1);
            List<Integer> currRow = t.get(i);
            for (int j = 0; j < currRow.size(); j++) {
                int updatedVal;
                if (j == 0) {
                    updatedVal = prevRow.get(j) + currRow.get(j);
                } else if (j == currRow.size() - 1) {
                    updatedVal = prevRow.get(j - 1) + currRow.get(j);
                } else {
                    int val1 = prevRow.get(j - 1) + currRow.get(j);
                    int val2 = prevRow.get(j) + currRow.get(j);
                    updatedVal = Math.min(val1, val2);
                }
                currRow.set(j, updatedVal);
            }
        }
        List<Integer> lastRow = t.get(t.size() - 1);
        int ans = Integer.MAX_VALUE;
        for (int val : lastRow) {
            ans = Math.min(ans, val);
        }
        return ans;
    }
}
