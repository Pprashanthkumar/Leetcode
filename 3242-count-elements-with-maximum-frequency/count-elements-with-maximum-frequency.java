class Solution {
    public int maxFrequencyElements(int[] nums) {

        Arrays.sort(nums);
        int len=nums[nums.length-1];
        int freq[]=new int[len+1];

        for(int val:nums) freq[val]++;
        Arrays.sort(freq);

        int res=0;

        int highest=freq[freq.length-1];
        for(int i=freq.length-1;i>0;i--){
            if(freq[i]==highest){
                res+=freq[i];
            }
        }

        return res;
    }
}