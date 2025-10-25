class Solution {
    public int totalMoney(int n) {
        int monday=1;
        int sum=0;

        while(n>0){
            for(int days=0;days<Math.min(7,n);days++){
                sum+=monday+days;
            }
            n-=7;
            monday++;
        }
        return sum;
        
    }
}