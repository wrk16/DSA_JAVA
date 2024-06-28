import java.util.Scanner;
public class sort_zero_one_arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=in.nextInt() ;
        int arr[]=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int start=0, end=arr.length-1;
        while(start<end){
            if(arr[start]==1 && arr[end]==0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            else if(arr[start]==0){
                start++;
            }
            else if(arr[end]==1){
                end--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
    
}
