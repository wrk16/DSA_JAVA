import java.util.Scanner;

public class printSum_1_to_n {
    /*
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n : ");
        int n =in.nextInt();
        System.out.println("Printing sum of 1 to " + n + " : ");
        System.out.println(Res(n));
        in.close();
    }

    public static int Res(int n){
        if(n==0) return 0;  // Base case
        return n +Res(n-1);  // Recursive call
    } */

    //parameterized approach
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n : ");
        int n =in.nextInt();
        sum(n,0);
        in.close();
    }
    public static void sum(int n,int s){
        if(n==0){
            System.out.println(s);  // Base case
            return;
        }
        sum(n-1, s+n);  //work and function call
    }
}