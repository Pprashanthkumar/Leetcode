class Solution {
    public int dominantIndex(int[] nums) {
        int ind=0;
        int val=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>val){
                val=nums[i];
                ind=i;
            }
        }
        System.out.println("Ind: "+ind+" val "+val);

        for(int i=0;i<nums.length;i++){
            if(ind==i) continue;
            if((nums[i]*2) >val){
                return -1;
            }
        }

        return ind;
        
    }
}