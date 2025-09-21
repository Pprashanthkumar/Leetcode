class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int or=0;
        for(int val:nums){
            if(val%2==0) or|=val;
        }
        return or;
    }
}