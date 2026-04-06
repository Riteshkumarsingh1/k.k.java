public class 37SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        solveSudoku(board);
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
    satic boolean solve(int[][] board){
        int n= board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (board[i][j] == '.'){
                    row = i;
                    col = j;
                    emptyLeft = false;
                    break;
                }
            }
            //if you found an empty cell then break the outer loop as well
            if (emptyLeft == false){
                break;
            }
        }
        if (emptyLeft==true){
            return true;
            // suduko solved
        }
        for (int num = 1; num <= n; num++){
            if (isSafe(board, row, col, num)){
                board[row][col] = (char) (num + '0');
                if (solve(board)){
                    display(board);
                    System.out.println();
                    return true;
                }
                board[row][col] = '.';
            }
        }        return false;
    }
        for (int num = 1; num <= n; num++){
            if (isSafe(board, row, col, num)){
                board[row][col] = (char) (num + '0');
                if (solve(board)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        // check for the row
        for (int i = 0; i < board.length; i++){
            // check if the number is already present in the row or not
            if (board[row][i] == num){
                return false;
            }
        }
        // check for the column
        for (int i = 0; i < board.length; i++){
            // check if the number is already present in the column or not
            if (board[i][col] == num){
                return false;
            }
        }
        private static void display(int[][] board){
        for (int[] row : board){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // check for the 3*3 box
        int boxRowStart = row - row % 3;
        int boxColStart = col - col % 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++){
            // check if the number is already present in the 3*3 box or not
            for (int j = boxColStart; j < boxColStart + 3; j++){
                if (board[i][j] == num){
                    return false;
                }
            }
            // instead of hardcoding the value 3 we can calculate the value of the box size using the length of the board
            int sqrt = (int) Math.sqrt(board.length);
            int boxRowStart = row - row % sqrt;
            int boxColStart = col - col % sqrt;
            for (int i = boxRowStart; i < boxRowStart + sqrt; i++){
                // check if the number is already present in the 3*3 box or not
                for (int j = boxColStart; j < boxColStart   + sqrt; j++){
                    if (board[i][j] == num){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
