class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int h=0;
        for(int i=columnTitle.length()-1;i>=0;i--){{
            ans+=(int)Math.pow(26,h++)*((int)(columnTitle.charAt(i)-'A')+1);
        }

        }
        return ans;
    }
}