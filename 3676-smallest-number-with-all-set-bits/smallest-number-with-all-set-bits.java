class Solution {
    public int smallestNumber(int n) {
        
        for(int i=n; ; i++){
            int val=i;
            String str=Integer.toBinaryString(val);
            if(!str.contains("0")) return i; 
        }
    }
}