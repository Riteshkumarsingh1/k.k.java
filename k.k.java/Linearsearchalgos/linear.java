public class linear {
    public static void main(String[] args) {
        int[] nums = { 23, 43, 1, 2, 3, 4, 5, 24, 13, 14, 123 };
        int target = 23;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: return index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }
        // return for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element
            int element = arr[index];
            if (element == target) {
                return index;

            }
        }
        // this line will execute if none of othe return elements abovve executed
        // hence the target is not found
        return -1;
    }

}
