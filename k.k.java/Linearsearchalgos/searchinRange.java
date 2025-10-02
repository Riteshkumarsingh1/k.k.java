public class searchinRange {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 56, 78, 34, 1, 9, 87, 9, 0 };
        int target = 12;
        System.out.println(linearSearch(arr, target, 0, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

}
