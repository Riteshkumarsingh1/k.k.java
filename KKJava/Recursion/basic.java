
// function call :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// public class baseic{
//     public static void main(String[] args) {
//         //write a function that takes in a number and prints it
//         // print first five numbers

//         print1(n:1);

//     }

//     static void print1 (int n){
//         System.out.println(n);
//         print2(n:2);
//     }
//     static void print2 (int n){
//         System.out.println(n);
//         print3(n:3);
//     }
//     static void print3 (int n){                        // yaha hm baar bar ek naye function ko call kr rhe hai 
//         System.out.println(n);                         // jiska koi fayda nhi hai, bs waste of stack space hai
//         print4(n:4);                                   // iska solution recursion hai
//     }
//     static void print4 (int n){
//         System.out.println(n);
//         print5(n:5);
//     }
//     static void print5 (int n){
//         System.out.println(n);
//         //base case
//     }
// }

// Why recursion ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
// because it solves bigger problems by breaking them into smaller problems of the same type
// it helps in reducing the code size
// it helps in backtracking problems like maze, n-queen, sudoko etc.
// it helps in tree and graph traversal algorithms like DFS
// it helps in solving problems like factorial, fibonacci, gcd etc.
// it helps in dynamic programming problems like knapsack, coin change etc.
// you can convert recursion solution to iteration but not vice versa  
public class basic {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first five numbers

        print(1);
    }

    static void int print(int n){
                // jo baar baar function call kr rhe the upar wale code me , agr dekha jai to jo bhi agla function  ya no call kr rhe the wo (n+1) tha
                                             // jaise hi hmne recursion use kr liya to hmne bs ek hi function bnaya aur usi function ko (n+1) k sath call kr diya
            if (n==5){    
                System.out.println(5);                  
                return;                    // base case , jaha pr hm function ko rok dena chahte hai aage call nhi krna chahte
            }
            System.out.println(n);
            // recursive call
            // if you are calling the same function inside the function then it is called recursive call, you can treat it as a seprate call in the stack
            // this is called tail recursion
            print(n:1);  //this is the last recursive function call 

    }
}
