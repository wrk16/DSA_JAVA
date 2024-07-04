import java.util.Scanner;

public class print_1_to_n {

    /* method 1 : by making a global variable n 
    static int n;  // global variable
    public static void main(String[] args) {
        int n=5;
        System.out.println("Printing 1 to "+n+" : ");
        Res(1);
    }

    public static void Res(int x) {
        if (x>n) {  // Base case
            System.out.println(x);
            Res(x+ 1);  // Recursive call with i+1
        }
    } */

    /*
     method 2 : by passing n as a parameter

    public static void main(String[] args) {
        int n=5;
        System.out.println("Printing 1 to "+n+" : ");
        Res(1,n);
    }

    public static void Res(int x, int n) {
        if (x>n) {  // Base case
            System.out.println(x);
            Res(x+ 1,n);  // Recursive call with i+1
        }
    } */
    
    // this is the optimized version of recursive approach to print 1 to n 
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n : ");
        int n=in.nextInt();
        System.out.println("Printing 1 to "+n+" : ");
        Res(n);
        in.close();
    }

    public static void Res(int n) {
        if(n==0) return;  // Base case
        Res(n-1);  // Recursive call
        System.out.println(n);
    } 
}