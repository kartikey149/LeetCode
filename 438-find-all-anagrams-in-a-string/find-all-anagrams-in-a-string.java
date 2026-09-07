class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       
       
        char[] ar=p.toCharArray();
        Arrays.sort(ar);
        String c=new String(ar);


        List<Integer> ls=new ArrayList<>();
        if(s.length()<p.length()) return ls;
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(0,p.length()));



        

        char[] arr=sb.toString().toCharArray();
        Arrays.sort(arr);
        String f=new String(arr);


        if(f.equals(c)) ls.add(0);
        for(int i=p.length();i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if(sb.length()==p.length()){

                char[] a=sb.toString().toCharArray();
                Arrays.sort(a);
                String d=new String(a);
                if(d.equals(c)){
                    ls.add(i-p.length()+1);
                }
            }

        }
        return ls;
    }
}