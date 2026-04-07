public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(12321));
    }

    static boolean palindrome(int n) {
        return n == rev(n);
    }

}
