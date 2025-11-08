class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        Map<Integer,Character> map=new HashMap<>();
        // put alphabets into 
        for(int i=0;i<26;i++) map.put(i,alpha.charAt(i));
        // System.out.println("Acutal Map "+map);

        StringBuilder res=new StringBuilder();
        for(int i=0;i<=n-k;i+=k){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=s.charAt(j)-'a';
            }
            res.append((char)('a'+ sum%26));
        }

        return res.toString();
        
        
    }
}