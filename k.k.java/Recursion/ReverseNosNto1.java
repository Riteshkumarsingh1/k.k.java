public class ReverseNosNto1 {
    public static void main(String[] args) {
        funboth(5);// function call
    }

    // static void fun(int n) {
    // if (n == 0) {// base case

    // return;
    // }
    // System.out.println(n); // yaha agla call hone se pahle print hoga, isliye
    // isko head recursion kehte hai, aur order reverse me print hoga, yani 1 se 1
    // tak print hoga
    // fun(n - 1);// tail recursion for recursive call is the last statement to be
    // executed in the function
    // }

    // static void funrev(int n) {
    // if (n == 0) {// base case

    // return;
    // }

    // funrev(n - 1);// for recursive call
    // System.out.println(n);// yaha agla call hone ke baad print hoga, isliye isko
    // tail recursion kehte hai,
    // // aur order me print hoga, yani 1 se n tak print hoga
    // }

    static void funrev(int n) {
        if (n == 0) {// base case

            return;
        }
        System.out.println(n);// yaha agla call hone se pahle print hoga, isliye isko head recursion kehte
                              // hai, aur order reverse me print hoga, yani n se 1 tak print hoga
        funboth(n - 1);// for recursive call
        System.out.println(n);// yaha agla call hone ke baad print hoga, isliye isko tail recursion kehte hai,
                              // aur order me print hoga, yani 1 se n tak print hoga
    } // so yaha dono head aur tail recursion ka use hua hai, isliye isko funboth naam
      // diya hai
      // isme n se 1 tak print hoga, phir 1 se n tak print hoga, yani n 5 4 3 2 1 1 2
      // 3 4 5 print hoga

}
