class Solution {
    public int countDigits(int n) {
        int org=n;
        int cnt=0;
        while(n>0){
            int rem=n%10;
            if(org%rem==0) cnt++;
            n/=10;
        }
        return cnt;
        
    }
}