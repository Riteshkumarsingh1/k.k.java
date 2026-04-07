public class PatternRecursion {
    public static void main(String[] args) {
        pattern(5, 0);
    }
    // static void pattern(int r, int c){
    // //base case // ****
    // if (r==0){ // ***
    // return; // ** for printing this kind of pattern we have to use two parameters
    // one for row and one for column
    // } // * // we have to use two if conditions one for column and one for row

    // if(c<r){
    // System.out.println("*");//printing the star in the same line
    // pattern(r, c+1);//calling the function for column
    // } else {
    // System.out.println();//for printing the next line
    // pattern(r-1, 0);//calling the function for row
    // }
    // }

    static void pattern(int r, int c) {
        // base case // ****
        if (r == 0) { // ***
            return; // ** for printing this kind of pattern we have to use two parameters one for
                    // row and one for column
        } // * // we have to use two if conditions one for column and one for row

        if (c < r) {
            pattern(r, c + 1);// calling the function for column
            System.out.println("*");// printing the star in the same line
        } else {
            pattern(r - 1, 0);// calling the function for row
            System.out.println();// for printing the next line
        }
    }

}
