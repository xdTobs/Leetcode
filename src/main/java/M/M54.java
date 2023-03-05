package M;

import java.util.ArrayList;
import java.util.List;

public class M54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0, right = matrix[0].length - 1;
        int bottom = matrix.length - 1, top = 0;
        List<Integer> res = new ArrayList<>();

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;

        }
        return res;
    }

    public static void main(String[] args) {
        int[] row1 = new int[]{1, 2, 3};
        int[] row2 = new int[]{4, 5, 6};
        int[] row3 = new int[]{7, 8, 9};

        M54 sol = new M54();
        int[][] map = new int[][]{row1, row2, row3};

        System.out.println(sol.spiralOrder(map));
    }
}
