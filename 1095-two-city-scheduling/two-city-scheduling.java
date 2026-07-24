// class Solution {
//     public int twoCitySchedCost(int[][] arr) {
//         TreeMap<Integer,Integer> map=new TreeMap<>();
//         HashMap<Integer,Integer> map2=new HashMap<>();
//         // for storing index
//         for(int i=0;i<arr.length;i++){
//             map2.put(arr[i][0]-arr[i][1],i);
//         }
//         for(int i=0;i<arr.length;i++){
//             map.put(arr[i][0]-arr[i][1],0);
//         }
//         int k=0;
//         // for arranging its index ins sorted manner
//         for(int i:map.keySet()){
//             map.put(i,k++);
//         }
//         for(int i:map.keySet()){
//             System.out.println(i+" "+map.get(i));
//         }
//         // for get keys of map1
//         List<Integer> keys = new ArrayList<>(map.keySet());

//         int a=arr.length/2;
//         int b=arr.length/2;
//         int sum=0;
//         int j=0;


//         while(a>0 && b>0 && j<arr.length){
//             if(a>0){
//                 System.out.println("if"+arr[map2.get(keys.get(j))][0]);
//                 sum+=arr[map2.get(keys.get(j))][0];
//                 j++;
//                 a--;
//             }
//             // else if(b>0){
//             //     System.out.println("else"+arr[map2.get(keys.get(j))][1]);
//             //     sum+=arr[map2.get(keys.get(j))][1];
//             //     j++;
//             //     b--;
//             // }
//         }
//         System.out.println("khatam");
//         // while(a>0 && j<arr.length){
//         //         System.out.println(arr[map2.get(keys.get(j))][0]);
//         //      sum+=arr[map2.get(keys.get(j))][0];
//         //         j++;
//         //         a--;
//         // }

//         while(b>0 && j<arr.length){
//                 System.out.println(arr[map2.get(keys.get(j))][1]);
//             sum+=arr[map2.get(keys.get(j))][1];
//                 j++;
//                 b--;
//         }


//         return sum;
//     }
// }



class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        Arrays.sort(costs, (a, b) -> Integer.compare(a[0] - a[1], b[0] - b[1]));

        int totalCost = 0;
        int n = costs.length / 2;

        for (int i = 0; i < costs.length; i++) {
            if (i < n) {
             
                totalCost += costs[i][0];
            } else {
               
                totalCost += costs[i][1];
            }
        }

        return totalCost;
    }
}