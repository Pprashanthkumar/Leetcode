class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res=new ArrayList<>();
        int main[]=new int[26];
        String firstWord=words[0];
        for(char ch:firstWord.toCharArray()){
            main[ch-'a']++;
        }

        for(String curStr:words){
            int cur[]=new int[26];
            for(char ch:curStr.toCharArray()){
                cur[ch-'a']++;
            }
            
            for(int i=0;i<26;i++){
                main[i]=Math.min(main[i],cur[i]);
            }
        }

        List<String> lst=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(main[i]>0){
                for(int j=0;j<main[i];j++){
                    lst.add(String.valueOf((char)('a'+ i)));
                }
            }
        }
        return lst;
        
    }
}