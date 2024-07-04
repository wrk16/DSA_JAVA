public class printSum_1_to_npart2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing sum of 1 to " + n + " : ");
        System.out.println(sum(n));
    }
    //focus on return type because we are returning the sum
    public static int sum(int n){
        if(n==0 || n==1) return n;  // Base case
        return n + sum(n-1);  // Recursive call
    }
}
