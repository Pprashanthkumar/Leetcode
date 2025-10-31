class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) lst.add(nums[i]);
        }
        // System.out.println("List "+lst);

        int res[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }
        return res;

        
    }
}