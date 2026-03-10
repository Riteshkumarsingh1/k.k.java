public class mathsForjava2 {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i <= n; i++) { // we are iterating from 1 to n (inclusive) to check if each number is prime
            System.out.println(i + " is prime: " + isPrime(i)); // we are checking if each number from 1 to n is prime
                                                                // and printing the result
        }
    }

 static boolean is

    Prime(int n){
    if(n<= 1){    //base case checked here
        return false;

    }
    int c= 2;  // starting from 2 because 1 is not prime
    while(c*c<=n){   // we are checking till the square root of n because if n is divisible by any number greater than its square root, it must have a corresponding divisor that is less than the square root.
        if(n%c==0){ // if n is divisible by c, then n is not prime
            return false;

        }
        c++; // incrementing c to check the next number
    }
    return true;    // if n is not divisible by any number from 2 to the square root of n, then n is prime
 }
}
