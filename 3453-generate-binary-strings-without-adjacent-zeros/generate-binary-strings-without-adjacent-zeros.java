import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> validStrings(int n) {
        int limit = (int) Math.pow(2, n);
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < limit; i++) {
            StringBuilder sb = new StringBuilder();
            boolean valid = true;

            for (int j = n - 1; j >= 0; j--) {
                int bit = (i >> j) & 1;
                sb.append(bit);

                if (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0' && sb.charAt(sb.length() - 2) == '0') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans.add(sb.toString());
            }
        }
        return ans;
    }
}