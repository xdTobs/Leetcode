package M;

import java.util.HashSet;

public class M36 {
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Integer> vertical = new HashSet<>();
            HashSet<Integer> horizontal = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (Character.isDigit(board[i][j])) {
                    int num = board[i][j];
                    if(horizontal.contains(num))
                        return false;
                    horizontal.add(num);
                }

                if (Character.isDigit(board[j][i])) {
                    int num = board[j][i];
                    if(vertical.contains(num))
                        return false;
                    vertical.add(num);
                }

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!validateBox(i*3,j*3,board))
                    return false;
            }
        }
        return true;
    }

    private static boolean validateBox(int i, int j, char[][] board) {
        HashSet<Integer> box = new HashSet<>();

        for (int k = 0; k <3 ; k++) {
            for (int l = 0; l < 3; l++) {
                if(Character.isDigit(board[k+i][l+j])){
                    int num = board[k+i][l+j];
                    if(box.contains(num))
                        return false;
                    box.add(num);

                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] row1 = new char[]{'5','3','.','.','7','.','.','.','.'};
        char[] row2 = new char[]{'6','.','.','1','9','5','.','.','.'};
        char[] row3 = new char[]{'.','9','8','.','.','.','.','6','.'};
        char[] row4 = new char[]{'8','.','.','.','6','.','.','.','3'};
        char[] row5 = new char[]{'4','.','.','8','.','3','.','.','1'};
        char[] row6 = new char[]{'7','.','.','.','2','.','.','.','6'};
        char[] row7 = new char[]{'.','6','.','.','.','.','2','8','.'};
        char[] row8 = new char[]{'.','.','.','4','1','9','.','.','5'};
        char[] row9 = new char[]{'.','.','.','.','8','.','.','7','9'};
        char[][] board = new char[][]{row1,row2,row3,row4,row5,row6,row7,row8,row9};
        System.out.println(isValidSudoku(board));
    }
}
