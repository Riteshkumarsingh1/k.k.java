public class Factor {
    public static void main(String[] args) {
        factor2(20);
    } // o(n)

    static void factor1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + "");
            }
        }
    }

    // o(sqrt(n))

    static void factor2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n % i == i) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
                System.out.println(i + " " + n / i " ");
            }
        }
    }

    // both time and space complexity is o(sqrt(n))

    static void factor3(int n) {
        ArrayList<Integer> list = new ArrayList<>();// to store the factors of n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n % i == i) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
                list.add(n / i);
        }
        for (int j = list.size() - 1; j >= 0; j--) {// to print the factors in reverse order
            System.out.print(list.get(j) + " ");// to print the factors in reverse order
        }
    }
    
}
