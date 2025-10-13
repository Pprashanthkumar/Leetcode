class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n=words.length;
        List<String> res=new ArrayList<>();
        res.add(words[0]);
        for(int i=1;i<n;i++){
            if(!check(words[i],words[i-1])){
                res.add(words[i]);
            }
        }
        return res;
    }
    private static boolean check(String s1, String s2){
        
        int a1[]=new int[26];
        int a2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            a1[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            a2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(a1[i]!=a2[i]) return false;
        }
        return true;


    }
}