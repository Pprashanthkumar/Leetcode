class Solution {
    public int triangleNumber(int[] nums) {
        // O(n^3) gives TLE
        Arrays.sort(nums);
        int count=0;
        for(int i=2;i<nums.length;i++){
            int left=0,right=i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    count+=right-left;
                    // increase value(left)
                    right--;
                }
                // if already greater decrease right
                else{
                    left++;
                }
                // above both methods(left, right) used to check possible
            }
        }

        return count;
    }
}