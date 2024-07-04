import java.util.Scanner;

public class remove_occurenceOf_A {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the str : ");
        String s=in.nextLine();
        System.out.println("enter the char : ");
        char ch=in.next().charAt(0);    
        System.out.println("printing the string: ");    
        remove(0, s, " ", ch);
        in.close();
    }

    public static void remove(int i, String s, String ans, char ch) {
        if(i==s.length())   {  //base case
            System.out.println(ans);  // it will print whatever string is there in ans 
        return;    
        }
        if(s.charAt(i)!=ch)  //checking if the character is not equal to the given character
            ans+=s.charAt(i);   //if not equal then add the character to the ans at the end
            remove(i+1, s, ans, ch);  //recursive call
        
    }
}
