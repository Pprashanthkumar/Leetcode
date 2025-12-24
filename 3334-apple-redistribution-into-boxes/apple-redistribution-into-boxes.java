class Solution {
    public int minimumBoxes(int[] apple, int[] size) {
        int appleSum=0;
        for(int val:apple) appleSum+=val;
        System.out.println("No of Apples "+appleSum);

        Arrays.sort(size);
        int ind=0;
        int left=0,right=size.length-1;
        while(left<=right){
            int temp=size[left];
            size[left]=size[right];
            size[right]=temp;
            left++;right--;
        }
        System.out.println(Arrays.toString(size));
        for(int i=0;i<size.length;i++){
            if(appleSum>0){
                appleSum=appleSum-size[i];
                ind++;
            }else break;
        }
        return ind;
    }
}