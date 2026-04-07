public class basicMaths {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 3;
        // System.out.println("a & b = " + (a & b)); // bitwise AND
        // System.out.println("a | b = " + (a | b)); // bitwise OR
        // System.out.println("a ^ b = " + (a ^ b)); // bitwise XOR
        // System.out.println("~a = " + (~a)); // bitwise NOT
        // System.out.println("a << 1 = " + (a << 1)); // left shift
        // System.out.println("a >> 1 = " + (a >> 1)); // right shift

        int arr[] = { 1, 4, 1, 5, 2, 2, 3, 4, 5 };
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i]; // this will give us the unique element in the array
        }
        return unique;
    }
}
