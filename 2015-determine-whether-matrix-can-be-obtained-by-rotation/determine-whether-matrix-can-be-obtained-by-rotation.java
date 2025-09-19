class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n=mat.length;

        for(int r=0;r<4;r++){ // each time 90 deg
            if(isRotate(mat,target)) return true;
            else mat=rotate(mat);
        }
        return false;
    }
    // Rotating 90 deg each time
    private static int[][] rotate(int [][]mat){
        int dummy[][]=new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                dummy[i][j]=mat[mat.length-1-j][i];
            }
        }
        return dummy;
    }
    // conparing funcion
    private static boolean isRotate(int a[][],int b[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]!=b[i][j]) return false;
            }
        }
        return true;
    }
}