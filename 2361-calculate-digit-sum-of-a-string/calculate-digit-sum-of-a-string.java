class Solution {
    public String digitSum(String s, int k) {
        boolean anss = true;
        StringBuilder sb1 = new StringBuilder(s);
        while (sb1.length()>k) {
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            while (i < sb1.length()) {
                int sum = 0;
                int end = Math.min(i + k, sb1.length());
                for (int j = i; j < end; j++) {
                    sum += sb1.charAt(j) - '0';
                }
                
                sb2.append(sum);
                i += k;

            }

            sb1.setLength(0);
            sb1.append(sb2);
            

        }
        return sb1.toString();

    }
}