public class log_power {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Printing " + a + " to the power of " + b + " : ");
        System.out.println(power(a,b));
    }

    //using logarthmic approach solve power function
    // x^(m+n) = x^m * x^n

    //this approach is better than the previous one because it reduces the number of recursive calls with T.C. : O(logn)
    public static int power(int a, int b){
        if(b==0) return 1;  // Base case
        int temp = power(a,b/2);  // Recursive call
        if(b%2==0) return temp*temp;  // if b is even
        else return a*temp*temp;  // if b is odd
    }
}
