public class OrderAgonsticSearch {
    public static void main(String[] args) {
        int[] arr = { 89, 67, 45, 23, 11, 9, 7, 5, 3, 2, 0, -5, -12, -18 };
        int target = 11;
        System.out.println(OrderAgonsticSearch(arr, target));
    }

    static int OrderAgonsticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        // boolean isAsc;
        // if(arr [start]< arr[end]){
        // isAsc = true;
        // }else{
        // isAsc = false;
        // }//or

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            // finds middle element
            // int mid = (start + end)/2; // might be possible that (start + end) exceeds
            // the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

}
