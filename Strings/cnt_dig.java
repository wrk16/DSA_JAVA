//Total number of digits without loop
import java.util.Scanner;

public class cnt_dig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        //String s=" "+num; //converting int to string by adding the number to an empty string
        String s = Integer.toString(num);
        System.out.println("The number of digits in the number is: " + s.length());
        sc.close();
    }
}
