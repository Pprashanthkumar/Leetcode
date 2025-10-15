class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {



        int k=1;
        int n=nums.size();
        int maxLen=0,curLen=1,prev=0;;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)) curLen++;
            else{
                prev=curLen;
                curLen=1;
            }
            maxLen=Math.max(maxLen,Math.min(prev,curLen));
            maxLen=Math.max(maxLen,curLen/2);
        }
        return maxLen;

        /*
        if(k<n){
            // if(k==1) return true;
            // if(2*k>n) return false;
            System.out.println("At k : "+k);
            for(int i=0;i<=n-2*k;i++){

                boolean firstIn=true;
                for(int j=i+1;j<i+k;j++){
                    System.out.println("fir part ");
                    System.out.print(nums.get(j)+" ");
                    if(nums.get(j)<=nums.get(j-1)){
                        firstIn=false;
                        break;
                    }
                }
                System.out.println();
                
                boolean secondIn=true;
                for(int l=i+k+1;l<i+(2*k);l++){
                    System.out.println("sec part ");
                    System.out.print(nums.get(l)+" ");
                    if(nums.get(l)<=nums.get(l-1)){
                        secondIn=false;
                        break;
                    }
                }
                if(firstIn && secondIn) maxLen=Math.max(maxLen,k);
                k++;
            }
        }
        return maxLen;
        */
    }
}