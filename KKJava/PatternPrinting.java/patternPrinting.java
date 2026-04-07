public class patternPrinting {
    public static void main(String[] args) {
        pattern1(4);
    }

    // static void pattern1(int n) {
    //     for (int i = 1; i <= n; i++) {  // for each row , run the columns
    //         for (int j = 1; j <= n; j++) {
    //             System.out.print("* ");
    //         }                                                               *
                                                                            // * *
                                                                            // * * *
                                                                            // * * * *
    //         // when on one row is printed we need to print a new line
    //         System.out.println();
    //     }


    // static void pattern2(int n) {
    //     for (int i = 1; i <= n; i++) {  // for each row , run the columns
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("* ");                                       * * * *
    //                                                                           * * * *
    //                                                                           * * * *
    //                                                                           * * * *
    //         }
    //         // when on one row is printed we need to print a new line
    //         System.out.println();
    //     }

    // static void pattern1(int n) {
    //     for (int i = 1; i <= n; i++) {  // for each row , run the columns
    //         for (int j = 1; j <= (n+1-i); j++) {
    //             System.out.print("* ");                                     // * * * *
    //                                                                         // * * *
    //                                                                         // * *
    //                                                                         // *
    //         }
    //         // when on one row is printed we need to print a new line
    //         System.out.println();
      //  }

    //  static void pattern4(int n) {
    //     for (int i = 1; i <= n; i++) {  // for each row , run the columns
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print(j +"" );                                   1 
    //                                                                         1 2 
    //                                                                         1 2 3 
    //                                                                         1 2 3 4
    //         }
    //         // when on one row is printed we need to print a new line
    //         System.out.println();
    //     }


// static void pattern1(int n) {
//         for (int i = 1; i <=2*n; i++) { 
//             int totalColsInRow = i > n ? 2*n - i : i;
//             for(int j =0; j<totalColsInRow; j++){
//                 System.out.print("* ");
//             }                                                 *
//                                                               * *
//                                                               * * *
//                                                               * * * *       
//                                                               * * * * *
//                                                               * * * *
//                                                               * * *
//                                                               * *   
//                                                               *            
//             System.out.println();
//         }





// static void pattern28(int n) {
//         for (int i = 1; i <=2*n; i++) { 
//             int totalColsInRow = i > n ? 2*n - i : i;
//             int noofspaces = n - totalColsInRow;
//             for (int s =0; s< noofspaces; s++){
//                 System.out.print(" ");
//             }
//             for(int j =0; j<totalColsInRow; j++){                *
//                                                                 * *
//                                                                * * *
//                                                               * * * * 
//                 System.out.print("* ");
//             }
            
//             System.out.println();
//         }
 
    //  static void pattern30(int n){
    //     for (int i=1; i<=n; i++){
    //         for(int spaces =0; spaces<n-i; spaces++){
    //             System.out.print(" ");
    //         }
    //         for(int j=i; j>=1; j--){
    //             System.out.print(j );
    //         }
    //         for(int j=2; j<=i; j++){
    //             System.out.print(j );
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    //  }


    // static void pattern17(int n){
    //     for (int i=1; i<=2*n; i++){
    //         int c=i>n? 2*n - i : i;

    //         for(int spaces =0; spaces<n-c; spaces++){
    //             System.out.print(" ");
    //         }

    //         for(int j=c; j>=1; j--){
    //             System.out.print(j );
    //         }

    //         for(int j=2; j<=c; j++){
    //             System.out.print(j );
    //         }
    //         System.out.println();
    
    //     }


    // static void pattern31(int n){
    //     int originalN= n;
    //     n = 2*n;
    //     for (int i=1; i<n ; i++){
    //         for(int j =1; j< n ; j++){                                                               4444444
    //                                                                                                  4333334
    //             int atEveryIndex =originalN-Math.min(Math.min(i, j), Math.min(n - i, n - j));        4322234
    //                                                                                                  4321234
    //             System.out.print(atEveryIndex + " ");                                                      4322234
    //                                                                                                  4333334
    //                                                                                                  4444444
    //         }
    //         System.out.println();
    
    //     }



    }
}
