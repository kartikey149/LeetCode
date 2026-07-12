class Solution {
    public int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer,Integer> map =new TreeMap<>();
        for(int i:arr){
            map.put(i,0);
        }
        int c=1;
        for(int key:map.keySet()){
            map.put(key,c++);
        }
        for(int i=0;i<arr.length;i++){
            
           arr[i]=map.get(arr[i]);
            
        }
        return arr;
    }
}