public class RotationCount {
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        }return pivot+1;

    }

    // use this for no duplicates
    static findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < start && arr[mid] > arr[mid + 1]) {
                return mid; // case 1
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1; // case 2
            }
            if (arr[start] >= arr[mid]) {
                end = mid - 1; // case 3
            } else {
                start = mid + 1; // case 4
            }
        }
        return -1;
    }

    // use this for duplicates when present in arr
    static findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < start && arr[mid] > arr[mid + 1]) {
                return mid; // case 1
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1; // case 2
            }
            // if elements at start, mid, end are equal then just skip the duplicates
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                // check whether end is pivot
                if
                (arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1; // case 4
            } else {
                end = mid - 1; // case 3
            }
        }
        return -1; // element not found
}
