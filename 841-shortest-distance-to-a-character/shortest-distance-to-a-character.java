class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> lst=new ArrayList<>();
        int n=s.length();
        for(int i=0;i<n;i++) if(s.charAt(i)==c) lst.add(i);
        System.out.println(lst);

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int dis=Integer.MAX_VALUE;
            for(int j=0;j<lst.size();j++){
                dis=Math.min(Math.abs(lst.get(j)-i),dis);
            }
            System.out.println(s.charAt(i)+" "+c+" "+dis);
            arr[i]=dis;
        }

        return arr;
        
        
    }
}