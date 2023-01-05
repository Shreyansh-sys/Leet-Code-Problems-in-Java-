class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if((rows*cols)!=(r*c)) return mat;

        int[][] res = new int [r][c];
        int resRows = 0, resCols = 0;

        for(int i = 0; i<rows;i++){
            for(int j=0;j<cols;j++){
                res[resRows][resCols] = mat[i][j];
                resCols++;

                if(resCols==c){
                    resCols = 0;
                    resRows++;
                }
            }
        }
        return res;
    }
}