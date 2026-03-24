public class SortedArrRec {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 15 };// sorted array
        System.out.println(sorted(arr, 0));// true
    }

    static boolean sorted(int[] arr, int index) { // function to check if the array is sorted in ascending order
        // base case
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index + 1); // recursive call
        // if the current element is less than the next element and the rest of the
        // array is sorted, then the whole array is sorted
        // if the current element is greater than or equal to the next element, then the
        // array is not sorted
        // if the current element is less than the next element but the rest of the
        // array is not sorted, then the array is not sorted

    }

}
