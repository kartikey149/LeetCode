class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        
        // int[] hashTable = new int[maxElement + 1];
        boolean[] hashTable=new boolean[n+1];

    
        for (int num : nums) {
            if(num>0 && num<=n){
                hashTable[num]=true;

            }
        }

        
        for (int i = 1; i < hashTable.length; i++) {
            // if (hashTable[i] > 0) {
            //     System.out.println(hashTable[i]);
            // }
            if(!hashTable[i]){
                return i;
                
            }
        }
        return n+1;
        
    }
}