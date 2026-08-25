class Solution {
    public int missingMultiple(int[] nums, int k) {
       Set<Integer> s=new HashSet<>();
       for(int c:nums){
        s.add(c);
       }
       int mul=k;
       int h=2;
       while(s.contains(mul)){
        mul=k*h;
        h++;
       }
       return mul;
        
    }
}