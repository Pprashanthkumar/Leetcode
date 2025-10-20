class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int neg=0,pos=0;
        for(int i=0;i<operations.length;i++){
            String cur=operations[i];
            for(int j=0;j<3;j++){
                if(cur.charAt(j)=='+') pos++;
                else if(cur.charAt(j)=='-') neg++;
            }
            // System.out.println(cur+" "+pos+" "+neg);
        }
        pos/=2;
        neg/=2;
        return pos-neg;
        
    }
}