import java.util.Scanner;
public class remsortarrii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int i = 0;
        for (int index = 0; index < arr.length; index++) {
            int num = arr[index];
            if (i < 2 || num > arr[i - 2]) {
                arr[i++] = num;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.println("Length: " + i);
        sc.close();
    }
}
