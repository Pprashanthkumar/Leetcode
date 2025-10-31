class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        // System.out.println("Map "+map);
        
        List<Integer> lst=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>1) lst.add(m.getKey());
        }
        // System.out.println("List "+lst);

        int res[]=new int[lst.size()];
        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }
        return res;
        
    }
}