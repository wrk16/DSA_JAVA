import java.util.Scanner;
public class linearSrc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("target element: ");
        int x=in.nextInt();
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<=n;i++){
            if(arr[i]==x){
                System.out.println("Element found at index: "+i);
                flag=true;
                break;
            }
        }
        if(flag==true)     System.out.println("Element  found");
        else    System.out.println("Element not found");
        in.close();
    }
}
