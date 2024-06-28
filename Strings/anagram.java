import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter two strings to check anagram: ");
        String s=in.nextLine();
        String t=in.nextLine();
        if(s.length()!=t.length())  System.out.println("false");
        else{
            char a[]=s.toCharArray();
            char b[]=t.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            for(int i=0;i<a.length;i++){
                if(a[i]!=b[i])  System.out.println("false");
            }
            System.out.println("TRUE");
        }
        in.close();
    }
    
}
