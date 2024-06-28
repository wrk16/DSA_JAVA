import java.util.Scanner;

public class twod_arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); //creating object of Scanner class
        System.out.println("Enter the size of the array: ");
        int n=in.nextInt(); //taking input from user
        //declaring and initializing 2D array
        System.out.println("Enter the elements of the array: ");
        int arr[][]=new int[n][n]; // n is the size of the array

        //taking input from user
        for(int i=0;i<n;i++){  //rows
            for(int j=0;j<n;j++){   //columns
                arr[i][j]=in.nextInt(); //taking input from user
            }
        }

        //printing 2D array
        for(int i=0;i<n;i++){  //rows
            for(int j=0;j<n;j++){   //columns
                System.out.print(arr[i][j]+" "); //printing 2D array
            }
            System.out.println(); //for new line
        }
        in.close(); //closing the Scanner class
        
    }
}