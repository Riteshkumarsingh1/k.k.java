import java.util.Arrays;

public class BacktrackingAllPath {
    public static void main(String[] args) {
        // boolean[][] board = {
        // { true, true, true },
        // { true, false, true },
        // { true, true, true }
        // };
        // path("", board, 0, 0),step;

        boolean[][] board = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };
        int[][] path = new int[board.length][board[0].length];
        pathPrint("", board, 0, 0, path, 1);//
    }

    // static void path(String p, boolean[][] maze, int r, int c) {
    // if (r == maze.length - 1 && c == maze[0].length - 1) {
    // System.out.println(p);
    // return;
    // }
    // if (!maze[r][c]) { // if the cell is false then we cannot move to that cell
    // return;
    // }
    // // to avoid the loop we will mark the cell as false
    // maze[r][c] = false;

    // if (r < maze.length - 1) {
    // path(p + 'D', maze, r + 1, c);
    // }
    // if (c < maze[0].length - 1) {
    // path(p + 'R', maze, r, c + 1);
    // }
    // if (r > 0) {
    // path(p + 'U', maze, r - 1, c);
    // }
    // if (c > 0) {
    // path(p + 'L', maze, r, c - 1);
    // }
    // // this is the backtracking step where we will mark the cell as true again
    // maze[r][c] = true;
    // }
    // }

    static void pathPrint(String p, boolean[][] maze, int r, int c, int path[][], int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;// this will store the step number in the path array
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));// this is to print the path in the form of a 2D array where
                                                         // the step number is stored in the path array
            }
            System.out.println(p);// this is to print the path in the form of a 2D array where the step number is
                                  // stored in the path array
            System.out.println();// this is to print the path in the form of a 2D array where the step number is
                                 // stored in the path array
            return;
        }
        if (!maze[r][c]) { // if the cell is false then we cannot move to that cell
            return;
        }
        // to avoid the loop we will mark the cell as false
        maze[r][c] = false;
        path[r][c] = step; // this will store the step number in the path array
        if (r < maze.length - 1) {
            pathPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if (c < maze[0].length - 1) {
            pathPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            pathPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            pathPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }
        // this is the backtracking step where we will mark the cell as true again
        maze[r][c] = true;
        path[r][c] = 0; // this will reset the step number in the path array
    }
}