class Solution {
    public int countPartitions(int[] nums) {
        int pref=0;
        int n=nums.length;
        int res=0;
        for(int i=0;i<n-1;i++){
            int suf=0;
            pref+=nums[i];
            for(int j=i+1;j<n;j++){
                suf+=nums[j];
            }
            if((pref-suf)%2==0) res++;
        }
        return res;
        
    }
}