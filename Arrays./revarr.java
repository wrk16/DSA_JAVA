// reverse an array
// input : arr=[1,2,3,4,5]
// output: arr=[5,4,3,2,1]


import java.util.Scanner;
public class revarr {
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
    int temp;
    int start=0;
    int end=arr.length-1;
    while(start<end){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

    in.close();
}   
}
