class Solution {
    public boolean doesAliceWin(String s) {
        int vow=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if("AEIOUaeiou".indexOf(ch)!=-1){
                vow++;
            }
        }
        
        return vow!=0 ? true : false;
        
    }
}