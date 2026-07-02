class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }
        for(int j=0;j<s.length();j++){
            int a=s.charAt(j) - 'a';
            arr[a]++;
        }
        // for(int k=0;k<arr.length;k++){
        //     if(arr[k]==1){
        //         return k;
        //     }
        // }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int x=c-'a';
            if(arr[x]==1){
                return i;
            }
        }
        return -1;
    }
}