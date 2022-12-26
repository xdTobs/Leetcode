package M;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class M417 {



    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        List<List<Integer>> res = new ArrayList<>();
        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];


        for (int i = 0; i < rows; i++) {
            validHeight(heights, i, 0, pac, heights[i][0]);
            validHeight(heights, i, cols - 1, atl, heights[i][cols-1]);
        }
        for (int j = 0; j < cols; j++) {
            validHeight(heights, 0, j, pac, heights[0][j]);
            validHeight(heights, rows-1, j, atl, heights[rows-1][j]);
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pac[r][c]&&atl[r][c]){
                    res.add(new ArrayList<>(List.of(new Integer[]{r, c})));
                }
            }
        }

        return res;
    }

    public void validHeight(int[][] heights, int i, int j, boolean[][] ocean, int previousHeight) {
        int rows = heights.length;
        int cols = heights[0].length;
        if (i < 0 || j < 0 || i >= rows || j >= cols || heights[i][j] < previousHeight|| ocean[i][j]) {
            return;
        }

        ocean[i][j] =true;
        validHeight(heights,i+1,j,ocean,heights[i][j]);
        validHeight(heights,i-1,j,ocean,heights[i][j]);
        validHeight(heights,i,j+1,ocean,heights[i][j]);
        validHeight(heights,i,j-1,ocean,heights[i][j]);
    }


}
//List<Integer> temp = new ArrayList<>();
//            temp.add(i);
//            temp.add(j);
//            res.add(temp);