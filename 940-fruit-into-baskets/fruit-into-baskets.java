class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            System.out.println(map.get(fruits[i]));


            if(map.size()>2){
                map.put(fruits[j],map.getOrDefault(fruits[j],0)-1);
                System.out.println(map.get(fruits[j])+" "+i);
                if(map.get(fruits[j])<=0){
                    map.remove(fruits[j]);
                }
                j++;
            }


        }
        int ans=0;
        for(int c:map.keySet()){
            ans+=map.get(c);
        }
        return ans;
    }
}