class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans=0;
        int a=0;
        int b=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(a<g.length && b<s.length){
            if(s[b]>=g[a]){
                ans++;
                a++;
                b++;
            }
            else if(g[a]>s[b]){
                b++;

            }
            else{
                a++;
            }


        }
        return ans;
    }
}