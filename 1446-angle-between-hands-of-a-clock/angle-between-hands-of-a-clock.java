class Solution {
    public double angleClock(int hour, int minutes) {
        double hr=( hour * 30 ) + minutes * 0.5;
        double min=minutes*6;
        double ans=Math.abs(hr-min);
        return Math.min(ans,360-ans);
    }
}