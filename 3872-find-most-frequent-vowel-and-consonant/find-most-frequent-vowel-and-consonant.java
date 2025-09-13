class Solution {
    public int maxFreqSum(String s) {

        int vow[]=new int[26];
        int con[]=new int[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                vow[ch-'a']++;
            }else
                con[ch-'a']++;
        }
        System.out.println(Arrays.toString(vow));
        System.out.println(Arrays.toString(con));

        int res=0,sum=0;;
        for(int i=0;i<26;i++){
            sum=Math.max(vow[i],sum);
        }
        res=sum;
        sum=0;
        for(int i=0;i<26;i++){
            sum=Math.max(con[i],sum);
        }
        res+=sum;


        return res;

        /*
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
        */
    }
}