class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int diff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            diff=Math.min(diff,Math.abs(arr[i]-arr[i+1]));
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i+1])==diff){
                List<Integer> pair = new ArrayList<>();
            pair.add(arr[i]);
            pair.add(arr[i + 1]);
            result.add(pair);
            }
        }
        return result;
    }
}