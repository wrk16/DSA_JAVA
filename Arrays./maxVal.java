import java.util.Scanner;   
public class maxVal {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int arr[]={-10,-30,-100,-90,-2};
        //to find the optimized way we have to compare the first element with the second element and then compare the result with the third element and so on.
        //int max=arr[0];
        // int max=Integer.MIN_VALUE;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }   
        // System.out.println("The maximum value is: "+max);

//find the second largest element in the arr using the same method
int max=Integer.MIN_VALUE;
for(int i=1;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];
    }

}   
    int sec_max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=max){
            sec_max=Math.max(sec_max,arr[i]);
        }
    }
System.out.println("The maximum value is: "+max);
System.out.println("The second maximum value is: "+sec_max);


        in.close();
    }
}
