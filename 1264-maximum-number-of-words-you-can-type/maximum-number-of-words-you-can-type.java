class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String str[]=text.split("\\s");
        // System.out.println(Arrays.toString(str));
        int malfunctioning =0;
        for(int i=0;i<str.length;i++){
            String cur=str[i];
            for(char ch:brokenLetters.toCharArray()){
                if(cur.indexOf(ch)!=-1){
                    malfunctioning++;
                    break;
                }
            }
            
        }
        // System.out.println(malfunctioning );
        return str.length-malfunctioning;
    }
}