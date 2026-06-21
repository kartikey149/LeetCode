class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        
        Arrays.sort(students);
        Arrays.sort(seats);
        int i=0,ans=0;
        while(i<seats.length){
            if(seats[i]!=students[i]){
                ans+=Math.abs(seats[i]-students[i]);
                i++;
                
            }
            else{
                i++;
                
            }
        }
    
        return ans;
    }
}