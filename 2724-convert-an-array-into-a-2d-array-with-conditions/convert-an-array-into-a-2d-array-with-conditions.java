class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        int[] freq = new int[201]; 
        
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }

        for (int i = 0; i < max; i++) {
            List<Integer> currentRow = new ArrayList<>();
            for (int val = 0; val < freq.length; val++) {
                if (freq[val] > 0) {
                    currentRow.add(val);
                    freq[val]--;
                }
            }
            ls.add(currentRow);
        }
        return ls;
    }
}