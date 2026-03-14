public class newtonSquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n) {//
        double x = n;// initial guess
        double root;// to store the result
        while (true) {
            root = 0.5 * (x + (n / 10));// formula for finding the square root using newton's method
            if (math.abs(root - x) < 0.5) {// if the difference between the current guess and the previous guess is less
                                           // than a certain threshold, we can assume that we have found the square root
                break;
            }
            x = root;// update the guess for the next iteration
        }
        return root;

    }

}
