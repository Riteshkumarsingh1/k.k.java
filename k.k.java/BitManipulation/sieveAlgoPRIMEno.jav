public class Sieve{
    public static void main(String[] args){
int n=40;// we are finding all prime numbers up to 40
boolean[] prime = new boolean[n+1]; // we are creating a boolean array  (array instantiation)  of size n+1 to store the prime status of numbers from 0 to n
sieve(n, prime); // we are calling the sieve method to fill the prime array with
    }
// this method implements the Sieve of Eratosthenes algorithm to find all prime numbers up to n
// the prime array will have true for non-prime numbers and false for prime numbers
    static void sieve(int n, boolean[] prime){
    for(int[i]=2; i*i <= n; i++){ // we are iterating from 2 to the square root of n because if n is divisible by any number greater than its square root, it must have a corresponding divisor that is less than the square root.
        if(!prime[i]){ // if prime[i] is false, then i is a prime number
            for(int j=i*i; j<=n; j+=i){ // we are marking all multiples of i as non-prime starting from i*i because all smaller multiples of i would have already been marked by smaller prime factors.
                prime[j] = true; // marking j as non-prime
            }
        }
    }
    for(int i=2; i<=n; i++){ // we are iterating from 2 to n to print all prime numbers
        if(!prime[i]){ // if prime[i] is false, then i is a prime number
            System.out.print(i + " "); // printing the prime number
        }
    }
}