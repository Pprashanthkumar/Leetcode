class Solution {
    public int nextBeautifulNumber(int n) {
        List<Integer> lst =new ArrayList<>();
        for(int i=n+1;;i++){
            if(check(i)) return i;
        }
    }
    private static boolean check(int val){
        int freq[]=new int[10];
        int org=val;
        while(val>0){
            int rem=val%10;
            freq[rem]++;
            val/=10;
        }
        // System.out.println(Arrays.toString(freq));
        for(int i=0;i<10;i++){
            if(freq[i]>0 && freq[i]!=i){
                return false;
            }
        }
        return true;
    }
}