class Solution {
    public int findLucky(int[] arr) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (int key : map.descendingKeySet()) {
            if (map.get(key) == key) {
                return key;
            }
        }
        return -1;

    }
}