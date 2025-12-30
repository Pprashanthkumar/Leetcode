class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCnt=0;
        int ind=0;
        for(int val:nums){
            if(val==0){
                zeroCnt++;
            }
            else{
                nums[ind++]=val;
            }
        }
        // System.out.println(Arrays.toString(nums));
        while(zeroCnt>0){
            nums[ind++]=0;
            zeroCnt--;
        }


        
    }
}