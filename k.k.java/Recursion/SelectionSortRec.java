public class SelectionSortRec {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static int selectionSort(int arr[], int row, int col, int max) {
        // base case
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[max] < arr[col]) {

                selectionSort(arr, row, col + 1, col);
            } else {
                selectionSort(arr, row, col + 1, max);
            }
        } else {
            // swap, if we are here that means we have found the maximum element in the
            // current row
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selectionSort(arr, row - 1, 0, 0);
        }
    }

}
