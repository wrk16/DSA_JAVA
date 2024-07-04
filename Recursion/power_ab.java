public class power_ab {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Printing " + a + " to the power of " + b + " : ");
        System.out.println(power(a,b));
    }
    // a^b = a * a^(b-1)----->recursive formula
    public static int power(int a, int b){
        if(b==0) return 1;  // Base case
        return a * power(a,b-1);  // Recursive call
    }
}
