public class powerOfTwo {
    public static void main(String[] args) {
        int n = 1; // note fixed for n=1 and n=0 as true but 0 is not a power of 2
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }

}
