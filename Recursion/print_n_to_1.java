public class print_n_to_1 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Printing " + n + " to 1 : ");
        Res(n);
    }
    public static void Res(int n){
        if(n>0){
            System.out.println(n);
            Res(n-1);
        }
    }
}
