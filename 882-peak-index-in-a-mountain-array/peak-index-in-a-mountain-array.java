class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int ind=0;
        int val=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>val){
                val=arr[i];
                ind=i;
            }
        }
        return ind;
    }
}