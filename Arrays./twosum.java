//Find the doublet in the Array whose sum is equal to the given value x. (Two Sum)
//Input: nums = [3,2,4], target = 6
//Output: [1,2]


import java.util.*;
public class twosum {
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
    System.out.println("Enter the value of x");                                
    int x=in.nextInt();
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==x){
                System.out.println(i+" "+j);}
        }
    }
in.close();
}
    
}