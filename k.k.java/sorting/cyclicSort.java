public class cyclicSort {
    public static void cyclicSort(String[] args) {
        int arr[] = { 3, 5, 2, 1, 4 };
        cyclic(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap (int[] arr; int first ; int  second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]= temp;
    }
}
