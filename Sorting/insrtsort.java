public class insrtsort {
    public static void main(String[] args) {
        int arr[]={10,99,86,56,-1,88,0,-99,100,1000};
        int n=arr.length;
        System.out.println("The array before sorting is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The array after sorting is:");
        for (int i = 1; i < n; i++) {
            for(int j=i;j>=1;j--){
                if (arr[j]<arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
