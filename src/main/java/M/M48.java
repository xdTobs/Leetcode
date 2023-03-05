package M;

import java.util.Arrays;

public class M48 {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            int[]circle = new int[matrix.length* matrix.length+1];
            for (int j = 0; j < matrix.length-(2*i); j++) {
                int length = matrix.length-(2*i);
                circle[j] = matrix[i][i+j];
                circle[j+ length-1] = matrix[j+i][matrix.length-1-i];
                circle[j+(2*(length-1))] = matrix[matrix.length-1-i][matrix.length-1-j-i];
                circle[j+(3*(length-1))] = matrix[matrix.length-1-j-i][i];
            }
            for (int j = 0; j < matrix.length-(2*i); j++) {
                int length = matrix.length-(2*i);
                matrix[j+i][matrix.length-1-i] = circle[j];
                matrix[matrix.length-1-i][matrix.length-1-j-i] = circle[j+ length-1];
                matrix[matrix.length-1-j-i][i] =circle[j+(2*(length-1))];
                matrix[i][j+i] = circle[j+(3*(length-1))];
            }


        }
    }

    public static void main(String[] args) {
        int[]row1 = new int[]{1,2};
        int[]row2 = new int[]{3,4};

        M48 sol = new M48();
        int[][] map = new int[][]{row1,row2};
        sol.rotate(map);
        System.out.println(map);
    }
    //int[]circle = new int[matrix.length* matrix.length];
    //            for (int j = 0; j < matrix.length-(2*i); j++) {
    //                circle[j] = matrix[i][i+j];
    //                circle[j+ matrix.length] = matrix[j-i][matrix.length-1+i];
    //                circle[j+(2*(matrix.length-1))] = matrix[matrix.length-1-i][matrix.length-1-j+i];
    //                circle[j+(3*(matrix.length-1))] = matrix[matrix.length-1-j-i][i];
    //            }
}
