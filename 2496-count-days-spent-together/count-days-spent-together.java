class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        int monthalice=Integer.parseInt(arriveAlice.substring(0,2));
        int datealice=Integer.parseInt(arriveAlice.substring(3,5));
        int monthbob=Integer.parseInt(arriveBob.substring(0,2));
        int datebob=Integer.parseInt(arriveBob.substring(3,5));
        // int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        int lmonthalice=Integer.parseInt(leaveAlice.substring(0,2));
        int ldatealice=Integer.parseInt(leaveAlice.substring(3,5));
        int lmonthbob=Integer.parseInt(leaveBob.substring(0,2));
        int ldatebob=Integer.parseInt(leaveBob.substring(3,5));


        int arral=0;
        // System.out.println()
        for(int i=0;i<monthalice-1;i++){
            arral+=months[i];
        }
        arral+=datealice;

        int leval=0;
        for(int i=0;i<lmonthalice-1;i++){
            leval+=months[i];
        }
        leval+=ldatealice;
        int arrbo=0;
        for(int i=0;i<monthbob-1;i++){
            arrbo+=months[i];
        }
        arrbo+=datebob;

        int levbo=0;
        for(int i=0;i<lmonthbob-1;i++){
            levbo+=months[i];
        }
        levbo+=ldatebob;

        // if(arral<arrbo){
        //     if(leval>levbo){
        //         int diff=levbo-arrbo;
        //         if(diff>0) return diff+1;
        //         else return 0;
        //     }
        //     else{
        //         int diff=leval-arrbo;
        //         if(diff>0) return diff+1;
        //         else return 0;
        //     }
        // }
        // else{
        //     if(leval>levbo){
        //         int diff=levbo-arral;
        //         if(diff>0) return diff+1;
        //         else return 0;
        //     }
        //     else{
        //         int diff=leval-arral;
        //         if(diff>0) return diff+1;
        //         // else return 0;
        //     }
        // }
        // return 0;
        int start=Math.max(arral,arrbo);
        int end=Math.min(levbo,leval);
        return Math.max(0,end-start+1);
        
        
    }
}