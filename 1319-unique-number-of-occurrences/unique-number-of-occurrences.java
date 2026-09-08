class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> map=new HashSet<>();
        HashMap<Integer,Integer> mapp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mapp.put(arr[i],mapp.getOrDefault(arr[i],0)+1);
        }
        for(int c:mapp.keySet()){
            if(map.contains(mapp.get(c))) return false;
            map.add(mapp.get(c));
        }
        return true;
        

    }
}