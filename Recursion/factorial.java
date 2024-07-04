import java.util.Scanner;
public class factorial {
    public static int fact(int n) {
        //creating a base case which will terminate the recursion
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);   // recursive call
    }
        
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter n : ");
        int n=in.nextInt();
        System.out.println(fact(n));
        in.close();
    }
}