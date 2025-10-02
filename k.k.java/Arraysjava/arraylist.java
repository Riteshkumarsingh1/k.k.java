// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Scanner;

import java.util.Arrays;

public class arraylist {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // syntax
        // ArrayList<Integer> list = new ArrayList<>(10);// initial capacity is 10 , but
        // we can add more than 10 elements
        // // to our list
        // // list.add(21);
        // // list.add(214);
        // // list.add(121);
        // // list.add(221);
        // // list.add(421);
        // // list.add(261);
        // // list.add(219);
        // // list.add(421);
        // // list.add(291);
        // // list.add(210);
        // // list.add(121);// duplicate values allowed here as line 9
        // // list.add(251);
        // // list.add(219);
        // // list.add(021);
        // // list.add(241);
        // // list.add(216);
        // // list.add(0021);
        // // list.add(214);

        // // System.out.println(list.contains(212));
        // // System.out.println(list.contains(121));
        // // list.set(0, 1);// replace element at 0th index by 1
        // // list.remove(1);// removes 214 from list
        // // System.out.println(list);

        // // iteration //input
        // for (int i = 0; i < 5; i++) {
        // list.add(in.nextInt());
        // }
        // // get item at any index
        // for (int i = 0; i < 5; i++) {
        // System.out.println(list.get(i));// pass index here, list [index] syntax will
        // not work here
        // }
        // System.out.println(list);

        /*
         * ArrayList in other ArrayList
         */
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // // initialisation
        // for (int i = 0; i < 3; i++) {
        // list.add(new ArrayList<>());
        // }

        // // add elements
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // list.get(i).add(in.nextInt());
        // }
        // }
        // System.out.println(list);

        // Q: SWAP

        // int[] arr = { 1, 2, 3, 9, 4, 5, 6 };
        // swap(arr, 1, 3);
        // System.out.println(Arrays.toString(arr));
        // }
        // static void swap(int[] arr, int index1, int index2) {
        // int temp = arr[index1];
        // arr[index1] = arr[index2];
        // arr[index2] = temp;
        // //in output the elements of index1 and index2 will be swap from the list you
        // created

        // Q: Return Max Item
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 23, 65, 78, 1, 2098, 678, 908,
        // 980, };
        // System.out.println(maxRange(arr, 1, 17));
        // }
        // imagin that arr is not empty
        // static int max(int[]arr){
        // int maxVal = arr[0];
        // for(int i=0;i<arr.length;i++){
        // if (arr [i] > maxVal){
        // maxVal= arr[i];
        // }
        // }
        // return maxVal;

        // // for maxval in RANGE
        // static int maxRange(int[] arr, int start, int end) {
        // int maxVal = arr[start];
        // for (int i = start; i <= end; i++) {
        // if (arr[i] > maxVal) {
        // maxVal = arr[i];
        // }
        // }
        // return maxVal;

        // Q:Reverse of an array usin swap fxn:
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 23, 65, 78, 1, 2098, 678, 908, 980, };
        // swap (arr,1,9 );
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;

        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
