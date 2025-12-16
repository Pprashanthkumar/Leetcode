class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxVal=nums[n-1];
        int count=0;
        for(int num:nums){
            count+=maxVal-num;
        }
        return count;
        
    }
}