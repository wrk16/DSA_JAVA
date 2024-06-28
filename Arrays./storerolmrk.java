import java.util.Scanner;

public class storerolmrk {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int arr[][] = new int[4][2];
        for(int i=0;i<4;i++){  //rows
            for(int j=0;j<2;j++){   //columns
                arr[i][j]=in.nextInt(); //taking input from user
            }
        }

        System.out.println("The roll no. with their respective marks are:");
        for(int i=0;i<4;i++){  //rows
            for(int j=0;j<2;j++){   //columns
                System.out.print(arr[i][j]+" "); //printing 2D array
            }
            System.out.println(); //for new line
        }
        in.close(); //closing the Scanner class
    }
}
