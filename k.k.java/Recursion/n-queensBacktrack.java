public class n-queensBacktrack
{

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(queens(board, 0)); // this will return the number of ways we can place the queens in the
                                              // board and also print the board with the queens placed in it

    }

    static int queens(boolean[][] board, int row) {
        // this is the base case where we will check if we have placed all the queens in
        // the board or not
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;// this will return 1 if we have placed all the queens in the board and also
                     // print the board with the queens placed in it
        }
        int count = 0;
        // placing the queen and checking for the next queen
        for (int col = 0; col < board.length; col++) {
            // placing the queen if it is safe to place the queen in that cell
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1); // this is the recursive call where we will check for the next queen
                board[row][col] = false;// this is the backtracking step where we will mark the cell as false again
            }
        }
        return count;
    }

    // this is the function where we will check if it is safe to place the queen in
    // that cell or not
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check for the vertical column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // check for the left diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        // check for the right diagonal
        int maxRight = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    // this is the function where we will display the board with the queens placed
    // in it
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
