class Solution {
    public int minimumPushes(String word) {
//         // HashMap<Character,Integer> map=new HashMap<>();
//         HashMap<Character,Integer> map2=new HashMap<>();


//         for(char c:word.toCharArray()){
//             map2.put(c,map2.getOrDefault(c,0)+1);
//         }


        
// Map<Character, Integer> sortedByFrequency = map2.entrySet()
//                 .stream()
//                 .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()) 
//                 .collect(Collectors.toMap(
//                         Map.Entry::getKey,
//                         Map.Entry::getValue,
//                         (e1, e2) -> e1,
//                         LinkedHashMap::new
//                 ));


//         HashMap<Character, Integer> pushCostMap = new HashMap<>();
//         int rank = 0;

//         for (char c : sortedByFrequency.keySet()) {
//             rank++;
//             if (rank <= 8) {
//                 pushCostMap.put(c, 1);
//             } else if (rank <= 16) {
//                 pushCostMap.put(c, 2);
//             } else if (rank <= 24) {
//                 pushCostMap.put(c, 3);
//             } else {
//                 pushCostMap.put(c, 4);
//             }
//         }
        
//         int ans=0;
//         for(char c:word.toCharArray()){
           
//             ans+=pushCostMap.get(c);
//         }
//         return ans;

        int arr[]=new int[26];
        for(int i=0;i<word.length();i++){
            arr[(word.charAt(i)-'a')]++;
        }
        Arrays.sort(arr);

        int count=1;
        int ans=0;
        int freq=1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                System.out.println(arr[i] + " " + freq );
                ans+=freq*arr[i];
                count++;
            }
            if((count-1) % 8==0){
                freq++;
            }
        }
        return ans;


    }
}