public class fibonacciNo {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    static int fibonacci   (int n){
        // base conditions
        // fibonacci(1) =1;
        // fibonacci(0)=0;     or

        if(n<2){
            return n;
        }

        return fibonacci(n:n-1) + fibonacci(n:n-2);  // this is not tail recursion 
  //    fibonacci(7) = fibonacci(6) + fibonacci(5)

    }
}
