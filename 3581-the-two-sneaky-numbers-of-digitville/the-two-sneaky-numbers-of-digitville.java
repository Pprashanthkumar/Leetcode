class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) lst.add(nums[i]);
            }
        }
        System.out.println(lst);
        Collections.sort(lst);
        int res[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }
        return res;
        
    }
}