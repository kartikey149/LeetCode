class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int total=0;
    int costt=0;
    int currentstation=0;
    for(int i=0;i<gas.length;i++){

        int gain=gas[i]-cost[i];
        total+=gain;
        costt+=gain;
        if(costt<0){
            currentstation=i+1;
            costt=0;
        }
    }
    return (total>=0)?currentstation:-1;
    
    
    
    }
    
}