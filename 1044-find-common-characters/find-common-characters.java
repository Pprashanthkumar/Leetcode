class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res=new ArrayList<>();
        int main[]=new int[26];
        String firstWord=words[0];
        int ind=0;
        for(char ch:firstWord.toCharArray()){
            main[ch-'a']++;
        }
        // System.out.println(Arrays.toString(main));

        for(String curStr:words){
            int cur[]=new int[26];
            for(char ch:curStr.toCharArray()){
                cur[ch-'a']++;
            }
            System.out.println("Ma:"+Arrays.toString(main));
            for(int i=0;i<26;i++){
                main[i]=Math.min(main[i],cur[i]);
            }
            System.out.println("Cu:"+Arrays.toString(main));
            System.out.println();

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