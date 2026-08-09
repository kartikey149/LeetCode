class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean bas[]=new boolean[baskets.length];
        int k=fruits.length;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j] && !bas[j]){
                    bas[j]=true;
                    k--;
                    break;
                }
            }
        }
        return k--;
    }
}