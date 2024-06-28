import java.util.Scanner;

public class Convertint_input_to_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        String s=" "+num; //converting int to string by adding the number to an empty string
//we can also use Integer.toString(num) method to convert int to string
        System.out.println("The string is: "+s);
        sc.close();
    }
}
