import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // System.out.println(num);

        // typecasting
        // int num = (int) (102.12);
        // System.out.println(num);

        // automatically type promotion in expressions
        // int a = 256;
        // byte b = (byte) (a);
        // System.out.println(b);

        // byte a = 25;
        // byte b = 23;
        // byte c = 5;
        // int d = a * b / c;
        // System.out.println(d);

        // byte a = 50;
        // b = a * 2; // ye nhi kr skte as 50 is integer we cannot assign it to byte,,
        // explictly type conversion cannot be done right here
        // System.out.println(b);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 12.34f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);
    }
}
