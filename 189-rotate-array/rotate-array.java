class Solution {
    public void rotate(int[] nums, int k) {
        //Recursive way
        // 1. Rotate 0 to n-k elements in reverse order
        // 2. Rotate remaining elements from n-k+1 to n elements
        // 3. Rotate all elements


        int n=nums.length;
        k%=n;
        if(k==0 || k>n) return;
        
        reverse(nums,n-k,n-1);
        //System.out.println(Arrays.toString(nums));

        reverse(nums,0,n-k-1);
        //System.out.println(Arrays.toString(nums));

        reverse(nums,0,n-1);
        //System.out.println(Arrays.toString(nums));


        
    }

    private void reverse(int[]nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}