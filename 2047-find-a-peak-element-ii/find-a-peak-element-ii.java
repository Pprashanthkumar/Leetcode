class Solution {
    public int[] findPeakGrid(int[][] mat) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(isOkay(i,j,mat[i][j],mat)) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
    private static boolean isOkay(int i,int j,int val,int [][]mat){

        int m=mat.length;
        int n=mat[0].length;
        // Top
        if(i-1>=0 && mat[i-1][j]>=val) return false;

        // Bottom
        if(i+1<m && mat[i+1][j]>=val) return false;

        // Left
        if(j-1>=0 && mat[i][j-1]>=val) return false;

        // Right
        if(j+1<n && mat[i][j+1]>=val) return false;

        return true; 
    }
}