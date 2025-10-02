
// import java.util.Scanner;
import java.util.Scanner;

// public class functions {
//     public static void main(String[] args) {

/*
 * return_type name (arguments)
 * //body
 * returnstatement
 */
// passing arguments ::::::::::::::::::::::::

// Scanner in = new Scanner(System.in);
// System.out.println("enter your name:");
// String naam = in.next();
// String personalised = myGreet(naam);
// System.out.println(personalised);
// }
// static String myGreet(String name) {
// String message = "hello welcome to the code " + name;
// return message;
// }

// // passing value of number when you are calling the method in main()
// // by passing the parameters..
// int ans = sum3(54, 65);
// System.out.println(ans);
// }
// static int sum3(int a, int b) {
// int sum = a + b;
// return sum;
// }

// calling a string type function :::::::::::

// String message = greet();
// System.out.println(message);
// }
// static String greet() {
// String greeting = "whats your name";
// return greeting;
// }

// calling a sum function ::::::::::::::

// int ans = sum2();
// System.out.println(ans);
// }
// // returns the value
// static int sum2() {
// Scanner in = new Scanner(System.in);
// System.out.println("enter no 1:");
// int num1 = in.nextInt();
// System.out.println("enter no 2:");
// int num2 = in.nextInt();
// int sum = num1 + num2;
// return sum;
// }

// swaping 2 nos:::::::::::::::

// int a = 20;
// int b = 23;
// swap(a, b);
// System.out.println(a + " " + b);
// }
// static void swap(int a, int b) {
// int temp = a;
// a = b;
// b = temp; // this change will only be valid in this function scope only, not
// out of this fxn.
// }

// change value::::::::::::::
// // create an array
// int[] arr = { 1, 3, 2, 45, 78 };
// change(arr);
// System.out.println(Arrays.toString(arr));
// }
// static void change(int[] nums) {
// nums[0] = 54;// if u make a change to the object via this ref. variable,
// }

// scoping::::::::::::::::
// just mean where we can access our variables

//         int a = 23;
//         int b = 90;
//         // System.out.println(marks);
//         { // int a= 23 already initialize outside the block in same method, hence u cannot
//           // initialize again, but u can change the values
//             a = 43; // reassign the variable to some other reasonable values...
//             System.out.println(a); // since a has been initialize previouisly, but then also we are able to
//                                    // initalize it , because its in other block, in same block one cannot
//                                    // initialize same variable different values
//             int c = 94;
//         }
//         System.out.println(a);
//     }
//     static void random(int marks) {
//         int num = 56;
//         // one can only access num, marks only in this function , one cannot access out
//         // of it , it will give error, as we done in swap example
//         System.out.println(num);
//         System.out.println(marks);
//     }

// shadowing in java::::::::::::
// it means practice in java , kof using 2 variables with the same name within the same scope that overlaps
// public class functions {
//     static int x = 90;// this will be shadowed at line 126, cuz lover level will be hiding upper level
//     public static void main(String[] args) {
//         System.out.println(x); // 90
//         int x = 40;
//         System.out.println(x); // 40  , the class variable at line 120 is shadowed by this
//         fun();
//     }
//     static void fun() {
//         System.out.println(x);//90
//     }
// variable length arguments:::::::::::
// public class functions {
//     public static void main(String[] args) {
//         fun(2, 4, 5, 3, 6, 1, 9, 45, 35, 67);
//     }
//     static void fun(int... v) {
//         System.out.println(Arrays.toString(v));
//     }

// Function OVERLOADING::::::::::::
// if parameters are different 2 or more function can exist of same name
// public class functions {
//     public static void main(String[] args) {
//         fun(45);
//         fun("ram");
//     }
//     static void fun(int a) {
//         System.out.println(a);
//     }
//     static void fun(String name) {
//         System.out.println(name);
//     }

// prime nos::::::::::::
// public class functions {
//     public static void main(String[] args) {

//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         boolean ans = isprime(n);
//         System.out.println(ans);
//     }

//     static boolean isprime(int n) {
//         if (n <= 1) {
//             return false;
//         }
//         int c = 2;
//         while (c * c <= n) {
//             if (n % c == 0) {
//                 return false;
//             }
//             c++;
//         }
//         return c * c > n;
//     }

/// Armstrong nos all 3 digits::::::::

public class functions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;

        }

        return sum == original;

    }

}
