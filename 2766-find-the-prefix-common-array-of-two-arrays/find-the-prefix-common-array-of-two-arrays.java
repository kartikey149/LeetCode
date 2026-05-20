class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        int[] arr=new int[A.length];
        
        for(int i=0;i<A.length;i++){
            map2.put(B[i],map2.getOrDefault(B[i],0)+1);
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            // int a=A[i];
            int j=i;
            int co=0;
            while(j>=0){
                int a=A[j];
                if(map.containsKey(a) && map2.containsKey(a)){
                    co++;
                }
                j--;
            }
            arr[i]=co;
        }
        return arr;
    }
}