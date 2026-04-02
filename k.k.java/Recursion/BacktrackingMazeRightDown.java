public class Maze {
    public static void main(String[] args) {
        // System.out.println(count(3,3));
        // }
        // static int count (int r , int c){
        // if(r==1||c==1){
        // return 1;
        // } for count of no of ways to reach from top left to bottom right in a maze
        // int left = count (r-1 ,c );
        // int right = count(r, c-1);
        // return left + right;

        // actual paths to reach from top left to bottom right in a maze
        // System.out.println(path("", 3, 3));
        // }
        // static void path (String p, int r, int c){
        // if(r==1||c==1){
        // System.out.println(p);
        // return;
        // }
        // path( p+'D', rr-1,c);
        // path(p+'R', r, c-1);
        // return p;

        // to return ans in arraylist
        // System.out.println(path("", 3, 3));
        // }
        // static ArrayList<String> path(String p, int r, int c){
        // if(row==1 && col ==1){
        // ArrayList<String> list = new ArrayList<>();
        // list.add(p);
        // return list;
        // }
        // ArrayList<String> ans = new ArrayList<>();
        // if (r>1){
        // ans.addAll(path(p+'D', r-1,c));
        // }
        // if(c>1){
        // ans.addAll(path(p+'R',r,c-1));
        // }
        // return list;
        // }
        // }

        // to return ans in arraylist along with the Diagonal path too
        // System.out.println(pathDiagonal("", 3, 3));
        // }

        // static ArrayList<String> pathDiagonal(String p, int r, int c){
        // if(row==1 && col ==1){
        // ArrayList<String> list = new ArrayList<>();
        // list.add(p);
        // return list;
        // }
        // ArrayList<String> ans = new ArrayList<>();

        // if (r>1&&c>1){
        // ans.addAll(pathDiagonal(p+'D', r-1,c));
        // }
        // if (r>1){
        // ans.addAll(pathDiagonal(p+'V', r-1,c));

        // }
        // if(c>1){
        // ans.addAll(pathDiagonal(p+'H',r,c-1));
        // }
        // return list;
        // }
        // }

        // path with Restrictions
        boolean[][] board = {
                { true, true, true },
                { true, false, true },
                { true, true, true }
        };
        System.out.println(pathWithRestrictions("", board, 0, 0));
    }

    static ArrayList<String> pathWithRestrictions(String p,boolean [][] maze, int r, int c){
        if(row==maze.length -1 &&  c ==maze[0].length-1){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
        }
        if(!maze[r][c]{
            return;
        })
        ArrayList<String> ans = new ArrayList<>();
        if (r>maze.length -1){
        ans.addAll(pathWithRestrictions(p+'D',maze, r+1,c));
        }
        if(c>maze[0].length-1){
        ans.addAll(pathWithRestrictions(p+'R', maze, r,c+1));
        }
        return list;
        }
}
