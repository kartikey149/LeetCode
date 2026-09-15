class Solution {
    public int totalNumbers(int[] digits) {
        if(digits.length<3) return 0;
        int count=0;
        Set<Integer> ls=new HashSet<>();
        StringBuilder sb=new StringBuilder();
        count(ls,digits,sb,new HashSet<>());
        System.out.print(ls.toString());
        
        return ls.size();

    }
    static void count(Set<Integer> ls,int[] nums,StringBuilder sb,Set<Integer> s){
        if(sb.length()==3){
            int number = Integer.parseInt(sb.toString());
         
            
                if(number%2==0){

                ls.add(number);
                }

            
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!s.contains(i)){
                if (sb.length() == 0 && nums[i] == 0) {
                    continue;
                }
                s.add(i);
                sb.append(nums[i]);
                count(ls,nums,sb,s);
                s.remove(i);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        

    }
}