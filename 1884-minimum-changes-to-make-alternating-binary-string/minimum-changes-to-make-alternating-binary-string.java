// class Solution {
//     public int minOperations(String s) {
//         boolean[] ans = new boolean[s.length()];
//         boolean[] ans2 = new boolean[s.length()];

//         for (int i = 0; i < s.length(); i += 2) {
//             if (s.charAt(i) == '1') {
//                 ans[i] = true;
//             }
//         }
//         for (int i = 1; i < s.length(); i += 2) {
//             if (s.charAt(i) == '0') {
//                 ans[i] = true;
//             }
//         }

//         for (int i = 0; i < s.length(); i += 2) {
//             if (s.charAt(i) == '0') {
//                 ans2[i] = true;
//             }
//         }
//         for (int i = 1; i < s.length(); i += 2) {
//             if (s.charAt(i) == '1') {
//                 ans2[i] = true;
//             }
//         }

//         int co = 0;
//         int co2 = 0;
//         for (int i = 0; i < ans.length; i++) {
//             if (ans[i] == false) {
//                 co++;
//             }
//         }
//         for (int i = 0; i < ans.length; i++) {
//             if (ans2[i] == false) {
//                 co2++;
//             }
//         }


//         return co<co2?co:co2;

//     }
// }

class Solution {
    public int minOperations(String s) {
        int co = 0;  
        int co2 = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            
            if (i % 2 == 0) {
                if (current != '1') co++;
                if (current != '0') co2++;
            } else {
                if (current != '0') co++;
                if (current != '1') co2++;
            }
        }
        
        return Math.min(co, co2);
    }
}