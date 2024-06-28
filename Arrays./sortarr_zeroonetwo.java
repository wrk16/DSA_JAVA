//most important interview question
//dutch flag algorithm: this is an algorithm that is used to sort an array of 0,1,2 in linear time complexity.
// it is used to sort an array of 0,1,2 in a single pass.
//

import java.util.*;
public class sortarr_zeroonetwo {
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
        int start=0, mid=0, end=arr.length-1;
        while(mid<=end){
            if(arr[mid]==0){
                int temp=arr[start];
                arr[start]=arr[mid];
                arr[mid]=temp;
                start++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[end];
                arr[end]=temp;
                end--;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}

// Time complexity: O(n)