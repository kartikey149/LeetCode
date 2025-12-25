class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();

        
        romanValues.put('M', 1000);
        romanValues.put('D', 500);
        romanValues.put('C', 100);
        romanValues.put('L', 50);
        romanValues.put('X', 10);
        romanValues.put('V', 5);
        romanValues.put('I', 1);

        int sum=0;
        int prevvalue=0;

        StringBuffer sb = new StringBuffer(s);

        for (int i =  sb.length()-1; i >=0; i--) {
            int currentvalue = romanValues.get(sb.charAt(i));
            if(currentvalue<prevvalue){
                sum-=currentvalue;
            }else{
                sum+=currentvalue;

            }
            prevvalue=currentvalue;
        }
        return sum;

        
    }
}