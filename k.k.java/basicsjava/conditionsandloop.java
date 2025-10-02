import java.util.Scanner;

public class conditionsandloop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // CONDITIONS..........
        // syntax of if stmt.
        // if(boolean exp is true or false){
        // body
        // }else{
        // do this
        // }

        // int salary = 193000;
        // if (salary > 10000) {
        // salary = salary + 2000;
        // } else {
        // salary = salary + 1000;

        // }
        // System.out.println(salary);
        // }

        // int sal = 193000;if(sal>10000)
        // {
        // sal += 1000;
        // }if(sal>20000)
        // {
        // sal += 2000;
        // }else
        // {
        // sal = sal / 100;
        // }System.out.println(sal);

        // // LOOPS...........

        // /*
        // *
        // * ....for loop syntax....
        // *
        // * for(initialisation; condition; increment/decrement){
        // * body
        // * }
        // *
        // */

        // // Q: print no from 1 to 5
        // for(
        // int num = 1;num<=5;num+=1)
        // {
        // System.out.println(num);
        // }

        // // Q:print no from 1 to n
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();

        // for(
        // int num = 1;num<=n;num++)
        // {
        // System.out.print(num + " ");
        // }

        // // While Loops.............

        // /*
        // * syntax....
        // * while(conditions){
        // * ...body
        // * }
        // */

        // // FIBONACCI SERIES..........

        // int n = in.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;

        // while(count<=n)
        // {
        // int temp = b;
        // b = b + a;
        // a = temp;
        // count++;
        // }System.out.println(b);

        // // NO OF OCCURANCE OF ANY NUMBER.......

        // int n = 174;
        // int count = 0;while(n>0)
        // {
        // int rem = n % 10;
        // if (rem == 8) {
        // count++;
        // }
        // n = n / 10;
        // }System.out.println(count);

        // // REVERSE OF A NO...........

        // int n = in.nextInt();
        // int ans = 0;while(n>0)
        // {
        // int rem = n % 10;
        // n = n / 10;
        // ans = ans * 10 + rem;
        // }System.out.println(ans);

        // /* CALCULATOR PROGRAM */
        // import java.util.Scanner;

        // public class conditionsandloop {
        // public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int ans = 0;
        // while (true) {
        // System.out.print("enter the operator");
        // // take operator as input
        // char op = in.next().trim().charAt(0);
        // if (op == '+' || op == '*' || op == '/' || op == '-' || op == '%') {
        // // input two nos...
        // System.out.print("enter two numbers");
        // int num1 = in.nextInt();
        // int num2 = in.nextInt();
        // System.out.println();
        // if (op == '+') {
        // ans = num1 + num2;
        // System.out.println(ans);
        // }

        // if (op == '-') {
        // ans = num1 - num2;
        // System.out.println(ans);
        // }

        // if (op == '*') {
        // ans = num1 * num2;
        // System.out.println(ans);
        // }

        // if (op == '/') {
        // if (num2 != 0) {
        // ans = num1 / num2;
        // } else {
        // System.out.println("Cannot divide by zero.");
        // continue;
        // }
        // System.out.println(ans);
        // }

        // if (op == '%') {
        // ans = num1 % num2;
        // System.out.println(ans);
        // }
        // } else if (op == 'x' || op == 'X') {
        // break;
        // } else {
        // System.out.println("invalid operation");
        // }

        // }

        // }
        // }

        // // OROROROROROO.. using SWITCH OPERATOR

        // switch(op){case'+':ans=num1+num2;break;case'-':ans=num1-num2;break;case'*':ans=num1*num2;break;case'/':if(num2!=0){ans=num1/num2;}else{System.out.println("Cannot
        // divide by
        // zero.");continue;}break;case'%':ans=num1%num2;break;default:System.out.println("Invalid
        // operation.");continue;}System.out.println("Result: "+ans);
    }
}