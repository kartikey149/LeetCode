class Solution {
    public long removeZeros(long n) {
        
        String st=String.valueOf(n);

        String s="";

        long res=0;

        for(int i=0;i<st.length();i++){

            if(st.charAt(i)=='0'){

                continue;

            }else{
                s+=st.charAt(i);




            }

        }

        res=Long.parseLong(s);

        return res;

    
    }
}
// class Solution {
//     public long removeZeros(long n) {
//         // 1. Convert the long to a String to look at each digit
//         String st = String.valueOf(n);
//         StringBuilder sb = new StringBuilder();
        
//         // 2. Loop through each character (digit)
//         for (int i = 0; i < st.length(); i++) {
//             char digit = st.charAt(i);
//             // 3. Only append if the digit is not '0'
//             if (digit != '0') {
//                 sb.append(digit);
//             }
//         }
        
//         // 4. Convert back to long (handle empty string case)
//         String res = sb.toString();
//         return res.isEmpty() ? 0 : Long.parseLong(res);
//     }
// }