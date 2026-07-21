class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        List<Integer> ls=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int co=0;
            if(s.charAt(i)=='1'){
                ls.add(1);
                i++;
            }
            else{
                while(i<s.length() && s.charAt(i)=='0'){
                    i++;
                    co++;
                }
                ls.add(co*(-1));
            }
        }
        System.out.println(ls.toString());
        
        List<Integer> ls2=new ArrayList<>();
        for(int j=0;j<ls.size();j++){
            if(ls.get(j)<1){
                ls2.add(ls.get(j));
            }
        }
        int sum2=0;
        for(int j=0;j<ls2.size()-1;j++){
            sum2=Math.max(Math.abs(ls2.get(j)+ls2.get(j+1)),sum2);
        }
        for(int j=0;j<ls.size();j++){
            if(ls.get(j)==1){
                sum2+=1;
            }
        }


        return sum2;
    }
}