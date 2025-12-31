class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones=0;
        int oneRes=0;
        for(int val:nums){
            if(val==1) ones++;
            else{
                oneRes=Math.max(ones,oneRes);
                ones=0;
            }
        }
        oneRes=Math.max(ones,oneRes);
        return oneRes;
    }
}