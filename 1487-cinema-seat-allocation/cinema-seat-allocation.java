class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int k=0;
        for(int[] c:r){
            if(!map.containsKey(c[0])){
                map.put(c[0],k++);
            }
        }

        boolean[][] c = new boolean[k][10];

        for (int i = 0; i <r.length; i++) {
            int r1 = map.get(r[i][0]);
            int s = r[i][1] - 1;
            c[r1][s] = true;
        }


        int out = 0;
        for (int i = 0; i < k; i++) {
            boolean left = !c[i][1] && !c[i][2] && !c[i][3] && !c[i][4];
            boolean right = !c[i][5] && !c[i][6] && !c[i][7] && !c[i][8];
            boolean mid = !c[i][3] && !c[i][4] && !c[i][5] && !c[i][6];
            if (left && right) {
                out += 2;
            } else if (mid || left || right) {
                out += 1;
            }

        }
        out+=(n-k)*2;

        return out;
    }
}