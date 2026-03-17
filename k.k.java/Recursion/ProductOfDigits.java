public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = pdt(123450);
        System.out.println(ans);
    }

    static int pdt(int n) {
        if (n % 10 == n)
            return 0;
        return (n % 10) * (n / 10);
    }

}
