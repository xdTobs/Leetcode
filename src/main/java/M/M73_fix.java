package M;

public class M73_fix {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean topLeft =false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j]==0){
                    matrix[0][j]=0;

                    if(i==0){
                        topLeft=true;
                    }
                    else{
                        matrix[i][0]=0;
                    }
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if (matrix[0][0]==0){
            for (int i = 0; i < rows; i++) {
                matrix[i][0] =0;
            }
        }
        if(topLeft){
            for (int i = 0; i < cols; i++) {
                matrix[0][i]= 0;
            }
        }

    }
}
