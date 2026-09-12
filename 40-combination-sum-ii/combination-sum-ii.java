class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        
        Arrays.sort(cand);
        pick(0,target,cand,0,ans,new ArrayList<>());

        
         return ans;

    }
    // static void pick(int i,int tar,int[] arr,int sum,Set<List<Integer>> ans,List<Integer> ls){
    //     if(sum==tar){
            
    //         ans.add(new ArrayList<>(ls));
    //         return;
    //     }
    //     if(i==arr.length|| sum>tar){
    //         return;
    //     }
        
    //     if(sum+arr[i]<=tar){

    //     ls.add(arr[i]);
    //     pick(i+1,tar,arr,sum+arr[i],ans,ls);
    //     ls.remove(ls.size()-1);
    //     }
    //     pick(i+1,tar,arr,sum,ans,ls);
    // }

    static void pick(int i,int tar,int[] arr,int sum,List<List<Integer>> ans,List<Integer> ls){
        if(sum==tar){
            ans.add(new ArrayList<>(ls));
            return;
        }
        

        for(int j=i;j<arr.length;j++){
            if(j>i && arr[j]==arr[j-1]) continue;
            if (arr[i] > tar-sum) break;
            ls.add(arr[j]);
            pick(j+1,tar,arr,sum+arr[j],ans,ls);
            ls.remove(ls.size() - 1);
        }
    }
}