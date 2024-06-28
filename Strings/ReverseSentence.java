import java.util.Scanner;

public class ReverseSentence { // Class name should follow CamelCase convention

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a sentence: "); // Informative prompt
    StringBuilder sb = new StringBuilder(in.nextLine());
    int n = sb.length();
    int i = 0, j = 0;

    while (j < n) {
      if (sb.charAt(j) != ' ') {
        j++;
      } else {
        reverseString(sb, i, j - 1); // Reverse the current word
        i = j + 1;
        j = i;
      }
    }

    // Handle the last word (if it doesn't end with a space)
    reverseString(sb, i, n - 1);

    System.out.println("Reversed sentence: " + sb);
    in.close();
  }

  public static void reverseString(StringBuilder sb, int start, int end) {
    while (start <= end) {
      char temp = sb.charAt(start);
      sb.setCharAt(start, sb.charAt(end));
      sb.setCharAt(end, temp);
      start++;
      end--;
    }
  }
}
