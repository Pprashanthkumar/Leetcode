class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        

        for(int val:nums){
            st.push(val);
            while(st.size()>1){
                int a=st.pop();
                int b=st.pop();

                int g=gcd(a,b);
                if(g>1){
                    st.push(lcm(a,b));
                }else{
                    st.push(b);
                    st.push(a);
                    break;
                }
            }
        }
        while(!st.isEmpty()) res.add(0,st.pop());
    
        return res;
        
    }
    // GCD
    private static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    private static int lcm(int a,int b){
        return a/gcd(a,b)*b;
    }
}