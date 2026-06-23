// class Solution {
//     public List<Integer> findSubstring(String s, String[] words) {
//         HashMap<String,Integer> map=new HashMap<>();
//         for(int i=0;i<words.length;i++){
//             // map.put(words[i],0);
//             map.put(words[i], map.getOrDefault(words[i], 0) + 1);
//         }
//         List<Integer> ls=new ArrayList<>();
//         StringBuilder sb=new StringBuilder();
        
//         int res=words.length*words[0].length();
//         System.out.println(res);
//         int i=0;
//         while(i<s.length()){
//             sb.append(s.charAt(i));
//             int ans=0;
//             if(map.containsKey(sb.toString())){
//                 ans++;
//                 int a=sb.length();
//                 int strii=i;
//                 int h=0;
//                 int stri=i+1;
//                 StringBuilder sb1=new StringBuilder();
//                 while(stri<s.length() && h<res-a){
//                     sb1.append(s.charAt(stri));
//                     if(map.containsKey(sb1.toString())){
//                         ans++;
//                         sb1.setLength(0);
//                     }
//                     else if(sb1.length()>=words[0].length()){
//                         sb1.setLength(0);
//                     }
//                     h++;
//                     stri++;
//                 }
//                 if(ans==map.size()){
//                     ls.add( strii - words[0].length() + 1 );
//                 }
//                 sb.setLength(0);
//             }
//             i++;
//         }
//         return ls;
//     }
// }

import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ls = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return ls;
        }

        // 1. Build the frequency map for the target words
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        int totalWords = words.length;
        int sLen = s.length();

        // 2. Run parallel sliding windows for each possible offset (0 to wordLen - 1)
        for (int i = 0; i < wordLen; i++) {
            int left = i;
            int right = i;
            int count = 0; // Tracks how many valid words are currently in the window
            HashMap<String, Integer> seen = new HashMap<>();

            // Slide the right boundary across the string in steps of wordLen
            while (right + wordLen <= sLen) {
                // Pull out the next word chunk
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordCount.containsKey(word)) {
                    seen.put(word, seen.getOrDefault(word, 0) + 1);
                    count++;

                    // If we have too many occurrences of 'word', shrink the window from the left
                    while (seen.get(word) > wordCount.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        seen.put(leftWord, seen.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    // If the number of matched words equals our target array size, we found an index
                    if (count == totalWords) {
                        ls.add(left);
                    }
                } else {
                    // Found a completely invalid word chunk, wipe the current window and jump forward
                    seen.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return ls;
    }
}