class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> vow=new HashMap<>();
        Map<Character,Integer> con=new HashMap<>(); 


        // Push into map all character in the string
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            // Char is vowel
            if("AEIOUaeiou".indexOf(ch)!=-1){
                vow.put(ch,vow.getOrDefault(ch,0)+1);
            }else{
                con.put(ch,con.getOrDefault(ch,0)+1);
            }
        }

        // Find Maximum in vow and con
        int res=0;
        int maxFreq=0;
        for(Map.Entry<Character,Integer> m:vow.entrySet())
            maxFreq=Math.max(maxFreq,m.getValue());
        

        res=maxFreq;
        maxFreq=0;
        for(Map.Entry<Character,Integer> m:con.entrySet())
            maxFreq=Math.max(maxFreq,m.getValue());
        

        // System.out.println("Vow: "+vow);
        // System.out.println("Con: "+con);
        res+=maxFreq;
        return res;
    }
}