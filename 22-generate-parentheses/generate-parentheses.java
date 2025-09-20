class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        fun(res,n,0,0,"");
        return res;      
    }
    private void fun(List<String> res, int n, int open, int close, String curStr){
        if(curStr.length()==n*2){
            res.add(curStr);
            return;
        }
        if(open<n){
            fun(res,n,open+1,close,curStr+"(");
        }
        if(close<open){
            fun(res,n,open,close+1,curStr+")");
        }
        
    }
}