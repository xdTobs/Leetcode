package M;

import java.util.HashMap;
import java.util.HashSet;

public class M79 {


    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (isWord(board, word, 0, i, j)) return true;
            }
        }
        return false;
    }

    public boolean isWord(char[][] board, String word, int index, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        if (index == word.length()) return true;
        if (index >= word.length()) return true;
        if (
                i < 0 ||
                        j < 0 ||
                        i >= m ||
                        j >= n ||
                        board[i][j] != word.charAt(index)
        ) return false;
        boolean hasSolution = false;
        if (board[i][j] == word.charAt(index)) {
            board[i][j] += 100;

            hasSolution = (isWord(board, word, index + 1, i + 1, j) ||
                    isWord(board, word, index + 1, i - 1, j) ||
                    isWord(board, word, index + 1, i, j + 1) ||
                    isWord(board, word, index + 1, i, j - 1));
            board[i][j] -= 100;

        }
        return hasSolution;
    }


}
