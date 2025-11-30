class Solution {
    public int countElements(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int curVal=nums[i];
            // System.out.println("curVal :"+curVal);
            boolean low=false,high=false;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(curVal<nums[j]){
                        // System.out.println("high "+nums[j]);
                        high=true;
                    }else if(curVal>nums[j]){
                        // System.out.println("low "+nums[j]);
                        low=true;
                    }
                }
            }
            System.out.println("\n");
            if(low && high) count++;
        }
        return count;
        
    }
}