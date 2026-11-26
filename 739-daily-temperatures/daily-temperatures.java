import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Solution {
    public record Pair<K, V>(K k, V v) {}

    public int[] dailyTemperatures(int[] nums) {
        List<Integer> ls = new ArrayList<>(Collections.nCopies(nums.length, 0));
        Stack<Pair<Integer, Integer>> st = new Stack<>();
        Pair<Integer, Integer> bottom = null; // Tracks the bottom-most element in the stack

        for (int i = 0; i < nums.length; i++) {
            if (st.isEmpty()) {
                Pair<Integer, Integer> n = new Pair<>(nums[i], i);
                st.push(n);
                bottom = n; // New bottom-most element
            } else {
                // Case 1: Current temp beats the bottom-most element -> clears the entire stack
                if (nums[i] > bottom.k()) {
                    while (!st.isEmpty()) {
                        Pair<Integer, Integer> top = st.pop();
                        ls.set(top.v(), i - top.v());
                    }
                    // For the bottom element specifically: i - bottom.v()
                    Pair<Integer, Integer> n = new Pair<>(nums[i], i);
                    st.push(n);
                    bottom = n; // Current element becomes the new bottom
                }
                // Case 2: Current temp beats top elements, but NOT the bottom element
                else if (nums[i] > st.peek().k()) {
                    while (!st.isEmpty() && nums[i] > st.peek().k()) {
                        Pair<Integer, Integer> top = st.pop();
                        ls.set(top.v(), i - top.v());
                    }
                    st.push(new Pair<>(nums[i], i));
                }
                // Case 3: Current temp is <= stack top -> push on top (bottom stays unchanged)
                else {
                    st.push(new Pair<>(nums[i], i));
                }
            }
        }

        return ls.stream().mapToInt(Integer::intValue).toArray();
    }
}