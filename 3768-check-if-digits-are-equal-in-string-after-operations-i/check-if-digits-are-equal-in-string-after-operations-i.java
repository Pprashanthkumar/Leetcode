class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder str=new StringBuilder(s);
        while(str.length()>2){
            StringBuilder dummy=new StringBuilder();
            for(int i=0;i<str.length()-1;i++){
                int a=str.charAt(i)-'0';
                int b=str.charAt(i+1)-'0';
                int rem=(a+b)%10;
                dummy.append(String.valueOf(rem));
            }
            // System.out.println(str+" "+dummy);
            str.setLength(0);
            str=dummy;
        }
        System.out.println("Final : "+str);

        return str.charAt(0)==str.charAt(1) ? true : false;
        
    }
}