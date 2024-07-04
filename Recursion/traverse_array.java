public class traverse_array {

    public static void print(int i, int[] arr){
        if(i==arr.length)  return;
        System.out.print(arr[i]+" ");
        print(i+1, arr);
    }
    public static void main(String[] args) {
        int arr[]={7,9,5,6,2,3, 4, 1, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        print(0, arr);
    }
}
