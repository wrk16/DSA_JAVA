import java.util.Arrays;
import java.util.Scanner;

public class sorting_str {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
        char ch[]=s.toCharArray();
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();
        Arrays.sort(ch);
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();
        in.close();
    }
}
