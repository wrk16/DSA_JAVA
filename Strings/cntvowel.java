import java.util.*;
public class cntvowel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=in.nextLine();
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)==true){
                cnt++;
            }
        }
        System.out.println("Number of vowels in the string are: "+cnt);
        in.close();
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
            return false;
    }
}