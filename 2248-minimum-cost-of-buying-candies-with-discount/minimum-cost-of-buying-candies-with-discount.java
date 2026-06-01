class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int costs=0;
        int count=0;
        for(int i=cost.length-1;i>=0;i--){
            count++;
            if(count<=2){

            costs+=cost[i];
            }
            else if(count>2){
                count=0;
            }

        }
        return costs;
    }
}