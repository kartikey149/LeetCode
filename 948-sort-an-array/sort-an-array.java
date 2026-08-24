class Solution {
    public int[] sortArray(int[] nums) {
        return sep(nums);
    }
    static int[] merge(int[] arr1,int[] arr2){
        int[] a=new int[arr1.length+arr2.length];
        int i=0,j=0,h=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                a[h++]=arr1[i++];
            }
            else{
                a[h++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            a[h++]=arr1[i++];
        }
        while(j<arr2.length){
            a[h++]=arr2[j++];
        }
        return a;

    }
    static int[] sep(int[] arr){
        if(arr.length<=1) return arr;
        int start=0;
        int end=arr.length;
        int m=(start+end)/2;
        int[] left=sep(Arrays.copyOfRange(arr,0,m));
        int[] right=sep(Arrays.copyOfRange(arr,m,end));
        return merge(left,right);
    }
}