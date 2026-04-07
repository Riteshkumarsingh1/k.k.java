import java.util.Arrays;
import java.util.Scanner;

public class base {

    public static void main(String[] args) {

        // //Q: store a roll no
        // int a = 23;

        // //Q: store a person name
        // String name = "ram";

        // //Q: store 5 roll numbers
        // int rno1 = 23;
        // int rno2 = 34;
        // int rno3 = 33;
        // .........

        // //Syntax::::::
        // //datatype[]variable_name = new datatype[size];

        // //store 5 roll nos....
        // int[] rnos = new int [5];
        // //or directly.....
        // int[] rnos = {4,7,9,1,3,12};

        // int[] ros;// declaration of arrays, ros is getting defined in the stack
        // ros = new int[5];// initialisation : actually here object is being created in
        // the memory (heap).
        // System.out.println(ros[1]);

        // String[] arr = new String[4];
        // System.out.println(arr[0]);

        /*
         * MULTIDIMENTIONAL ARRAYS:::::::::::::
         */

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */

        // int [][] arr = new int[5][];

        // int [][] arr2d = {
        // {1,2,3},//0th index
        // {4,5},// 1st index
        // {6,7,8,9}//2nd index -> arr2d[2]= {6,7,8,9}
        // };

        // HOW TO take input of an arr::::

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[3][4];
        // System.out.println(arr.length);// this will print length of the rows
        for (int row = 0; row < arr.length; row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // HOW TO TAKE OUTPUT of an arr:::::::::
        // for (int row = 0; row < arr.length; row++) {
        // // for each column in every row
        // for (int col = 0; col < arr[row].length; col++) {
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // // output:::::
        // for (int row = 0; row < arr.length; row++) {
        // System.out.println(Arrays.toString(arr[row]));
        // }
        // output::::: enhanced for loop::::
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}