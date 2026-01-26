class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int diff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            diff=Math.min(diff,arr[i+1]-arr[i]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==diff){
                List<Integer> pair = new ArrayList<>();
            pair.add(arr[i]);
            pair.add(arr[i + 1]);
            result.add(pair);
            }
        }
        return result;
    }
}