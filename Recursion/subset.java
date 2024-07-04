import java.util.ArrayList;

public class subset {
    static ArrayList<String> arr = new ArrayList<>();
    public static int possibleSubset(String s) {
        int n=s.length();
        if(n==0) {
            return -1;
        }
        return (int) (Math.pow(2,n));
    }

    public static void Subsets(int i, String st, String ans) {
        if(i == st.length()) {             //base case
            arr.add(ans);
            return;
        }
        char ch=st.charAt(i);
        Subsets(i+1, st, ans+ch);   //if we include the character
        Subsets(i+1, st, ans);           //if we exclude the character
    }

    public static void main(String[] args) {
        arr = new ArrayList<>();
        String s="abc";
        System.out.println("printing the no.of possible string: ");
        System.out.println(possibleSubset(s));
        System.out.println("printing the possible string: ");
        Subsets(0, s, " ");
        System.out.println(arr);
    }
}
