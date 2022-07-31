// Name : MOXSHANG SHAH
// ID : 21CE129

// Aim :
// The problem is to check whether a given Sudoku solution is correct.

import java.util.*;

class Practical_9 {
    private int[][] sdk;

    public Practical_9() 
    {
        // sudoku has 9 rows and 9 coloumns
        sdk = new int[9][9];
    }

    public Practical_9(int sdk[][]) {
        this.sdk = sdk;
    }

    // Check the elements in Row
    private boolean row_checking(int row, int no) {

        for (int i = 0; i < 9; i++) {
            if (sdk[row][i] == no) {

                return false;
            }
        }
        return true;
    }

    // Check the elements in Collumn
    private boolean column_checking(int col, int no) {

        for (int i = 0; i < 9; i++) {

            if (sdk[i][col] == no) {

                return false;
            }
        }
        return true;
    }

    // Check the elements in all 3x3 box
    private boolean box_checking(int row, int col, int no) {

        int r = row - row % 3;
        int c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (sdk[i][j] == no) {

                    return false;
                }
            }
        }
        return true;
    }
// final method for checking the validity of sudoku
    private final boolean validity(int row, int col, int no) {
        boolean chk_col = column_checking(col, no);
        boolean chk_box = box_checking(row, col, no);
        boolean chk_row = row_checking(row, no);

        return !(chk_box || chk_col ||chk_row);
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        // elements of the sudoku
        int[][] board = 
        { 
                { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
        };
        Practical_9 a = new Practical_9(board);
        for (int i = 0; i < 9; i++) 
        {
            for (int j = 0; j < 9; j++) 
            {
                boolean c = a.validity(i, j, board[i][j]);
                if (c == true) 
                {
                    cnt++;
                }
            }
        }
        sc.close();
        // if 9*9 = 81 counted the sudoku is valid
        if (cnt == 81) 
        {
            System.out.print("Sudoku answer is Valid");
        } else 
        {
            System.out.print("Sudoku answer is Invalid");
        }
    }
}