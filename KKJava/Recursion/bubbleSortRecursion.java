public class bubbleSortRecursion {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static int sort(int arr[], int row, int col) {
        // base case
        if (row == col) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                // swap(arr,col,col+1);
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            sort(row, col + 1);
        }
        sort(row - 1, 0);
    }

}
