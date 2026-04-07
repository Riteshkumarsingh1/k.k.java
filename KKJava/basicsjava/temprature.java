import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the temprature in celcius");
        // It looks like there is a typo in your code. The correct statement should be
        // `float tempC =
        // input.nextFloat();` instead of `float tempC = in.nextFloat();`. This line of
        // code is reading
        // a floating-point number input from the user and storing it in the variable
        // `tempC`, which
        // represents the temperature in Celsius.
        float tempC = input.nextFloat();

        float tempf = (tempC * 9 / 5) + 32;
        System.out.println(tempf);

    }
}
