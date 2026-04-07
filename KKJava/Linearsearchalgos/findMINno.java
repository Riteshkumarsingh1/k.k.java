public class findMINno {
    public static void main(String[] args) {
        int[] arr = { 56, 87, 0, 45, 1, 23, 4, 5, -6, 890, 1, 2, 3, 8, 56, 00 };
        System.out.println(min(arr));
    }

    // assun]me arr.length != 0
    // return the min value in arr
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }

        }
        return ans;
    }
}
