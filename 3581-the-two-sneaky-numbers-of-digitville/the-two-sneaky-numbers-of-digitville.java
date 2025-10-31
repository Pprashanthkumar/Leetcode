class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int len=nums[nums.length-1];
        int freq[]=new int[len+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        System.out.println(Arrays.toString(freq));

        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<=len;i++){
            if(freq[i]>1) lst.add(i);
        }
        System.out.println("List "+lst);
        int res[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }
        return res;
        
    }
}