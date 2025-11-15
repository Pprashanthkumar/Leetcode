class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        
        List<String> lst=new ArrayList<>();
        int n=list1.length;
        int m=list2.length;
       
        int ind=99999;
        for(int i=0;i<n;i++){
            String cur=list1[i];
            for(int j=0;j<m;j++){
                if(cur.equals(list2[j])) {
                    if(ind>i+j){
                        ind=i+j;
                        lst.clear();
                        lst.add(cur);
                    }
                    else if(i+j==ind) lst.add(cur);
                }
            }
        }
        System.out.println(lst);
        String res[]=new String[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }

        return res;
    }
}