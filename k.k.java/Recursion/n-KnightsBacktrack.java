public class n-KnightsBacktrack
{

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println(knights(board, 0, 0, 4)); // this will return the number of ways we can place the knights in
                                                     // the board and also print the board with the knights placed in it

    }

    static void knight(boolean[][] board, int row, int col,int target){
     // this is the base case where we will check if we have placed all the knights in the board or not
        if (target == 0){
            display(board);
            System.out.println();
            return;// this will return if we have placed all the knights in the board and also print the board with the knights placed in it
        }
        if(row == board.length-1 && col == board.length){// this is the base case where we will check if we have reached the end of the board or not
            return;
        }
        if (col == board.length){}
            knight(board, row + 1, 0, target);
            return;
        }
    // placing the knight and checking for the next knight
    if(isSafe(board, row, col)){
            board[row][col] = true;
            knight(board, row, col + 1, target - 1); // this is the recursive call where we will check for the next knight
            board[row][col] = false;// this is the backtracking step where we will mark the cell as false again
        }

    // this is the recursive call where we will check for the next knight without
    // placing the current knight in the current cell
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check for the 8 possible moves of the knight
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    // do not repeat the same code for checking the 8 possible moves of the knight,
    // instead we can create a function for that
    static boolean isSafe(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            if (board[row][col]) {
                return false;
            }
        }
    }

    // this is the function where we will display the board with the knights placed
    // in it
    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
