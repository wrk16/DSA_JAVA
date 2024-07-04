import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n : ");
        int n=in.nextInt();
        System.out.println("Printing the " + n + "th fibonacci number: ");
        System.out.println(fib(n));
        in.close();
    }
    // f(n) = f(n-1) + f(n-2)----->recursive formula
    public static int fib(int n) {
        if(n<=1)  return n;  //base case
        return fib(n-1) + fib(n-2);   //recursive call
    }
    // T.C. : O(2^n)
}
