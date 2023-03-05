package M;

import java.util.ArrayList;
import java.util.List;

public class M73 {
    public void setZeroes(int[][] matrix) {
        List<int[]> coords = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0)
                    coords.add(new int[]{i,j});
            }
        }

        for (int[] point : coords){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][point[1]] = 0;
            }
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[point[0]][i] = 0;
            }
        }

    }
}
