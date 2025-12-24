class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int small=nums[0],high=nums[n-1];
        int cnt=0;
        for(int i=1;i<=Math.min(small,high);i++){
            if(small%i==0 && high%i==0) cnt=i;
        }
        return cnt;
    }
}