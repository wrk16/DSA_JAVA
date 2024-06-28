import java.util.Arrays;
public class hittry {
    public static void main(String[] args) {
        int arr[] = {89,88,55,96,464,36,57,34,65,78,23,12,3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        Arrays.parallelSort(arr);
        System.out.println("Sorted array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
