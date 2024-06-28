// Sort the array in descending order using bubble sort.

public class decOrder_bs {
    public static void main(String[] args) {
        int arr[]={10,99,86,56,-1,88};
        int n=arr.length;
        System.out.println("The array before sorting is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The array after sorting is:");
        for (int i = 1; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j]<arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
