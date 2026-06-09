class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int sum=0,odd=0,count=0;
        for(char c:map.keySet()){
            if(map.get(c)%2==0){
                sum+=map.get(c);
            }
            else{
                sum+=map.get(c);
                count++;
            }
        }
        return count>0?sum-count+1:sum;
    }
}