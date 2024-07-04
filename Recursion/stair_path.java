public class stair_path {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("Printing the number of ways to reach the " + n + "th stair: ");
        System.out.println(stair(n));
    }

    public static int stair(int n) {
        if(n<=2) return n;  // Base case
        return stair(n-1) + stair(n-2);  // Recursive call
    }
}

