public class noOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        int b = 2;

        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }

}

// time complexity = log(n)