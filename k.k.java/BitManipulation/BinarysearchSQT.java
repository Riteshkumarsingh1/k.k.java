public class BinarysearchSQT {
    public static void main(String[] args) {
        int n = 40;// note for perfect square it will give the correct answer but for non perfect
                   // square it will give the floor value of the square root
        int p = 3;// for finding the square root upto p decimal places

        // System.out.println(sqrt(n, p));
        System.out.printf("%.3f", sqrt(n, p));
    }

    static double sqrt(int n, int p) {
        int s = 0;
        int e = 0;

        double root = 0.0;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid * mid == n) {

                return mid;
            } else {
                s = mid + 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            if (root * root <= n) {
                root = root + increment;
            }
            root = root - increment;
            increment = increment / 10;
        }
        return root;
    }

}
