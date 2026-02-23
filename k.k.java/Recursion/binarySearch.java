public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int target = 14;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int start, int end) { // yha hm start and end ko as a parameter pass kr rhe
                                                                   // hai taki in future functions me hm inhe call kr
                                                                   // sake as recursion.

        if (start > end) {

            return -1; // element not found
        }
        int middle = start + (end - start) / 2;
        if (arr[middle] == target) {

            return middle; // element found
        } else if (arr[middle] < target) {
            return search(arr, target, middle + 1, end);
        } else {
            return search(arr, target, start, middle - 1);
        }
    }
}
