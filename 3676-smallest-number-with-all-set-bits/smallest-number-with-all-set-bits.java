class Solution {
    public int smallestNumber(int n) {
        for(int i=n; ; i++){
            int val=i;
            String str=Integer.toBinaryString(val);
            // System.out.println(str);
            boolean containsZero=true;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)-'0'==0){
                    containsZero=false;
                    break;
                }
            }
            if(containsZero) return i;
        }
    }
}