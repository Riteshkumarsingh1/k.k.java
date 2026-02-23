public class countSetBits {
    public static void main(String[] args) {
        int n = 30;

        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;
        // while (n > 0) {
        // count++; to count no of setBits in a number
        // n -= (n & -n);
        // }

        // while (n > 0) {
        // count++; to count the same using Brian Kernighan’s Algorithm to count the no
        // of SetBits in a number
        // n = n & (n - 1);
        // }

        while (n > 0) {
            count += (n & 1); // to count the no of setBits in a number using bit manipulation
            n = n >> 1;
        }
        return count;
    }

}
